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
    }

    private static void ArrayDeletionEx(char[] ar, int index) {
        for (int i = index; i <= ar.length - 1; i++) {
            ar[i - 1] = ar[i];
        }
        ar[ar.length - 1] = 0;
    }
}
