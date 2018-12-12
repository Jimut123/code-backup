VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000011&
   Caption         =   "Form1"
   ClientHeight    =   6240
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   6015
   LinkTopic       =   "Form1"
   ScaleHeight     =   6240
   ScaleWidth      =   6015
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command27 
      BackColor       =   &H80000009&
      Caption         =   "="
      Height          =   615
      Left            =   5040
      TabIndex        =   27
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command26 
      Caption         =   "-"
      Height          =   615
      Left            =   4080
      TabIndex        =   26
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command25 
      Caption         =   "+"
      Height          =   615
      Left            =   3120
      TabIndex        =   25
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command24 
      Caption         =   "."
      Height          =   615
      Left            =   2160
      TabIndex        =   24
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command23 
      Caption         =   "0"
      Height          =   615
      Left            =   1200
      TabIndex        =   23
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command22 
      Caption         =   "M+"
      Height          =   615
      Left            =   240
      TabIndex        =   22
      Top             =   5040
      Width           =   735
   End
   Begin VB.CommandButton Command21 
      Caption         =   "1/x"
      Height          =   615
      Left            =   5040
      TabIndex        =   21
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command20 
      Caption         =   "*"
      Height          =   615
      Left            =   4080
      TabIndex        =   20
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command19 
      Caption         =   "3"
      Height          =   615
      Left            =   3120
      TabIndex        =   19
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command18 
      Caption         =   "2"
      Height          =   615
      Left            =   2160
      TabIndex        =   18
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command17 
      Caption         =   "1"
      Height          =   615
      Left            =   1200
      TabIndex        =   17
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command16 
      Caption         =   "MS"
      Height          =   615
      Left            =   240
      TabIndex        =   16
      Top             =   4200
      Width           =   735
   End
   Begin VB.CommandButton Command15 
      Caption         =   "%"
      Height          =   615
      Left            =   5040
      TabIndex        =   15
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command14 
      Caption         =   "/"
      Height          =   615
      Left            =   4080
      TabIndex        =   14
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command13 
      Caption         =   "6"
      Height          =   615
      Left            =   3120
      TabIndex        =   13
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command12 
      Caption         =   "5"
      Height          =   615
      Left            =   2160
      TabIndex        =   12
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command11 
      Caption         =   "4"
      Height          =   615
      Left            =   1200
      TabIndex        =   11
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command10 
      Caption         =   "MR"
      Height          =   615
      Left            =   240
      TabIndex        =   10
      Top             =   3360
      Width           =   735
   End
   Begin VB.CommandButton Command9 
      Caption         =   "SQ RT"
      Height          =   615
      Left            =   5040
      TabIndex        =   9
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command8 
      Caption         =   "+/-"
      Height          =   615
      Left            =   4080
      TabIndex        =   8
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command7 
      Caption         =   "9"
      Height          =   615
      Left            =   3120
      TabIndex        =   7
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command6 
      Caption         =   "8"
      Height          =   615
      Left            =   2160
      TabIndex        =   6
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command5 
      Caption         =   "7"
      Height          =   615
      Left            =   1200
      TabIndex        =   5
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command4 
      Caption         =   "MC"
      Height          =   615
      Left            =   240
      TabIndex        =   4
      Top             =   2520
      Width           =   735
   End
   Begin VB.CommandButton Command3 
      Caption         =   "C"
      Height          =   495
      Left            =   4560
      TabIndex        =   3
      Top             =   1800
      Width           =   1215
   End
   Begin VB.CommandButton Command2 
      Caption         =   "CE"
      Height          =   495
      Left            =   3120
      TabIndex        =   2
      Top             =   1800
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "backspace"
      Height          =   495
      Left            =   1200
      TabIndex        =   1
      Top             =   1800
      Width           =   1695
   End
   Begin VB.TextBox Text1 
      Alignment       =   1  'Right Justify
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   240
      TabIndex        =   0
      Top             =   720
      Width           =   5535
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim a As Double, b As Double, c As Double, d As Double, e As Double


Private Sub Command1_Click()
If Text1.Text = "0" Then
Else
Text1.Text = ((Val(Text1.Text) - (Val(Text1.Text) Mod 10))) / 10
End If
End Sub

Private Sub Command11_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "4"
End Sub

Private Sub Command12_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "5"
End Sub

Private Sub Command13_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "6"
End Sub

Private Sub Command14_Click()
a = Val(Text1.Text)
Text1.Text = ""
b = 4
d = 0
End Sub

Private Sub Command15_Click()
a = Val(Text1.Text)
Text1.Text = ""
b = 5
d = 0
End Sub

Private Sub Command17_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "1"
End Sub

Private Sub Command18_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "2"
End Sub

Private Sub Command19_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "3"
End Sub

Private Sub Command2_Click()
Text1.Text = a
b = 0
End Sub

Private Sub Command20_Click()
a = Val(Text1.Text)
Text1.Text = ""
b = 3
d = 0
End Sub

Private Sub Command21_Click()
Text1.Text = 1 / Val(Text1.Text)
End Sub

Private Sub Command23_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "0"
End Sub

Private Sub Command24_Click()
Text1.Text = Text1.Text & "."
End Sub

Private Sub Command25_Click()
a = Val(Text1.Text)
Text1.Text = ""
b = 1
d = 0
End Sub

Private Sub Command26_Click()
a = Val(Text1.Text)
Text1.Text = ""
b = 2
d = 0
End Sub

Private Sub Command27_Click()
If d = 1 Then
a = Val(Text1.Text)
Else
e = Val(Text1.Text)
End If
If b = 1 Then
    c = a + e
    Text1.Text = c
End If
If b = 2 Then
    c = a - e
    Text1.Text = c
End If
If b = 3 Then
    c = a * e
    Text1.Text = c
End If
If b = 4 Then
    c = a / e
    Text1.Text = c
End If
If b = 5 Then
    c = a Mod c
    Text1.Text = c
End If
d = 1
End Sub

Private Sub Command3_Click()
a = 0
b = 0
c = 0
d = 0
Text1.Text = "0"
End Sub

Private Sub Command5_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "7"
End Sub

Private Sub Command6_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "8"
End Sub

Private Sub Command7_Click()
If Text1.Text = "0" Then
Text1.Text = ""
End If
Text1.Text = Text1.Text & "9"
End Sub

Private Sub Command8_Click()
Text1.Text = Val(Text1.Text) * -1
End Sub

Private Sub Command9_Click()
Text1.Text = (Val(Text1.Text))
End Sub

Private Sub Form_Load()
a = 0
b = 0
c = 0
d = 0
Text1.Text = "0"
End Sub
