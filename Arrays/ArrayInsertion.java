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
    }

    private static void ArrayInsert(char[] ar, int index, char val) {
        for (int i = ar.length - 1; i >= index; i--) {
            ar[i] = ar[i - 1];
        }
        ar[index - 1] = val;
    }
}
