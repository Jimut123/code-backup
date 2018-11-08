/**
 * Finds a protein within a strand of DNA represented as a string of c,g,t,a letters.
 * A protein is a part of the DNA strand marked by start and stop codons (DNA triples)
 * that is a multiple of 3 letters long.
 *
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;
public class ss2 {
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
    public void printGenes(StorageResource  sr)
    {
        for(String gene: sr.data())
        {
            if(gene.length()>60)
            {
                System.out.println(gene.length()+"\t"+gene);
            }
        }
    }
}
