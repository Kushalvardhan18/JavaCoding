// Call by value ---- Java Always Call By Value.
public class Swapping {
    public static int swap(int a, int b){
        int temp =a;
        a =b;
        b =temp;
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
        return temp;
    }
    public static void main(String[] args){
        swap(4,5);
        swap(52,25);

    }
}
