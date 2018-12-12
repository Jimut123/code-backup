 #include <iostream>
 #include <iomanip>

 int main()
 {
     int a = 45;
     float b = 45.323;
     double c = 45.5468;
     int aa = a + 9;
     float bb = b + 9;
     double cc = c + 9;
     int aaa = aa + 9;
     float bbb = bb + 9;
     double ccc = cc + 9;

     std::cout<<"print with set width = 10\n";
     std::cout<<"Ints"<<std::setw(10);
     std::cout<<"Floats"<<std::setw(10);
     std::cout<<"Doubles"<<std::setw(10) << "\n";

     std::cout<< a;
     std::cout<< std::setw(12)<< b;
     std::cout<< std::setw(10)<< c << "\n";    

     std::cout<< aa;
     std::cout<< std::setw(12)<< bb;
     std::cout<< std::setw(10)<< cc << "\n";  

     std::cout<< aaa;
     std::cout<< std::setw(12)<< bbb;
     std::cout<< std::setw(10)<< ccc << "\n\n"; 

     std::cout<<"print with tabs\n";
     std::cout<<"Int"<<"\tFloats"<<"\tDoubles\n";
     std::cout<< aaa<<"\t"<< bbb<<"\t"<< ccc <<"\n"; 

     return 0;
 }
