VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   6024
   ClientLeft      =   108
   ClientTop       =   432
   ClientWidth     =   10920
   LinkTopic       =   "Form2"
   ScaleHeight     =   6024
   ScaleWidth      =   10920
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command36 
      BackColor       =   &H00FFC0FF&
      Caption         =   "&NEXT"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   10.8
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   852
      Left            =   9840
      Style           =   1  'Graphical
      TabIndex        =   42
      Top             =   720
      Width           =   852
   End
   Begin VB.TextBox Memory 
      Alignment       =   1  'Right Justify
      BackColor       =   &H00FFFF80&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   19.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2760
      TabIndex        =   39
      Top             =   720
      Width           =   1812
   End
   Begin VB.TextBox Buffer 
      Alignment       =   1  'Right Justify
      BackColor       =   &H00C0C0FF&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   19.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   840
      TabIndex        =   37
      Top             =   720
      Width           =   1812
   End
   Begin VB.CommandButton Command35 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   8280
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   36
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command34 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   6960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   35
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command33 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   5760
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   34
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command32 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4560
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   33
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command31 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   3360
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   32
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command30 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2160
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   31
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command29 
      BackColor       =   &H00FFFFC0&
      Caption         =   "NOP"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   30
      Top             =   5160
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command28 
      BackColor       =   &H00FFFFC0&
      Caption         =   "mod"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   8280
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   29
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command27 
      BackColor       =   &H00FFFFC0&
      Caption         =   "+"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   6960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   28
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command26 
      BackColor       =   &H00FFFFC0&
      Caption         =   "."
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   5760
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   27
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command25 
      BackColor       =   &H00FFFFC0&
      Caption         =   "/"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4560
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   26
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command24 
      BackColor       =   &H00FFFFC0&
      Caption         =   "%age"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   3360
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   25
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command23 
      BackColor       =   &H00FFFFC0&
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2160
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   24
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command22 
      BackColor       =   &H00FFFFC0&
      Caption         =   "9"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   23
      Top             =   4320
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command21 
      BackColor       =   &H00FFFFC0&
      Caption         =   "X"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   8280
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   22
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command20 
      BackColor       =   &H00FFFFC0&
      Caption         =   "1/x"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   6960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   21
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command19 
      BackColor       =   &H00FFFFC0&
      Caption         =   "sqrt"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   5760
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   20
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command18 
      BackColor       =   &H00FFFFC0&
      Caption         =   "8"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4560
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   19
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command17 
      BackColor       =   &H00FFFFC0&
      Caption         =   "7"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   3360
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   18
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command16 
      BackColor       =   &H00FFFFC0&
      Caption         =   "6"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2160
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   17
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command15 
      BackColor       =   &H00FFFFC0&
      Caption         =   "5"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   16
      Top             =   3480
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command14 
      BackColor       =   &H00FFFFC0&
      Caption         =   "="
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   8280
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   15
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command13 
      BackColor       =   &H00FFFFC0&
      Caption         =   "-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   6960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   14
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command12 
      BackColor       =   &H00FFFFC0&
      Caption         =   "<-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   5760
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   13
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command11 
      BackColor       =   &H00FFFFC0&
      Caption         =   "4"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4560
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   12
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command10 
      BackColor       =   &H00FFFFC0&
      Caption         =   "3"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   3360
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   11
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command9 
      BackColor       =   &H00FFFFC0&
      Caption         =   "2"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2160
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   10
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command8 
      BackColor       =   &H00FFFFC0&
      Caption         =   "1"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   9
      Top             =   2640
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command7 
      BackColor       =   &H00FFFFC0&
      Caption         =   "C"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   8280
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   8
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command6 
      BackColor       =   &H00FFFFC0&
      Caption         =   "CE"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   6960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   7
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command5 
      BackColor       =   &H00FFFFC0&
      Caption         =   "M-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   5760
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   6
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command4 
      BackColor       =   &H00FFFFC0&
      Caption         =   "M+"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   4560
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   5
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command3 
      BackColor       =   &H00FFFFC0&
      Caption         =   "MS"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   3360
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   4
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00FFFFC0&
      Caption         =   "MR"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   2160
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   3
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H00FFFFC0&
      Caption         =   "MC"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   612
      Left            =   960
      MaskColor       =   &H00C0FFFF&
      Style           =   1  'Graphical
      TabIndex        =   2
      Top             =   1680
      UseMaskColor    =   -1  'True
      Width           =   852
   End
   Begin VB.TextBox Result 
      Alignment       =   1  'Right Justify
      BackColor       =   &H00C0E0FF&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   19.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   636
      Left            =   4680
      TabIndex        =   1
      Top             =   720
      Width           =   4572
   End
   Begin VB.Label Label4 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFFF&
      Caption         =   "RESULT"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   372
      Left            =   6600
      TabIndex        =   41
      Top             =   240
      Width           =   1332
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFFF&
      Caption         =   "MEMORY"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   372
      Left            =   3000
      TabIndex        =   40
      Top             =   240
      Width           =   1332
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00C0FFFF&
      Caption         =   "BUFFER"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   372
      Left            =   960
      TabIndex        =   38
      Top             =   240
      Width           =   1332
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00000000&
      Caption         =   "J-CAL"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.2
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C0FFFF&
      Height          =   6012
      Left            =   600
      TabIndex        =   0
      Top             =   0
      Width           =   9012
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Dim dummy_val As Double, op As Integer, res_val As Double
Dim mem As Double

Private Sub Command1_Click()
mem = 0
Memory.Text = Str(mem)
End Sub

Private Sub Command10_Click()
Result.Text = Result.Text + Str(3)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command11_Click()
Result.Text = Result.Text + Str(4)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command12_Click()
Result.Text = Left(Result.Text, Len(Result.Text) - 2)
End Sub

Private Sub Command13_Click()
op = 2

res_val = Val(Result.Text)
Buffer.Text = res_val
Result.Text = ""
End Sub

Private Sub Command14_Click()
Buffer.Text = Val(Result.Text)
If Val(Result.Text) = 0 Then
    
End If
If op = 1 Then
    Result.Text = Val(Result.Text) + res_val
End If
If op = 2 Then
    Result.Text = res_val - Val(Result.Text)
End If
If op = 3 Then
    Result.Text = res_val * Val(Result.Text)
End If
If op = 4 Then
    Result.Text = res_val / Val(Result.Text)
End If
If op = 5 Then
    Result.Text = res_val Mod Val(Result.Text)
End If
If op = 6 Then
    Result.Text = 1 / Val(res_val)
End If
If op = 7 Then
    Result.Text = Sqr(res_val)
End If
If op = 8 Then
    Result.Text = ((Val(Result.Text) / res_val) * 100)
End If

End Sub

Private Sub Command15_Click()
Result.Text = Result.Text + Str(5)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command16_Click()
Result.Text = Result.Text + Str(6)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command17_Click()
Result.Text = Result.Text + Str(7)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command18_Click()
Result.Text = Result.Text + Str(8)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command19_Click()
op = 7
res_val = Val(Result.Text)
Buffer.Text = res_val
Result.Text = ""
End Sub

Private Sub Command2_Click()
Result.Text = mem
Memory.Text = Str(mem)
End Sub

Private Sub Command20_Click()
op = 6
res_val = Val(Result.Text)
Buffer.Text = res_val
Result.Text = ""
End Sub

Private Sub Command21_Click()
op = 3
res_val = Val(Result.Text)
Result.Text = ""
Buffer.Text = res_val
End Sub

Private Sub Command22_Click()
Result.Text = Result.Text + Str(9)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command23_Click()
Result.Text = Result.Text + Str(0)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command24_Click()
op = 8
res_val = Val(Result.Text)
Result.Text = ""
Buffer.Text = res_val
End Sub

Private Sub Command25_Click()
op = 4
res_val = Val(Result.Text)
Result.Text = ""
Buffer.Text = res_val
End Sub

Private Sub Command26_Click()
Result.Text = Result.Text + "."
End Sub

Private Sub Command27_Click()
op = 1
res_val = Val(Result.Text)
Result.Text = ""
Buffer.Text = res_val
End Sub

Private Sub Command28_Click()
op = 5
res_val = Val(Result.Text)
Result.Text = ""
Buffer.Text = res_val
End Sub

Private Sub Command3_Click()
mem = Val(Result.Text)
Memory.Text = Str(mem)
Result.Text = ""
End Sub

Private Sub Command36_Click()
Form2.Hide
Form3.Show
End Sub

Private Sub Command4_Click()
mem = mem + Val(Result.Text)
Memory.Text = Str(mem)
Result.Text = ""
End Sub

Private Sub Command5_Click()
mem = mem - Val(Result.Text)
Memory.Text = Str(mem)
End Sub

Private Sub Command6_Click()
Result.Text = ""

End Sub

Private Sub Command7_Click()
Result.Text = ""
Buffer.Text = ""
Memory.Text = ""
res_val = 0
mem = 0
dummy_val = 0
End Sub

Private Sub Command8_Click()
Result.Text = Result.Text + Str(1)
dummy_val = Val(Result.Text)
End Sub

Private Sub Command9_Click()
Result.Text = Result.Text + Str(2)
dummy_val = Val(Result.Text)
End Sub

Private Sub Text1_Change()

End Sub

