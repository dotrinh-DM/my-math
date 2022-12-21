package fib;


public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.using_for();
    }

    public void using_for() {
        int n1 = 0, n2 = 1, n3, i, count = 23;
        LogI("fib: " + n1);
        LogI("fib: " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            LogI("fib: " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void LogI(String Message) {
        System.out.println("viewlog " + Message);
    }

}