package az.coders.ada_students.lessons.lesson_18;

class Solution18_1 {
    public int fib(int n) {
        if ( n == 0 ) return 0;
        if ( n == 1 ) return 1;
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }
}

public class FibonacciNumber {
    public static void main(String[] args) {
        Solution18_1 solution18_1 = new Solution18_1();
        System.out.println(solution18_1.fib(4));
    }


}
