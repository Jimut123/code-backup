; ReplaceInFile wrapper for testreplace function
; John T. Haller of PortableApps.com
; BSD License
; Requires TextReplace plugin installed in NSIS and !include "TextReplace.nsh" in main nsi
;
; Usage: ${ReplaceInFile} SOURCE_FILE SEARCH_TEXT REPLACEMENT
; or use ReplaceInFileCS for case-sensitive (use when possible, it's faster)
; No return variable.  Error will be set if unable to do the replacement (invalid file, locked file, etc)

; Modified to suite uTorrentPortable, 2010/06/05 by Gringoloco aka Mark Sikkema

!include NewTextReplace.nsh

Function ReplaceInFile
	Exch $0 ;REPLACEMENT
	Exch
	Exch $1 ;SEARCH_TEXT
	Exch 2
	Exch $2 ;SOURCE_FILE
	Exch 3
	Exch $3 ;CASE_INSENSITIVE
	Push $4 ;NEW_FILE
	Push $5 ;RETURN_VALUE
	
	StrCpy $4 `$2.OldReplaceInFile`
	
	${textreplace::ReplaceInFile} "$2" "$4" "$1" "$0" "$3 /C=0" $5
	IntCmp $5 0 StackCleanup ReturnError DeleteFileGuardnNameToOriginal
	
	ReturnError:
		SetErrors
		Goto StackCleanup
	
	DeleteFileGuardnNameToOriginal:
		FileOpen $0 $4 r
			FileRead $0 $1
			StrCpy $1 $1 17
			StrCmp $1 'd10:.fileguard40:' +5
				FileClose $0
				Delete $2
				Rename $4 $2
				Goto StackCleanup
			FileSeek $0 0 END $1 ;get file size
			FileSeek $0 0 SET
			System::Alloc /NOUNLOAD $1
				Pop $5
			System::Call /NOUNLOAD 'kernel32::ReadFile(i r0, i r5, i r1, t.,)'
		FileClose $0
		IntOp $3 $5 + 57 ;delete 'fileguard'
		IntOp $1 $1 - 57 ;shorten file size
		FileOpen $0 $2 w
			FileWriteByte $0 0x64 ;write the 'd'
			System::Call /NOUNLOAD 'kernel32::WriteFile(i r0, i r3, i r1, t.,)'
		FileClose $0
		System::Free $5
		Delete $4
	
	StackCleanup:
		Pop $5
		Pop $4
		Pop $3
		Pop $0
		Pop $1
		Pop $2

		${textreplace::Unload}
FunctionEnd

!macro ReplaceInFileCS SOURCE_FILE SEARCH_TEXT REPLACEMENT
	Push `/S=1`
	Push `${SOURCE_FILE}`
	Push `${SEARCH_TEXT}`
	Push `${REPLACEMENT}`
	Call ReplaceInFile
!macroend

!macro ReplaceInFile SOURCE_FILE SEARCH_TEXT REPLACEMENT
	Push `/S=0`
	Push `${SOURCE_FILE}`
	Push `${SEARCH_TEXT}`
	Push `${REPLACEMENT}`
	Call ReplaceInFile
!macroend

!define ReplaceInFileCS '!insertmacro "ReplaceInFileCS"'

!define ReplaceInFile '!insertmacro "ReplaceInFile"'