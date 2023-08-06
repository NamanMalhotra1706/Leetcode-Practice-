public class BubbleSort {

    public static void BubbleSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};

        BubbleSort(arr);

        printArr(arr);
        

    }
}
