import java.util.Scanner;

// Functions which are written inside the classes are called as Methods.
public class Functions {
    public static int sum(int a, int b){ //Parameters or formal Parameters.
//        int add = a+b;
//        System.out.println("The Sum is " + c );
       return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
//        System.out.println(sum(4,5));
        int add = sum(a,b); //Arguments or actual Parameters.
        System.out.println("The sum is "+ add);
    }
}
