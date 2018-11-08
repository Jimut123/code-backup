// Project folder:  ...\Source_IX\Chapter 16\Series
// This program finds the sum of series up to n = 10 & x = 5
// as like 1 +  x1 /2!  +x2 / 3! +............+ xn /(n+1)!
class Series {
    public static void main(String args[]) {
        int n, i, x, j;
        float p, f, p1, sum;
        n = 10;
            x = 5;
        p = 1;
        f = 1;
        sum = 1;
        for ( i = 2;i <= n; i++)
        {
            for (j = 1;j <= i; j++)
            f = f * j;
            p = p * x;
            p1 = p / f;
            sum = sum + p1;
        }
        System.out.print("The sum of the series is -> " + sum);
    }
}