import java.util.*;

public class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println(change(n));
        System.out.println(minus(n));
        sc.close();
    }

    static int change(int n){
        return n+1;
    }

    static int minus(int n){
        return n-1;
    }
}