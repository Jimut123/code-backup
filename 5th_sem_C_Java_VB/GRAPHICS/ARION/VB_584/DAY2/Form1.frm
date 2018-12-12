VERSION 5.00
Begin VB.Form Form1 
   AutoRedraw      =   -1  'True
   BackColor       =   &H80000013&
   Caption         =   "Form1"
   ClientHeight    =   8460
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   13005
   LinkTopic       =   "Form1"
   ScaleHeight     =   8460
   ScaleWidth      =   13005
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text2 
      BackColor       =   &H80000013&
      BorderStyle     =   0  'None
      BeginProperty Font 
         Name            =   "MS Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   4320
      TabIndex        =   20
      Text            =   "Time Remaining: "
      Top             =   7320
      Width           =   4935
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   3240
      Top             =   7320
   End
   Begin VB.CommandButton Command2 
      Caption         =   "&RESET"
      Height          =   375
      Left            =   360
      TabIndex        =   19
      Top             =   7320
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "&NEXT>>>"
      Height          =   375
      Left            =   11040
      TabIndex        =   18
      Top             =   7320
      Width           =   1695
   End
   Begin VB.Frame Frame3 
      BackColor       =   &H80000002&
      Caption         =   "Question3"
      Height          =   2175
      Left            =   240
      TabIndex        =   8
      Top             =   4920
      Width           =   12615
      Begin VB.OptionButton Option12 
         BackColor       =   &H80000000&
         Caption         =   "Zindagi"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   10800
         TabIndex        =   17
         Top             =   1560
         Width           =   1695
      End
      Begin VB.OptionButton Option11 
         BackColor       =   &H80000000&
         Caption         =   "Tu bin bataye"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   6720
         TabIndex        =   16
         Top             =   1560
         Width           =   2415
      End
      Begin VB.OptionButton Option10 
         BackColor       =   &H80000000&
         Caption         =   "Tere liye"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3240
         TabIndex        =   15
         Top             =   1560
         Width           =   1695
      End
      Begin VB.OptionButton Option9 
         BackColor       =   &H80000000&
         Caption         =   "Jay ho"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   120
         TabIndex        =   14
         Top             =   1560
         Width           =   1695
      End
      Begin VB.Label Label3 
         BackColor       =   &H80000002&
         Caption         =   "Which song of Slumdog Millionaire received Oscar Prize?"
         BeginProperty Font 
            Name            =   "Myriad Pro Light"
            Size            =   15.75
            Charset         =   0
            Weight          =   600
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   9
         Top             =   480
         Width           =   12135
      End
   End
   Begin VB.Frame Frame2 
      BackColor       =   &H80000002&
      Caption         =   "Question2"
      Height          =   2055
      Left            =   240
      TabIndex        =   6
      Top             =   2520
      Width           =   12615
      Begin VB.OptionButton Option8 
         BackColor       =   &H80000000&
         Caption         =   "Torvald"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   10680
         TabIndex        =   13
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option7 
         BackColor       =   &H80000000&
         Caption         =   "Gates"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   6840
         TabIndex        =   12
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option6 
         BackColor       =   &H80000000&
         Caption         =   " Jobbs"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3480
         TabIndex        =   11
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option5 
         BackColor       =   &H80000000&
         Caption         =   "Mark Tony"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   10
         Top             =   1440
         Width           =   1695
      End
      Begin VB.Label Label2 
         BackColor       =   &H80000002&
         Caption         =   "Who developed Linux?"
         BeginProperty Font 
            Name            =   "Myriad Pro Light"
            Size            =   15.75
            Charset         =   0
            Weight          =   600
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   7
         Top             =   480
         Width           =   12135
      End
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H80000002&
      Caption         =   "Question1"
      Height          =   2055
      Left            =   240
      TabIndex        =   0
      Top             =   240
      Width           =   12615
      Begin VB.OptionButton Option4 
         BackColor       =   &H80000000&
         Caption         =   "Dhoni"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   10440
         TabIndex        =   5
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option3 
         BackColor       =   &H80000000&
         Caption         =   "Virat "
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   6840
         TabIndex        =   4
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option2 
         BackColor       =   &H80000000&
         Caption         =   "Sachin"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3480
         TabIndex        =   3
         Top             =   1440
         Width           =   1695
      End
      Begin VB.OptionButton Option1 
         BackColor       =   &H80000000&
         Caption         =   "Gayle"
         BeginProperty Font 
            Name            =   "Myriad Pro"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   2
         Top             =   1440
         Width           =   1695
      End
      Begin VB.Label Label1 
         BackColor       =   &H80000002&
         Caption         =   "Who scored the First Double Century in One Day International Cricket?"
         BeginProperty Font 
            Name            =   "Myriad Pro Light"
            Size            =   15.75
            Charset         =   0
            Weight          =   600
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   1
         Top             =   360
         Width           =   12135
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Public m As Integer
Public X As Integer
Public disp As String


Private Sub Command1_Click()
Form1.Hide
Form2.Show

End Sub

Private Sub Command2_Click()
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
m = 0
X = 20
End Sub

Private Sub Command3_Click()
If Option2.Value = True Then
    m = m + 4
Else
    m = m - 2
End If
If Option8.Value = True Then
    m = m + 4
Else
    m = m - 2
End If
If Option9.Value = True Then
    m = m + 4
Else
    m = m - 2
End If
End Sub


Private Sub Form_Activate()
disp = "Time Remaining: "
X = 20
disp = disp & "20"
Timer1.Enabled = True
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
m = 0
End Sub

Private Sub Timer1_Timer()
X = X - 1
    If (X = 0) Then
    Me.Hide
    Form2.Show
    Else
    disp = "Time Remaining: " & X
    Text2.Text = disp
    End If
End Sub
