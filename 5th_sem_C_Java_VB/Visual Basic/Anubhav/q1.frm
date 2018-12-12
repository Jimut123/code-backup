VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   8670
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   15825
   LinkTopic       =   "Form1"
   ScaleHeight     =   8670
   ScaleWidth      =   15825
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command3 
      Caption         =   "Next"
      Height          =   735
      Left            =   11640
      TabIndex        =   19
      Top             =   7440
      Width           =   2295
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Retry"
      Height          =   735
      Left            =   9240
      TabIndex        =   18
      Top             =   7440
      Width           =   2055
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Score"
      Height          =   735
      Left            =   6480
      TabIndex        =   17
      Top             =   7440
      Width           =   2295
   End
   Begin VB.Frame Frame3 
      Caption         =   "Q3"
      Height          =   2175
      Left            =   360
      TabIndex        =   7
      Top             =   4920
      Width           =   14655
      Begin VB.OptionButton Option12 
         Caption         =   "Chetan Sharma"
         Height          =   495
         Left            =   10320
         TabIndex        =   16
         Top             =   1440
         Width           =   2055
      End
      Begin VB.OptionButton Option11 
         Caption         =   "Harbhajan Singh"
         Height          =   495
         Left            =   6960
         TabIndex        =   15
         Top             =   1440
         Width           =   1815
      End
      Begin VB.OptionButton Option10 
         Caption         =   "Kapil Dev"
         Height          =   495
         Left            =   3600
         TabIndex        =   14
         Top             =   1440
         Width           =   1935
      End
      Begin VB.OptionButton Option9 
         Caption         =   "Anil Kumble"
         Height          =   495
         Left            =   360
         TabIndex        =   13
         Top             =   1440
         Width           =   1815
      End
      Begin VB.Label Label3 
         Caption         =   "Who is the only bowler to get a hattrick for India in WC ?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   13.5
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   855
         Left            =   240
         TabIndex        =   20
         Top             =   360
         Width           =   13695
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "Q2"
      Height          =   2055
      Left            =   360
      TabIndex        =   6
      Top             =   2760
      Width           =   14655
      Begin VB.OptionButton Option8 
         Caption         =   "Ranjit Singh"
         Height          =   615
         Left            =   10440
         TabIndex        =   12
         Top             =   1320
         Width           =   1935
      End
      Begin VB.OptionButton Option7 
         Caption         =   "W.G.Grace"
         Height          =   615
         Left            =   7080
         TabIndex        =   11
         Top             =   1320
         Width           =   2055
      End
      Begin VB.OptionButton Option6 
         Caption         =   "Bannerman"
         Height          =   615
         Left            =   3600
         TabIndex        =   10
         Top             =   1320
         Width           =   2415
      End
      Begin VB.OptionButton Option5 
         Caption         =   "Bradman"
         Height          =   615
         Left            =   240
         TabIndex        =   9
         Top             =   1320
         Width           =   2175
      End
      Begin VB.Label Label2 
         Caption         =   "Who scored the first century in Test Cricket ?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   13.5
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   855
         Left            =   240
         TabIndex        =   8
         Top             =   240
         Width           =   14175
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "Q1"
      Height          =   2295
      Left            =   360
      TabIndex        =   0
      Top             =   240
      Width           =   14655
      Begin VB.OptionButton Option4 
         Caption         =   "Sehwag"
         Height          =   615
         Left            =   10440
         TabIndex        =   5
         Top             =   1560
         Width           =   2175
      End
      Begin VB.OptionButton Option3 
         Caption         =   "Sachin"
         Height          =   495
         Left            =   6960
         TabIndex        =   4
         Top             =   1680
         Width           =   2055
      End
      Begin VB.OptionButton Option2 
         Caption         =   "Gayle"
         Height          =   615
         Left            =   3720
         TabIndex        =   3
         Top             =   1560
         Width           =   2055
      End
      Begin VB.OptionButton Option1 
         Caption         =   "Rohit"
         Height          =   615
         Left            =   480
         TabIndex        =   2
         Top             =   1560
         Width           =   2175
      End
      Begin VB.Label Label1 
         Caption         =   "Who scored the First Double Century in One Day International Cricket?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   13.5
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   855
         Left            =   240
         TabIndex        =   1
         Top             =   240
         Width           =   14175
      End
   End
   Begin VB.Label Label4 
      Caption         =   "SCORE :"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   600
      TabIndex        =   21
      Top             =   7440
      Width           =   2775
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim marks As Integer
Private Sub Command1_Click()
If Option3.Value = True Then
  marks = marks + 4
Else
  marks = marks - 2
End If
If Option7.Value = True Then
  marks = marks + 4
Else
  marks = marks - 2
End If
If Option12.Value = True Then
  marks = marks + 4
Else
  marks = marks - 2
End If
Label4.Caption = Label4.Caption & marks
Label4.Visible = True
Label4.Caption = "SCORE : " & marks
End Sub

Private Sub Command2_Click()
marks = 0
Label4.Caption = "SCORE : "
Option1.Value = False
Option2.Value = False
Option3.Value = False
Option4.Value = False
Option5.Value = False
Option6.Value = False
Option7.Value = False
Option8.Value = False
Option9.Value = False
Option10.Value = False
Option11.Value = False
Option12.Value = False
End Sub

Private Sub Form_Activate()
Option1.Value = False
Option2.Value = False
Option3.Value = False
Option4.Value = False
Option5.Value = False
Option6.Value = False
Option7.Value = False
Option8.Value = False
Option9.Value = False
Option10.Value = False
Option11.Value = False
Option12.Value = False
End Sub

