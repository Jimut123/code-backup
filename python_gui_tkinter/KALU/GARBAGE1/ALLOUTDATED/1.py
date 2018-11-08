import os, MaxPlus 
from PySide import QtCore, QtGui

fname = os.path.join(os.path.abspath(os.path.curdir), "my_ui.ui")
ui_type, base_type = MaxPlus.LoadUiType(fname)
print (ui_type)
print (base_type)

def buttonClicked():
    print ("pushButton clicked")

class MyWidget(base_type, ui_type):
  def __init__(self, parent = None):
    base_type.__init__(self)
    ui_type.__init__(self)
    self.setupUi(self)
    MaxPlus.AttachQWidgetToMax(self)
    pb = self.pushButton
    pb.clicked.connect(buttonClicked)

form = MyWidget()
form.show()
