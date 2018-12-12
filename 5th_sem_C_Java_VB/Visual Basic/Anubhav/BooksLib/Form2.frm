VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   5940
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   11985
   LinkTopic       =   "Form2"
   ScaleHeight     =   5940
   ScaleWidth      =   11985
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command3 
      Caption         =   "update"
      Height          =   495
      Left            =   7200
      TabIndex        =   10
      Top             =   2160
      Width           =   1455
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Prev"
      Height          =   615
      Left            =   7080
      TabIndex        =   9
      Top             =   1320
      Width           =   1575
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Next"
      Height          =   615
      Left            =   7080
      TabIndex        =   8
      Top             =   480
      Width           =   1575
   End
   Begin VB.TextBox Text4 
      DataField       =   "MGR_ID"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3120
      TabIndex        =   7
      Top             =   3120
      Width           =   2655
   End
   Begin VB.TextBox Text3 
      DataField       =   "E_SALARY"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3120
      TabIndex        =   6
      Top             =   2280
      Width           =   2655
   End
   Begin VB.TextBox Text2 
      DataField       =   "E_NAME"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3120
      TabIndex        =   5
      Top             =   1440
      Width           =   2655
   End
   Begin VB.TextBox Text1 
      DataField       =   "EMP_ID"
      DataSource      =   "Adodc1"
      Height          =   615
      Left            =   3120
      TabIndex        =   4
      Top             =   480
      Width           =   2655
   End
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   855
      Left            =   2040
      Top             =   4680
      Width           =   1935
      _ExtentX        =   3413
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
      Connect         =   "Provider=MSDAORA.1;Password=bsclab;User ID=system;Persist Security Info=True"
      OLEDBString     =   "Provider=MSDAORA.1;Password=bsclab;User ID=system;Persist Security Info=True"
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   ""
      Password        =   ""
      RecordSource    =   "employee"
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
   Begin VB.Label Label4 
      Caption         =   "Mgr_id"
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
      Left            =   1080
      TabIndex        =   3
      Top             =   3120
      Width           =   1695
   End
   Begin VB.Label Label3 
      Caption         =   "E_Salary"
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
      Left            =   1080
      TabIndex        =   2
      Top             =   2280
      Width           =   1695
   End
   Begin VB.Label Label2 
      Caption         =   "E_Name"
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
      Left            =   1080
      TabIndex        =   1
      Top             =   1440
      Width           =   1695
   End
   Begin VB.Label Label1 
      Caption         =   "Emp_id"
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
      Left            =   1080
      TabIndex        =   0
      Top             =   600
      Width           =   1695
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Adodc1.Recordset.EOF = True Then
MsgBox "This is the last record"
Adodc1.Recordset.MovePrevious
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
Adodc1.Recordset.Update
End Sub
