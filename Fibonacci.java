public class Fibonacci {
    public static void main(String args[]) {
     System.out.println(fibo(4));
    }
    public static int fibo(int n)
    {
        if(n<=1)
        return n;
        System.out.println(n+"  fibo("+(n-1)+") + fibo("+(n-2)+")");
        int ans=fibo(n-1)+fibo(n-2);
        System.out.println("Ans "+ans);
        return ans;
    }
}


/*
==============OUTPUT=====================

4  fibo(3) + fibo(2)
3  fibo(2) + fibo(1)
2  fibo(1) + fibo(0)
Ans 1
Ans 2
2  fibo(1) + fibo(0)
Ans 1
Ans 3
3

-----------------------------
                        f(4)
                       /    \
                     f(3)    f(2)
                   /     \      / \
                 f(2)  f(1)   f(1)   f(0)
                /   \
              f(1)  f(0)  

*/
