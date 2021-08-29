public class PrintSubsequence {
    //find all subsequences
    public static void main(String args[]) {
     find("abcd",0,"");
    }
    public static void find(String s,int i,String ans)
    {
        if(i==s.length())
        {
            System.out.println(ans);
            return;
        }
        find(s,i+1,ans+s.charAt(i));
        find(s,i+1,ans);
    }
}
/*

===================OUTPUT===============
  abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d

*/
