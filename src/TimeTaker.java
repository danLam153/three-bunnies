public class TimeTaker {
    public static int fibClosed(int n){
        return -1;
    }

    public static int fibIterative(int n){
        return -1;
    }

    public static int fibRecursive(int n){
        return -1;
    }
    public static void recordTime(Timable method, int n, String methodName){
        long start = System.nanoTime();
        System.out.println(method.calc(n));
        long end = System.nanoTime();
        System.out.println(methodName + "(" + n + ") calculated in " + (end-start) + "ns.");
    }

    public static void main(String[] args){
        recordTime((n)->fibClosed(n), 46, "fibClosed");
        recordTime((n)->fibIterative(n), 46, "fibIterative");
        recordTime((n)->fibRecursive(n), 46, "fibRecursive");
    }
}
