public class Test {
    public static void main(String[] args) {
        //c = (f - 32) * (5/9)
        System.out.println(convert(20));
    }

    public static double convert(double c) {
        //(f - 32) = c / (5/9)
        double f = (c * 9)/5 + 32;
        return f;
    }
}
