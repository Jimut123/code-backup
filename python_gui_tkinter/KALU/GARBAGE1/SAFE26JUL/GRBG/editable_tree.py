def onDoubleClick(self, event):
    ''' Executed, when a row is double-clicked. Opens 
    read-only EntryPopup above the item's column, so it is possible
    to select text '''

    # close previous popups
    self.destroyPopups()

    # what row and column was clicked on
    rowid = self._tree.identify_row(event.y)
    column = self._tree.identify_column(event.x)

    # clicked row parent id
    parent = self._tree.parent(rowid)

    # do nothing if item is top-level        
    if parent == '':
        return

    # get column position info
    x,y,width,height = self._tree.bbox(rowid, column)

    # y-axis offset
    pady = height // 2

    # place Entry popup properly         
    url = self._tree.item(rowid, 'text')
    self.entryPopup = EntryPopup(self._tree, url)
    self.entryPopup.place( x=0, y=y+pady, anchor=W, relwidth=1)
class EntryPopup(Entry):

    def __init__(self, parent, text, **kw):
        ''' If relwidth is set, then width is ignored '''
        super().__init__(parent, **kw)

        self.insert(0, text) 
        self['state'] = 'readonly'
        self['readonlybackground'] = 'white'
        self['selectbackground'] = '#1BA1E2'
        self['exportselection'] = False

        self.focus_force()
        self.bind("<Control-a>", self.selectAll)
        self.bind("<Escape>", lambda *ignore: self.destroy())

    def selectAll(self, *ignore):
        ''' Set selection on the whole text '''
        self.selection_range(0, 'end')

        # returns 'break' to interrupt default key-bindings
        return 'break'

if __name__ == "__main__":
    root = Tk()
    
