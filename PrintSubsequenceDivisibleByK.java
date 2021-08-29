public class PrintSubsequenceDivisibleByK {
    //find all subsequences divisible by k
    public static void main(String args[]) {
        int arr[]={4,2,3};
        int k=3;
     find(arr,0,0,"",k);
    }
    public static void find(int arr[],int i,int sum,String ans,int k)
    {
        if(i==arr.length)
        {
            if(ans.length()>0 && sum%k==0)
            System.out.println(ans);
            return;
        }
        find(arr,i+1,sum,ans,k);
         find(arr,i+1,sum+arr[i],ans+arr[i],k);
    }
}


/*
==============OUTPUT================
3
42
423

*/
