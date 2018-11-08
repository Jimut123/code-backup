import pandas as pd
x1 = pd.ExcelFile("test.xls")
df = x1.parse()
print(df.head())
