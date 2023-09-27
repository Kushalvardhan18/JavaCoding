// Multiple functions with the same name but with the different parameters.
public class func_Overloading {
    public static int cal_Multiply(int a, int b){
        return a*b;
    }
    public static float cal_Multiply(float a, float b){
        return a*b;

    }
    public static void main(String[] args){
//        cal_Multiply(4,4.5); ---------> This is not valid as it is taking int value ,but we are providing float value.
        System.out.println(cal_Multiply(4,5));
        System.out.println(cal_Multiply(5.4F,4.5F));

    }
}
