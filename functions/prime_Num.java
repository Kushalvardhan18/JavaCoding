// Printing all the prime numbers in a range ----->
public class prime_Num {
    public static boolean primeFn(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public  static boolean print_Prime(int n){
        if (n==2){
            System.out.println("The prime number is " + n);

        }
        for (int i =2;i<=n;i++){
            if (primeFn(i)){
                System.out.println(i);
            }

        }
        return true;
    }
    public static void main(String[] args){
        print_Prime(13);
    }
}
