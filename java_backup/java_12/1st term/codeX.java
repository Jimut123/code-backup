import java.io.*;
class codeX
{
    static void main()
    {
    int array[] = {81,13,10,34,23,234,8,33};
int value = array[0]; 
int value2 = value;
int c=0;
for (int element : array){
    System.out.println(c++);
    if (element > value){
        value = element;
    }
    if (element < value2){
        value2 = element;
    }
}
System.out.println(value+" "+value2);
}
}