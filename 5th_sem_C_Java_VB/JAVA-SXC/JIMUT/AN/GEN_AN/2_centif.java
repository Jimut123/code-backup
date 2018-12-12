import java.io.*;
class Centigrade
{
        public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);

                int c;
                float f,dum;
                System.out.println("Enter C :");
                c = Integer.parseInt(cd.readLine());
                if(c<0 || c>100)
                        System.out.println("Invalid data... Try again!");
                else
                        {
								dum = (float)(c/5)*9;
                                f=(float)(dum+32);
                                System.out.println("F :"+f);
                        }
        }
}
