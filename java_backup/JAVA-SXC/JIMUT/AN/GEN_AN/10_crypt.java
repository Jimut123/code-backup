/**
Author : Jimut Bahan Pal
CRYPTING ALGORITHM
July, 2018
**/

import java.io.*;
import java.lang.*;

class Crypt
{
    int arr[][],n,i,j,temp;
    String crypt_text,cipherKey,deciphered_txt;
    Crypt(int a[][],int n1)         //param const
    {
        n = n1;
        arr=a;
    }
    void showDecipheredText()throws IOException
    {
        if(deciphered_txt.length()!=0)
            System.out.println(deciphered_txt);
        else
            System.out.println("Text not yet deciphered!");
    }
    void DecryptText()throws IOException
    {
        int len=cipherKey.length();
        char ch;
        int size = (int)Math.sqrt(crypt_text.length());
        int lrdush;      //lrsh for left, right, up, diagonal shift
        int dsh;            // dsh for diagonal shift   
        int csh;            // for circular shift
        csh = size*4-4;
        lrdush=size;
        dsh = 1;
        System.out.println("Decrypting text ...\n");
        int m=0,n=0;
        for(m=len-1;m>=0;m--)
        {
            System.out.println("***"+m+"**"+len);
            ch=cipherKey.charAt(m);
            switch(ch)
            {
                case '1':
                    for(n=0;n<lrdush;n++)
                    {    
                        leftshift();
                    }
                    System.out.println("After leftshift :");
                    printarray();
                break;
                case '2':
                    for(n=0;n<lrdush;n++)
                    {
                       downshift();
                    }
                    System.out.println("After downshift :");
                    printarray();
                break;
                case '3':
                    for(n=0;n<lrdush;n++)
                    {
                        rightshift();
                    }
                    System.out.println("After rightshift :");
                    printarray();
                break;
                case '4':
                    for(n=0;n<lrdush;n++)
                     { 
                       upshift();
                     }
                    System.out.println("After upshift :");
                    printarray();
                break;
                case '5':
                    for(n=0;n<=dsh;n++)
                     {   
                        diagonalshift();
                     }
                    System.out.println("After diagonalshift :");
                    printarray();
                break;
                case '6':
                    for(n=0;n<csh;n++)
                    {
                        circularshift();
                    }
                    System.out.println("After circularshift :");
                    printarray();
                break;
                default: System.out.println("Wrong cipher key syntax!");
            }
        }
        int p=0;
        deciphered_txt="";
        while(p<crypt_text.length())
        {
            ch =crypt_text.charAt(p);
            if(ch!='$')
            { 
                deciphered_txt+=ch;
            }
            p++;
        }
        System.out.println("");
    }

    void printCryptedText()         // to print the crypted text
    {
        System.out.println("Encrypted text : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print((char)arr[i][j]);
            }
        }
        System.out.println("\n");
    }
    void CipherText()throws IOException // this part converts a string to ASCII array
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the key :");
        System.out.println("[1] leftshift\n[2] downshift\n[3] rightshift\n[4] upshift\n[5] diagonalshift\n[6] circularshift"); 
        cipherKey = cd.readLine();      //12345 the key to perform encryption
        int len = cipherKey.length();
        int i=0;
        char ch;
        System.out.println("Automating Encryption :");
        while(i<len)
        {
            ch = cipherKey.charAt(i);               //encrypting on the bais of param
            switch(ch)
            {
                case '1':
                    leftshift();
                    System.out.println("After leftshift :");
                    printarray();
                    break;
                case '2':
                    downshift();
                    System.out.println("After downshift :");
                    printarray();
                    break;
                case '3':
                    rightshift();
                    System.out.println("After rightshift :");
                    printarray();
                    break;
                case '4':
                    upshift();
                    System.out.println("After upshift :");
                    printarray();
                    break;
                case '5':
                    diagonalshift();
                    System.out.println("After diagonalshift :");
                    printarray();
                    break;
                case '6':
                    circularshift();
                    System.out.println("After circularshift :");
                    printarray();
                    break;
                default: System.out.println("Wrong cipher key syntax!");
            }
            i++; 
        }
        printCryptedText();
    }
    void text_encoding()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a String to be encrypted!");
        crypt_text = cd.readLine();
        int len = crypt_text.length();
        int size = (int)Math.sqrt(len)+1;       // creating the size of the square matrix
        arr = new int[size][size];
        n=size;
        int dummy=0;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(dummy<len)
                    {
                        arr[i][j]=(int)crypt_text.charAt(dummy++);  // to store the text in the first array indices
                    }
                else
                    {
                        arr[i][j]=(int)'$';     // replaces null by '$' sign
                    }
            }
        }
    }
    void leftshift()
    {
        // 3 1 2 3 4 5 6 7 8 9
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1]=temp;
            }
        }
    }
    void rightshift()
    {   
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>0;j--)
            {
                temp=arr[i][j-1];
                arr[i][j-1]=arr[i][j];
                arr[i][j]=temp;
            }
        }
    }
    void upshift()
    {
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n;j++)
            {
                 temp = arr[i][j];
                 arr[i][j] = arr[i+1][j];
                 arr[i+1][j] = temp;
            }
        }
    }
    void downshift()
    {
        for(i=n-1;i>0;i--)
        {
            for(j=0;j<n;j++)
            {
                temp=arr[i-1][j];
                arr[i-1][j] = arr[i][j];
                arr[i][j]=temp;
            }
        }
    }
    void diagonalshift()
    {
        //left diagonal
        for(i=0;i<n/2;i++)
        {
            temp=arr[i][i];
            arr[i][i]=arr[n-1-i][n-1-i];
            arr[n-1-i][n-1-i]=temp;
        }
        //right diagonal
        for(i=0;i<n/2;i++)
        {
            temp=arr[i][n-i-1];
            arr[i][n-i-1] = arr[n-i-1][i];
            arr[n-i-1][i]=temp;
        }
    }
    void circularshift()
   {
        //arion code
        int row = 0, col = 0;
        int prev, curr,m=n,n1=n;
        while (row < m && col < n1)
        {
            if (row + 1 == m || col + 1 == n1)
                break;
            prev = arr[row + 1][col];
            for (int i = col; i < n1; i++)
            {
                curr = arr[row][i];
                arr[row][i] = prev;
                prev = curr;
            }
            row++;
            for (int i = row; i < m; i++)
            {
                curr = arr[i][n1-1];
                arr[i][n1-1] = prev;
                prev = curr;
            }
            n1--;
            if (row < m)
            {
                for (int i = n1-1; i >= col; i--)
                {
                    curr = arr[m-1][i];
                    arr[m-1][i] = prev;
                    prev = curr;
                }
            }
            m--;
            if (col < n1)
            {
                for (int i = m-1; i >= row; i--)
                {
                    curr = arr[i][col];
                    arr[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
   }
  }

    void printarray()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}

class ApplyCrypt extends Crypt
{
   ApplyCrypt(int a[][],int n)
    {
        super(a,n);     // calling the base class constructor
        System.out.println("Apply Crypt obj is constructed!");
    }
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                int n,i,j,ch;
                
                System.out.println("\nEnter the size of n :");
                n=Integer.parseInt(cd.readLine());
                int arr[][] = new int[n][n];
                
                ApplyCrypt ob = new ApplyCrypt(arr, n);
                
                while(true)
                {
                
                    System.out.println("\nEnter the array : \n [1] to enter "); 
                    System.out.println(" [2] to autofill !\n [3] to give text \n [4] to encrypt (use string) \n [5] to decrypt ");
                    System.out.println(" [6] to show the string \n [7] to show deciphered text");

                    ch = Integer.parseInt(cd.readLine());
                    
                    switch(ch)
                    {

                        case 1:
                        {
                            for(i=0;i<n;i++)        // to input accordingly
                            {
                                for(j=0;j<n;j++)
                                {
                                    System.out.println("arr["+i+"]["+j+"]:");
                                    arr[i][j]= Integer.parseInt(cd.readLine());
                                }
                            }
                        }
                        break;
                        
                        case 2:
                        {
                            int dum=0;      // to autofill
                            for(i=0;i<n;i++)
                            {
                                for(j=0;j<n;j++)
                                {
                                    arr[i][j]= dum++;
                                }
                                }
                        }
                        break;

                        case 3:
                        {
                            ob.text_encoding();     // to encode the text
                            ob.printarray();
                        }
                        break;
                        
                        case 4:
                        {
                            ob.CipherText();    // this part converts a string to ASCII array
                            ob.printarray();
                        }
                        break;

                        case 5:
                        {
                            ob.printCryptedText();
                            ob.DecryptText();
                            ob.printarray();
                            ob.printCryptedText();
                        }
                        break;

                        case 6:
                        {
                            ob.printCryptedText();      // to print the text being ciphered!
                        }
                        break;

                        case 7:
                        {
                            ob.showDecipheredText();
                        }
                        break;
                        default:
                        {
                            System.out.println("Wrong choice!");
                        }

                    }
                }
            }
}