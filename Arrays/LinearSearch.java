public class LinearSearch {
    public static void main(String args[]){
int [] arr ={12,34,56,78,90,54,55};
 int target =950;
int ans = Linearsearch(arr ,target);
System.out.println(ans);

    }

    static int Linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target)
            return i;
        }
        return -1;
    }
   static int Linearsearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for( int element : arr){
            if(element == target)
            return element;
        }
        return Integer.MIN_VALUE;
    }
}

