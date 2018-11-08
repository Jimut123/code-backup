VERSION 5.00
Begin VB.Form Form3 
   BackColor       =   &H00C0E0FF&
   Caption         =   "Form3"
   ClientHeight    =   6096
   ClientLeft      =   108
   ClientTop       =   432
   ClientWidth     =   11736
   LinkTopic       =   "Form3"
   ScaleHeight     =   6096
   ScaleWidth      =   11736
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   372
      Left            =   480
      TabIndex        =   16
      Text            =   "Text1"
      Top             =   5280
      Width           =   852
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H0080FF80&
      Caption         =   "&RESET"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   492
      Left            =   4440
      MaskColor       =   &H00C0E0FF&
      Style           =   1  'Graphical
      TabIndex        =   15
      Top             =   5280
      Width           =   2052
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H0080FF80&
      Caption         =   "&Next"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   492
      Left            =   6840
      MaskColor       =   &H00C0E0FF&
      Style           =   1  'Graphical
      TabIndex        =   14
      Top             =   5280
      Width           =   2052
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H0080FF80&
      Caption         =   "&Prev"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   492
      Left            =   2040
      MaskColor       =   &H00C0E0FF&
      Style           =   1  'Graphical
      TabIndex        =   13
      Top             =   5280
      Width           =   2052
   End
   Begin VB.OptionButton Option9 
      Caption         =   "To blow parent's money"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   7440
      TabIndex        =   12
      Top             =   4680
      Width           =   3012
   End
   Begin VB.OptionButton Option8 
      Caption         =   "To write shit codes"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   4080
      TabIndex        =   11
      Top             =   4680
      Width           =   3012
   End
   Begin VB.OptionButton Option7 
      Caption         =   "To spread hatred"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   600
      TabIndex        =   10
      Top             =   4680
      Width           =   3012
   End
   Begin VB.OptionButton Option6 
      Caption         =   "Lobby"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   7440
      TabIndex        =   9
      Top             =   3240
      Width           =   3012
   End
   Begin VB.OptionButton Option5 
      Caption         =   "Hobby"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   4080
      TabIndex        =   8
      Top             =   3240
      Width           =   3012
   End
   Begin VB.OptionButton Option4 
      Caption         =   "CIA"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   720
      TabIndex        =   7
      Top             =   3240
      Width           =   3012
   End
   Begin VB.OptionButton Option3 
      Caption         =   "Sarthak Gupta"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   7440
      TabIndex        =   6
      Top             =   1800
      Width           =   3012
   End
   Begin VB.OptionButton Option2 
      Caption         =   "To see Hitesh Chowdhury"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4080
      TabIndex        =   5
      Top             =   1680
      Width           =   3012
   End
   Begin VB.OptionButton Option1 
      Caption         =   "To join Xavier's"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   372
      Left            =   720
      TabIndex        =   4
      Top             =   1800
      Width           =   3012
   End
   Begin VB.Label Label4 
      Caption         =   "Q3. Why do you even exist?"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   600
      TabIndex        =   3
      Top             =   3840
      Width           =   9852
   End
   Begin VB.Label Label3 
      Caption         =   "Q2. What made you here ?"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   600
      TabIndex        =   2
      Top             =   2400
      Width           =   9852
   End
   Begin VB.Label Label2 
      Caption         =   "Q1. What is the biggest mistake of your life ?"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   600
      TabIndex        =   1
      Top             =   960
      Width           =   9852
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFFF&
      Caption         =   "QUIZ TIME"
      BeginProperty Font 
         Name            =   "Palatino Linotype"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   5772
      Left            =   240
      TabIndex        =   0
      Top             =   120
      Width           =   11292
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim score As Integer, strin As String

Private Sub Command1_Click()
Form3.Hide
Form2.Show
End Sub

Private Sub Command2_Click()
If Option1.Value = True Then
    score = score + 4
Else
    score = score - 2
End If
If Option4.Value = True Then
    score = score + 4
Else
    score = score - 2
End If
If Option9.Value = True Then
    score = score + 4
Else
    score = score - 2
End If

If score = 12 Then
    strin = "YOU HAVE WON BUT YOU STILL HAVE TO DO VISUAL BASIC TOMORROW"
Else
    strin = "YOU ARE A PILE OF SHIT :)"
End If
Text1.Text = strin
Form3.Hide
Form4.Show
End Sub

Private Sub Command3_Click()
Option1.Value = False
Option2.Value = False
Option3.Value = False
Option4.Value = False
Option5.Value = False
Option6.Value = False
Option7.Value = False
Option8.Value = False
Option9.Value = False
End Sub

Private Sub Form_Activate()
Command3_Click
End Sub

