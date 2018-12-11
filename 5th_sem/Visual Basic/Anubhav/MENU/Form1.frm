VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00C00000&
   ClientHeight    =   7860
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   14205
   LinkTopic       =   "Form1"
   ScaleHeight     =   7860
   ScaleWidth      =   14205
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text11 
      Height          =   615
      Left            =   9360
      TabIndex        =   26
      Top             =   360
      Width           =   2055
   End
   Begin VB.TextBox Text10 
      Height          =   615
      Left            =   720
      TabIndex        =   25
      Top             =   360
      Width           =   2055
   End
   Begin VB.TextBox Text9 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4200
      TabIndex        =   24
      Top             =   6960
      Width           =   1815
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H00FF8080&
      Caption         =   "&EXIT"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   9960
      Style           =   1  'Graphical
      TabIndex        =   23
      Top             =   6960
      Width           =   2175
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00FF8080&
      Caption         =   "&RESET"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7080
      Style           =   1  'Graphical
      TabIndex        =   22
      Top             =   6960
      Width           =   2175
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H00FF8080&
      Caption         =   "&BILL"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1440
      Style           =   1  'Graphical
      TabIndex        =   21
      Top             =   6960
      Width           =   2175
   End
   Begin VB.TextBox Text8 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   10920
      TabIndex        =   20
      Top             =   5760
      Width           =   855
   End
   Begin VB.TextBox Text7 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   10920
      TabIndex        =   19
      Top             =   4680
      Width           =   855
   End
   Begin VB.TextBox Text6 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   10920
      TabIndex        =   18
      Top             =   3600
      Width           =   855
   End
   Begin VB.TextBox Text5 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   10920
      TabIndex        =   17
      Top             =   2520
      Width           =   855
   End
   Begin VB.TextBox Text4 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   16
      Top             =   5760
      Width           =   855
   End
   Begin VB.TextBox Text3 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   15
      Top             =   4680
      Width           =   855
   End
   Begin VB.TextBox Text2 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   14
      Top             =   3600
      Width           =   855
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   13
      Top             =   2520
      Width           =   855
   End
   Begin VB.CheckBox Check8 
      BackColor       =   &H0080FF80&
      Caption         =   "CHICKEN BUTTER RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   7080
      TabIndex        =   12
      Top             =   5640
      Width           =   2775
   End
   Begin VB.CheckBox Check7 
      BackColor       =   &H0080FF80&
      Caption         =   "MUTTON AFGANI RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   7080
      TabIndex        =   11
      Top             =   4560
      Width           =   2775
   End
   Begin VB.CheckBox Check6 
      BackColor       =   &H0080FF80&
      Caption         =   "CHICKEN BHARTA RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   7080
      TabIndex        =   10
      Top             =   3480
      Width           =   2775
   End
   Begin VB.CheckBox Check5 
      BackColor       =   &H0080FF80&
      Caption         =   "MUTTON REZALA RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   7080
      TabIndex        =   9
      Top             =   2400
      Width           =   2775
   End
   Begin VB.CheckBox Check4 
      BackColor       =   &H0080FF80&
      Caption         =   "SPECIAL MAHAL BIRIYANI RS 300/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   600
      TabIndex        =   8
      Top             =   5640
      Width           =   2775
   End
   Begin VB.CheckBox Check3 
      BackColor       =   &H0080FF80&
      Caption         =   "KESAR KEBAB BIRIYANI RS 300/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   600
      TabIndex        =   7
      Top             =   4560
      Width           =   2775
   End
   Begin VB.CheckBox Check2 
      BackColor       =   &H0080FF80&
      Caption         =   "CHICKEN BIRIYANI RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   600
      TabIndex        =   6
      Top             =   3480
      Width           =   2775
   End
   Begin VB.CheckBox Check1 
      BackColor       =   &H0080FF80&
      Caption         =   "MUTTON BIRIYANI RS 200/-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   600
      TabIndex        =   1
      Top             =   2400
      Width           =   2775
   End
   Begin VB.Label Label5 
      BackColor       =   &H000080FF&
      Caption         =   " QTY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF80&
      Height          =   615
      Left            =   10680
      TabIndex        =   5
      Top             =   1440
      Width           =   1335
   End
   Begin VB.Label Label4 
      BackColor       =   &H000080FF&
      Caption         =   " QTY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF80&
      Height          =   615
      Left            =   4320
      TabIndex        =   4
      Top             =   1440
      Width           =   1335
   End
   Begin VB.Label Label3 
      BackColor       =   &H000080FF&
      Caption         =   "    MENU"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF80&
      Height          =   615
      Left            =   7080
      TabIndex        =   3
      Top             =   1440
      Width           =   2775
   End
   Begin VB.Label Label2 
      BackColor       =   &H000080FF&
      Caption         =   "    MENU"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF80&
      Height          =   615
      Left            =   600
      TabIndex        =   2
      Top             =   1440
      Width           =   2775
   End
   Begin VB.Label Label1 
      BackColor       =   &H0000FFFF&
      Caption         =   "      ARSALAN"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   855
      Left            =   3840
      TabIndex        =   0
      Top             =   240
      Width           =   4575
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim price As Integer
Private Sub Check1_Click()
Text1.Enabled = True
Text1.SetFocus
End Sub
Private Sub Check1_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text1.Enabled = True
Check1.Value = 1
Text1.SetFocus
End If
End Sub
Private Sub Check2_Click()
Text2.Enabled = True
Text2.SetFocus
End Sub
Private Sub Check2_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text2.Enabled = True
Check2.Value = 1
Text2.SetFocus
End If
End Sub
Private Sub Check3_Click()
Text3.Enabled = True
Text3.SetFocus
End Sub
Private Sub Check3_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text3.Enabled = True
Check3.Value = 1
Text3.SetFocus
End If
End Sub
Private Sub Check4_Click()
Text4.Enabled = True
Text4.SetFocus
End Sub
Private Sub Check4_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text4.Enabled = True
Check4.Value = 1
Text4.SetFocus
End If
End Sub
Private Sub Check5_Click()
Text5.Enabled = True
Text5.SetFocus
End Sub
Private Sub Check5_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text5.Enabled = True
Check5.Value = 1
Text5.SetFocus
End If
End Sub
Private Sub Check6_Click()
Text6.Enabled = True
Text6.SetFocus
End Sub
Private Sub Check6_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text6.Enabled = True
Check6.Value = 1
Text6.SetFocus
End If
End Sub
Private Sub Check7_Click()
Text7.Enabled = True
Text7.SetFocus
End Sub
Private Sub Check7_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text7.Enabled = True
Check7.Value = 1
Text7.SetFocus
End If
End Sub
Private Sub Check8_Click()
Text8.Enabled = True
Text8.SetFocus
End Sub
Private Sub Check8_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Text8.Enabled = True
Check8.Value = 1
Text8.SetFocus
End If
End Sub

Private Sub Command1_Click()
price = 0
If Check1.Value = 1 Then
price = price + Val(Text1.Text) * 200
End If
If Check2.Value = 1 Then
price = price + Val(Text2.Text) * 200
End If
If Check3.Value = 1 Then
price = price + Val(Text3.Text) * 300
End If
If Check4.Value = 1 Then
price = price + Val(Text4.Text) * 300
End If
If Check5.Value = 1 Then
price = price + Val(Text5.Text) * 200
End If
If Check6.Value = 1 Then
price = price + Val(Text6.Text) * 200
End If
If Check7.Value = 1 Then
price = price + Val(Text7.Text) * 200
End If
If Check8.Value = 1 Then
price = price + Val(Text8.Text) * 200
End If
If price > 2000 Then
MsgBox " CONGRATS...YOU ARE ELIGIBLE FOR 10% DISCOUNT", vbOKOnly, "DISCOUNT APPLIED"
Text9.Text = price * 0.9
Else
Text9.Text = price
End If
End Sub

Private Sub Command1_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Command1_Click
End If
End Sub
Private Sub Command2_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Command2_Click
End If
End Sub
Private Sub Command3_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Command3_Click
End If
End Sub

Private Sub Command2_Click()
price = 0
Check1.Value = 0
Check2.Value = 0
Check3.Value = 0
Check4.Value = 0
Check5.Value = 0
Check6.Value = 0
Check7.Value = 0
Check8.Value = 0
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
Text4.Text = ""
Text5.Text = ""
Text6.Text = ""
Text7.Text = ""
Text8.Text = ""
Text9.Text = ""
End Sub

Private Sub Text1_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check2.SetFocus
End If
End Sub
Private Sub Text2_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check3.SetFocus
End If
End Sub
Private Sub Text3_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check4.SetFocus
End If
End Sub
Private Sub Text4_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check5.SetFocus
End If
End Sub
Private Sub Text5_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check6.SetFocus
End If
End Sub
Private Sub Text6_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check7.SetFocus
End If
End Sub
Private Sub Text7_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
Check8.SetFocus
End If
End Sub
Private Sub Command3_Click()
End
End Sub
