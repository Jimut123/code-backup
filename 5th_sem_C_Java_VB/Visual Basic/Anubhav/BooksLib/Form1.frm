VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6825
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12225
   LinkTopic       =   "Form1"
   ScaleHeight     =   6825
   ScaleWidth      =   12225
   StartUpPosition =   3  'Windows Default
   Begin MSAdodcLib.Adodc Adodc2 
      Height          =   615
      Left            =   4800
      Top             =   5280
      Width           =   2175
      _ExtentX        =   3836
      _ExtentY        =   1085
      ConnectMode     =   0
      CursorLocation  =   3
      IsolationLevel  =   -1
      ConnectionTimeout=   15
      CommandTimeout  =   30
      CursorType      =   3
      LockType        =   3
      CommandType     =   2
      CursorOptions   =   0
      CacheSize       =   50
      MaxRecords      =   0
      BOFAction       =   0
      EOFAction       =   0
      ConnectStringType=   1
      Appearance      =   1
      BackColor       =   -2147483643
      ForeColor       =   -2147483640
      Orientation     =   0
      Enabled         =   -1
      Connect         =   "Provider=MSDAORA.1;Password=bsclab;User ID=system;Persist Security Info=True"
      OLEDBString     =   "Provider=MSDAORA.1;Password=bsclab;User ID=system;Persist Security Info=True"
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   ""
      Password        =   ""
      RecordSource    =   "EMPLOYEES"
      Caption         =   "Adodc2"
      BeginProperty Font {0BE35203-8F91-11CE-9DE3-00AA004BB851} 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      _Version        =   393216
   End
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   855
      Left            =   1920
      Top             =   5160
      Visible         =   0   'False
      Width           =   2295
      _ExtentX        =   4048
      _ExtentY        =   1508
      ConnectMode     =   0
      CursorLocation  =   3
      IsolationLevel  =   -1
      ConnectionTimeout=   15
      CommandTimeout  =   30
      CursorType      =   3
      LockType        =   3
      CommandType     =   2
      CursorOptions   =   0
      CacheSize       =   50
      MaxRecords      =   0
      BOFAction       =   0
      EOFAction       =   0
      ConnectStringType=   1
      Appearance      =   1
      BackColor       =   -2147483643
      ForeColor       =   -2147483640
      Orientation     =   0
      Enabled         =   -1
      Connect         =   $"Form1.frx":0000
      OLEDBString     =   $"Form1.frx":0158
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   ""
      Password        =   ""
      RecordSource    =   "books"
      Caption         =   "Adodc1"
      BeginProperty Font {0BE35203-8F91-11CE-9DE3-00AA004BB851} 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      _Version        =   393216
   End
   Begin VB.CommandButton Command7 
      Caption         =   "Delete"
      Height          =   495
      Left            =   7800
      TabIndex        =   15
      Top             =   5640
      Width           =   1575
   End
   Begin VB.CommandButton Command6 
      Caption         =   "Update"
      Height          =   495
      Left            =   7800
      TabIndex        =   14
      Top             =   4920
      Width           =   1575
   End
   Begin VB.CommandButton Command5 
      Caption         =   "Insert"
      Height          =   495
      Left            =   7800
      TabIndex        =   13
      Top             =   4200
      Width           =   1575
   End
   Begin VB.CommandButton Command4 
      Caption         =   "Last"
      Height          =   495
      Left            =   7800
      TabIndex        =   12
      Top             =   3480
      Width           =   1575
   End
   Begin VB.CommandButton Command3 
      Caption         =   "First"
      Height          =   495
      Left            =   7800
      TabIndex        =   11
      Top             =   2760
      Width           =   1575
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Prev"
      Height          =   495
      Left            =   7800
      TabIndex        =   10
      Top             =   2040
      Width           =   1575
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Next"
      Height          =   495
      Left            =   7800
      TabIndex        =   9
      Top             =   1320
      Width           =   1575
   End
   Begin VB.TextBox Text4 
      DataField       =   "copies"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3600
      TabIndex        =   8
      Top             =   3720
      Width           =   3495
   End
   Begin VB.TextBox Text3 
      DataField       =   "book_author"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3600
      TabIndex        =   6
      Top             =   2880
      Width           =   3495
   End
   Begin VB.TextBox Text2 
      DataField       =   "book_name"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3600
      TabIndex        =   4
      Top             =   2040
      Width           =   3495
   End
   Begin VB.TextBox Text1 
      DataField       =   "book_id"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3600
      TabIndex        =   2
      Top             =   1200
      Width           =   3495
   End
   Begin VB.Label Label5 
      Caption         =   "Copies"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1320
      TabIndex        =   7
      Top             =   3840
      Width           =   1815
   End
   Begin VB.Label Label4 
      Caption         =   "Author"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1320
      TabIndex        =   5
      Top             =   3000
      Width           =   1815
   End
   Begin VB.Label Label3 
      Caption         =   "Book_Name"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1320
      TabIndex        =   3
      Top             =   2160
      Width           =   1815
   End
   Begin VB.Label Label2 
      Caption         =   "Book_ID"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1320
      TabIndex        =   1
      Top             =   1320
      Width           =   1815
   End
   Begin VB.Label Label1 
      Caption         =   "Library Management System"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   2520
      TabIndex        =   0
      Top             =   240
      Width           =   6615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim X As Integer
Private Sub Command1_Click()
If Adodc1.Recordset.EOF = True Then
MsgBox "This is the last record"
Adodc1.Recordset.MoveFirst
Else
Adodc1.Recordset.MoveNext
End If
End Sub

Private Sub Command2_Click()
If Adodc1.Recordset.BOF = True Then
MsgBox "This is the first record"
Adodc1.Recordset.MoveLast
Else
Adodc1.Recordset.MovePrevious
End If
End Sub

Private Sub Command3_Click()
Adodc1.Recordset.MoveFirst
End Sub

Private Sub Command4_Click()
Adodc1.Recordset.MoveLast
End Sub


Private Sub Command6_Click()
Adodc1.Recordset.Update
End Sub

Private Sub Command7_Click()
X = MsgBox("Confirm Deletion", vbOKCancel, "Delete???")
If X = 1 Then
  Adodc1.Recordset.Delete
Else
  Adodc1.Recordset.Cancel
End If
End Sub

