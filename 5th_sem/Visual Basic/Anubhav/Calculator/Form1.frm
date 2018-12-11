VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4845
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   6030
   LinkTopic       =   "Form1"
   ScaleHeight     =   4845
   ScaleWidth      =   6030
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command28 
      Caption         =   "M-"
      Height          =   615
      Left            =   240
      TabIndex        =   28
      Top             =   4080
      Width           =   855
   End
   Begin VB.CommandButton Command27 
      Caption         =   "M+"
      Height          =   615
      Left            =   240
      TabIndex        =   27
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command26 
      Caption         =   "MS"
      Height          =   615
      Left            =   240
      TabIndex        =   26
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command25 
      Caption         =   "MR"
      Height          =   615
      Left            =   240
      TabIndex        =   25
      Top             =   1920
      Width           =   855
   End
   Begin VB.CommandButton Command24 
      Caption         =   "MC"
      Height          =   615
      Left            =   240
      TabIndex        =   24
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command23 
      Caption         =   "="
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   5040
      TabIndex        =   23
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command22 
      Caption         =   "1/x"
      Height          =   615
      Left            =   5040
      TabIndex        =   22
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command21 
      Caption         =   "%"
      Height          =   615
      Left            =   5040
      TabIndex        =   21
      Top             =   1920
      Width           =   855
   End
   Begin VB.CommandButton Command20 
      Caption         =   "Sqt"
      Height          =   615
      Left            =   5040
      TabIndex        =   20
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command19 
      Caption         =   "<-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1200
      TabIndex        =   19
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command18 
      Caption         =   "CE"
      Height          =   615
      Left            =   2160
      TabIndex        =   18
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command17 
      Caption         =   "C"
      Height          =   615
      Left            =   3120
      TabIndex        =   17
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command16 
      Caption         =   "+/-"
      Height          =   615
      Left            =   4080
      TabIndex        =   16
      Top             =   1200
      Width           =   855
   End
   Begin VB.CommandButton Command15 
      Caption         =   "+"
      Height          =   615
      Left            =   4080
      TabIndex        =   15
      Top             =   4080
      Width           =   855
   End
   Begin VB.CommandButton Command14 
      Caption         =   "-"
      Height          =   615
      Left            =   4080
      TabIndex        =   14
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command13 
      Caption         =   "*"
      Height          =   615
      Left            =   4080
      TabIndex        =   13
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command12 
      Caption         =   "/"
      Height          =   615
      Left            =   4080
      TabIndex        =   12
      Top             =   1920
      Width           =   855
   End
   Begin VB.CommandButton Command11 
      Caption         =   "."
      Height          =   615
      Left            =   3120
      TabIndex        =   11
      Top             =   4080
      Width           =   855
   End
   Begin VB.CommandButton Command10 
      Caption         =   "0"
      Height          =   615
      Left            =   1200
      TabIndex        =   10
      Top             =   4080
      Width           =   1815
   End
   Begin VB.CommandButton Command9 
      Caption         =   "9"
      Height          =   615
      Left            =   3120
      TabIndex        =   9
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command8 
      Caption         =   "8"
      Height          =   615
      Left            =   2160
      TabIndex        =   8
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command7 
      Caption         =   "7"
      Height          =   615
      Left            =   1200
      TabIndex        =   7
      Top             =   3360
      Width           =   855
   End
   Begin VB.CommandButton Command6 
      Caption         =   "6"
      Height          =   615
      Left            =   3120
      TabIndex        =   6
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command5 
      Caption         =   "5"
      Height          =   615
      Left            =   2160
      TabIndex        =   5
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command4 
      Caption         =   "4"
      Height          =   615
      Left            =   1200
      TabIndex        =   4
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command3 
      Caption         =   "3"
      Height          =   615
      Left            =   3120
      TabIndex        =   3
      Top             =   1920
      Width           =   855
   End
   Begin VB.CommandButton Command2 
      Caption         =   "2"
      Height          =   615
      Left            =   2160
      TabIndex        =   2
      Top             =   1920
      Width           =   855
   End
   Begin VB.CommandButton Command1 
      Caption         =   "1"
      Height          =   615
      Left            =   1200
      TabIndex        =   1
      Top             =   1920
      Width           =   855
   End
   Begin VB.TextBox Text1 
      Alignment       =   1  'Right Justify
      Enabled         =   0   'False
      Height          =   855
      Left            =   240
      TabIndex        =   0
      Text            =   "0"
      Top             =   240
      Width           =   5655
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim flag As Integer, op1 As Integer, op2 As Integer
Dim oper As String, mem As Integer
Private Sub Command1_Click()
If (flag = 0) Then
Text1.Text = Command1.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command1.Caption
End If
End Sub

Private Sub Command10_Click()
If (flag = 0) Then
Text1.Text = Command10.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command10.Caption
End If
End Sub

Private Sub Command12_Click()
oper = "/"
flag = 0
op1 = Val(Text1.Text)
End Sub

Private Sub Command13_Click()
oper = "*"
flag = 0
op1 = Val(Text1.Text)
End Sub

Private Sub Command14_Click()
oper = "-"
flag = 0
op1 = Val(Text1.Text)
End Sub

Private Sub Command15_Click()
oper = "+"
flag = 0
op1 = Val(Text1.Text)
End Sub

Private Sub Command17_Click()
Text1.Text = ""
End Sub

Private Sub Command19_Click()
Text1.Text = Left(Text1.Text, Len(Text1.Text) - 1)
End Sub

Private Sub Command2_Click()
If (flag = 0) Then
Text1.Text = Command2.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command2.Caption
End If
End Sub

Private Sub Command20_Click()
Text1.Text = Sqr(Val(Text1.Text))
End Sub

Private Sub Command21_Click()
Text1.Text = Val(Text1.Text) / 100
End Sub

Private Sub Command22_Click()
Text1.Text = 1 / Val(Text1.Text)
End Sub

Private Sub Command23_Click()
op2 = Val(Text1.Text)
If (oper = "+") Then
Text1.Text = op1 + op2
ElseIf (oper = "-") Then
Text1.Text = op1 - op2
ElseIf (oper = "*") Then
Text1.Text = op1 * op2
ElseIf (oper = "/") Then
Text1.Text = op1 / op2
ElseIf (oper = "%") Then
Text1.Text = Val(Text1.Text) / 100
End If
End Sub

Private Sub Command24_Click()
mem = 0
End Sub

Private Sub Command25_Click()
Text1.Text = mem
End Sub

Private Sub Command26_Click()
mem = Text1.Text
End Sub

Private Sub Command27_Click()
mem = mem + Val(Text1.Text)
End Sub

Private Sub Command28_Click()
mem = mem - Val(Text1.Text)
End Sub

Private Sub Command3_Click()
If (flag = 0) Then
Text1.Text = Command3.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command3.Caption
End If
End Sub

Private Sub Command4_Click()
If (flag = 0) Then
Text1.Text = Command4.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command4.Caption
End If
End Sub

Private Sub Command5_Click()
If (flag = 0) Then
Text1.Text = Command5.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command5.Caption
End If
End Sub

Private Sub Command6_Click()
If (flag = 0) Then
Text1.Text = Command6.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command6.Caption
End If
End Sub

Private Sub Command7_Click()
If (flag = 0) Then
Text1.Text = Command7.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command7.Caption
End If
End Sub

Private Sub Command8_Click()
If (flag = 0) Then
Text1.Text = Command8.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command8.Caption
End If
End Sub

Private Sub Command9_Click()
If (flag = 0) Then
Text1.Text = Command9.Caption
flag = 1
Else
Text1.Text = Text1.Text + Command9.Caption
End If
End Sub

Private Sub Form_Load()
flag = 0
op1 = 0
op2 = 0
mem = 0
End Sub
