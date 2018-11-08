public class salary
{
    public static void main (String name, String doj, double basic)
    {
    double da, pf, hra, net, medical, sa;
    da=(basic*50)/100;
    pf=(basic*13)/100;
    hra=(basic*10)/100;
    medical=500;
    net=(basic+da+hra+medical)-pf;
    if (net<=5000)
    sa=(net*10)/100;
    else if(net<=10000)
    sa=(net*20)/100;
    sa=(net*30)/100;
    System.out.println (name);
    System.out.println (doj);
    System.out.println (basic);
    System.out.println (da);
    System.out.println (pf);
    System.out.println (hra);
    System.out.println (net);
    System.out.println (medical);
    System.out.println (sa);
}
}