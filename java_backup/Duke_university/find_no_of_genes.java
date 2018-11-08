import java.io.*;
import edu.duke.*;
class find_no_of_genes
{
    public String findProtein(String dna)
    {
        int start = dna.indexOf("atg");
        if(start == -1)
        {
            return "";
        }
        int stop = dna.indexOf("tag",start+3);
        if((stop-start)%3==0)
        {
            return dna.substring(start,stop+3);
        }
        else
        {
            return "";
        }
    }
    public void printAllStarts(String dna)
    {
        int start = 0;
        while(true)
        {
            int loc = dna.indexOf("atg",start);
            if(loc==-1)
            {
                break;
            }
            System.out.println("Starts at : "+loc);
            start = loc+3;
        }
    }
    public int findStopIndex(String dna, int index)
    {
        int stop1 = dna.indexOf("tga",index);
        if(stop1==-1 || (stop1 - index)%3!=0)
        {
            stop1 = dna.length();
        }
        int stop2 = dna.indexOf("taa",index);
        if(stop2 == -1 || (stop2 - index)%3!=0)
        {
            stop2 = dna.length();
        }
        int stop3=dna.indexOf("tag",index);
        if(stop3 == -1 ||(stop3 - index)%3!=0)
        {
            stop3 = dna.length();
        }
        return Math.min(stop1,Math.min(stop2,stop3));
    }
    public static void main()
    {
        codons ob = new codons();
        String s= "xxxxxatgxxyyccxxgtagxxxxatgaaatag";
        String d=ob.findProtein(s);
        System.out.println(d);
    }
}