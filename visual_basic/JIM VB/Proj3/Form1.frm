VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00FFFF00&
   Caption         =   "Form1"
   ClientHeight    =   6645
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12780
   LinkTopic       =   "Form1"
   ScaleHeight     =   6645
   ScaleWidth      =   12780
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      BackColor       =   &H00C0FFC0&
      Caption         =   "&Generate"
      Height          =   615
      Left            =   9600
      MaskColor       =   &H00C0FFC0&
      TabIndex        =   4
      Top             =   1800
      Width           =   2295
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   6360
      Top             =   1920
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H00C0FFC0&
      Height          =   615
      Left            =   7680
      TabIndex        =   2
      Top             =   1800
      Width           =   1455
   End
   Begin VB.Label Label3 
      BackColor       =   &H00C0FFC0&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   3015
      Left            =   480
      TabIndex        =   3
      Top             =   3240
      Width           =   11535
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFFF&
      Caption         =   "Enter no1. of terms required < 21 :"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00004000&
      Height          =   615
      Left            =   720
      TabIndex        =   1
      Top             =   1800
      Width           =   4935
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFC0&
      Caption         =   "FIBONACCI GENERATOR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00404000&
      Height          =   855
      Left            =   600
      TabIndex        =   0
      Top             =   240
      Width           =   11415
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim n, counter, x, y, newnum As Integer
Dim disp As String

Private Sub Command1_Click()
    n = Val(Text1.Text)
        If Not IsNumeric(Text1.Text) Or n < 3 Or n > 21 Then
            MsgBox "Enter the value of n correctly!"
            Text1.Text = ""
            Exit Sub
        End If
    disp = "1 1 "
    x = 1
    y = 1
    counter = 3
    Label3.Caption = disp
    Timer1.Enabled = True
    Timer1_Timer
End Sub

Private Sub Form_Load()
    Timer1.Enabled = False
End Sub

Private Sub Timer1_Timer()
    newnum = x + y
    disp = disp & newnum & " "
    x = y
    y = newnum
    Label3.Caption = disp
    counter = counter + 1
    If counter > n Or counter < 3 Then
        Timer1.Enabled = False
    End If
End Sub
