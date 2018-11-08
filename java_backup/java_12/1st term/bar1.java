class bar1
{
/** Precondition: array contains only positive values. 
* @param num a positive int
*/
void bar(int[] array, int num, int lim){
    int i = 0;
    int v = 0;
    while ((i < array.length) && (array[i] + num < lim)){
        if (array[i] <= array[v]){
            v = i; /* Statement A */
            System.out.println("v");
        }  
        i++; /* Statement B */
    }
    System.out.println(v);
}
}