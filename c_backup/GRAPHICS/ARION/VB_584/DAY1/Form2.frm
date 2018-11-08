VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H00C0C0C0&
   Caption         =   "Form2"
   ClientHeight    =   4290
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   7500
   LinkTopic       =   "Form2"
   ScaleHeight     =   4290
   ScaleWidth      =   7500
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command4 
      Caption         =   "<<&Prev"
      Height          =   375
      Left            =   240
      TabIndex        =   7
      Top             =   3720
      Width           =   2055
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
      Height          =   495
      HideSelection   =   0   'False
      Left            =   1800
      TabIndex        =   6
      Top             =   2040
      Width           =   2535
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H00404040&
      Caption         =   "&RESET"
      Height          =   375
      Left            =   5400
      MaskColor       =   &H00404040&
      TabIndex        =   5
      Top             =   3000
      Width           =   1815
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00404040&
      Caption         =   " &F to C"
      Height          =   375
      Left            =   2880
      MaskColor       =   &H00404040&
      TabIndex        =   4
      Top             =   3000
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H00404040&
      Caption         =   " &C to F"
      Height          =   375
      Left            =   240
      MaskColor       =   &H00404040&
      TabIndex        =   3
      Top             =   3000
      Width           =   1815
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
      Left            =   3360
      TabIndex        =   2
      Top             =   960
      Width           =   2535
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      Caption         =   "Enter Temperature:"
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
      Left            =   240
      TabIndex        =   1
      Top             =   1080
      Width           =   2565
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      BackColor       =   &H00808080&
      Caption         =   "TEMPERATURE"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   435
      Left            =   1440
      TabIndex        =   0
      Top             =   120
      Width           =   2235
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text2.Text = 9 * Val(Text1.Text) / 5 + 32
End Sub

Private Sub Command2_Click()
Text2.Text = 5 * (Val(Text1.Text) - 32) / 9
End Sub

Private Sub Command3_Click()
Text1.Text = " "
Text1.SetFocus
End Sub

Private Sub Command4_Click()
Form1.Show
Form2.Hide
End Sub

Private Sub Command6_Click()
Form3.Show
Form2.Hide
End Sub
