VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00C0C0C0&
   ClientHeight    =   5625
   ClientLeft      =   1455
   ClientTop       =   1650
   ClientWidth     =   12645
   LinkTopic       =   "Form1"
   ScaleHeight     =   5625
   ScaleWidth      =   12645
   Begin VB.CommandButton Command6 
      Caption         =   "&Next>>"
      Height          =   375
      Left            =   10200
      TabIndex        =   13
      Top             =   5160
      Width           =   2055
   End
   Begin VB.Frame ascasc 
      BackColor       =   &H00C0C0C0&
      Caption         =   "CALCULATIONS"
      Height          =   3855
      Left            =   9840
      TabIndex        =   7
      Top             =   960
      Width           =   2415
      Begin VB.CommandButton Command2 
         BackColor       =   &H00404040&
         Caption         =   "&RESET"
         Height          =   375
         Left            =   360
         MaskColor       =   &H00404040&
         TabIndex        =   12
         Top             =   3120
         Width           =   1815
      End
      Begin VB.CommandButton Command5 
         BackColor       =   &H00404040&
         Caption         =   " &Division"
         Height          =   375
         Left            =   360
         MaskColor       =   &H00404040&
         TabIndex        =   11
         Top             =   2400
         Width           =   1815
      End
      Begin VB.CommandButton Command4 
         BackColor       =   &H00404040&
         Caption         =   " &Product"
         Height          =   375
         Left            =   360
         MaskColor       =   &H00404040&
         TabIndex        =   10
         Top             =   1680
         Width           =   1815
      End
      Begin VB.CommandButton Command3 
         BackColor       =   &H00404040&
         Caption         =   " D&ifference"
         Height          =   375
         Left            =   360
         MaskColor       =   &H00404040&
         TabIndex        =   9
         Top             =   960
         Width           =   1815
      End
      Begin VB.CommandButton Command1 
         BackColor       =   &H00404040&
         Caption         =   " &Sum"
         Height          =   375
         Left            =   360
         MaskColor       =   &H00404040&
         TabIndex        =   8
         Top             =   360
         Width           =   1815
      End
   End
   Begin VB.TextBox Text3 
      Alignment       =   2  'Center
      BackColor       =   &H00E0E0E0&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   615
      HideSelection   =   0   'False
      Left            =   3000
      Locked          =   -1  'True
      TabIndex        =   4
      Top             =   4200
      Width           =   3855
   End
   Begin VB.TextBox Text2 
      Alignment       =   2  'Center
      BackColor       =   &H00E0E0E0&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   615
      HideSelection   =   0   'False
      Left            =   5760
      TabIndex        =   3
      Top             =   3000
      Width           =   3855
   End
   Begin VB.TextBox Text1 
      Alignment       =   2  'Center
      BackColor       =   &H00E0E0E0&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   615
      HideSelection   =   0   'False
      Left            =   5760
      TabIndex        =   2
      Top             =   2040
      Width           =   3855
   End
   Begin VB.Label Label4 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      BackColor       =   &H00808080&
      Caption         =   "    CALCULATOR   "
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   20.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   480
      Left            =   3495
      TabIndex        =   14
      Top             =   240
      Width           =   2985
   End
   Begin VB.Label Label5 
      Alignment       =   2  'Center
      BackColor       =   &H00C0C0C0&
      Caption         =   "Result :"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   14.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   720
      TabIndex        =   6
      Top             =   4320
      Width           =   1695
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      BackColor       =   &H00808080&
      BorderStyle     =   1  'Fixed Single
      Caption         =   "SIMPLE CALCULATOR"
      BeginProperty Font 
         Name            =   "MS Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   585
      Left            =   2760
      TabIndex        =   5
      Top             =   5400
      Width           =   5385
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      Caption         =   "Enter Number 2:"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   375
      Left            =   1080
      TabIndex        =   1
      Top             =   3120
      Width           =   2160
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      Caption         =   "Enter Number 1:"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   375
      Left            =   1080
      TabIndex        =   0
      Top             =   2280
      Width           =   2160
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text3.Text = Val(Text1.Text) + Val(Text2.Text)

End Sub

Private Sub Command2_Click()
Text1.Text = " "
Text2.Text = " "
Text3.Text = " "
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
MsgBox " Division By 0 Not Allowed !"
Command2_Click
Else
Text3.Text = Val(Text1.Text) / Val(Text2.Text)
End If
End Sub

Private Sub Command6_Click()
Form2.Show
Form1.Hide
End Sub
