VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H00FFFFFF&
   Caption         =   "Form2"
   ClientHeight    =   6690
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12555
   LinkTopic       =   "Form2"
   ScaleHeight     =   6690
   ScaleWidth      =   12555
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   10080
      TabIndex        =   16
      Text            =   "Text1"
      Top             =   5640
      Visible         =   0   'False
      Width           =   1815
   End
   Begin VB.CommandButton Command6 
      Caption         =   "&Retry"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7680
      TabIndex        =   14
      Top             =   5640
      Width           =   2055
   End
   Begin VB.CommandButton Command5 
      Caption         =   "&Score"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   3120
      TabIndex        =   13
      Top             =   5640
      Width           =   1935
   End
   Begin VB.CommandButton Command4 
      Caption         =   "&Prev"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   840
      TabIndex        =   12
      Top             =   5640
      Width           =   1815
   End
   Begin VB.Frame Frame2 
      BackColor       =   &H00C0E0FF&
      Caption         =   "Q5"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2175
      Left            =   360
      TabIndex        =   1
      Top             =   2640
      Width           =   11775
      Begin VB.OptionButton Option20 
         Caption         =   "James Gosling"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   8880
         TabIndex        =   11
         Top             =   1440
         Width           =   2535
      End
      Begin VB.OptionButton Option19 
         Caption         =   "Dennis Ritchie"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   5880
         TabIndex        =   10
         Top             =   1440
         Width           =   2655
      End
      Begin VB.OptionButton Option18 
         Caption         =   "D. Heinmier Hansson"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3240
         TabIndex        =   9
         Top             =   1440
         Width           =   2175
      End
      Begin VB.OptionButton Option17 
         Caption         =   "YukiHiro Matsumoto"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   600
         TabIndex        =   8
         Top             =   1440
         Width           =   2175
      End
      Begin VB.Label Label5 
         Caption         =   "Who created Ruby-On-Rails ?"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   13.5
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   735
         Left            =   480
         TabIndex        =   7
         Top             =   480
         Width           =   11055
      End
   End
   Begin VB.Frame Frame4 
      BackColor       =   &H00C0E0FF&
      Caption         =   "Q4"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2175
      Left            =   360
      TabIndex        =   0
      Top             =   120
      Width           =   11775
      Begin VB.OptionButton Option16 
         Caption         =   "Elon Musk"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   9000
         TabIndex        =   6
         Top             =   1560
         Width           =   2415
      End
      Begin VB.OptionButton Option15 
         Caption         =   "Dennis Ritchie"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   5880
         TabIndex        =   5
         Top             =   1560
         Width           =   2775
      End
      Begin VB.OptionButton Option14 
         Caption         =   "Jack Ma"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3120
         TabIndex        =   4
         Top             =   1560
         Width           =   2295
      End
      Begin VB.OptionButton Option13 
         Caption         =   "Mark Zuckerberg"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   480
         TabIndex        =   3
         Top             =   1560
         Width           =   2295
      End
      Begin VB.Label Label4 
         Caption         =   "Who is the youngest billionare till now?"
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
         Left            =   360
         TabIndex        =   2
         Top             =   360
         Width           =   11055
      End
   End
   Begin VB.Label Label7 
      Caption         =   "Score:"
      Height          =   615
      Left            =   5520
      TabIndex        =   15
      Top             =   5640
      Visible         =   0   'False
      Width           =   1695
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Option Explicit
Dim k As Integer    ' k is the score counter

Private Sub Command4_Click()
     Form2.Hide
     Form1.Show
End Sub

Private Sub Command5_Click()

If Option13.Value = True Then
    k = k + 4
Else
    k = k - 2
End If

If Option18.Value = True Then
    k = k + 4
Else
    k = k - 2
End If

'Text2.Text = k

Text1.Text = k

Label7.Caption = "Score: " & Val(Form1.Text1.Text) + Val(Form2.Text1.Text)

Label7.Visible = True
End Sub

Private Sub Command6_Click()
Option13.Value = False
Option14.Value = False
Option15.Value = False
Option16.Value = False
Option17.Value = False
Option18.Value = False
Option19.Value = False
Option20.Value = False
Label7.Visible = False
End Sub


Private Sub Form_Activate()
Command6_Click
End Sub

