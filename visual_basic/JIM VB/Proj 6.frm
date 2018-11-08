VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6900
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   14085
   LinkTopic       =   "Form1"
   ScaleHeight     =   6900
   ScaleWidth      =   14085
   StartUpPosition =   3  'Windows Default
   Begin VB.ListBox List3 
      Height          =   1815
      Left            =   9600
      TabIndex        =   8
      Top             =   1200
      Width           =   3255
   End
   Begin VB.ListBox List2 
      Height          =   1815
      Left            =   5160
      TabIndex        =   7
      Top             =   1200
      Width           =   3255
   End
   Begin VB.CommandButton Command5 
      Caption         =   "&Exit"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   11040
      MaskColor       =   &H00C0E0FF&
      TabIndex        =   5
      Top             =   5520
      Width           =   1695
   End
   Begin VB.CommandButton Command4 
      Caption         =   "&Multiply"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   8640
      MaskColor       =   &H00C0E0FF&
      TabIndex        =   4
      Top             =   5520
      Width           =   1695
   End
   Begin VB.CommandButton Command3 
      Caption         =   "&Add"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   6120
      MaskColor       =   &H00C0E0FF&
      TabIndex        =   3
      Top             =   5520
      Width           =   1695
   End
   Begin VB.CommandButton Command2 
      Caption         =   "&Transpose"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   3840
      MaskColor       =   &H00C0E0FF&
      TabIndex        =   2
      Top             =   5520
      Width           =   1695
   End
   Begin VB.Frame Frame1 
      Caption         =   "Frame1"
      Height          =   6255
      Left            =   480
      TabIndex        =   0
      Top             =   240
      Width           =   13335
      Begin VB.ListBox List1 
         Height          =   1815
         Left            =   360
         TabIndex        =   6
         Top             =   960
         Width           =   3255
      End
      Begin VB.CommandButton Command1 
         Caption         =   "&Create"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   375
         Left            =   840
         MaskColor       =   &H00C0E0FF&
         TabIndex        =   1
         Top             =   5280
         Width           =   1695
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim a(2, 2), b(2, 2), result(2, 2) As Integer
Dim i As Integer, j As Integer, k As Integer

Private Sub Command1_Click()
List1.Clear
Dim str As String
For i = 0 To 2
    str = ""
    For j = 0 To 2
        a(i, j) = InputBox("Enter number for Row " & i & "and column  " & j)
        str = str & Space(3) & a(i, j)
    Next
    List1.AddItem str
Next
End Sub

Private Sub Command2_Click()
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

Private Sub Command3_Click()
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

Private Sub Command4_Click()
    List3.Clear
    Dim str As String
    For i = 0 To 2
    str = ""
        For j = 0 To 2
            For k = 0 To 2
                result(i, j) = Val(result(i, j)) + Val(Val(a(i, k)) * Val(b(k, j)))
                'str = str & Space(3) & result(i, j)
            Next
        Next
    'List3.AddItem str
Next
For i = 0 To 2
    str = ""
    For j = 0 To 2
        str = str & Space(3) & result(i, j)
    Next
    List3.AddItem str
Next
End Sub

Private Sub Command5_Click()
    'Form1.Hide
    End
End Sub

