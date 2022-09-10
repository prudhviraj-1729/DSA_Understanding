package Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        char ar[] = new char[6];
        ar[0] = 'a';
        ar[1] = 'b';
        ar[2] = 'c';
        ar[3] = 'd';
        ar[4] = 'e';
        System.out.println("Before Insertion");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        ArrayInsert(ar, 3, 'v');
        System.out.println();
        System.out.println("After Insertion");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int key = 3;
        int n = 5;
        int capacity = arr.length;
        //Bfore Insertion
        System.out.println();
        System.out.println("This is for Number Insertion");
        System.out.println("Before Insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        n = insertElementNumber(arr, key, capacity, n);
        //After Insertion
        System.out.println("After Insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void ArrayInsert(char[] ar, int index, char val) {
        for (int i = ar.length - 1; i >= index; i--) {
            ar[i] = ar[i - 1];
        }
        ar[index - 1] = val;
    }

    private static int insertElementNumber(int[] arr, int key, int capacity, int n){
        if(n >= capacity){
            return n;
        }
        int i;
        for(i = n-1 ; (i >= 0 && arr[i] > key); i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = key;
        return n+1;
    }
}
