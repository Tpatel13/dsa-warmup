package recursion;

public class Main {
    public static void main(String[] args) {
        nextFibo(10);
    }

    private static int nextFibo(int value) {
        System.out.print(value);
        System.out.print("-");
        if (value == 1 || value == 0) return 1;
        else {
            return value = nextFibo(value - 1) + nextFibo(value - 2);
        }
    }
}
