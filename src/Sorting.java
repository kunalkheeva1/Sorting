public class Sorting{
    public static void main(String[] args) {
        int []arr={2,5,3,8,7,36,53,10,43,655,32,34,54,245,4235,2436};
        for(int i=0; i<arr.length; i++){
            int smallest =i;
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    smallest=j;
                }
            }int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}