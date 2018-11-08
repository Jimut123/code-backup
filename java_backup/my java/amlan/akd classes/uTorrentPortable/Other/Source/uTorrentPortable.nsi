;Copyright 2004-2010 John T. Haller
;Copyright 2007-2009 Erik Pilsits

;Website: http://PortableApps.com/

;This software is OSI Certified Open Source Software.
;OSI Certified is a certification mark of the Open Source Initiative.

;This program is free software; you can redistribute it and/or
;modify it under the terms of the GNU General Public License
;as published by the Free Software Foundation; either version 2
;of the License, or (at your option) any later version.

;This program is distributed in the hope that it will be useful,
;but WITHOUT ANY WARRANTY; without even the implied warranty of
;MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;GNU General Public License for more details.

;You should have received a copy of the GNU General Public License
;along with this program; if not, write to the Free Software
;Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

!define PORTABLEAPPNAME "uTorrent Portable"
!define APPNAME "uTorrent"
!define NAME "uTorrentPortable"
!define VER "1.6.10.0"
!define WEBSITE "PortableApps.com"
!define DEFAULTEXE "uTorrent.exe"
!define DEFAULTAPPDIR "uTorrent"
!define LAUNCHERLANGUAGE "English"

;=== Program Details
Name "${PORTABLEAPPNAME}"
OutFile "..\..\${NAME}.exe"
Caption "${PORTABLEAPPNAME} | PortableApps.com"
VIProductVersion "${VER}"
VIAddVersionKey ProductName "${PORTABLEAPPNAME}"
VIAddVersionKey Comments "Allows ${APPNAME} to be run from a removable drive.  For additional details, visit ${WEBSITE}"
VIAddVersionKey CompanyName "PortableApps.com (Erik Pilsits)"
VIAddVersionKey LegalCopyright "PortableApps.com and contributors"
VIAddVersionKey FileDescription "${PORTABLEAPPNAME}"
VIAddVersionKey FileVersion "${VER}"
VIAddVersionKey ProductVersion "${VER}"
VIAddVersionKey InternalName "${PORTABLEAPPNAME}"
VIAddVersionKey LegalTrademarks "PortableApps.com is a Trademark of Rare Ideas, LLC."
VIAddVersionKey OriginalFilename "${NAME}.exe"
;VIAddVersionKey PrivateBuild ""
;VIAddVersionKey SpecialBuild ""

;=== Runtime Switches
CRCCheck On
WindowIcon Off
SilentInstall Silent
AutoCloseWindow True
RequestExecutionLevel user
XPStyle on

; Best Compression
SetCompress Auto
SetCompressor /SOLID lzma
SetCompressorDictSize 32
SetDatablockOptimize On

;=== Includes
!include FileFunc.nsh
!include MoveFiles.nsh
!include ReplaceInFileForuTorrent.nsh

;=== Program Icon
Icon "..\..\App\AppInfo\appicon.ico"

;=== Languages
LoadLanguageFile "${NSISDIR}\Contrib\Language files\${LAUNCHERLANGUAGE}.nlf"
!include PortableApps.comLauncherLANG_${LAUNCHERLANGUAGE}.nsh

Var PROGRAMDIRECTORY
Var SETTINGSDIRECTORY
Var PROGRAMEXECUTABLE
Var MISSINGFILEORPATH

Section "Main"
	;=== Check if already running
	System::Call 'kernel32::CreateMutex(i 0, i 0, t "${NAME}") i .r1 ?e'
	Pop $0
	StrCmp $0 0 "" LaunchAndExit
	
	;=== Set directories / vars
	StrCpy $PROGRAMDIRECTORY "$EXEDIR\App\${APPNAME}"
	StrCpy $SETTINGSDIRECTORY "$EXEDIR\Data\settings"
	StrCpy $PROGRAMEXECUTABLE ${DEFAULTEXE}
	
	;=== Check Program EXE
	IfFileExists "$PROGRAMDIRECTORY\${DEFAULTEXE}" FoundProgramEXE
		;=== Program executable not where expected
		StrCpy $MISSINGFILEORPATH $PROGRAMEXECUTABLE
		MessageBox MB_OK|MB_ICONEXCLAMATION `$(LauncherFileNotFound)`
		Abort
		
	FoundProgramEXE:
		FindProcDLL::FindProc "utorrent.exe"
		StrCmp $R0 "1" "" CheckForDirectories
			;=== Already running, but not our version
			MessageBox MB_OK|MB_ICONINFORMATION `$(LauncherAlreadyRunning)`
			Goto TheEnd
	
	CheckForDirectories:
		;=== Check for directories
		IfFileExists "$SETTINGSDIRECTORY\*.*" +2
			CreateDirectory "$SETTINGSDIRECTORY"
		IfFileExists "$SETTINGSDIRECTORY\..\downloads\*.*" +2
			CreateDirectory "$SETTINGSDIRECTORY\..\downloads"
		IfFileExists "$SETTINGSDIRECTORY\..\torrents\*.*" +2
			CreateDirectory "$SETTINGSDIRECTORY\..\torrents"
		Goto CheckPortableSettings
	
	CopyDefaultSettings:
		IfFileExists "$EXEDIR\App\DefaultData\settings\settings.dat" 0 DefaultSettingsError
		CopyFiles /SILENT "$EXEDIR\App\DefaultData\settings\settings.dat" "$SETTINGSDIRECTORY"
	
	CheckPortableSettings:
		${GetRoot} "$EXEDIR" $1
		ReadINIStr $0 "$SETTINGSDIRECTORY\${NAME}Settings.ini" "${NAME}Settings" "LastDriveLetter"
		StrCmp $0 $1 StoreCurrentDriveLetter ; just to store serial
		${ReplaceInFile} "$SETTINGSDIRECTORY\settings.dat" '$0\' '$1\'
		${ReplaceInFile} "$SETTINGSDIRECTORY\resume.dat" '$0\' '$1\'

	StoreCurrentDriveLetter:
		WriteINIStr "$SETTINGSDIRECTORY\${NAME}Settings.ini" "${NAME}Settings" "LastDriveLetter" "$1"

;	MoveSettings:
		IfFileExists "$PROGRAMDIRECTORY\*.dat" LaunchNow 
		IfFileExists "$SETTINGSDIRECTORY\*.dat" 0 CopyDefaultSettings
		CopyFiles /SILENT "$SETTINGSDIRECTORY\*.dat" "$PROGRAMDIRECTORY"
		CopyFiles /SILENT "$SETTINGSDIRECTORY\*.old" "$PROGRAMDIRECTORY"
			Goto LaunchNow

	DefaultSettingsError:
		MessageBox MB_OK|MB_ICONSTOP|MB_TOPMOST "Default settings file not found.  Check your installation."
			Abort
	
	LaunchNow:
		${GetParameters} $0
		SetOutPath "$PROGRAMDIRECTORY"
		ExecWait '"$PROGRAMDIRECTORY\$PROGRAMEXECUTABLE" $0'
	
	CheckRunning:
		Sleep 1000
		FindProcDLL::FindProc "${DEFAULTEXE}"                  
		StrCmp $R0 "1" CheckRunning

		;=== Move settings back
		${MoveFiles} "FORCE" "*.dat" "$PROGRAMDIRECTORY" "$SETTINGSDIRECTORY"
		${MoveFiles} "FORCE" "*.old" "$PROGRAMDIRECTORY" "$SETTINGSDIRECTORY"
		Goto TheEnd
		
	LaunchAndExit:
		${GetParameters} $0
		SetOutPath "$PROGRAMDIRECTORY"
		Exec '"$PROGRAMDIRECTORY\$PROGRAMEXECUTABLE" $0'

	TheEnd:
SectionEnd