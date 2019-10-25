package Dynamic;

public class Fibonacci {

    public int fibonacci(int n, int [] memo){

        if (n<=0)
            return 0;
        if (n == 1)
            return 1;
        if (memo[n] != 0)
            return memo[n];
        else
        {

            memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo);

        }
        return memo[n];
    }
}
