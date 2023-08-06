public class SelectionSort {

    public static void SelectionSort(int arr[]){
        int length= arr.length-1;

        for(int i=0;i<length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,9,8,7,0,3,2,1};

        SelectionSort(arr);

        printArr(arr);

    }
}
