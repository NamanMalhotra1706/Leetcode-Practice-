public class InsertionSort {

    // We suppose 1st element Sorted hai
    public static void InsertionSort(int arr[]){

       
        for(int i=1;i<arr.length;i++){
            int currentEle = arr[i];

            int j=i-1;
            while(j>=0 && currentEle < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            //placement of Element
            arr[j+1]=currentEle;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,1,2,3,4,5,6};

        InsertionSort(arr);
        printArr(arr);
    }
}
