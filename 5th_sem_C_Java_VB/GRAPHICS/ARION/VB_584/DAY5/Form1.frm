VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   AutoRedraw      =   -1  'True
   BackColor       =   &H00404040&
   BorderStyle     =   1  'Fixed Single
   Caption         =   "Form1"
   ClientHeight    =   8250
   ClientLeft      =   45
   ClientTop       =   375
   ClientWidth     =   11730
   DrawStyle       =   5  'Transparent
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   8250
   ScaleWidth      =   11730
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Appearance      =   0  'Flat
      BackColor       =   &H80000010&
      BorderStyle     =   0  'None
      DataField       =   "E_NAME"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   18
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   3120
      TabIndex        =   14
      Top             =   2520
      Width           =   6615
   End
   Begin VB.TextBox Text3 
      Appearance      =   0  'Flat
      BackColor       =   &H80000010&
      DataField       =   "E_ID"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   15.75
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   510
      Left            =   6360
      TabIndex        =   13
      Top             =   1665
      Width           =   3375
   End
   Begin VB.TextBox Text5 
      Appearance      =   0  'Flat
      BackColor       =   &H80000010&
      DataField       =   "MGR_ID"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   15.75
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   510
      Left            =   7680
      TabIndex        =   12
      Top             =   4320
      Width           =   2055
   End
   Begin VB.TextBox Text2 
      Appearance      =   0  'Flat
      BackColor       =   &H80000010&
      DataField       =   "E_SALARY"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   15.75
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   3120
      TabIndex        =   11
      Top             =   3360
      Width           =   6615
   End
   Begin VB.Frame Frame1 
      Appearance      =   0  'Flat
      BackColor       =   &H00808080&
      Caption         =   "Navigate"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   14.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000008&
      Height          =   2295
      Left            =   240
      TabIndex        =   1
      Top             =   5520
      Width           =   11175
      Begin VB.CommandButton Command7 
         BackColor       =   &H80000010&
         Caption         =   "DE&L"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   7440
         Style           =   1  'Graphical
         TabIndex        =   8
         Top             =   1560
         Width           =   2055
      End
      Begin VB.CommandButton Command6 
         BackColor       =   &H80000010&
         Caption         =   "E&DIT"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   4440
         Style           =   1  'Graphical
         TabIndex        =   7
         Top             =   1560
         Width           =   2175
      End
      Begin VB.CommandButton Command5 
         BackColor       =   &H80000010&
         Caption         =   "N&EW"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   1560
         Style           =   1  'Graphical
         TabIndex        =   6
         Top             =   1560
         Width           =   2175
      End
      Begin VB.CommandButton Command4 
         Appearance      =   0  'Flat
         BackColor       =   &H00C0C0C0&
         Caption         =   "&Last"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   8640
         Style           =   1  'Graphical
         TabIndex        =   5
         Top             =   600
         Width           =   2175
      End
      Begin VB.CommandButton Command3 
         Appearance      =   0  'Flat
         BackColor       =   &H00C0C0C0&
         Caption         =   "&First"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   5880
         Style           =   1  'Graphical
         TabIndex        =   4
         Top             =   600
         Width           =   2175
      End
      Begin VB.CommandButton Command2 
         BackColor       =   &H00C0C0C0&
         Caption         =   "&Next"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   3120
         Style           =   1  'Graphical
         TabIndex        =   3
         Top             =   600
         Width           =   2175
      End
      Begin VB.CommandButton Command1 
         BackColor       =   &H00C0C0C0&
         Caption         =   "&Prev"
         BeginProperty Font 
            Name            =   "MS Reference Sans Serif"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         Style           =   1  'Graphical
         TabIndex        =   2
         Top             =   600
         Width           =   2175
      End
   End
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   615
      Left            =   840
      Top             =   4440
      Visible         =   0   'False
      Width           =   1815
      _ExtentX        =   3201
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
      UserName        =   "system"
      Password        =   "bsclab"
      RecordSource    =   "Employee1"
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
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00404040&
      BackStyle       =   0  'Transparent
      Caption         =   " Name:"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   21.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000E&
      Height          =   735
      Left            =   360
      TabIndex        =   16
      Top             =   2640
      Width           =   2415
   End
   Begin VB.Label Label6 
      BackColor       =   &H00404040&
      Caption         =   "Employee ID:"
      BeginProperty Font 
         Name            =   "Myriad Pro"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000F&
      Height          =   495
      Left            =   3120
      TabIndex        =   15
      Top             =   1680
      Width           =   2535
   End
   Begin VB.Label Label5 
      Appearance      =   0  'Flat
      BackColor       =   &H00404040&
      BackStyle       =   0  'Transparent
      Caption         =   "Manager ID:"
      BeginProperty Font 
         Name            =   "Myriad Pro Light"
         Size            =   15.75
         Charset         =   0
         Weight          =   600
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000003&
      Height          =   615
      Left            =   5640
      TabIndex        =   10
      Top             =   4320
      Width           =   1935
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00404040&
      BackStyle       =   0  'Transparent
      Caption         =   "Salary(Rs.):"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   20.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   735
      Left            =   360
      TabIndex        =   9
      Top             =   3480
      Width           =   2415
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00404040&
      Caption         =   "EMPLOYEE  MANAGEMENT   SYSTEM"
      BeginProperty Font 
         Name            =   "Myriad Pro Cond"
         Size            =   36
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H80000002&
      Height          =   855
      Left            =   1080
      TabIndex        =   0
      Top             =   240
      Width           =   9375
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim X As Integer

Private Sub Command1_Click()
Text1.Enabled = False
Text2.Enabled = False
Text3.Enabled = False
Text5.Enabled = False
If Adodc1.Recordset.BOF = True And Text1.Text! = "" Then
Adodc1.Recordset.MoveFirst
MsgBox "This is the First Record"
Adodc1.Recordset.MoveFirst
Else
Adodc1.Recordset.MovePrevious
End If
End Sub

Private Sub Command2_Click()
Text1.Enabled = False
Text2.Enabled = False
Text3.Enabled = False
Text5.Enabled = False
If Adodc1.Recordset.EOF = True Then
Adodc1.Recordset.MoveLast
MsgBox "This is the Last Record"
Adodc1.Recordset.MoveLast
Else
Adodc1.Recordset.MoveNext
End If
End Sub

Private Sub Command3_Click()
Text1.Enabled = False
Text2.Enabled = False
Text3.Enabled = False
Text5.Enabled = False
Adodc1.Recordset.MoveFirst

End Sub

Private Sub Command4_Click()
Text1.Enabled = False
Text2.Enabled = False
Text3.Enabled = False
Text5.Enabled = False
Adodc1.Recordset.MoveLast
End Sub

Private Sub Command5_Click()
Text1.Enabled = True
Text2.Enabled = True
Text3.Enabled = True
Text5.Enabled = True
Adodc1.Recordset.AddNew

End Sub

Private Sub Command6_Click()
Text1.Enabled = True
Text2.Enabled = True
Text3.Enabled = True
Text5.Enabled = True
Adodc1.Recordset.Update

End Sub

Private Sub Command7_Click()
X = MsgBox("Confirm Delete this Data?", vbOKCancel, "DELETE???")
If X = 1 Then
Adodc1.Recordset.Delete
Else
Adodc1.Recordset.Cancel
End If
End Sub

Private Sub Form_Load()
Text1.Enabled = False
Text2.Enabled = False
Text3.Enabled = False
Text5.Enabled = False
End Sub
