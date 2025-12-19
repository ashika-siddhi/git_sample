import java.util.*;

public class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println(change(n));
        System.out.println(minus(n));
        sc.close();
    }


    static void nothing(int n){
        System.out.println("lets do nothing");
    }
}

    static int change(int n){
        return n+1;
    }

    static int minus(int n){
        return n-1;
    }
    #to check the pull request
}

