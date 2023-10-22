import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the Year");
        int n = year.nextInt();
        if(n%4==0){
            if (n%100==0){
                if (n%400==0){
                    System.out.println("Year is leap");
                }
            }

        }
        else {
            System.out.println("year is not leap");
        }
    }
}
