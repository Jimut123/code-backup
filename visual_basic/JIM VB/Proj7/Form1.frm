VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6240
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12465
   LinkTopic       =   "Form1"
   ScaleHeight     =   6240
   ScaleWidth      =   12465
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text2 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   5760
      TabIndex        =   6
      Top             =   4920
      Width           =   3015
   End
   Begin VB.TextBox Text1 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   960
      TabIndex        =   5
      Top             =   4920
      Width           =   3015
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Command1"
      Height          =   495
      Left            =   4200
      TabIndex        =   4
      Top             =   2880
      Width           =   1095
   End
   Begin VB.ComboBox Combo2 
      Height          =   315
      Left            =   6480
      TabIndex        =   2
      Text            =   "Select CEO/Founder"
      Top             =   2280
      Width           =   2055
   End
   Begin VB.ComboBox Combo1 
      Height          =   315
      Left            =   1080
      TabIndex        =   1
      Text            =   "Select Company"
      Top             =   2280
      Width           =   2055
   End
   Begin VB.Label Label2 
      BackColor       =   &H00404040&
      Caption         =   "You selected Company and CEO/Founder"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C0E0FF&
      Height          =   735
      Left            =   3120
      TabIndex        =   3
      Top             =   3840
      Width           =   3615
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00404040&
      Caption         =   "COMBO BOX"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H0080FF80&
      Height          =   855
      Left            =   1560
      TabIndex        =   0
      Top             =   360
      Width           =   7575
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text1.Text = Combo1.List(Combo1.ListIndex)
Text2.Text = Combo2.List(Combo2.ListIndex)

End Sub

Private Sub Form_Load()
    Combo1.AddItem "facebook"
    Combo1.AddItem "twitter"
    Combo1.AddItem "micro-soft"
    Combo1.AddItem "google"
    Combo1.AddItem "Alibaba"
    Combo1.AddItem "Apple"
    
    Combo2.AddItem "Mark Zuckerberg"
    Combo2.AddItem "twitter"
    Combo2.AddItem "Bill Gates"
    Combo2.AddItem "Larry Page/ Sergie Brin/ Sundar Pichai"
    Combo2.AddItem "Jack Ma"
    Combo2.AddItem "Steve Jobbs"
End Sub
