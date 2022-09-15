import java.util.Scanner;
public class practice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];
        for(int i = 0 ; i <= n ; i++ ){
            prime[i] = true;
        }
        for(int div = 2 ; div * div <= n ; div++){
            if(prime[div]){
                for(int i = 2*div ; i <= n ; i = i + div){
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}