import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Number is negative");
        } else if (n==0) {
            System.out.println("Number is neutral");
        }
        else {
            System.out.println("Number is positive");
        }
    }
}
