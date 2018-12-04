def update_csv(old_name, new_name):
    import csv
    
    fin = open(old_name)
    fout = open(new_name,'w',newline = '')
    ct = 0
    tot_weight = 0.0
    for row in csv.reader(fin):
        if row[0]!="Date":
            ct = ct + 1
            tot_weight = tot_weight + float(row[1])
        csv.writer(fout).writerow(row)
    row = ["Average", tot_weight/ct]
    csv.writer(fout).writerow(row)
    fin.close()
    fout.close()  

name_old = input("Enter the old file name :")
name_new = input("Enter the new file name :")

update_csv(name_old,name_new)

