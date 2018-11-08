unit=input("Enter Unit:")
charge=0.0
if(unit<=75) :
   charge=0.0;
if(unit>75 and unit<=150) :
      charge=0+(unit-75)*.50;
if(unit>150 and unit<=225) :
          charge=0+75*.50+(unit-150)*1.00;
if(unit>225 and unit<=300) :
     charge=0+75*.50+75*1.00+(unit-225)*2.50;
else:
   charge=0+75*.50+75*1.00+225*2.50+(unit-300)*3.50;
print"Charge",charge;
