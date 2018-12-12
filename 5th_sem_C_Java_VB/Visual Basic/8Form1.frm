VERSION 5.00
Object = "{67397AA1-7FB1-11D0-B148-00A0C922E820}#6.0#0"; "MSADODC.OCX"
Begin VB.Form Form1 
   BackColor       =   &H80000007&
   Caption         =   "Form1"
   ClientHeight    =   7935
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9090
   BeginProperty Font 
      Name            =   "Monotype Corsiva"
      Size            =   21.75
      Charset         =   0
      Weight          =   700
      Underline       =   0   'False
      Italic          =   -1  'True
      Strikethrough   =   0   'False
   EndProperty
   LinkTopic       =   "Form1"
   Picture         =   "8Form1.frx":0000
   ScaleHeight     =   7935
   ScaleWidth      =   9090
   StartUpPosition =   3  'Windows Default
   Begin MSAdodcLib.Adodc Adodc1 
      Height          =   330
      Left            =   6720
      Top             =   7440
      Width           =   1215
      _ExtentX        =   2143
      _ExtentY        =   582
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
      Connect         =   $"8Form1.frx":0342
      OLEDBString     =   $"8Form1.frx":04AD
      OLEDBFile       =   ""
      DataSourceName  =   ""
      OtherAttributes =   ""
      UserName        =   ""
      Password        =   ""
      RecordSource    =   "bill"
      Caption         =   "Adodc1"
      BeginProperty Font {0BE35203-8F91-11CE-9DE3-00AA004BB851} 
         Name            =   "Monotype Corsiva"
         Size            =   21.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      _Version        =   393216
   End
   Begin VB.TextBox Text12 
      DataField       =   "Amount"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "MS Reference Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   6360
      TabIndex        =   25
      Top             =   6840
      Width           =   2055
   End
   Begin VB.TextBox Text11 
      DataField       =   "Name"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "MS Reference Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   6360
      TabIndex        =   24
      Top             =   6360
      Width           =   2055
   End
   Begin VB.TextBox Text10 
      DataField       =   "ID"
      DataSource      =   "Adodc1"
      BeginProperty Font 
         Name            =   "MS Reference Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   6360
      TabIndex        =   23
      Top             =   5880
      Width           =   2055
   End
   Begin VB.Frame Frame1 
      Caption         =   "BILL"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1455
      Left            =   360
      TabIndex        =   2
      Top             =   5880
      Width           =   5895
      Begin VB.CommandButton Command3 
         Caption         =   "&EXIT"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   8.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   4080
         TabIndex        =   22
         Top             =   840
         Width           =   1575
      End
      Begin VB.CommandButton Command2 
         Caption         =   "&RESET"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   8.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   615
         Left            =   480
         TabIndex        =   19
         Top             =   480
         Width           =   1335
      End
      Begin VB.CommandButton Command1 
         Caption         =   "&BILL:"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   8.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   555
         Left            =   2160
         TabIndex        =   20
         Top             =   480
         Width           =   1335
      End
      Begin VB.TextBox Text9 
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
         Left            =   4080
         TabIndex        =   21
         Top             =   240
         Width           =   1575
      End
   End
   Begin VB.TextBox Text8 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7560
      TabIndex        =   18
      Top             =   4920
      Width           =   855
   End
   Begin VB.TextBox Text7 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7560
      TabIndex        =   16
      Top             =   3960
      Width           =   855
   End
   Begin VB.TextBox Text6 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7560
      TabIndex        =   14
      Top             =   3000
      Width           =   855
   End
   Begin VB.TextBox Text5 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   7560
      TabIndex        =   12
      Top             =   2040
      Width           =   855
   End
   Begin VB.TextBox Text4 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   3000
      TabIndex        =   10
      Top             =   4920
      Width           =   855
   End
   Begin VB.TextBox Text3 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   3000
      TabIndex        =   8
      Top             =   3960
      Width           =   855
   End
   Begin VB.TextBox Text2 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   3000
      TabIndex        =   6
      Top             =   3000
      Width           =   855
   End
   Begin VB.TextBox Text1 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   3000
      TabIndex        =   4
      Top             =   2040
      Width           =   855
   End
   Begin VB.CheckBox Check8 
      BackColor       =   &H80000011&
      Caption         =   "MUTTON REZALA - 150"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   4680
      TabIndex        =   17
      Top             =   4920
      Width           =   2055
   End
   Begin VB.CheckBox Check7 
      BackColor       =   &H80000011&
      Caption         =   "CHICKEN REZALA - 120"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   4680
      TabIndex        =   15
      Top             =   3960
      Width           =   2055
   End
   Begin VB.CheckBox Check6 
      BackColor       =   &H80000011&
      Caption         =   "MUTTON STEW - 120"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   4680
      TabIndex        =   13
      Top             =   3000
      Width           =   2055
   End
   Begin VB.CheckBox Check5 
      BackColor       =   &H80000011&
      Caption         =   "CHICKEN STEW - 100"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   4680
      TabIndex        =   11
      Top             =   2040
      Width           =   2055
   End
   Begin VB.CheckBox Check4 
      BackColor       =   &H80000011&
      Caption         =   "MUTTON CHAAP - 150"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   120
      TabIndex        =   9
      Top             =   4920
      Width           =   2055
   End
   Begin VB.CheckBox Check3 
      BackColor       =   &H80000011&
      Caption         =   "CHICKEN CHAAP - 120"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   120
      TabIndex        =   7
      Top             =   3960
      Width           =   2055
   End
   Begin VB.CheckBox Check2 
      BackColor       =   &H80000011&
      Caption         =   "MUTTON BIRYANI - 200"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   120
      TabIndex        =   5
      Top             =   3000
      Width           =   2055
   End
   Begin VB.CheckBox Check1 
      BackColor       =   &H80000011&
      Caption         =   "CHICKEN BIRYANI - 180"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   615
      Left            =   120
      TabIndex        =   3
      Top             =   2040
      Width           =   2055
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000010&
      Caption         =   "    ITEM                    QTY            ITEM                    QTY"
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
      Left            =   0
      TabIndex        =   1
      Top             =   1200
      Width           =   9135
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000012&
      Caption         =   "AWADH 1590"
      BeginProperty Font 
         Name            =   "Harlow Solid Italic"
         Size            =   27.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   735
      Left            =   1920
      TabIndex        =   0
      Top             =   240
      Width           =   5055
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim x As Double
Private Sub Check1_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check1.Value = Unchecked Then
Check1.Value = Checked
Else
Check1.Value = Unchecked
End If
End If
End Sub

Private Sub Check2_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check2.Value = Unchecked Then
Check2.Value = Checked
Else
Check2.Value = Unchecked
End If
End If
End Sub

Private Sub Check3_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check3.Value = Unchecked Then
Check3.Value = Checked
Else
Check3.Value = Unchecked
End If
End If
End Sub

Private Sub Check4_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check4.Value = Unchecked Then
Check4.Value = Checked
Else
Check4.Value = Unchecked
End If
End If
End Sub

Private Sub Check5_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check5.Value = Unchecked Then
Check5.Value = Checked
Else
Check5.Value = Unchecked
End If
End If
End Sub

Private Sub Check6_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check6.Value = Unchecked Then
Check6.Value = Checked
Else
Check6.Value = Unchecked
End If
End If
End Sub

Private Sub Check7_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check7.Value = Unchecked Then
Check7.Value = Checked
Else
Check7.Value = Unchecked
End If
End If
End Sub

Private Sub Check8_KeyPress(KeyAscii As Integer)
If KeyAscii = 13 Then
If Check8.Value = Unchecked Then
Check8.Value = Checked
Else
Check8.Value = Unchecked
End If
End If
End Sub

Private Sub Command1_Click()
If Check1.Value = Checked Then
x = x + Val(Text1.Text) * 180
End If
If Check2.Value = Checked Then
x = x + Val(Text2.Text) * 200
End If
If Check3.Value = Checked Then
x = x + Val(Text3.Text) * 120
End If
If Check4.Value = Checked Then
x = x + Val(Text4.Text) * 150
End If
If Check5.Value = Checked Then
x = x + Val(Text5.Text) * 100
End If
If Check6.Value = Checked Then
x = x + Val(Text6.Text) * 120
End If
If Check7.Value = Checked Then
x = x + Val(Text7.Text) * 120
End If
If Check8.Value = Checked Then
x = x + Val(Text8.Text) * 150
End If
If x >= 1000 Then
MsgBox "Congrats! you get 10% discount for ordering items worth 1000 or more", vbOKOnly, "Discount applied"
x = x * 0.9
End If
Text9.Text = Val(x)
Text12.Text = Val(x)
Adodc1.Recordset.Update
x = 0
End Sub

Private Sub Command2_Click()
Check1.Value = Unchecked
Check2.Value = Unchecked
Check3.Value = Unchecked
Check4.Value = Unchecked
Check5.Value = Unchecked
Check6.Value = Unchecked
Check7.Value = Unchecked
Check8.Value = Unchecked
Text1.Text = ""
Text2.Text = ""
Text3.Text = ""
Text4.Text = ""
Text5.Text = ""
Text6.Text = ""
Text7.Text = ""
Text8.Text = ""
Text9.Text = ""
x = 0
End Sub

Private Sub Command3_Click()
Form1.Hide
End Sub

