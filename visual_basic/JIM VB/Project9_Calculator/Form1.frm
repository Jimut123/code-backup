VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7920
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9495
   LinkTopic       =   "Form1"
   ScaleHeight     =   7920
   ScaleWidth      =   9495
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command29 
      BackColor       =   &H00C0FFC0&
      Caption         =   "<-"
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
      Left            =   840
      Style           =   1  'Graphical
      TabIndex        =   29
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command28 
      BackColor       =   &H00C0FFC0&
      Caption         =   "+"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   28
      Top             =   6480
      Width           =   855
   End
   Begin VB.CommandButton Command27 
      BackColor       =   &H00C0FFC0&
      Caption         =   "."
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   27
      Top             =   6480
      Width           =   855
   End
   Begin VB.CommandButton Command26 
      BackColor       =   &H00C0FFC0&
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
      Height          =   1695
      Left            =   6240
      Style           =   1  'Graphical
      TabIndex        =   26
      Top             =   5520
      Width           =   855
   End
   Begin VB.CommandButton Command25 
      BackColor       =   &H00C0FFC0&
      Caption         =   "-"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   25
      Top             =   5520
      Width           =   855
   End
   Begin VB.CommandButton Command24 
      BackColor       =   &H00C0FFC0&
      Caption         =   "3"
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   24
      Top             =   5520
      Width           =   855
   End
   Begin VB.CommandButton Command23 
      BackColor       =   &H00C0FFC0&
      Caption         =   "2"
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
      Left            =   2280
      Style           =   1  'Graphical
      TabIndex        =   23
      Top             =   5520
      Width           =   855
   End
   Begin VB.CommandButton Command22 
      BackColor       =   &H00C0FFC0&
      Caption         =   "1/x"
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
      Left            =   6240
      Style           =   1  'Graphical
      TabIndex        =   22
      Top             =   4560
      Width           =   855
   End
   Begin VB.CommandButton Command21 
      BackColor       =   &H00C0FFC0&
      Caption         =   "*"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   21
      Top             =   4560
      Width           =   855
   End
   Begin VB.CommandButton Command20 
      BackColor       =   &H00C0FFC0&
      Caption         =   "6"
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   20
      Top             =   4560
      Width           =   855
   End
   Begin VB.CommandButton Command19 
      BackColor       =   &H00C0FFC0&
      Caption         =   "5"
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
      Left            =   2280
      Style           =   1  'Graphical
      TabIndex        =   19
      Top             =   4560
      Width           =   855
   End
   Begin VB.CommandButton Command18 
      BackColor       =   &H00C0FFC0&
      Caption         =   "0"
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
      Left            =   840
      Style           =   1  'Graphical
      TabIndex        =   18
      Top             =   6480
      Width           =   2295
   End
   Begin VB.CommandButton Command17 
      BackColor       =   &H00C0FFC0&
      Caption         =   "1"
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
      Left            =   840
      Style           =   1  'Graphical
      TabIndex        =   17
      Top             =   5520
      Width           =   855
   End
   Begin VB.CommandButton Command16 
      BackColor       =   &H00C0FFC0&
      Caption         =   "4"
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
      Left            =   840
      Style           =   1  'Graphical
      TabIndex        =   16
      Top             =   4560
      Width           =   855
   End
   Begin VB.CommandButton Command15 
      BackColor       =   &H00C0FFC0&
      Caption         =   "%"
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
      Left            =   6240
      Style           =   1  'Graphical
      TabIndex        =   15
      Top             =   3600
      Width           =   855
   End
   Begin VB.CommandButton Command14 
      BackColor       =   &H00C0FFC0&
      Caption         =   "/"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   14
      Top             =   3600
      Width           =   855
   End
   Begin VB.CommandButton Command13 
      BackColor       =   &H00C0FFC0&
      Caption         =   "9"
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   13
      Top             =   3600
      Width           =   855
   End
   Begin VB.CommandButton Command12 
      BackColor       =   &H00C0FFC0&
      Caption         =   "8"
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
      Left            =   2280
      Style           =   1  'Graphical
      TabIndex        =   12
      Top             =   3600
      Width           =   855
   End
   Begin VB.CommandButton Command11 
      BackColor       =   &H00C0FFC0&
      Caption         =   "7"
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
      Left            =   840
      Style           =   1  'Graphical
      TabIndex        =   11
      Top             =   3600
      Width           =   855
   End
   Begin VB.CommandButton Command10 
      BackColor       =   &H00C0FFC0&
      Caption         =   "sqrt"
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
      Left            =   6240
      Style           =   1  'Graphical
      TabIndex        =   10
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command9 
      BackColor       =   &H00C0FFC0&
      Caption         =   "+/-"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   9
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command8 
      BackColor       =   &H00C0FFC0&
      Caption         =   "C"
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   8
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command7 
      BackColor       =   &H00C0FFC0&
      Caption         =   "CE"
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
      Left            =   2280
      Style           =   1  'Graphical
      TabIndex        =   7
      Top             =   2640
      Width           =   855
   End
   Begin VB.CommandButton Command5 
      BackColor       =   &H00C0FFC0&
      Caption         =   "M-"
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
      Left            =   6240
      Style           =   1  'Graphical
      TabIndex        =   6
      Top             =   1560
      Width           =   855
   End
   Begin VB.CommandButton Command4 
      BackColor       =   &H00C0FFC0&
      Caption         =   "M+"
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
      Left            =   4920
      Style           =   1  'Graphical
      TabIndex        =   5
      Top             =   1560
      Width           =   855
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H00C0FFC0&
      Caption         =   "MS"
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
      Left            =   3600
      Style           =   1  'Graphical
      TabIndex        =   4
      Top             =   1560
      Width           =   855
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00C0FFC0&
      Caption         =   "MR"
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
      Left            =   2280
      Style           =   1  'Graphical
      TabIndex        =   3
      Top             =   1560
      Width           =   855
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H00FFFFC0&
      Caption         =   "Frame1"
      Height          =   7815
      Left            =   360
      TabIndex        =   0
      Top             =   0
      Width           =   7335
      Begin VB.CommandButton Command1 
         BackColor       =   &H00C0FFC0&
         Caption         =   "MC"
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
         Left            =   480
         Style           =   1  'Graphical
         TabIndex        =   2
         Top             =   1560
         Width           =   855
      End
      Begin VB.TextBox Result 
         Alignment       =   1  'Right Justify
         BackColor       =   &H00C0FFFF&
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   33
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H00000000&
         Height          =   855
         Left            =   480
         TabIndex        =   1
         Top             =   360
         Width           =   6255
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim value As Double, Sum As Double, value2 As Double, op As Integer, mem As Double, memp As Double
Dim temp As Double



Private Sub Command1_Click()
mem = 0
End Sub

Private Sub Command10_Click()
op = 7
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command11_Click()
Result.Text = Result.Text + Str(7)
End Sub

Private Sub Command12_Click()
Result.Text = Result.Text + Str(8)
End Sub

Private Sub Command13_Click()
Result.Text = Result.Text + Str(9)
End Sub

Private Sub Command14_Click()
op = 4
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command15_Click()
op = 5
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command16_Click()
Result.Text = Result.Text + Str(4)
End Sub

Private Sub Command17_Click()
Result.Text = Result.Text + Str(1)
End Sub

Private Sub Command18_Click()
Result.Text = Result.Text + Str(0)
End Sub

Private Sub Command19_Click()
Result.Text = Result.Text + Str(5)
End Sub

Private Sub Command2_Click()
Result.Text = Str(mem)
End Sub

Private Sub Command20_Click()
Result.Text = Result.Text + Str(6)
End Sub

Private Sub Command21_Click()
op = 3
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command22_Click()
op = 6
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command23_Click()
Result.Text = Result.Text + Str(2)
End Sub

Private Sub Command24_Click()
Result.Text = Result.Text + Str(3)
End Sub

Private Sub Command25_Click()
op = 2
value = Val(Result.Text)
Result.Text = ""
End Sub

Private Sub Command26_Click()
value2 = Val(Result.Text)
If op = 1 Then
    Sum = 0
    Sum = value + value2
    Result.Text = Str(Sum)
End If
If op = 2 Then
    Sum = 0
    Sum = value - value2
    Result.Text = Str(Sum)
End If
If op = 3 Then
    Sum = 0
    Sum = value * value2
    Result.Text = Str(Sum)
End If
If op = 4 Then
    Sum = 0
    Sum = value / value2
    Result.Text = Str(Sum)
End If
If op = 5 Then
    Sum = 0
    Sum = value Mod value2
    Result.Text = Str(Sum)
End If
If op = 6 Then
    Sum = 0
    Sum = 1 / value
    Result.Text = Str(Sum)
End If
If op = 7 Then
    Sum = 0
    Sum = Sqr(value)
    Result.Text = Str(Sum)
End If
End Sub

Private Sub Command27_Click()
Result.Text = Result.Text + "."
End Sub

Private Sub Command28_Click()
op = 1
value = Val(Result.Text)
Result.Text = ""

End Sub

Private Sub Command29_Click()
Result.Text = Left(Result.Text, Len(Result.Text) - 2)
End Sub

Private Sub Command3_Click()
mem = Val(Result.Text)
End Sub

Private Sub Command4_Click()
mem = mem + Val(Result.Text)
End Sub

Private Sub Command5_Click()
mem = mem - Val(Result.Text)
End Sub

Private Sub Command7_Click()
Result.Text = value
End Sub

Private Sub Command8_Click()
Result.Text = ""
value = 0
value2 = 0
End Sub

