public class practice {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int toSearch = 3;
        int index = searchElement(arr, 0, arr.length - 1, toSearch);
        System.out.println("Element found at index " + arr[index]);
        System.out.println("Before Deletion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("After Deletion");
        int n = deleteElement(arr, index);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("After Insertion");
        int capacity = arr.length;
        int m = insertElement(arr,capacity, arr.length-1, 3);
        for(int i = 0 ; i < m; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int insertElement(int[] arr, int capacity, int n, int key){
        if(n > capacity){
            return n;
        }
        int i;
        for(i = n-1 ; (i >= 0 && arr[i] > key) ; i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = key;
        return n+1;
    }
    
    static int deleteElement(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr.length - 1;
    }

    static int searchElement(int[] arr, int low, int high,int key) {
        int mid = (low+high)/2;
        if(key == arr[mid]){
            return mid;
        }
        if(key > arr[mid]){
            return searchElement(arr, mid+1, high, key);
        }
        return searchElement(arr, low ,mid-1, key);
    }
}