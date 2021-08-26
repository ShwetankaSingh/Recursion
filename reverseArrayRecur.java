public class reverseArrayRecur {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7};
     reverseArray(arr,0);
     
      System.out.println("Final reverse array");
     for(int i=0;i<arr.length;i++)
     System.out.print(arr[i]+" ");
    }
    public static void reverseArray(int arr[],int i)
    {
        if(i>arr.length/2)
        return;
        
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
      
        for(int j=0;j<arr.length;j++)
        System.out.print(arr[j]+" ");
        System.out.println();
      
         reverseArray(arr,i+1);
    }
}
/*

================OUTPUT============
7 2 3 4 5 6 1 
7 6 3 4 5 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
Final reverse array
7 6 5 4 3 2 1 

*/
