VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7335
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12030
   LinkTopic       =   "Form1"
   ScaleHeight     =   7335
   ScaleWidth      =   12030
   StartUpPosition =   3  'Windows Default
   Begin VB.ListBox List3 
      Height          =   2010
      Left            =   7200
      TabIndex        =   7
      Top             =   1200
      Width           =   2295
   End
   Begin VB.ListBox List2 
      Height          =   2010
      Left            =   4200
      TabIndex        =   6
      Top             =   1200
      Width           =   2295
   End
   Begin VB.ListBox List1 
      Height          =   2010
      ItemData        =   "Form1.frx":0000
      Left            =   1320
      List            =   "Form1.frx":0002
      TabIndex        =   5
      Top             =   1200
      Width           =   2175
   End
   Begin VB.CommandButton Exit 
      Caption         =   "EXIT"
      Height          =   495
      Left            =   4560
      TabIndex        =   4
      Top             =   5760
      Width           =   1575
   End
   Begin VB.CommandButton CmdAdd 
      Caption         =   "ADDITION"
      Height          =   495
      Left            =   5400
      TabIndex        =   3
      Top             =   4680
      Width           =   1575
   End
   Begin VB.CommandButton CmdMulti 
      Caption         =   "MULTIPLICATION"
      Height          =   495
      Left            =   7560
      TabIndex        =   2
      Top             =   4680
      Width           =   1575
   End
   Begin VB.CommandButton CmdTranspose 
      Caption         =   "TRANSPOSE"
      Height          =   495
      Left            =   3360
      TabIndex        =   1
      Top             =   4680
      Width           =   1575
   End
   Begin VB.CommandButton CmdCreate 
      Caption         =   "CREATE"
      Height          =   495
      Left            =   1320
      TabIndex        =   0
      Top             =   4680
      Width           =   1575
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
Private Sub CmdCreate_Click()
List1.Clear
Dim str As String
For i = 0 To 2
str = ""
For j = 0 To 2
a(i, j) = InputBox("Enter No. for Row " & i & " and Column " & j)
str = str & Space(3) & a(i, j)
Next
List1.AddItem str
Next
End Sub
Private Sub CmdMulti_Click()
List3.Clear
Dim str As String
For i = 0 To 2
str = ""
For j = 0 To 2
result(i, j) = 0
For k = 0 To 2
result(i, j) = Val(result(i, j)) + Val(Val(a(k, j)) * Val(b(i, k)))
Next
Next
Next
For i = 0 To 2
str = ""
For j = 0 To 2
str = str & Space(3) & result(i, j)
Next
List3.AddItem str
Next
End Sub
Private Sub CmdTranspose_Click()
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
Private Sub CmdAdd_Click()
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

Private Sub Exit_Click()
End
End Sub
