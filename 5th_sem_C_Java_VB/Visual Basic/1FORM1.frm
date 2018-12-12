VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000007&
   Caption         =   "Form1"
   ClientHeight    =   6750
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12135
   BeginProperty Font 
      Name            =   "MS Sans Serif"
      Size            =   13.5
      Charset         =   0
      Weight          =   700
      Underline       =   0   'False
      Italic          =   0   'False
      Strikethrough   =   0   'False
   EndProperty
   LinkTopic       =   "Form1"
   ScaleHeight     =   6750
   ScaleWidth      =   12135
   StartUpPosition =   3  'Windows Default
   Begin VB.Timer Timer1 
      Interval        =   500
      Left            =   11400
      Top             =   600
   End
   Begin VB.CommandButton Command1 
      Caption         =   "GENERATE"
      Height          =   615
      Left            =   5160
      TabIndex        =   4
      Top             =   5280
      Width           =   2055
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H8000000D&
      Height          =   480
      Left            =   8880
      TabIndex        =   2
      Top             =   2160
      Width           =   1215
   End
   Begin VB.Label Label3 
      BackColor       =   &H8000000D&
      Height          =   1215
      Left            =   1920
      TabIndex        =   3
      Top             =   3240
      Width           =   7935
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000002&
      Caption         =   "ENTER NUMBER OF TERMS REQUIRED"
      Height          =   495
      Left            =   1560
      TabIndex        =   1
      Top             =   2160
      Width           =   5895
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H8000000A&
      Caption         =   "FIBONACCI GENERATOR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   690
      Left            =   0
      TabIndex        =   0
      Top             =   490
      Width           =   12135
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim a As Integer
Dim b As Integer
Dim c As Integer
Dim n As Integer
Private Sub Command1_Click()
a = 0
b = 1
c = 1
n = Int(Text1.Text)
Timer1.Enabled = True
End Sub

Private Sub Form_Load()
Timer1.Enabled = False
End Sub

Private Sub Timer1_Timer()
If Not IsNumeric(n) Or n > 21 Then
MsgBox "invalid input"
ElseIf n > 0 Then
Label3.Caption = Label3.Caption & "  " & c
c = a + b
a = b
b = c
n = n - 1
Else
Timer1.Enabled = False
End If
End Sub

