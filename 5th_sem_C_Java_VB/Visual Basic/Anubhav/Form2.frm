VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   4740
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   10665
   LinkTopic       =   "Form2"
   ScaleHeight     =   4740
   ScaleWidth      =   10665
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command3 
      Caption         =   "Reset"
      Height          =   615
      Left            =   4800
      TabIndex        =   6
      Top             =   1800
      Width           =   1455
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Exit"
      Height          =   615
      Left            =   6480
      TabIndex        =   5
      Top             =   1080
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Convert"
      Height          =   615
      Left            =   4800
      TabIndex        =   4
      Top             =   1080
      Width           =   1455
   End
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2640
      TabIndex        =   3
      Top             =   1080
      Width           =   1935
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Left            =   2640
      TabIndex        =   2
      Top             =   120
      Width           =   1935
   End
   Begin VB.Label Label2 
      Caption         =   "Fahrenheit"
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
      Left            =   360
      TabIndex        =   1
      Top             =   1080
      Width           =   2055
   End
   Begin VB.Label Label1 
      Caption         =   "Celsius"
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
      Left            =   840
      TabIndex        =   0
      Top             =   240
      Width           =   1575
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Text2.Text = "" Then
Text2.Text = (9 / 5) * Val(Text1.Text) + 32
Else
Text1.Text = (Val(Text2.Text) - 32) * (5 / 9)
End If
End Sub

Private Sub Command2_Click()
End
End Sub

Private Sub Command3_Click()
Text1.Text = ""
Text2.Text = ""
Text1.SetFocus
End Sub
