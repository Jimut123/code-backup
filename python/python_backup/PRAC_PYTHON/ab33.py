for i in range(1,(5+1),1):
      if i==1 or i==5:
          for j in range(1,(5+1),1):
                if j==1 or j==5:
                    print"@",
                else:
                    print"*",
      else:
         for j in range(1,(5+1),1):
               if  j==i:
                    print"@",
               else:
                    if  j==((5-i)+1):
                        print"@", 
                    else:
                       if j%2==0:
                           print" ",
                       else:
                          print"*",
      print" "
