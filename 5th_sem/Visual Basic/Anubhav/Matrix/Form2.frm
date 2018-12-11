VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   6720
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12285
   LinkTopic       =   "Form2"
   ScaleHeight     =   6720
   ScaleWidth      =   12285
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   7080
      TabIndex        =   7
      Top             =   5280
      Width           =   2775
   End
   Begin VB.CommandButton Command1 
      Caption         =   "SELECT CAPT"
      Height          =   735
      Left            =   4920
      TabIndex        =   6
      Top             =   3840
      Width           =   2295
   End
   Begin VB.ComboBox Combo2 
      Height          =   315
      Left            =   6720
      TabIndex        =   5
      Text            =   "Combo1"
      Top             =   2040
      Width           =   3495
   End
   Begin VB.ComboBox Combo1 
      Height          =   315
      ItemData        =   "Form2.frx":0000
      Left            =   1680
      List            =   "Form2.frx":0002
      TabIndex        =   4
      Text            =   "Combo1"
      Top             =   2040
      Width           =   3495
   End
   Begin VB.Label Label4 
      Caption         =   "   YOU SELECTED"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   600
      TabIndex        =   3
      Top             =   5400
      Width           =   4695
   End
   Begin VB.Label Label3 
      Caption         =   "    CAPTAIN"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   6840
      TabIndex        =   2
      Top             =   2760
      Width           =   3375
   End
   Begin VB.Label Label2 
      Caption         =   "      TEAM"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1680
      TabIndex        =   1
      Top             =   2760
      Width           =   3375
   End
   Begin VB.Label Label1 
      Caption         =   "      COMBO BOX"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   2640
      TabIndex        =   0
      Top             =   240
      Width           =   5175
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text1.Text = Combo2.List(Combo1.ListIndex)
Combo2.Text = Combo2.List(Combo1.ListIndex)
End Sub

Private Sub Form_Load()
Combo1.AddItem "India"
Combo1.AddItem "Pakistan"
Combo1.AddItem "Australia"
Combo1.AddItem "England"
Combo1.AddItem "SriLanka"
Combo1.AddItem "South Africa"
Combo1.AddItem "Bangladesh"
Combo1.AddItem "West Indies"

Combo2.AddItem "Virat"
Combo2.AddItem "Sarfaraz"
Combo2.AddItem "Warner"
Combo2.AddItem "Root"
Combo2.AddItem "Mathews"
Combo2.AddItem "DuPlessy"
Combo2.AddItem "Shakib"
Combo2.AddItem "Holder"
End Sub
