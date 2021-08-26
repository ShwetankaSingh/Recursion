public class BinarySeacrhRecur {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7};
     System.out.println(binarySearch(arr,0,arr.length-1,2));
     
    }
    public static boolean binarySearch(int arr[],int l,int r,int find)
    {
       if(l>r)
       return false;
       int mid=(l+r)/2;
       if(arr[mid]==find)
       {
           return true;
           
       }
       else if(arr[mid]>find)
       return binarySearch(arr,l,mid-1,find);
       return binarySearch(arr,mid+1,r,find);
    }
}
