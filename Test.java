public class Test{

    public static int bianary(int[] elements, int target){
        int left = 0;
        int right = elements.length - 1;
        while (left <= right){
            int middle = (left + right)/2;
            if (target < elements[middle]){
                right = middle-1;
            }
            else if (target > elements[middle]){
                left = middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] elements){
        for (int i = 0; i < elements.length - 1; i++){
            int minIndex = i;
            for (int k = i + 1; k < elements.length; k++){
                if (elements[k] < elements[minIndex]){
                    minIndex = k;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] elements){
        for (int i = 0; i < elements.length; i++){
            int temp = elements[i];
            int possibleIndex = i;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]){
                elements[possibleIndex] = elements[possibleIndex -1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static int bianaryTwo(int[] elements, int target){
        int left = 0;
        int right = elements.length - 1;
        while (left <= right){
            int middle = (left+right)/2;
            if (target < elements[middle]){
                right = middle-1;
            }
            else if (target > elements[middle]){
                left = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    public static void insertionTwo(int[] elements){
        for (int i = 0; i < elements.length; i++){
            int temp = elements[i];
            int possibleIndex = i;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]){
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static void selectionTwo(int[] elements){
        for (int i < 0; i < elements.length - 1; i++){
            int minIndex = i;
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 3};
        int find = 3;
        //System.out.println(Test.bianary(arr, find));

        /*Test.selectionSort(arr);
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + ", ");
        }
        System.out.println("");*/

        /*int[] arrTwo = {4, 7, 12, 54, 1, -1, 3};
        Test.insertionSort(arrTwo);
        for (int k = 0; k < arrTwo.length; k++){
            System.out.print(arrTwo[k] + ", ");
        }
        System.out.println("");*/

        /*int[] biPra = {1, 3, 5, 6, 8};
        System.out.println(Test.bianaryTwo(biPra, 6));*/
    }

    int[] arrThr = {4, 7, 12, 54, 1, -1, 3};
    Test.insertionTwo(arrThr);
    
    
}
