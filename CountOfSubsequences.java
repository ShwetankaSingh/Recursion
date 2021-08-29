public class CountOfSubsequences {
    //find count of all subsequences divisible by k
    public static void main(String args[]) {
        int arr[]={4,2,3};
        int k=3;
     System.out.println("Count divisible by k " +find(arr,0,k,0));
    }
    public static int find(int arr[],int i,int k,int sum)
    {
        if(i==arr.length)
        {
           if(sum>0 && sum%k==0)
           return 1;
           else
           return 0;
        }
        return find(arr,i+1,k,sum)+find(arr,i+1,k,sum+arr[i]);
    }
}

/*
=======================OUTPUT=============

Count divisible by k 3


*/
