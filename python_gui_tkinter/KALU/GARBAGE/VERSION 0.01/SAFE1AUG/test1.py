import xlrd
workbook = xlrd.open_workbook('akankha.xls')
for sheet in workbook.sheets():
    for row in range(sheet.nrows):
        for column in range(sheet.ncols):
            print ("row::::: ", row)
            print ("column:: ", column)
            print ("value::: ", sheet.cell(row,column).value)