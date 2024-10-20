Time complexity refers to **the rate at which the runtime of an algorithm increases** as the size of the input data grows. It provides a way to analyze and predict how the execution time of an algorithm changes when the input size (e.g., the number of elements, `n`) gets larger.

### What Time Complexity Tells Us:
- It describes the **efficiency** of an algorithm.
- Helps compare different algorithms to find the most efficient one for large datasets.
- It's expressed using **Big O notation** (e.g., `O(1)`, `O(n)`, `O(log n)`, `O(n^2)`), which focuses on how the runtime grows in the worst case.

### Examples:
1. **`O(1)` (Constant Time):** The runtime does not change with the input size.
   - Example: Accessing an element in an array.
2. **`O(n)` (Linear Time):** The runtime increases linearly with the input size.
   - Example: Looping through `n` elements one by one.
3. **`O(log n)` (Logarithmic Time):** The runtime increases slowly, even if the input size grows a lot.
   - Example: Binary search.
4. **`O(n^2)` (Quadratic Time):** The runtime grows quadratically as the input size increases.
   - Example: Nested loops where each loop runs `n` times.

In short, time complexity is a measure of how quickly an algorithm's execution time grows as the input size increases. It helps developers choose the right algorithm for their problem, especially when dealing with large datasets.