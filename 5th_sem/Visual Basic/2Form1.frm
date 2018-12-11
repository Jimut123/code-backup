VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   BackColor       =   &H80000007&
   Caption         =   "Form1"
   ClientHeight    =   8715
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12315
   LinkTopic       =   "Form1"
   ScaleHeight     =   8715
   ScaleWidth      =   12315
   StartUpPosition =   3  'Windows Default
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   495
      Left            =   4320
      Top             =   7800
      Width           =   3240
      _ExtentX        =   5715
      _ExtentY        =   873
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
      Connect         =   $"2Form1.frx":0000
      OLEDBString     =   $"2Form1.frx":017D
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   ""
      Password        =   ""
      RecordSource    =   "BOOKS"
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
   Begin VB.TextBox Text5 
      DataField       =   "COPIES"
      DataSource      =   "Adodc1"
      Height          =   495
      Left            =   5640
      TabIndex        =   17
      Top             =   4560
      Width           =   4815
   End
   Begin VB.TextBox Text4 
      DataField       =   "PRICE"
      DataSource      =   "Adodc1"
      Height          =   495
      Left            =   5640
      TabIndex        =   16
      Top             =   3840
      Width           =   4815
   End
   Begin VB.TextBox Text3 
      DataField       =   "BOOK_AUTHOR"
      DataSource      =   "Adodc1"
      Height          =   495
      Left            =   5640
      TabIndex        =   15
      Top             =   3120
      Width           =   4815
   End
   Begin VB.Frame Frame1 
      BackColor       =   &H80000011&
      Caption         =   "FUNCTIONS"
      Height          =   2055
      Left            =   1560
      TabIndex        =   5
      Top             =   5400
      Width           =   8895
      Begin VB.CommandButton Command6 
         Caption         =   "ADD"
         Height          =   615
         Left            =   480
         TabIndex        =   11
         Top             =   1200
         Width           =   2055
      End
      Begin VB.CommandButton Command5 
         Caption         =   "UPDATE"
         Height          =   615
         Left            =   3360
         TabIndex        =   10
         Top             =   1200
         Width           =   2055
      End
      Begin VB.CommandButton Command4 
         Caption         =   "DELETE"
         Height          =   615
         Left            =   6360
         TabIndex        =   9
         Top             =   1200
         Width           =   2055
      End
      Begin VB.CommandButton Command3 
         Caption         =   "PREV"
         Height          =   615
         Left            =   3360
         TabIndex        =   8
         Top             =   360
         Width           =   2055
      End
      Begin VB.CommandButton Command2 
         Caption         =   "FIRST"
         Height          =   615
         Left            =   6360
         TabIndex        =   7
         Top             =   360
         Width           =   2055
      End
      Begin VB.CommandButton Command1 
         Caption         =   "NEXT"
         Height          =   615
         Left            =   480
         TabIndex        =   6
         Top             =   360
         Width           =   2055
      End
   End
   Begin VB.TextBox Text2 
      DataField       =   "BOOK_NAME"
      DataSource      =   "Adodc1"
      Height          =   495
      Left            =   5640
      TabIndex        =   4
      Top             =   2400
      Width           =   4815
   End
   Begin VB.TextBox Text1 
      DataField       =   "BOOK_ID"
      DataSource      =   "Adodc1"
      Height          =   495
      Left            =   5640
      TabIndex        =   3
      Top             =   1680
      Width           =   4815
   End
   Begin VB.Label Label6 
      BackColor       =   &H80000007&
      Caption         =   "AUTHOR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   1680
      TabIndex        =   14
      Top             =   3240
      Width           =   2775
   End
   Begin VB.Label Label5 
      BackColor       =   &H80000007&
      Caption         =   "PRICE"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   1680
      TabIndex        =   13
      Top             =   3960
      Width           =   2775
   End
   Begin VB.Label Label4 
      BackColor       =   &H80000007&
      Caption         =   "COPIES"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   1680
      TabIndex        =   12
      Top             =   4680
      Width           =   2775
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000007&
      Caption         =   "BOOK NAME"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   1680
      TabIndex        =   2
      Top             =   2520
      Width           =   2775
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000007&
      Caption         =   "BOOK ID"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   495
      Left            =   1680
      TabIndex        =   1
      Top             =   1800
      Width           =   2775
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000012&
      Caption         =   "LIBRARY MANAGEMENT SYSTEM"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000D&
      Height          =   855
      Left            =   0
      TabIndex        =   0
      Top             =   480
      Width           =   12375
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Adodc1.Recordset.EOF = True Then
MsgBox "Opps! This is the last record."
Else
Adodc1.Recordset.MoveNext
End If
End Sub

Private Sub Command2_Click()
Adodc1.Recordset.MoveFirst
End Sub

Private Sub Command3_Click()
If Adodc1.Recordset.BOF = True Then
MsgBox "Opps! This is the first record."
Else
Adodc1.Recordset.MovePrevious
End If
End Sub

Private Sub Command4_Click()
Adodc1.Recordset.Delete
End Sub

Private Sub Command5_Click()
Adodc1.Recordset.Update
End Sub

Private Sub Command6_Click()
Adodc1.Recordset.AddNew
End Sub
