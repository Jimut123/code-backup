class tariff
    {
        public static void main(int hours)
            {
                int t=0;
               if(hours<=48)
                System.out.print("Wages :"+(hours*1000));
                else
                if(hours>48 && hours<=56)
                System.out.print("Wages :"+((48*1000)+(hours-48)*1250));
                else
                 if(hours>56)
                 System.out.print("Wages :"+((48*1000)+(1250*8)+(hours-56)*1500));
            }
        }