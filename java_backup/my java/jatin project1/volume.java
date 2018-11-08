class volume
    {
        int s,l,h,b;
        double r;
        void vl(int s)
        {
            int vc;
            vc=s*s*s;
            System.out.println("Volume of cube:"+vc);
        }
        void vl(double r)
        {
            double vs;
            vs=((1.3333333)*(3.14)*(r*r*r));
            System.out.println("Volume of sphere"+vs);
        }
        void vl(int l,int b,int h)
        {
            int vcd;
            vcd=l*b*h;
            System.out.println("Volume of cuboid:"+vcd);
        }
    }