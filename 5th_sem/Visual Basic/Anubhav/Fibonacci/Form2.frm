VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   8370
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   15090
   LinkTopic       =   "Form2"
   ScaleHeight     =   8370
   ScaleWidth      =   15090
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "Reset"
      Height          =   615
      Left            =   10800
      TabIndex        =   16
      Top             =   2400
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Generate"
      Height          =   615
      Left            =   10680
      TabIndex        =   15
      Top             =   1320
      Width           =   1935
   End
   Begin VB.TextBox nst 
      Height          =   735
      Left            =   4920
      TabIndex        =   14
      Top             =   7200
      Width           =   4335
   End
   Begin VB.TextBox gst 
      Height          =   735
      Left            =   4920
      TabIndex        =   13
      Top             =   6240
      Width           =   4335
   End
   Begin VB.TextBox pft 
      Height          =   735
      Left            =   4920
      TabIndex        =   12
      Top             =   5280
      Width           =   4335
   End
   Begin VB.TextBox dat 
      Height          =   735
      Left            =   4920
      TabIndex        =   11
      Top             =   4320
      Width           =   4335
   End
   Begin VB.TextBox hrat 
      Height          =   735
      Left            =   4920
      TabIndex        =   10
      Top             =   3360
      Width           =   4335
   End
   Begin VB.TextBox bst 
      Height          =   735
      Left            =   4920
      TabIndex        =   9
      Top             =   2280
      Width           =   4335
   End
   Begin VB.TextBox name1 
      Height          =   735
      Left            =   4920
      TabIndex        =   8
      Top             =   1320
      Width           =   4335
   End
   Begin VB.Label Label9 
      Height          =   855
      Left            =   10080
      TabIndex        =   17
      Top             =   3600
      Width           =   3375
   End
   Begin VB.Label Label8 
      Caption         =   "  Net Salary"
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
      Left            =   1560
      TabIndex        =   7
      Top             =   7200
      Width           =   3015
   End
   Begin VB.Label Label7 
      Caption         =   "   Gross Salary"
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
      Left            =   1560
      TabIndex        =   6
      Top             =   6240
      Width           =   3015
   End
   Begin VB.Label Label6 
      Caption         =   "      PF :"
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
      Left            =   1560
      TabIndex        =   5
      Top             =   5280
      Width           =   3015
   End
   Begin VB.Label Label5 
      Caption         =   "     HRA : "
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
      Left            =   1560
      TabIndex        =   4
      Top             =   4320
      Width           =   3015
   End
   Begin VB.Label Label4 
      Caption         =   "      DA :"
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
      Left            =   1560
      TabIndex        =   3
      Top             =   3360
      Width           =   3015
   End
   Begin VB.Label Label3 
      Caption         =   "Enter your basic salary"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1560
      TabIndex        =   2
      Top             =   2400
      Width           =   3015
   End
   Begin VB.Label Label2 
      Caption         =   "Enter Your Name"
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
      Left            =   1560
      TabIndex        =   1
      Top             =   1440
      Width           =   3015
   End
   Begin VB.Label Label1 
      Caption         =   "PAYSLIP CALCULATOR"
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
      Left            =   3360
      TabIndex        =   0
      Top             =   360
      Width           =   6735
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim bs As Double, da As Double, hra As Double, pf As Double, gs As Double, ns As Double
Private Sub Command1_Click()
bs = Val(bst.Text)
da = 1 * bs
hra = 0.15 * bs
pf = 0.12 * bs
gs = bs + da + hra + pf
ns = gs - pf
bst.Text = bs
hrat.Text = hra
dat.Text = da
pft.Text = pf
gst.Text = gs
nst.Text = ns
Label9.Visible = True
Label9.Caption = "Hello, " & name1.Text & " Your Gross Salary is : " & gst.Text
End Sub

Private Sub Command2_Click()
bst.Text = " "
hrat.Text = " "
dat.Text = " "
pft.Text = " "
gst.Text = " "
nst.Text = " "
name1.Text = " "
Label9.Visible = False
End Sub

