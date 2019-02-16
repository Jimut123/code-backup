public class vigenere
{
    public static String encrypt(String text, final String key)
    {
        String res = "";
        int mid;
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            //res += (char) ((c + key.charAt(j) - 2 * 'A'+1) % 26 + 'A');
            mid=c+key.charAt(j)-64;
            if(mid>90)
              mid=mid-26;
            res += (char) (mid);
            j = ++j % key.length();
        }
        return res;
    }
 
    public static String decrypt(String text, final String key)
    {
        String res = "";
        int mid;
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
            {
                res=res+" ";
                continue;
            }
            //res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            mid=c-key.charAt(j)+64;
            if(mid<65)
              mid=mid+26;
            res += (char) (mid);
            j = ++j % key.length();
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        String key = "ENIGMA";
        //String message = "XCVLGJRSB PG JX HQL CFTDUL AP TBN PZBLWWLF BSMCOVOL CO DUP IC COR UMWWNF UMOC UB PSS LHA JROPPAF";
        String message = "ROLOVOJG LHA OJJNY GINBT HF IZAJUF ET PDA WVXH KLPBZGN ZBNJHQPAH YVRUXT IWOMRSJBCSL GWCV FBV ICNZ VU RSJU VUX BXA GINBTPAH";
        //String encryptedMsg = encrypt(message, key);
        //System.out.println("String: " + message);
        //System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + decrypt(message, key));
    }
}