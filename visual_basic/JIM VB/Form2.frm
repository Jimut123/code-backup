VERSION 5.00
Begin VB.Form Form2 
   BackColor       =   &H00FF0000&
   Caption         =   "Form2"
   ClientHeight    =   7035
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   11055
   LinkTopic       =   "Form2"
   ScaleHeight     =   7035
   ScaleWidth      =   11055
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command4 
      Caption         =   "Prev"
      Height          =   615
      Left            =   4440
      TabIndex        =   6
      Top             =   4560
      Width           =   1335
   End
   Begin VB.CommandButton Command3 
      Caption         =   "&Reset"
      Height          =   615
      Left            =   2160
      TabIndex        =   5
      Top             =   4560
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "&Convert"
      Height          =   615
      Left            =   5160
      TabIndex        =   4
      Top             =   2400
      Width           =   1335
   End
   Begin VB.TextBox Text2 
      BackColor       =   &H00FFC0C0&
      Height          =   615
      Left            =   3000
      TabIndex        =   3
      Top             =   2880
      Width           =   1695
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H00FFC0C0&
      Height          =   615
      Left            =   3000
      TabIndex        =   2
      Top             =   1920
      Width           =   1695
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H00FFC0C0&
      Caption         =   "     CONVERSIONS"
      Height          =   2175
      Left            =   4920
      TabIndex        =   7
      Top             =   1440
      Width           =   1815
   End
   Begin VB.Frame Frame2 
      BackColor       =   &H00FFC0C0&
      Caption         =   "                                         FORM  OPERATIONS"
      Height          =   1215
      Left            =   1560
      TabIndex        =   8
      Top             =   4200
      Width           =   5055
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00FF8080&
      Caption         =   "TEMPERATURE CONVERTER"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C00000&
      Height          =   975
      Left            =   720
      TabIndex        =   9
      Top             =   240
      Width           =   7575
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      Caption         =   "Centigrade"
      Height          =   735
      Left            =   840
      TabIndex        =   1
      Top             =   2880
      Width           =   1335
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "Farenheit"
      Height          =   735
      Left            =   840
      TabIndex        =   0
      Top             =   1680
      Width           =   1335
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Text2.Text = "" Then
    Text1.Text = 9 * Val(Text2.Text) / 5 + 32
Else
    Text2.Text = (Val(Text1.Text) - 32) * 5 / 9
End If
End Sub


Private Sub Command3_Click()
Text1.Text = ""
Text2.Text = ""
End Sub

Private Sub Command4_Click()
Form2.Hide
Form1.Show
End Sub

