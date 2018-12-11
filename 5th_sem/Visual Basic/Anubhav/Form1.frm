VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00FFFFFF&
   Caption         =   "Form1"
   ClientHeight    =   4605
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9855
   LinkTopic       =   "Form1"
   ScaleHeight     =   4605
   ScaleWidth      =   9855
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command6 
      Caption         =   "Next"
      Height          =   495
      Left            =   6840
      TabIndex        =   12
      Top             =   2400
      Width           =   1335
   End
   Begin VB.CommandButton Command5 
      Caption         =   "Divide"
      Height          =   495
      Left            =   6840
      TabIndex        =   10
      Top             =   1800
      Width           =   1335
   End
   Begin VB.CommandButton Command4 
      Caption         =   "Multiply"
      Height          =   495
      Left            =   5280
      TabIndex        =   9
      Top             =   2400
      Width           =   1455
   End
   Begin VB.CommandButton Command3 
      Caption         =   "Subtract"
      Height          =   495
      Left            =   3840
      TabIndex        =   8
      Top             =   2400
      Width           =   1335
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Reset"
      Height          =   495
      Left            =   5280
      TabIndex        =   7
      Top             =   1800
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Add"
      Height          =   495
      Left            =   3840
      TabIndex        =   6
      Top             =   1800
      Width           =   1335
   End
   Begin VB.TextBox Text3 
      Height          =   495
      Left            =   2040
      TabIndex        =   5
      Top             =   1800
      Width           =   1455
   End
   Begin VB.TextBox Text2 
      Height          =   495
      Left            =   2040
      TabIndex        =   3
      Top             =   1080
      Width           =   1455
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H00FFFFFF&
      Height          =   495
      Left            =   2040
      TabIndex        =   2
      Top             =   360
      Width           =   1455
   End
   Begin VB.Label Label4 
      Caption         =   "Simple Calculator"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   4200
      TabIndex        =   11
      Top             =   360
      Width           =   3975
   End
   Begin VB.Label Label3 
      Caption         =   "Result"
      Height          =   375
      Left            =   240
      TabIndex        =   4
      Top             =   1800
      Width           =   1455
   End
   Begin VB.Label Label2 
      Caption         =   "Number 2"
      Height          =   375
      Left            =   120
      TabIndex        =   1
      Top             =   1080
      Width           =   1575
   End
   Begin VB.Label Label1 
      Caption         =   "Number 1"
      Height          =   495
      Left            =   240
      TabIndex        =   0
      Top             =   360
      Width           =   1455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click() ' add button
Text3.Text = Val(Text1.Text) + Val(Text2.Text)
End Sub

Private Sub Command2_Click() ' reset button
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
Text1.SetFocus
End Sub

Private Sub Command3_Click()
Text3.Text = Val(Text1.Text) - Val(Text2.Text)
End Sub

Private Sub Command4_Click()
Text3.Text = Val(Text1.Text) * Val(Text2.Text)
End Sub

Private Sub Command5_Click()
If Val(Text2.Text) = 0 Then
MsgBox " Division by Zero not allowed"
Command2_Click
Else
Text3.Text = Val(Text1.Text) / Val(Text2.Text)
End If
End Sub

Private Sub Command6_Click()
Form2.Show
Form1.Hide
End Sub

Private Sub Label4_Click()
MsgBox "Calculator"
End Sub
