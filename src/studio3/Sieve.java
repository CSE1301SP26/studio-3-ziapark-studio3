package studio3;
import java.util.Scanner;
public class Sieve {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is n?");
    int n = in.nextInt();
    boolean[] sieve = new boolean[n+1];
    for (int i = 2; i < n + 1; i++){
        if (sieve[i] == false){
            for (int p = 2 * i; p < n + 1; p = p + i){
            sieve[p] = true;
    }
    }
    }
     for (int i=2; i < n + 1; i++){
        if (sieve[i] == false){
            System.out.println(i);
        }
     }
     }
   
    
}