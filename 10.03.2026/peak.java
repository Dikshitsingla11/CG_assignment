public class peak {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int n=arr.length;
        int peak=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                peak=arr[i];
                break;
            }
        }
        System.out.println("Peak element is: "+peak);
    }
}
