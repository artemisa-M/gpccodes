public class Main {

    static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return a * (b / GCD(a, b));
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 53;
        System.out.println("GCD de a y b = " + GCD(a, b));
        System.out.println("LCM de a y b = " + LCM(a, b));
    }
}
