package Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        char ar[] = new char[5];
        ar[0] = 'a';
        ar[1] = 'b';
        ar[2] = 'v';
        ar[3] = 'c';
        ar[4] = 'd';
        System.out.println("Before Deletion");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        ArrayDeletionEx(ar, 3);
        System.out.println();
        System.out.println("After Deletion");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        //Program for Number Deletion
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int key = 4;
        int n = arr.length;
        System.out.println();
        System.out.println("Before Deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int x = deleteElement(arr, key, n);
        System.out.println("After Deletion");   
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void ArrayDeletionEx(char[] ar, int index) {
        for (int i = index; i <= ar.length - 1; i++) {
            ar[i - 1] = ar[i];
        }
        ar[ar.length - 1] = 0;
    }

    private static int deleteElement(int[] arr, int key, int n) {
        int i;
        for (i = key - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
}
