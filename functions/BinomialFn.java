//Binomial Coefficient :-----> n!/r!*(n-r)!
import java.util.Scanner;
public class BinomialFn {
    public static int binomialCoeff(int n){
        for(int i=n-1;i>=1;i--){
            n = n*i;
        }
//            System.out.println(n);
        return n;
    }
    public static  void main (String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r =sc.nextInt();
        int c = binomialCoeff(n) /(binomialCoeff(r)*binomialCoeff(n-r));
        System.out.println(c);
    }
}
