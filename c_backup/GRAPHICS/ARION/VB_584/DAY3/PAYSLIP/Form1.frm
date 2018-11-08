VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000013&
   Caption         =   "Form1"
   ClientHeight    =   8760
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9720
   LinkTopic       =   "Form1"
   ScaleHeight     =   8760
   ScaleWidth      =   9720
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "RESET"
      Height          =   375
      Left            =   7560
      TabIndex        =   16
      Top             =   7320
      Width           =   1935
   End
   Begin VB.CommandButton Command1 
      Caption         =   "CALCULATE"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   14.25
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   2880
      TabIndex        =   15
      Top             =   7200
      Width           =   3255
   End
   Begin VB.TextBox Text7 
      Alignment       =   2  'Center
      BackColor       =   &H80000000&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "MS Serif"
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
      Top             =   6360
      Width           =   3495
   End
   Begin VB.TextBox Text6 
      BackColor       =   &H80000000&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   13
      Top             =   2040
      Width           =   3735
   End
   Begin VB.TextBox Text5 
      Alignment       =   2  'Center
      BackColor       =   &H80000000&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   12
      Top             =   3000
      Width           =   3135
   End
   Begin VB.TextBox Text4 
      Alignment       =   2  'Center
      BackColor       =   &H80000000&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   11
      Top             =   3840
      Width           =   3135
   End
   Begin VB.TextBox Text3 
      Alignment       =   2  'Center
      BackColor       =   &H80000000&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   10
      Top             =   4680
      Width           =   3135
   End
   Begin VB.TextBox Text2 
      Alignment       =   2  'Center
      BackColor       =   &H80000000&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "MS Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   9
      Top             =   5640
      Width           =   3495
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H80000000&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   4560
      TabIndex        =   8
      Top             =   1320
      Width           =   3735
   End
   Begin VB.Label Label9 
      Alignment       =   2  'Center
      BackColor       =   &H80000013&
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   15.75
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   17
      Top             =   7920
      Width           =   9015
   End
   Begin VB.Label Label8 
      BackColor       =   &H80000011&
      Caption         =   "  DA:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro M"
         Size            =   15.75
         Charset         =   0
         Weight          =   500
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   7
      Top             =   3120
      Width           =   3495
   End
   Begin VB.Label Label7 
      BackColor       =   &H80000011&
      Caption         =   "  HRA:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro M"
         Size            =   15.75
         Charset         =   0
         Weight          =   500
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   6
      Top             =   3960
      Width           =   3495
   End
   Begin VB.Label Label6 
      BackColor       =   &H80000011&
      Caption         =   "  PF:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro M"
         Size            =   15.75
         Charset         =   0
         Weight          =   500
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   5
      Top             =   4800
      Width           =   3495
   End
   Begin VB.Label Label5 
      BackColor       =   &H80000010&
      Caption         =   "GROSS  SALARY:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro H"
         Size            =   15.75
         Charset         =   0
         Weight          =   900
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   4
      Top             =   5640
      Width           =   3495
   End
   Begin VB.Label Label4 
      BackColor       =   &H80000010&
      Caption         =   "NET SALARY:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro H"
         Size            =   15.75
         Charset         =   0
         Weight          =   900
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   3
      Top             =   6360
      Width           =   3495
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000010&
      Caption         =   "ENTER BASIC SALARY:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro H"
         Size            =   15.75
         Charset         =   0
         Weight          =   900
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   2
      Top             =   2160
      Width           =   3495
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000010&
      Caption         =   "ENTER NAME:"
      BeginProperty Font 
         Name            =   "Kozuka Mincho Pro H"
         Size            =   15.75
         Charset         =   0
         Weight          =   900
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   1
      Top             =   1440
      Width           =   3495
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000013&
      Caption         =   "PAYSLIP GENERATOR"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   26.25
         Charset         =   0
         Weight          =   700
         Underline       =   -1  'True
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000002&
      Height          =   735
      Left            =   1080
      TabIndex        =   0
      Top             =   240
      Width           =   6615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim b, da, hra, pf, gs, ns As Double

Private Sub Command1_Click()
b = Val(Text6.Text)
da = 1 * b
hra = 0.15 * b
pf = 0.12 * b
gs = bs + da + hra + pf
ns = gs - pf
Text5.Text = da
Text4.Text = hra
Text3.Text = pf
Text2.Text = gs
Text7.Text = ns
Label9.Visible = True
Label9.Caption = "Hello, " & Text1.Text & " Your Gross Salary is : Rs. " & Text2.Text

End Sub

Private Sub Command2_Click()
Text5.Text = ""
Text4.Text = ""
Text3.Text = ""
Text2.Text = ""
Text7.Text = ""
Text1.Text = ""
Text6.Text = ""
Label9.Visible = False
End Sub

Private Sub Form_Load()
Label9.Visible = False
Text1.Text = ""
End Sub

