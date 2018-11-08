class abc1 extends abc {
    int k,p,m;
    abc1()
    { super();
        k=sc.nextInt();
        p=sc.nextInt();
    }
    void input() {
        super.input();
        m=k+p;
        System.out.println(m);
    }
}