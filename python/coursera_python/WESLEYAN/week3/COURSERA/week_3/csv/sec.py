import csv

def read_csv_file2(filename):
    """Reads a CSV file and prints each row without list brackets. """
    f = open(filename)
    for row in csv.reader(f):
        print(''.join(row))
        pass # replace this line with your code
    f.close()

filename = input("Enter a filename :")
read_csv_file2(filename)


