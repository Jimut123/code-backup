VERSION 5.00
Begin VB.Form Form3 
   BackColor       =   &H80000002&
   Caption         =   "Form3.Show"
   ClientHeight    =   4950
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9855
   LinkTopic       =   "Form3"
   ScaleHeight     =   4950
   ScaleWidth      =   9855
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text3 
      Alignment       =   2  'Center
      BackColor       =   &H80000002&
      BorderStyle     =   0  'None
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000C0&
      Height          =   615
      Left            =   2520
      Locked          =   -1  'True
      TabIndex        =   7
      Top             =   3120
      Width           =   4095
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00404040&
      Caption         =   " &LOGIN"
      Height          =   615
      Left            =   1080
      MaskColor       =   &H00404040&
      TabIndex        =   6
      Top             =   4080
      Width           =   2535
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H00404040&
      Caption         =   "&RESET"
      Height          =   375
      Left            =   5520
      MaskColor       =   &H00404040&
      TabIndex        =   5
      Top             =   4200
      Width           =   1815
   End
   Begin VB.TextBox Text2 
      Alignment       =   2  'Center
      BackColor       =   &H80000003&
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   615
      HideSelection   =   0   'False
      IMEMode         =   3  'DISABLE
      Left            =   4080
      PasswordChar    =   "*"
      TabIndex        =   1
      Top             =   2160
      Width           =   3855
   End
   Begin VB.TextBox Text1 
      Alignment       =   2  'Center
      BackColor       =   &H80000003&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   615
      HideSelection   =   0   'False
      IMEMode         =   3  'DISABLE
      Left            =   4080
      TabIndex        =   0
      Top             =   1320
      Width           =   3855
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      BackStyle       =   0  'Transparent
      Caption         =   "LOGIN"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   435
      Left            =   4200
      TabIndex        =   4
      Top             =   240
      Width           =   1005
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      BackStyle       =   0  'Transparent
      Caption         =   "Enter Name:"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   375
      Left            =   600
      TabIndex        =   3
      Top             =   1440
      Width           =   1620
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      BackColor       =   &H00C0C0C0&
      BackStyle       =   0  'Transparent
      Caption         =   "Enter Password:"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   15.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   375
      Left            =   600
      TabIndex        =   2
      Top             =   2280
      Width           =   2070
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command2_Click()
If Text1.Text = "Computer" Then
If Text2.Text = "password" Then
    Text3.Text = "LOGIN SUCCESSFUL"
    Form1.Show
    Form3.Hide
Else
    Text3.Text = "INCORRECT ID/PASSWORD"
    Text1.Text = ""
    Text2.Text = ""
    Text1.SetFocus
End If
Else
 Text3.Text = "INCORRECT ID/PASSWORD"
    Text1.Text = ""
    Text2.Text = ""
    Text1.SetFocus
End If

End Sub

Private Sub Command3_Click()
    Text1.Text = ""
    Text2.Text = ""
    Text3.Text = ""
    Text1.SetFocus
End Sub

Private Sub Command4_Click()
Form2.Show
Form3.Hide
End Sub

