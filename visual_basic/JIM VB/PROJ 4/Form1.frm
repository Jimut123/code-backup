VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7545
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   14715
   LinkTopic       =   "Form1"
   ScaleHeight     =   7545
   ScaleWidth      =   14715
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox netf 
      Height          =   495
      Left            =   3240
      TabIndex        =   17
      Top             =   5520
      Width           =   1815
   End
   Begin VB.TextBox grossf 
      Height          =   495
      Left            =   3240
      TabIndex        =   16
      Top             =   4800
      Width           =   1815
   End
   Begin VB.TextBox pff 
      Height          =   495
      Left            =   3240
      TabIndex        =   15
      Top             =   4080
      Width           =   1815
   End
   Begin VB.TextBox hraf 
      Height          =   495
      Left            =   3240
      TabIndex        =   14
      Top             =   3360
      Width           =   1815
   End
   Begin VB.TextBox daf 
      Height          =   495
      Left            =   3240
      TabIndex        =   13
      Top             =   2520
      Width           =   1815
   End
   Begin VB.TextBox salf 
      Height          =   495
      Left            =   3240
      TabIndex        =   12
      Top             =   1920
      Width           =   1815
   End
   Begin VB.TextBox namef 
      Height          =   495
      Left            =   3240
      TabIndex        =   11
      Top             =   1200
      Width           =   1815
   End
   Begin VB.Frame Frame1 
      Caption         =   "Frame1"
      Height          =   3135
      Left            =   8520
      TabIndex        =   0
      Top             =   840
      Width           =   2415
      Begin VB.CommandButton reset 
         Caption         =   "&RESET"
         Height          =   735
         Left            =   360
         TabIndex        =   2
         Top             =   1920
         Width           =   1695
      End
      Begin VB.CommandButton payslip 
         Caption         =   "&PAYSLIP"
         Height          =   735
         Left            =   360
         TabIndex        =   1
         Top             =   720
         Width           =   1695
      End
   End
   Begin VB.Label down 
      Height          =   1575
      Left            =   6360
      TabIndex        =   18
      Top             =   4320
      Width           =   6015
   End
   Begin VB.Label Label8 
      Caption         =   "Net"
      Height          =   375
      Left            =   840
      TabIndex        =   10
      Top             =   5640
      Width           =   2055
   End
   Begin VB.Label Label7 
      Caption         =   "Gross"
      Height          =   375
      Left            =   840
      TabIndex        =   9
      Top             =   4800
      Width           =   2055
   End
   Begin VB.Label Label6 
      Caption         =   "P.F."
      Height          =   375
      Left            =   840
      TabIndex        =   8
      Top             =   4080
      Width           =   2055
   End
   Begin VB.Label Label5 
      Caption         =   "H.R.A."
      Height          =   375
      Left            =   840
      TabIndex        =   7
      Top             =   3360
      Width           =   2055
   End
   Begin VB.Label Label4 
      Caption         =   "D. A."
      Height          =   375
      Left            =   840
      TabIndex        =   6
      Top             =   2640
      Width           =   2055
   End
   Begin VB.Label Label3 
      Caption         =   "Basic Sal"
      Height          =   375
      Left            =   840
      TabIndex        =   5
      Top             =   2040
      Width           =   2055
   End
   Begin VB.Label Label2 
      Caption         =   "Name"
      Height          =   375
      Left            =   840
      TabIndex        =   4
      Top             =   1320
      Width           =   2055
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "PAYSLIP CALCULATOR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   495
      Left            =   1080
      TabIndex        =   3
      Top             =   360
      Width           =   6615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Option Explicit
Dim basic_sal, da, hra, pf, gross, net As Integer
Dim name As String

Private Sub payslip_Click()
name = namef.Text
basic_sal = Val(salf.Text)
da = basic_sal
hra = 0.15 * basic_sal
pf = 0.12 * basic_sal
gross = basic_sal + da + hra + pf
net = gross - pf
daf.Text = da
hraf.Text = hra
pff.Text = pf
grossf.Text = gross
netf.Text = net
down.Caption = "Hello ! " & namef.Text & " Your gross salary is : " & grossf.Text
End Sub

Private Sub reset_Click()
namef.Text = ""
salf.Text = ""
daf.Text = ""
hraf.Text = ""
pff.Text = ""
grossf.Text = ""
netf.Text = ""
down.Caption = ""
End Sub
