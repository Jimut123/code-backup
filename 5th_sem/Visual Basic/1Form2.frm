VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H80000012&
   Caption         =   "Form2"
   ClientHeight    =   8175
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   14985
   LinkTopic       =   "Form2"
   ScaleHeight     =   8175
   ScaleWidth      =   14985
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "RESET"
      Height          =   615
      Left            =   12480
      TabIndex        =   17
      Top             =   3960
      Width           =   1215
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H80000010&
      Caption         =   "PAYSLIP"
      Height          =   2295
      Left            =   12120
      TabIndex        =   15
      Top             =   2640
      Width           =   2055
      Begin VB.CommandButton Command1 
         Caption         =   "PAYSLIP"
         Height          =   615
         Left            =   360
         TabIndex        =   16
         Top             =   360
         Width           =   1215
      End
   End
   Begin VB.TextBox Text5 
      Height          =   405
      Left            =   6960
      TabIndex        =   14
      Top             =   4560
      Width           =   3735
   End
   Begin VB.TextBox Text8 
      Height          =   405
      Left            =   6960
      TabIndex        =   13
      Top             =   2040
      Width           =   3735
   End
   Begin VB.TextBox Text7 
      Height          =   405
      Left            =   6960
      TabIndex        =   12
      Top             =   2880
      Width           =   3735
   End
   Begin VB.TextBox Text6 
      Height          =   405
      Left            =   6960
      TabIndex        =   11
      Top             =   3720
      Width           =   3735
   End
   Begin VB.TextBox Text4 
      Height          =   405
      Left            =   6960
      TabIndex        =   10
      Top             =   5400
      Width           =   3735
   End
   Begin VB.TextBox Text3 
      Height          =   405
      Left            =   6960
      TabIndex        =   9
      Top             =   6240
      Width           =   3735
   End
   Begin VB.TextBox Text1 
      Height          =   405
      Left            =   6960
      TabIndex        =   8
      Top             =   1320
      Width           =   3735
   End
   Begin VB.Label Label9 
      BackColor       =   &H80000011&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   3120
      TabIndex        =   18
      Top             =   7080
      Width           =   6615
   End
   Begin VB.Label Label8 
      BackColor       =   &H80000012&
      Caption         =   "PF"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   7
      Top             =   4560
      Width           =   2415
   End
   Begin VB.Label Label7 
      BackColor       =   &H80000012&
      Caption         =   "GROSS SALARY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   6
      Top             =   5400
      Width           =   2415
   End
   Begin VB.Label Label6 
      BackColor       =   &H80000012&
      Caption         =   "NET SALARY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   5
      Top             =   6240
      Width           =   2415
   End
   Begin VB.Label Label5 
      BackColor       =   &H80000012&
      Caption         =   "ENTER SALARY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   4
      Top             =   2040
      Width           =   2415
   End
   Begin VB.Label Label4 
      BackColor       =   &H80000012&
      Caption         =   "HRA"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   3
      Top             =   2880
      Width           =   2415
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000012&
      Caption         =   "DA"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   2
      Top             =   3720
      Width           =   2415
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000012&
      Caption         =   "ENTER NAME"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   2160
      TabIndex        =   1
      Top             =   1320
      Width           =   2415
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000010&
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
      Left            =   0
      TabIndex        =   0
      Top             =   240
      Width           =   15015
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text7.Text = Val(Text8.Text) * 0.15
Text6.Text = Text8.Text
Text5.Text = Val(Text8.Text) * 0.1
Text4.Text = Val(Text7.Text) + Val(Text6.Text) + Val(Text5.Text)
Text3.Text = Val(Text4.Text) - Val(Text5.Text)
Label9.Caption = "Hello Mr. " & Text1.Text & " your net salary is " & Text3.Text
End Sub

Private Sub Command2_Click()
Label9.Caption = ""
Text1.Text = ""
Text3.Text = ""
Text4.Text = ""
Text5.Text = ""
Text6.Text = ""
Text7.Text = ""
Text8.Text = ""
End Sub

