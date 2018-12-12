VERSION 5.00
Begin VB.Form Form3 
   BackColor       =   &H00000000&
   Caption         =   "Form3"
   ClientHeight    =   8430
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   10335
   LinkTopic       =   "Form3"
   ScaleHeight     =   8430
   ScaleWidth      =   10335
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame Frame5 
      BackColor       =   &H80000012&
      Caption         =   "SCORE"
      ForeColor       =   &H8000000B&
      Height          =   735
      Left            =   6600
      TabIndex        =   27
      Top             =   7320
      Width           =   3375
      Begin VB.TextBox Text1 
         Height          =   405
         Left            =   720
         TabIndex        =   28
         Top             =   240
         Width           =   2535
      End
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H80000011&
      Caption         =   "SCORE"
      Height          =   615
      Left            =   3480
      TabIndex        =   26
      Top             =   7440
      Width           =   2655
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H80000011&
      Caption         =   "RESET"
      Height          =   615
      Left            =   240
      TabIndex        =   25
      Top             =   7440
      Width           =   2655
   End
   Begin VB.Frame Frame4 
      BackColor       =   &H80000011&
      Caption         =   "Q4"
      ForeColor       =   &H8000000B&
      Height          =   1335
      Left            =   240
      TabIndex        =   19
      Top             =   5880
      Width           =   9735
      Begin VB.OptionButton Option16 
         BackColor       =   &H00000000&
         Caption         =   "potate"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   600
         TabIndex        =   23
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option15 
         BackColor       =   &H00000000&
         Caption         =   "paracetamolate"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   4920
         TabIndex        =   22
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option14 
         BackColor       =   &H00000000&
         Caption         =   "date"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   6960
         TabIndex        =   21
         Top             =   720
         Width           =   1695
      End
      Begin VB.OptionButton Option13 
         BackColor       =   &H00000000&
         Caption         =   "tomate"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   2760
         TabIndex        =   20
         Top             =   720
         Width           =   1575
      End
      Begin VB.Label Label5 
         BackColor       =   &H00000000&
         Caption         =   "  Complete the sentence, ""Haters gonna hate, potatoes gonna _________""."
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   360
         TabIndex        =   24
         Top             =   240
         Width           =   9135
      End
   End
   Begin VB.Frame Frame3 
      BackColor       =   &H80000011&
      Caption         =   "Q3"
      ForeColor       =   &H8000000B&
      Height          =   1335
      Left            =   240
      TabIndex        =   13
      Top             =   4200
      Width           =   9735
      Begin VB.OptionButton Option12 
         BackColor       =   &H00000000&
         Caption         =   "veg chilli chicken"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   2760
         TabIndex        =   18
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option11 
         BackColor       =   &H00000000&
         Caption         =   "potato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   6960
         TabIndex        =   16
         Top             =   720
         Width           =   1695
      End
      Begin VB.OptionButton Option10 
         BackColor       =   &H00000000&
         Caption         =   "chowmein"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   4920
         TabIndex        =   15
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option9 
         BackColor       =   &H00000000&
         Caption         =   "pineapple pizza"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   600
         TabIndex        =   14
         Top             =   720
         Width           =   1575
      End
      Begin VB.Label Label4 
         BackColor       =   &H00000000&
         Caption         =   "  According to Rahul Modi which food item can be converted to gold using a machine?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   360
         TabIndex        =   17
         Top             =   240
         Width           =   9135
      End
   End
   Begin VB.OptionButton Option8 
      BackColor       =   &H00000000&
      Caption         =   "ladyfinger"
      ForeColor       =   &H8000000B&
      Height          =   375
      Left            =   3000
      TabIndex        =   12
      Top             =   3240
      Width           =   1575
   End
   Begin VB.Frame Frame2 
      BackColor       =   &H80000011&
      Caption         =   "Q2"
      ForeColor       =   &H8000000B&
      Height          =   1335
      Left            =   240
      TabIndex        =   7
      Top             =   2520
      Width           =   9735
      Begin VB.OptionButton Option7 
         BackColor       =   &H00000000&
         Caption         =   "tomato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   600
         TabIndex        =   10
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option6 
         BackColor       =   &H00000000&
         Caption         =   "potato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   4920
         TabIndex        =   9
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option5 
         BackColor       =   &H00000000&
         Caption         =   "cabbage"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   6960
         TabIndex        =   8
         Top             =   720
         Width           =   1695
      End
      Begin VB.Label Label3 
         BackColor       =   &H00000000&
         Caption         =   "  Which vegetable has been named the best vegetable by UNESCO?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   360
         TabIndex        =   11
         Top             =   240
         Width           =   9135
      End
   End
   Begin VB.OptionButton Option2 
      BackColor       =   &H00000000&
      Caption         =   "very rare potato"
      ForeColor       =   &H8000000B&
      Height          =   375
      Left            =   3000
      TabIndex        =   4
      Top             =   1560
      Width           =   1695
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H80000011&
      Caption         =   "Q1"
      ForeColor       =   &H8000000B&
      Height          =   1335
      Left            =   240
      TabIndex        =   1
      Top             =   840
      Width           =   9735
      Begin VB.OptionButton Option4 
         BackColor       =   &H00000000&
         Caption         =   "common potato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   6960
         TabIndex        =   6
         Top             =   720
         Width           =   1695
      End
      Begin VB.OptionButton Option3 
         BackColor       =   &H00000000&
         Caption         =   "not rare potato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   4920
         TabIndex        =   5
         Top             =   720
         Width           =   1575
      End
      Begin VB.OptionButton Option1 
         BackColor       =   &H00000000&
         Caption         =   "rare potato"
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   600
         TabIndex        =   3
         Top             =   720
         Width           =   1575
      End
      Begin VB.Label Label2 
         BackColor       =   &H00000000&
         Caption         =   "  Which is the rarest potato in the world?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H8000000B&
         Height          =   375
         Left            =   360
         TabIndex        =   2
         Top             =   240
         Width           =   9135
      End
   End
   Begin VB.Label Label1 
      BackColor       =   &H00000000&
      Caption         =   "POTATO QUIZ"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   -1  'True
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   3240
      TabIndex        =   0
      Top             =   120
      Width           =   3855
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim marks As Integer
Private Sub Command1_Click()
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
Option13.Value = False
Option14.Value = False
Option15.Value = False
Option16.Value = False
Text1.Text = " "
End Sub

Private Sub Command2_Click()
If Option2.Value = True Then
marks = marks + 4
ElseIf Option3.Value = True Then
marks = marks - 2
ElseIf Option1.Value = True Then
marks = marks - 2
ElseIf Option4.Value = True Then
marks = marks - 2
End If
If Option6.Value = True Then
marks = marks + 4
ElseIf Option7.Value = True Then
marks = marks - 2
ElseIf Option8.Value = True Then
marks = marks - 2
ElseIf Option5.Value = True Then
marks = marks - 2
End If
If Option11.Value = True Then
marks = marks + 4
ElseIf Option9.Value = True Then
marks = marks - 2
ElseIf Option10.Value = True Then
marks = marks - 2
ElseIf Option11.Value = True Then
marks = marks - 2
End If
If Option16.Value = True Then
marks = marks + 4
ElseIf Option13.Value = True Then
marks = marks - 2
ElseIf Option14.Value = True Then
marks = marks - 2
ElseIf Option15.Value = True Then
marks = marks - 2
End If
Text1.Text = marks
Form4.Show
Form3.Hide
End Sub

Private Sub Timer1_Timer()

End Sub

