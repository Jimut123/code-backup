def problem3_7(csv_pricefile, flower):
    import csv
    fin = open(csv_pricefile)
    #fout = open(new_name,'w',newline = '')
    #ct = 0
    #tot_weight = 0.0
    for row in csv.reader(fin):
        #print(row[0]," ",row[1])
        if row[0] == flower:
            print(row[1])
    fin.close()
    #fout.close()

#csv_pricefile = "flower.csv"
#flower = input("Enter the name of the flower : ")
#problem3_7(csv_pricefile,flower)

