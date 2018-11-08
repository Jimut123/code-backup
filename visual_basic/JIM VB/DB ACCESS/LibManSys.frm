VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   8145
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   11505
   LinkTopic       =   "Form1"
   ScaleHeight     =   8145
   ScaleWidth      =   11505
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame Frame1 
      BackColor       =   &H00FFC0C0&
      Caption         =   "                         LIBRARY MANAGEMENT SYSTEM"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   6495
      Left            =   600
      TabIndex        =   0
      Top             =   720
      Width           =   10335
      Begin MSAdodcLib.Adodc Adodc1 
         Height          =   495
         Left            =   1320
         Top             =   5040
         Width           =   2775
         _ExtentX        =   4895
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
         Connect         =   $"LibManSys.frx":0000
         OLEDBString     =   $"LibManSys.frx":0185
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
      Begin VB.Frame Frame2 
         BackColor       =   &H00C0FFC0&
         Caption         =   "RECORD OPERATIONS"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   13.5
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   4815
         Left            =   6120
         TabIndex        =   11
         Top             =   720
         Width           =   3735
         Begin VB.CommandButton Command7 
            Caption         =   "&LAST"
            Height          =   615
            Left            =   1080
            TabIndex        =   18
            Top             =   3600
            Width           =   1215
         End
         Begin VB.CommandButton Command6 
            Caption         =   "&DELETE"
            Height          =   615
            Left            =   1920
            TabIndex        =   17
            Top             =   2520
            Width           =   1215
         End
         Begin VB.CommandButton Command5 
            Caption         =   "&FIRST"
            Height          =   615
            Left            =   240
            TabIndex        =   16
            Top             =   2520
            Width           =   1215
         End
         Begin VB.CommandButton Command4 
            Caption         =   "&UPDATE"
            Height          =   615
            Left            =   1920
            TabIndex        =   15
            Top             =   1440
            Width           =   1215
         End
         Begin VB.CommandButton Command3 
            Caption         =   "&PREV"
            Height          =   615
            Left            =   240
            TabIndex        =   14
            Top             =   1320
            Width           =   1215
         End
         Begin VB.CommandButton Command2 
            Caption         =   "&INSERT"
            Height          =   615
            Left            =   1920
            TabIndex        =   13
            Top             =   480
            Width           =   1215
         End
         Begin VB.CommandButton Command1 
            Caption         =   "&NEXT"
            Height          =   615
            Left            =   240
            TabIndex        =   12
            Top             =   480
            Width           =   1215
         End
      End
      Begin VB.TextBox Text5 
         DataField       =   "#copies"
         DataSource      =   "Adodc1"
         Height          =   495
         Left            =   2280
         TabIndex        =   10
         Top             =   3960
         Width           =   2295
      End
      Begin VB.TextBox Text4 
         DataField       =   "book_price"
         DataSource      =   "Adodc1"
         Height          =   495
         Left            =   2280
         TabIndex        =   9
         Top             =   3120
         Width           =   2295
      End
      Begin VB.TextBox Text3 
         DataField       =   "book_author"
         DataSource      =   "Adodc1"
         Height          =   495
         Left            =   2280
         TabIndex        =   8
         Top             =   2280
         Width           =   2295
      End
      Begin VB.TextBox Text2 
         DataField       =   "book_name"
         DataSource      =   "Adodc1"
         Height          =   495
         Left            =   2280
         TabIndex        =   7
         Top             =   1560
         Width           =   2295
      End
      Begin VB.TextBox Text1 
         DataField       =   "book_id"
         DataSource      =   "Adodc1"
         Height          =   495
         Left            =   2280
         TabIndex        =   6
         Top             =   840
         Width           =   2295
      End
      Begin VB.Label Label5 
         BackColor       =   &H00C0C0FF&
         Caption         =   "COPIES"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   5
         Top             =   3960
         Width           =   1695
      End
      Begin VB.Label Label4 
         BackColor       =   &H00C0C0FF&
         Caption         =   "PRICE"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   4
         Top             =   3120
         Width           =   1695
      End
      Begin VB.Label Label3 
         BackColor       =   &H00C0C0FF&
         Caption         =   "AUTHOR"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   3
         Top             =   2280
         Width           =   1695
      End
      Begin VB.Label Label2 
         BackColor       =   &H00C0C0FF&
         Caption         =   "BOOK NAME"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   2
         Top             =   1560
         Width           =   1695
      End
      Begin VB.Label Label1 
         BackColor       =   &H00C0C0FF&
         Caption         =   "BOOK ID"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   12
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   240
         TabIndex        =   1
         Top             =   840
         Width           =   1695
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()

If Adodc1.Recordset.EOF = True Then
    MsgBox "This is the last Record!"
    Adodc1.Recordset.MoveFirst
Else
    Adodc1.Recordset.MoveNext
End If
End Sub

Private Sub Command2_Click()
Adodc1.Recordset.AddNew
End Sub

Private Sub Command3_Click()
If Adodc1.Recordset.EOF = True Then
    MsgBox "This is the First Record!"
    Adodc1.Recordset.MoveLast
Else
    Adodc1.Recordset.MovePrevious
End If

End Sub

Private Sub Command4_Click()
Adodc1.Recordset.Update
End Sub

Private Sub Command5_Click()
Adodc1.Recordset.MoveFirst
End Sub

Private Sub Command6_Click()
If Adodc1.Recordset.EOF = True Then
    MsgBox "There is no record to be deleted!"
Else
    MsgBox "CONFIRM DELETION ?", vbYesNo, "DELETE???"
    If vbYes Then
        Adodc1.Recordset.Delete
    Else
        Adodc1.Recordset.Cancel
    End If
End If



End Sub

Private Sub Command7_Click()
Adodc1.Recordset.MoveLast
End Sub
