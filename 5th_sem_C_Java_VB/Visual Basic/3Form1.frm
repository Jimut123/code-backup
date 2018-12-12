VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   BackColor       =   &H80000007&
   Caption         =   "Form1"
   ClientHeight    =   7620
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   12840
   LinkTopic       =   "Form1"
   ScaleHeight     =   7620
   ScaleWidth      =   12840
   StartUpPosition =   3  'Windows Default
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   495
      Left            =   4440
      Top             =   6720
      Width           =   3375
      _ExtentX        =   5953
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
      Connect         =   "Provider=MSDAORA.1;User ID=system;Persist Security Info=False"
      OLEDBString     =   "Provider=MSDAORA.1;User ID=system;Persist Security Info=False"
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   "system"
      Password        =   "bsclab"
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
   Begin VB.Frame Frame1 
      BackColor       =   &H8000000C&
      Caption         =   "OPERATIONS"
      Height          =   1935
      Left            =   1680
      TabIndex        =   9
      Top             =   4440
      Width           =   9135
      Begin VB.CommandButton Command7 
         BackColor       =   &H8000000A&
         Caption         =   "UPDATE"
         Height          =   495
         Left            =   5880
         TabIndex        =   16
         Top             =   1080
         Width           =   1695
      End
      Begin VB.CommandButton Command6 
         BackColor       =   &H8000000A&
         Caption         =   "DELETE"
         Height          =   495
         Left            =   3600
         TabIndex        =   15
         Top             =   1080
         Width           =   1695
      End
      Begin VB.CommandButton Command5 
         BackColor       =   &H8000000A&
         Caption         =   "ADD"
         Height          =   495
         Left            =   1320
         TabIndex        =   14
         Top             =   1080
         Width           =   1695
      End
      Begin VB.CommandButton Command4 
         BackColor       =   &H8000000A&
         Caption         =   "LAST"
         Height          =   495
         Left            =   6960
         TabIndex        =   13
         Top             =   360
         Width           =   1695
      End
      Begin VB.CommandButton Command3 
         BackColor       =   &H8000000A&
         Caption         =   "NEXT"
         Height          =   495
         Left            =   4800
         TabIndex        =   12
         Top             =   360
         Width           =   1695
      End
      Begin VB.CommandButton Command2 
         BackColor       =   &H8000000A&
         Caption         =   "PREV"
         Height          =   495
         Left            =   2520
         TabIndex        =   11
         Top             =   360
         Width           =   1695
      End
      Begin VB.CommandButton Command1 
         BackColor       =   &H8000000A&
         Caption         =   "FIRST"
         Height          =   495
         Left            =   360
         TabIndex        =   10
         Top             =   360
         Width           =   1695
      End
   End
   Begin VB.TextBox Text4 
      DataField       =   "MGR_ID"
      DataSource      =   "Adodc1"
      Height          =   375
      Left            =   6600
      TabIndex        =   8
      Top             =   3480
      Width           =   4455
   End
   Begin VB.TextBox Text3 
      DataField       =   "E_SALARY"
      DataSource      =   "Adodc1"
      Height          =   375
      Left            =   6600
      TabIndex        =   7
      Top             =   2760
      Width           =   4455
   End
   Begin VB.TextBox Text2 
      DataField       =   "E_NAME"
      DataSource      =   "Adodc1"
      Height          =   375
      Left            =   6600
      TabIndex        =   6
      Top             =   2040
      Width           =   4455
   End
   Begin VB.TextBox Text1 
      DataField       =   "EMP_ID"
      DataSource      =   "Adodc1"
      Height          =   375
      Left            =   6600
      TabIndex        =   5
      Top             =   1320
      Width           =   4455
   End
   Begin VB.Label Label5 
      BackColor       =   &H80000012&
      Caption         =   "MANAGER ID"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000C&
      Height          =   495
      Left            =   1320
      TabIndex        =   4
      Top             =   3480
      Width           =   2535
   End
   Begin VB.Label Label4 
      BackColor       =   &H80000012&
      Caption         =   "EMPLOYEE SALARY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000C&
      Height          =   495
      Left            =   1320
      TabIndex        =   3
      Top             =   2760
      Width           =   3975
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000012&
      Caption         =   "EMPLOYEE NAME"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000C&
      Height          =   495
      Left            =   1320
      TabIndex        =   2
      Top             =   2040
      Width           =   3375
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000012&
      Caption         =   "EMPLOYEE ID"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   18
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000C&
      Height          =   495
      Left            =   1320
      TabIndex        =   1
      Top             =   1320
      Width           =   3015
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000007&
      Caption         =   "EMPLOYEE TABLE"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   29.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   735
      Left            =   2280
      TabIndex        =   0
      Top             =   240
      Width           =   8535
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Adodc1.Recordset.MoveFirst
End Sub

Private Sub Command2_Click()
If Adodc1.Recordset.BOF = True Then
MsgBox "Opps! This is the first record."
Else
Adodc1.Recordset.MovePrevious
End If
End Sub

Private Sub Command3_Click()
If Adodc1.Recordset.EOF = True Then
MsgBox "Opps! This is the last record."
Else
Adodc1.Recordset.MoveNext
End If
End Sub

Private Sub Command4_Click()
Adodc1.Recordset.MoveLast
End Sub

Private Sub Command5_Click()
Adodc1.Recordset.AddNew
End Sub

Private Sub Command6_Click()
Adodc1.Recordset.Delete
End Sub

Private Sub Command7_Click()
Adodc1.Recordset.Update
End Sub
