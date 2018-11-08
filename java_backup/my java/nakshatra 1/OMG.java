class OMG
{
    public static void main()
    {
        int x,y,f,p;
        f=0;
        for(x=1; ;x++)
        {
         if (x>100)
          break;
        for(y=20; ;y++)
        { 
           if (y>100)
          break;
            p=(y*100)+x;
            if((p-20)==(((x*100)+y)*2))
            {
            System.out.print(x+":"+y);
            f=1;
            break;
        }
    }
        if(f==1)
        break;
    }
}
}
        
                                   
            
        