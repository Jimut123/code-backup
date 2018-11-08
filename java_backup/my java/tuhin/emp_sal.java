public class emp_sal extends emp_master
{
    public int da ;
    public int hra ;
    public int ta ;
    public int gross;
    
    public void calc()
    {
        da=(basic*10)/100 ;
        System.out.println("Da:"+da);
        hra=5000;
        System.out.println("Hra:"+hra);
        ta=(basic*5)/100;
        System.out.println("Ta:"+ta);
        gross =basic+da+hra+ta;
        System.out.println("Gross:"+gross);
    }
}
        