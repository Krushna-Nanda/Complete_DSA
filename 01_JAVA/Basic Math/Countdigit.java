import java.util.Scanner;
public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        // int count = 0;
        // while(n>0){
        //     n = n/10;
        //     count++;
        // }
        // System.out.println("Number of digits in the given number is: "+count);

        // optimised logic

         int  count = (int)Math.ceil(Math.log10(n));

         System.out.println("Number of digits in the given number is: "+ count);
    }
}

/* 

 Magnitude in the Context of Logarithms
When discussing the magnitude of a number in terms of logarithms, it often refers to how large a number is in comparison to powers of ten.
For instance, the magnitude of 1000 is 3 because it can be expressed as 10^3. Similarly, the magnitude of 10000 is 4 because it can be written as 10^4. The magnitude of a number is related to the number of digits in its decimal representation.

 .
This is relevant in calculating the number of digits in a number, as discussed earlier.



The optimized logic using `Math.log10(n)` is more efficient than the first approach with the `while` loop. Here's why:

### Comparison of the Two Approaches:

1. **First Approach: Using a While Loop**
   ```java
   int count = 0;
   while(n > 0) {
       n = n / 10;
       count++;
   }
   System.out.println("Number of digits in the given number is: " + count);
   ```
   - **Time Complexity:** This approach has a time complexity of \( O(d) \), where `d` is the number of digits in `n`. This is because each iteration removes one digit from `n`, and the loop runs `d` times.
   - **Efficiency:** It may become slower for very large numbers because it has to repeatedly divide the number until it reaches `0`.

2. **Optimized Approach: Using `Math.log10`**
   ```java
   int count = (int) Math.log10(n) + 1;
   System.out.println("Number of digits in the given number is: " + count);
   ```
   - **Time Complexity:** This approach has a time complexity of \( O(1) \) because the logarithmic calculation is done in constant time. The method performs a mathematical operation directly, without any loops.
   - **Efficiency:** Much faster for large numbers, as it doesn't need to iterate over the digits. The calculation directly gives you the result.

### Why Is the `Math.log10(n)` Approach More Efficient?
- **Constant Time (`O(1)`):** It calculates the result in a single step, regardless of the size of `n`. The logarithmic function directly determines the magnitude of the number.
- **No Iteration Needed:** Unlike the loop, which checks and divides `n` digit by digit, the logarithmic approach jumps directly to the answer.

### Practical Example:
- **Input:** `n = 123456789`
  - **While Loop:** It will divide `n` by `10` nine times (one for each digit) to reach `0`.
  - **Logarithmic Approach:** It calculates `Math.log10(123456789)` once and gives the result almost instantly.

Therefore, **the optimized logic with `Math.log10` is more efficient** due to its constant time complexity, making it faster and more suitable for handling larger numbers.

*/