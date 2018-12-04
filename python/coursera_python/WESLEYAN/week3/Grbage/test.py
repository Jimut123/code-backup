import csv
#filename = read_csv_file(input("Enter a file : "))
def read_csv_file(filename):
    """Reads a CSV file and prints each row, which is a list. """
    f = open(filename)
    for row in csv.reader(f):
        print(row)
    f.close()


filename = read_csv_file(input("Enter a file : "))

