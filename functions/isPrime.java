public class isPrime {
    public static boolean primeFn(int n){
        if(n == 2){
            return true;
        }
//        for (int i=2; i<n-1;i++){
//            if (n%i == 0){
//                return false;
//            }
//        Optimization ----------->
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args){
        System.out.println(primeFn(13));
    }
}
