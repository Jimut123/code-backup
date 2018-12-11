VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00000040&
   Caption         =   "Form1"
   ClientHeight    =   5220
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   10110
   LinkTopic       =   "Form1"
   ScaleHeight     =   5220
   ScaleWidth      =   10110
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   525
      Left            =   5280
      TabIndex        =   6
      Top             =   4080
      Width           =   3255
   End
   Begin VB.CommandButton Command1 
      Caption         =   "SELECT CAPTAIN"
      Height          =   495
      Left            =   3960
      TabIndex        =   5
      Top             =   3240
      Width           =   2055
   End
   Begin VB.ComboBox Combo2 
      Height          =   315
      Left            =   5640
      TabIndex        =   2
      Text            =   "Combo1"
      Top             =   1800
      Width           =   3255
   End
   Begin VB.ComboBox Combo1 
      Height          =   315
      Left            =   1200
      TabIndex        =   1
      Text            =   "Combo1"
      Top             =   1800
      Width           =   3255
   End
   Begin VB.Label Label4 
      Alignment       =   2  'Center
      BackColor       =   &H00C0E0FF&
      Caption         =   "CAPTAIN :"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1680
      TabIndex        =   7
      Top             =   4080
      Width           =   3255
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00C0E0FF&
      Caption         =   "CAPTAIN"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5640
      TabIndex        =   4
      Top             =   2400
      Width           =   3255
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00C0E0FF&
      Caption         =   "TEAM"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1200
      TabIndex        =   3
      Top             =   2400
      Width           =   3255
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00C0E0FF&
      Caption         =   "COMBO BOX"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   1800
      TabIndex        =   0
      Top             =   360
      Width           =   6495
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Combo2.Text = Combo2.List(Combo1.ListIndex)
Text1.Text = Combo2.Text
End Sub

Private Sub Form_Load()
 Combo1.AddItem "India"
 Combo1.AddItem "England"
 Combo1.AddItem "Australia"
 Combo1.AddItem "South Africa"
 Combo1.AddItem "Pakistan"
 Combo1.AddItem "Sri Lanka"
 Combo1.AddItem "West Indies"
 Combo1.AddItem "New Zealand"
 Combo2.AddItem "Virat Kohli"
 Combo2.AddItem "Alaister Cook"
 Combo2.AddItem "Steve Smith"
 Combo2.AddItem "Faf du Plesis"
 Combo2.AddItem "Sarfaraz Khan"
 Combo2.AddItem "Angelo Matthews"
 Combo2.AddItem "Darren Sammy"
 Combo2.AddItem "Kane Williamson"
End Sub
