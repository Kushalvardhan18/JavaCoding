//Product using Functions:--->
public class Product {
    public static int num_product(int a, int b){
        int c = a*b;
//        System.out.println("The product of the numbers is : "+ c);
        return c;
    }
    public static void main(String[] args){
       int prod= num_product(4,5);
        System.out.println(prod);
    }
}
