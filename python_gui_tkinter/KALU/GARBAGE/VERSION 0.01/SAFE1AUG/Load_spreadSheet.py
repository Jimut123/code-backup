import xlrd

# to make the xlrd object
workbook = xlrd.open_workbook('akankha.xls')
print(workbook)


# to collect the no. of sheets present :
n_sheets = workbook.nsheets
print(n_sheets)

# to get and print the sheet names :
sheet_names = workbook.sheet_names()
print(sheet_names)


# to get the first worksheet 
first_sheet = workbook.sheet_by_index(0)
print(first_sheet)

# to read a row
row_1 = first_sheet.row_values(0)
print(row_1)

# to read a cell

cell = first_sheet.cell(0,0)

print(cell)
print(cell.value)

# read a row slice

row_slice = first_sheet.row_slice(rowx=4, start_colx=0, end_colx=10)
print(row_slice)

