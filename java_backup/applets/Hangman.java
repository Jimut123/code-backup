	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.applet.*;
	import java.util.Random;
	import java.lang.String;
	import java.lang.*;
	 
	public class Hangman extends JApplet
	      implements ActionListener
	{
	   private JTextField wordbox, guessbox, guesslet, chances;
	   private String word, wrongletters, starstring;
	   private char[] stars;
	   private int lengword, tries;
	   private JRadioButton tletter,tword;
	   private JPanel pickpanel;
	    
	    
	       
	   public void init()
	   {
	      JPanel panel=new JPanel();
	      panel.setLayout(new GridLayout(5,2));
	       
	      panel.add(new JLabel("Word: "));
	      wordbox=new JTextField(5);
	      wordbox.setEditable(false);
	      panel.add(wordbox);

	      panel.add(new JLabel("Guessed Letters: "));
	      guesslet=new JTextField(5);
	      guesslet.setEditable(false);
	      guesslet.setText("None");
	      panel.add(guesslet);
	       
	      tletter = new JRadioButton("Letter", true);
	      tword = new JRadioButton("Word");
	      ButtonGroup gr = new ButtonGroup();
	      gr.add(tletter);
	      gr.add(tword);
          panel.add(tletter);
	      panel.add(tword);
	       
	      JButton button=new JButton("Click to Guess");
	      button.addActionListener(this);
	      panel.add(button);
	      guessbox=new JTextField(5);
	      panel.add(guessbox);
	       
	      panel.add(new JLabel("Chances: "));
	      chances=new JTextField(5);
	      chances.setEditable(false);
	      chances.setText("None");
	      panel.add(chances);
	       
	      
	       
	      pickpanel=new JPanel();
	      pickpanel.setLayout(new GridLayout(1,1));
	      pickpanel.setBackground(Color.red);
	       
	      Container c=getContentPane();
	      c.add(panel, BorderLayout.NORTH);
	      c.add(pickpanel, BorderLayout.CENTER);
	     setup();
	   }
	      
	    
	   public void actionPerformed(ActionEvent e)
	    {
	      String t, f ="";
	      t = guessbox.getText().trim().toLowerCase();
	      if (tletter.isSelected())
	      {
	         int i;
	         char letter;
	         boolean found=false;
	          
	          
	         letter = t.charAt(0);
	         for (i=0; i<lengword; i++)
	         {
	            if (letter == word.charAt(i))
	            {
	              stars[i] = letter;
	              found = true;
	            }
	            
	        }
	               
	          
	          if (found==false)
	         {
	            wrongletters+=letter;
	            tries--;
	         }
	         if (tries==0)
	         {
	            guessbox.setText("You Lose");
	            guessbox.setEditable(false);
	            wordbox.setText(word);
	             
	         }
	          
	            starstring = String.copyValueOf(stars);
	            wordbox.setText(starstring);
	            guesslet.setText(wrongletters);
	            guessbox.setText("");
	            chances.setText("" + tries);
	        
	       }
	        
	       else // word.isSelected
	       {
	          
	          if (t.equals(word))
	          {
	            guessbox.setText("You Win");
	            guessbox.setEditable(false);
	          }
	          repaint();
	        }
	     
	    }
	    public void paint(Graphics g)
	    {
	        super.paint(g);
	 
	       int y = pickpanel.getY();
	       int w = pickpanel.getWidth();
	       int h = pickpanel.getHeight();
	       int midw = w/2;
	       int midh = h/2 + 140;
	        
	        
	       g.setColor(Color.black);
	       g.drawLine(midw, midh-131, midw, midh-161);
	       g.fillRect(midw, midh-161, 100, 10);
	       g.drawLine(midw+50, midh-161, midw+100, midh-111);
	       g.fillRect(midw+100, midh-161, 10, 321);
	       g.fillRect(midw, midh+150, 200, 10);
	       g.setColor(Color.green);
	       g.fillRect(0, midh+161, w, h);
           g.setColor(Color.black);
         
	       switch(tries)
	       {
	          case 6: g.drawLine(midw, midh+70, midw-40, midh+120); //6 leg
	          case 5: g.drawLine(midw, midh+70, midw+40, midh+120); //5 leg
	          case 4: g.drawLine(midw, midh, midw+40, midh-60); //4 arm
	          case 3: g.drawLine(midw, midh, midw-40, midh-60); //3 arm
	          case 2: g.drawLine(midw, midh+70, midw, midh-80); //2 body
	          case 1:
	          {
	              g.drawOval(midw-25, midh-130, 50, 50); //1 head
	              g.drawLine(midw-13, midh-95, midw+13, midh-95); //1 mouth
	              g.drawOval(midw-13, midh-115,10,10);// left eye
	              g.drawOval(midw+9, midh-115,10,10);//  right eye
	               
	          }  //case 
	           
	               
	            
	        } //switch  
	    }
	     	     
	     
	    public void setup()
	    {
	       int i;
	       tries =6;
	       word = getaword();
	       lengword = word.length();
	       stars = new char[lengword];
	       wrongletters = "";
	       for (i=0; i<lengword; i++)
	       stars[i] = '*';
	       starstring = String.copyValueOf(stars);
	       wordbox.setText(starstring);
	       chances.setText(""+ tries);
	       repaint();
	    }
	         
        
	 
	  public String getaword()
	    {
	       Random r = new Random();
	       int num;
	        
	       String[] words = new String[20];
	       words[0]= "crew";
	       words[1]= "track";
	       words[2]= "field";
	       words[3]= "zune";
	       words[4]= "blackberry";
	       words[5]= "toyota";
	       words[6]= "gateway";
	       words[7]= "batman";
	       words[8]= "superman";
	       words[9]= "smallville"; 
	       words[10]= "supernatural";
	       words[11]= "gryffindor";
	       words[12]= "hogwarts";
           words[13]= "voldemort";
	       words[14]= "coxswain";
	       words[15]= "hudson";
	       words[16]= "nike";
	       words[17]= "pilgrims";
	       words[18]= "garcia";
           words[19]= "string";
	        
	        
	        
	       num = r.nextInt(20);  
	       return words[num];
	    }
	}
	  
