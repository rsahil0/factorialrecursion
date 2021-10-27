import java.util.Scanner;

public class factorialrecursion {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any Number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        factorialrecursion obj = new factorialrecursion();
        int result = obj.fact (n);
        System.out.println("Factorial of given Number: "+result);
    }
    int fact (int n){
        if (n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
