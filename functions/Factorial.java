public class Factorial {
    public static  void factorial_fn(int n){

        for (int i=n-1; i>=1;i--){
            n = n*i;
        }
        System.out.println("The Factorial of number is : " + n);
    }
    public static void main(String[] args){
        factorial_fn(4);
    }
}
