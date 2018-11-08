VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00C0FFFF&
   Caption         =   "Form1"
   ClientHeight    =   7335
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   11055
   FillColor       =   &H00C0FFFF&
   ForeColor       =   &H80000010&
   LinkTopic       =   "Form1"
   ScaleHeight     =   7335
   ScaleWidth      =   11055
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command6 
      Caption         =   "Next"
      Height          =   855
      Left            =   7920
      TabIndex        =   19
      Top             =   2400
      Width           =   2055
   End
   Begin VB.CommandButton Command5 
      Caption         =   "&Division"
      Height          =   495
      Left            =   4560
      TabIndex        =   18
      Top             =   5400
      Width           =   1335
   End
   Begin VB.CommandButton Command4 
      Caption         =   "&Multiplication"
      Height          =   495
      Left            =   4560
      TabIndex        =   17
      Top             =   4560
      Width           =   1335
   End
   Begin VB.CommandButton Command3 
      Caption         =   "&Subtraction"
      Height          =   495
      Left            =   4560
      TabIndex        =   16
      Top             =   3720
      Width           =   1335
   End
   Begin VB.TextBox Text6 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   12
      Tag             =   """result """
      Top             =   5400
      Width           =   1335
   End
   Begin VB.TextBox Text5 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   11
      Tag             =   """result """
      Top             =   4560
      Width           =   1335
   End
   Begin VB.TextBox Text4 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   10
      Tag             =   """result """
      Top             =   3720
      Width           =   1335
   End
   Begin VB.CommandButton Command2 
      Caption         =   "&Reset"
      Height          =   495
      Left            =   4560
      TabIndex        =   8
      Top             =   1440
      Width           =   1335
   End
   Begin VB.TextBox Text3 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   7
      Tag             =   """result """
      Top             =   2880
      Width           =   1335
   End
   Begin VB.TextBox Text2 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   6
      Tag             =   """Enter no. 2"""
      Top             =   1920
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "&Addition"
      Height          =   495
      Left            =   4560
      TabIndex        =   4
      Top             =   2760
      Width           =   1335
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H80000007&
      ForeColor       =   &H80000005&
      Height          =   615
      Left            =   1800
      TabIndex        =   3
      Tag             =   """Enter no. 1"""
      Top             =   1080
      Width           =   1335
   End
   Begin VB.Frame Frame1 
      Caption         =   "OPERATIONS"
      Height          =   5055
      Left            =   4320
      TabIndex        =   9
      Top             =   960
      Width           =   2055
   End
   Begin VB.Frame Frame2 
      Caption         =   "              FORM OPERATIONS "
      Height          =   1815
      Left            =   7440
      TabIndex        =   20
      Top             =   2040
      Width           =   3135
   End
   Begin VB.Label Label7 
      BackColor       =   &H00C0FFC0&
      Caption         =   "Div"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   360
      TabIndex        =   15
      Top             =   5520
      Width           =   975
   End
   Begin VB.Label Label6 
      BackColor       =   &H00C0FFC0&
      Caption         =   "Mult"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   360
      TabIndex        =   14
      Top             =   4680
      Width           =   975
   End
   Begin VB.Label Label5 
      BackColor       =   &H00C0FFC0&
      Caption         =   "Sub"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   360
      TabIndex        =   13
      Top             =   3840
      Width           =   975
   End
   Begin VB.Label Label4 
      Alignment       =   2  'Center
      Caption         =   "DEMO CALCULATOR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000D&
      Height          =   615
      Left            =   480
      TabIndex        =   5
      Top             =   120
      Width           =   5175
   End
   Begin VB.Label Label3 
      BackColor       =   &H00C0FFC0&
      Caption         =   "Sum"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   360
      TabIndex        =   2
      Top             =   3000
      Width           =   975
   End
   Begin VB.Label Label2 
      BackColor       =   &H00FFFFC0&
      Caption         =   "Num 2"
      ForeColor       =   &H000080FF&
      Height          =   375
      Left            =   360
      TabIndex        =   1
      Top             =   2040
      Width           =   975
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FFFFC0&
      Caption         =   "Num 1"
      ForeColor       =   &H008080FF&
      Height          =   435
      Left            =   360
      TabIndex        =   0
      Top             =   1200
      Width           =   1065
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()    ' add button
Text3.Text = Val(Text1.Text) + Val(Text2.Text)
End Sub

Private Sub Command2_Click()    ' reset button
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
Text4.Text = ""
Text5.Text = ""
Text6.Text = ""
Text1.SetFocus
End Sub

Private Sub Command3_Click()
Text4.Text = Val(Text1.Text) - Val(Text2.Text)
End Sub

Private Sub Command4_Click()
Text5.Text = Val(Text1.Text) * Val(Text2.Text)
End Sub

Private Sub Command5_Click()
If Val(Text2.Text) = 0 Then
    MsgBox "Div by 0 not allowed"
    Command2_Click
Else
    Text6.Text = Val(Text1.Text) / Val(Text2.Text)
End If
End Sub

Private Sub Command6_Click()
Form2.Show
Form1.Hide
End Sub

