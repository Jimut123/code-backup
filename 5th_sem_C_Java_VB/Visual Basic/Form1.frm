VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000013&
   Caption         =   "Form1"
   ClientHeight    =   3690
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   7860
   LinkTopic       =   "Form1"
   ScaleHeight     =   3690
   ScaleWidth      =   7860
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      Caption         =   "NEXT"
      Height          =   495
      Left            =   3240
      TabIndex        =   12
      Top             =   3000
      Width           =   1575
   End
   Begin VB.TextBox Text3 
      Height          =   495
      Left            =   2280
      TabIndex        =   8
      Top             =   2160
      Width           =   1695
   End
   Begin VB.TextBox Text2 
      Height          =   495
      Left            =   2280
      TabIndex        =   3
      Top             =   1440
      Width           =   1695
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   2280
      TabIndex        =   2
      Top             =   720
      Width           =   1695
   End
   Begin VB.Label Label9 
      Alignment       =   2  'Center
      BackColor       =   &H00C0C0C0&
      Caption         =   "&SUBTRACT"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000007&
      Height          =   495
      Left            =   6120
      TabIndex        =   11
      Top             =   720
      Width           =   1335
   End
   Begin VB.Label Label8 
      Alignment       =   2  'Center
      BackColor       =   &H00C0C0C0&
      Caption         =   "&MULTIPLY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000007&
      Height          =   495
      Left            =   4560
      TabIndex        =   10
      Top             =   1440
      Width           =   1335
   End
   Begin VB.Label Label7 
      Alignment       =   2  'Center
      BackColor       =   &H00C0C0C0&
      Caption         =   "&DIVIDE"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000007&
      Height          =   495
      Left            =   6120
      TabIndex        =   9
      Top             =   1440
      Width           =   1335
   End
   Begin VB.Label Label4 
      Alignment       =   2  'Center
      BackColor       =   &H00C0C0C0&
      Caption         =   "&ADD"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000007&
      Height          =   495
      Left            =   4560
      TabIndex        =   5
      Top             =   720
      Width           =   1335
   End
   Begin VB.Label Label5 
      Alignment       =   2  'Center
      BackColor       =   &H000000C0&
      Caption         =   "&RESET"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000A&
      Height          =   495
      Left            =   4680
      TabIndex        =   6
      Top             =   2160
      Width           =   2655
   End
   Begin VB.Label Label6 
      BackColor       =   &H80000013&
      Caption         =   "RESULT"
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   480
      TabIndex        =   7
      Top             =   2280
      Width           =   1455
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H80000013&
      Caption         =   "CALCULATOR"
      BeginProperty Font 
         Name            =   "Cooper Std Black"
         Size            =   12
         Charset         =   0
         Weight          =   900
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000001&
      Height          =   495
      Left            =   1680
      TabIndex        =   4
      Top             =   120
      Width           =   3975
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000013&
      Caption         =   "NUMBER 2"
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   480
      TabIndex        =   1
      Top             =   1560
      Width           =   1335
   End
   Begin VB.Label Label1 
      BackColor       =   &H80000013&
      Caption         =   "NUMBER 1"
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   480
      TabIndex        =   0
      Top             =   840
      Width           =   1335
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Form2.Show
Form1.Hide
End Sub

Private Sub Label4_Click()
Text3.Text = Val(Text1.Text) + Val(Text2.Text)
End Sub

Private Sub Label5_Click()
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
Text1.SetFocus
End Sub

Private Sub Label7_Click()
If Text2.Text = "0" Then
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
MsgBox "Division by zero not allowed"
Else
Text3.Text = Val(Text1.Text) / Val(Text2.Text)
End If
End Sub

Private Sub Label8_Click()
Text3.Text = Val(Text1.Text) * Val(Text2.Text)
End Sub

Private Sub Label9_Click()
Text3.Text = Val(Text1.Text) - Val(Text2.Text)
End Sub
