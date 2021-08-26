public class Factorail {
    public static void main(String args[]) {
     System.out.println(fact(5));
    }
    public static int fact(int n)
    {
        if(n<=0)
        return 1;
        System.out.println(n+" * fact("+(n-1)+")");
        int ans= n*fact(n-1);
        System.out.println("Ans "+ans);
        return ans;
    }
}


/*
=============OUTPUT===================
5 * fact(4)
4 * fact(3)
3 * fact(2)
2 * fact(1)
1 * fact(0)
Ans 1
Ans 2
Ans 6
Ans 24
Ans 120
120




*/
