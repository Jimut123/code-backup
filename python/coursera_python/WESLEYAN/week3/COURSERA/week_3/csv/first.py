import csv

def read_csv_file1(filename):
    """Reads a CSV file and print it as a list of rows."""
    f = open(filename)
    data = []
    for row in csv.reader(f):
        data.append(row)
    print(data)   
    f.close()
filename = input("Enter a filename : ")
read_csv_file1(filename)
