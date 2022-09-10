public class practice{
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int indexToDelete = searchElement(arr, 0, arr.length, 3);
        System.out.println("Element found at:" + indexToDelete);
        System.out.println("After Deletion");
        int m = deleteElement(arr, indexToDelete);
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        int x = insertElement(arr, arr.length, indexToDelete, 3);
        System.out.println("After Insertion");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int insertElement(int[] arr, int n, int posToInsert, int elementToInsert) {
        int i;
        for (i = posToInsert; i < n - 2; i++) {
            arr[i + 1] = arr[i];
        }
        arr[posToInsert] = elementToInsert;
        return n;
    }
    
    static int deleteElement(int[] arr, int indexTodelete) {
        int i;
        for (i = indexTodelete; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr.length - 1;
    }
    static int searchElement(int[] arr, int low, int high, int key){
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return searchElement(arr, mid + 1, high, key);
        }
        return searchElement(arr, low, mid - 1, key);
    }
}