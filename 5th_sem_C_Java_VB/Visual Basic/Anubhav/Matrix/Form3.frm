VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form3 
   Caption         =   "Form3"
   ClientHeight    =   5160
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12615
   ControlBox      =   0   'False
   LinkTopic       =   "Form3"
   ScaleHeight     =   5160
   ScaleWidth      =   12615
   StartUpPosition =   3  'Windows Default
   Begin WMPLibCtl.WindowsMediaPlayer WindowsMediaPlayer1 
      Height          =   3675
      Left            =   360
      TabIndex        =   0
      Top             =   120
      Width           =   3600
      URL             =   "C:\Users\Public\Videos\Sample Videos\wildlife.avi"
      rate            =   1
      balance         =   0
      currentPosition =   0
      defaultFrame    =   ""
      playCount       =   1
      autoStart       =   -1  'True
      currentMarker   =   0
      invokeURLs      =   -1  'True
      baseURL         =   ""
      volume          =   50
      mute            =   0   'False
      uiMode          =   "full"
      stretchToFit    =   -1  'True
      windowlessVideo =   -1  'True
      enabled         =   -1  'True
      enableContextMenu=   0   'False
      fullScreen      =   0   'False
      SAMIStyle       =   ""
      SAMILang        =   ""
      SAMIFilename    =   ""
      captioningID    =   ""
      enableErrorDialogs=   0   'False
      _cx             =   6350
      _cy             =   6482
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
WindowsMediaPlayer1.URL = "C:\Users\Public\Videos\Sample Videos\wildlife.wmv"
End Sub
