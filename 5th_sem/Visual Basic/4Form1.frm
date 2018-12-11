VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000012&
   Caption         =   "Form1"
   ClientHeight    =   6060
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   13305
   LinkTopic       =   "Form1"
   ScaleHeight     =   6060
   ScaleWidth      =   13305
   StartUpPosition =   3  'Windows Default
   Begin VB.ListBox List3 
      Height          =   1425
      Left            =   9120
      TabIndex        =   8
      Top             =   1920
      Width           =   2535
   End
   Begin VB.ListBox List2 
      Height          =   1425
      Left            =   5400
      TabIndex        =   7
      Top             =   1920
      Width           =   2535
   End
   Begin VB.ListBox List1 
      Height          =   1425
      Left            =   1680
      TabIndex        =   6
      Top             =   1920
      Width           =   2535
   End
   Begin VB.CommandButton Command5 
      Appearance      =   0  'Flat
      BackColor       =   &H80000008&
      Caption         =   "&RESET"
      Height          =   735
      Left            =   10680
      MaskColor       =   &H00008080&
      TabIndex        =   4
      Top             =   4680
      Width           =   1935
   End
   Begin VB.CommandButton Command4 
      Appearance      =   0  'Flat
      BackColor       =   &H80000008&
      Caption         =   "&MULTIPLY"
      Height          =   735
      Left            =   8160
      MaskColor       =   &H00008080&
      TabIndex        =   3
      Top             =   4680
      Width           =   1935
   End
   Begin VB.CommandButton Command3 
      Appearance      =   0  'Flat
      BackColor       =   &H80000008&
      Caption         =   "&TRANSPOSE"
      Height          =   735
      Left            =   5760
      MaskColor       =   &H00008080&
      TabIndex        =   2
      Top             =   4680
      Width           =   1935
   End
   Begin VB.CommandButton Command2 
      Appearance      =   0  'Flat
      BackColor       =   &H80000008&
      Caption         =   "&ADD"
      Height          =   735
      Left            =   3360
      MaskColor       =   &H00008080&
      TabIndex        =   1
      Top             =   4680
      Width           =   1935
   End
   Begin VB.CommandButton Command1 
      Appearance      =   0  'Flat
      BackColor       =   &H80000008&
      Caption         =   "&CREATE"
      Height          =   735
      Left            =   960
      MaskColor       =   &H00008080&
      TabIndex        =   0
      Top             =   4680
      Width           =   1935
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000007&
      Caption         =   "MATRIX OPERATIONS"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   -1  'True
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000A&
      Height          =   1335
      Left            =   1320
      TabIndex        =   5
      Top             =   480
      Width           =   10455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim a(2, 2), b(2, 2), result(2, 2) As Integer
Dim i As Integer, j As Integer, k As Integer
Private Sub Command1_Click()
    List1.Clear
    Dim str As String
    For i = 0 To 2
        str = ""
    For j = 0 To 2
        a(i, j) = InputBox("Enter the number for row " & i & " and column " & j)
        str = str & Space(3) & a(i, j)
    Next
    List1.AddItem str
    Next
End Sub

Private Sub Command2_Click()
    List3.Clear
    Dim str As String
    For i = 0 To 2
        str = ""
        For j = 0 To 2
            result(i, j) = Val(a(i, j)) + Val(b(i, j))
            str = str & Space(3) & result(i, j)
        Next
        List3.AddItem str
    Next
End Sub

Private Sub Command3_Click()
    List2.Clear
    Dim str As String
    For i = 0 To 2
        str = ""
        For j = 0 To 2
            b(i, j) = a(j, i)
            str = str & Space(3) & b(i, j)
        Next
        List2.AddItem str
    Next
End Sub

Private Sub Command4_Click()
List3.Clear
    Dim str As String
    For i = 0 To 2
        str = ""
        For j = 0 To 2
            result(i, j) = 0
            For k = 0 To 2
                result(i, j) = Val(result(i, j)) + Val(a(i, k)) * Val(b(k, j))
            Next
            str = str & Space(3) & result(i, j)
        Next
        List3.AddItem str
    Next
End Sub

Private Sub Command5_Click()
List1.Clear
List2.Clear
List3.Clear
End Sub
