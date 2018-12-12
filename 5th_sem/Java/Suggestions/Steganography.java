import java.nio.charset.Charset;
import java.math.*;
import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class Steganography {
	public static void main(String [] args) throws Exception{
		
		FileReader code = new FileReader("input.txt");
		BufferedReader in = new BufferedReader(code);
		String s = "";
		String g = "";
		while((s=in.readLine())!=null)
			g+=s;
		
		Convert c = new Convert();
		ImageProcess impro = new ImageProcess();
		byte [] txtBytes = c.txtToByte(g);
		BufferedImage img = impro.fetchImage();
		impro.hideText(img,txtBytes);
		//c.conToBinary(g);
	}
}

class Convert{
	//Module to Convert Binary to String
	void conToString(StringBuilder binary){
		try{
		BigInteger val = new BigInteger(""+binary, 2);
		byte [] imageInByte = val.toByteArray();
		String hi = new String(imageInByte);
		System.out.println(hi);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	//Module to Convert String to Binary
	void conToBinary(String s){
		byte [] arr = s.getBytes(Charset.forName("UTF-8"));
		StringBuilder binary = new StringBuilder();
		for (byte b : arr){
			int val = b;
			for (int i = 0; i < 8; i++){
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
		}
		System.out.println("'" + s + "' to binary: " + binary);
		conToString(binary);
	}
	
	byte[] txtToByte(String s){
		byte [] arr = s.getBytes(Charset.forName("UTF-8"));
		return arr;
	}
	
	void conToBinary(byte [] barr){
		StringBuilder binary = new StringBuilder();
		for (byte b : barr){
			int val = b;
			for (int i = 0; i < 8; i++){
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
		}
		System.out.println(" to binary: " + binary);
		conToString(binary);
	}
}


class ImageProcess{
	BufferedImage fetchImage() throws Exception{
		File f = new File("Capture3.png");
		BufferedImage img = ImageIO.read(f);
		return img;
	}
	
	void hideText(BufferedImage img , byte [] txt) throws Exception{
		
		int i = 0;
		int j = 0;
		for(byte b : txt){
			for(int k=7;k>=0;k--){
				Color c = new Color(img.getRGB(j,i));
				byte blue = (byte)c.getBlue();
				
				int red = c.getRed();
				int green = c.getGreen();
				
				int bitVal = (b >>> k) & 1;  
				blue = (byte)((blue & 0xFE)| bitVal);
				
				Color newColor = new Color(red,
				green,(blue & 0xFF));
				img.setRGB(j,i,newColor.getRGB());
				j++;
			}
			i++;
		}
		
		System.out.println("Text Hidden");
		createImgWithMsg(img);
		System.out.println("Decode? Y or N");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		switch(in.readLine().trim()){
			case "Y":
			case "y":
				{
					String k = revealMsg(txt.length,0);
		 			System.out.println("Text is: " + k);
				}
				break;
			default:
					System.out.println("Program is now ending");
				break;
		}
	}
	
	void createImgWithMsg(BufferedImage img){
		try{
			File ouptut = new File("new2.png");
			ImageIO.write(img, "png", ouptut);
		}
		catch(Exception ex)
		{}
	}
	
	BufferedImage newImageFetch(){
		File f = new File("new2.png");
		BufferedImage img = null;
		try{
			img = ImageIO.read(f);
		}
		catch(Exception ex)
		{}
		return img;
	}
	
	String revealMsg(int msgLen , int offset){
		BufferedImage img = newImageFetch();
		byte [] msgBytes = extractHiddenBytes(img,msgLen,offset);
		if(msgBytes == null)
			return null;
		String msg = new String(msgBytes);
		return (msg);
	}
	
	byte[] extractHiddenBytes(BufferedImage img , int size , int offset){
		
		int i = 0;
		int j = 0;
		byte [] hiddenBytes = new byte[size];
		
		for(int l=0;l<size;l++){
			for(int k=0 ; k<8 ; k++){
				Color c = new Color(img.getRGB(j,i));
				byte blue = (byte)c.getBlue();
				
				int red = c.getRed();
				int green = c.getGreen();
				
				hiddenBytes[l] = (byte) ((hiddenBytes[l]<<1)|(blue&1));
				
				j++;
			}
			i++;
		}
		return hiddenBytes;
		
	}
}