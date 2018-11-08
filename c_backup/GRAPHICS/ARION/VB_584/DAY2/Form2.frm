VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H80000013&
   Caption         =   "Form2"
   ClientHeight    =   7965
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   13140
   LinkTopic       =   "Form2"
   ScaleHeight     =   7965
   ScaleWidth      =   13140
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text2 
      BackColor       =   &H80000013&
      BorderStyle     =   0  'None
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1080
      TabIndex        =   16
      Text            =   "Time Remaining: "
      Top             =   6000
      Width           =   3375
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   240
      Top             =   6000
   End
   Begin VB.CommandButton Command3 
      Caption         =   "<<<PREV"
      Height          =   375
      Left            =   360
      TabIndex        =   15
      Top             =   7080
      Width           =   1695
   End
   Begin VB.CommandButton Command2 
      Caption         =   "&RESET"
      Height          =   375
      Left            =   10440
      TabIndex        =   14
      Top             =   7080
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "TOTAL SCORE"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   4560
      TabIndex        =   13
      Top             =   5880
      Width           =   3735
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H80000013&
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   5160
      TabIndex        =   12
      Top             =   6840
      Width           =   2655
   End
   Begin VB.Frame Frame2 
      BackColor       =   &H80000002&
      Caption         =   "Question5"
      Height          =   2055
      Left            =   240
      TabIndex        =   6
      Top             =   3000
      Width           =   12615
      Begin VB.OptionButton Option8 
         BackColor       =   &H80000000&
         Caption         =   "Dev"
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
         Width           =   2055
      End
      Begin VB.OptionButton Option7 
         BackColor       =   &H80000000&
         Caption         =   "Sabyasachi Sengupta"
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
         Left            =   2880
         TabIndex        =   9
         Top             =   1440
         Width           =   3135
      End
      Begin VB.OptionButton Option6 
         BackColor       =   &H80000000&
         Caption         =   "Abir Chatterjee"
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
         Left            =   6600
         TabIndex        =   8
         Top             =   1440
         Width           =   2535
      End
      Begin VB.OptionButton Option5 
         BackColor       =   &H80000000&
         Caption         =   "Arijit Singh"
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
         Left            =   9720
         TabIndex        =   7
         Top             =   1440
         Width           =   2415
      End
      Begin VB.Label Label2 
         BackColor       =   &H80000002&
         Caption         =   "Who played the role of Feluda in Badshahi Angti(2016)?"
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
         Left            =   360
         TabIndex        =   11
         Top             =   360
         Width           =   12135
      End
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H80000002&
      Caption         =   "Question4"
      Height          =   2055
      Left            =   240
      TabIndex        =   0
      Top             =   360
      Width           =   12615
      Begin VB.OptionButton Option1 
         BackColor       =   &H80000000&
         Caption         =   "Sidney Sheldon"
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
         TabIndex        =   4
         Top             =   1440
         Width           =   2415
      End
      Begin VB.OptionButton Option2 
         BackColor       =   &H80000000&
         Caption         =   "JK Rowling"
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
         Left            =   3840
         TabIndex        =   3
         Top             =   1440
         Width           =   2055
      End
      Begin VB.OptionButton Option3 
         BackColor       =   &H80000000&
         Caption         =   "Jhumpa Lahiri"
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
         TabIndex        =   2
         Top             =   1440
         Width           =   2175
      End
      Begin VB.OptionButton Option4 
         BackColor       =   &H80000000&
         Caption         =   "Wilbur Smith"
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
         Left            =   9840
         TabIndex        =   1
         Top             =   1440
         Width           =   2295
      End
      Begin VB.Label Label1 
         BackColor       =   &H80000002&
         Caption         =   "Who wrote the book If Tomorrow Comes?"
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
         TabIndex        =   5
         Top             =   360
         Width           =   12135
      End
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
If Option1.Value = True Then
    Form1.m = Form1.m + 4
    Else
    Form1.m = Form1.m - 2
    End If
If Option6.Value = True Then
   Form1.m = Form1.m + 4
    Else
   Form1.m = Form1.m - 2
    End If
    Text1.Text = Form1.m
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

Text1.Text = " "
Form1.m = 0
Form1.X = 10
End Sub

Private Sub Command3_Click()
Me.Hide
Form1.Show

End Sub

Private Sub Form_Activate()
Form1.X = 10
Timer1.Enabled = True
disp = "Time Remaining: "
disp = disp & "20"
Option1.Value = False
Option2.Value = False
Option3.Value = False
Option4.Value = False
Option5.Value = False
Option6.Value = False
Option7.Value = False
Option8.Value = False
Text1.Text = " "
End Sub

Private Sub Timer1_Timer()
Form1.X = Form1.X
    If (Form1.X = 0) Then
    MsgBox "TIME UP!!!"
    Command2_Click
    Else
    disp = "Time Remaining: " & Form1.X
    Text2.Text = disp
    End If
End Sub
