VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H80000013&
   Caption         =   "Form2"
   ClientHeight    =   6630
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   13125
   LinkTopic       =   "Form2"
   ScaleHeight     =   6630
   ScaleWidth      =   13125
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "<<<&Prev"
      Height          =   495
      Left            =   10200
      TabIndex        =   5
      Top             =   5640
      Width           =   2415
   End
   Begin VB.TextBox Text1 
      Alignment       =   2  'Center
      BackColor       =   &H8000000A&
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7920
      TabIndex        =   3
      Top             =   1800
      Width           =   1215
   End
   Begin VB.TextBox Text2 
      Alignment       =   2  'Center
      BackColor       =   &H80000010&
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   18
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   600
      ScrollBars      =   2  'Vertical
      TabIndex        =   2
      Top             =   3480
      Width           =   11775
   End
   Begin VB.CommandButton Command1 
      Caption         =   "&GENERATE"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   4320
      TabIndex        =   1
      Top             =   4680
      Width           =   4095
   End
   Begin VB.Timer Timer1 
      Interval        =   200
      Left            =   1320
      Top             =   4800
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000013&
      Caption         =   "Enter Number of terms required:->"
      BeginProperty Font 
         Name            =   "MS Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   720
      TabIndex        =   4
      Top             =   2040
      Width           =   6255
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000013&
      Caption         =   "PRIME NUMBER GENERATOR"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   26.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   1800
      TabIndex        =   0
      Top             =   360
      Width           =   8895
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim i, flag, cnt, lim, j, n As Integer
Dim disp As String

Private Sub Command1_Click()
n = Val(Text1.Text)
If Not IsNumeric(Text1.Text) Or n < 1 Or n > 30 Then
    MsgBox "ENTER N IN RANGE OF 1 to 30!!!"
    Text1.Text = ""
    Exit Sub
End If
 i = 2
flag = 1
cnt = 1
Text2.Text = disp
Timer1.Enabled = True

End Sub

Private Sub Command2_Click()
Form2.Hide
Form1.Show
End Sub

Private Sub Form_Load()
Timer1.Enabled = False
End Sub

Private Sub Timer1_Timer()

j = 2
For j = 2 To i
   If i Mod j = 0 Then
      flag = 0
    Exit For
    End If
    Next j
  
  If flag = 1 Then
    disp = disp & i & " , "
    End If
Text2.Text = disp
i = i + 1
cnt = cnt + 1
If cnt > n Then
    Timer1.Enabled = False
End If
End Sub

