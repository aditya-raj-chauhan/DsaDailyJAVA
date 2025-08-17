📘 Time & Space Complexity – Revision Notes
🔹 Time Complexity
Definition

Time complexity = Rate of growth of running time w.r.t input size n.

Expressed as T(n), analyzed asymptotically.

Key Notations

Big-O (O): Worst-case, upper bound.

Big-Ω (Ω): Best-case, lower bound.

Big-Θ (Θ): Average-case, tight bound.

🔹 Rules for Calculating Time Complexity

Constant Rule → Fixed operation = O(1).

Sequential Rule → Add, but keep the largest term.

Example: O(n) + O(m) → O(max(n, m)).

Loop Rule →

Single loop = O(n).

Nested loop = Multiply.

Example: O(n) × O(n) = O(n²).

Conditional Rule → Only one branch executes, cost = max branch.

Logarithmic Rule → Repeated halving = O(log n).

Polynomial Rule → Dependent nested loops = O(n²), O(n³), etc.

Recurrence Rule → Use Master Theorem (e.g., Merge Sort = O(n log n)).

Ignore Constants & Lower-order Terms.

👉 Shortcut: Worst-case → Drop constants → Drop smaller terms.

🔹 Why Always Worst Case?

Guarantee of performance → Safe upper bound.

Predictable for large systems → Handles stress.

Universal comparison → Doesn’t depend on input distribution.

Average case is hard → Needs probability distribution.

⚡ Worst = Safe, Best = Rare, Average = Complex.

🔹 Examples
1. Fixed Loop
for (int i = 1; i <= 5; i++) { ... }


Runs 5 times → Constant.

Time Complexity = O(1).

2. Variable Loop
for (int i = 1; i <= n; i++) { ... }


Runs n times.

Time Complexity = O(n).

3. If-Else Marks Example
if (marks < 23) ...
else if (marks < 60) ...
else if (marks < 80) ...
else if (marks < 95) ...
else ...


At most 4 checks in worst case.

Constant number of checks.

Time Complexity = O(1) (not O(4), since constants ignored).

🔹 Space Complexity
Definition

Total memory used = Input Space + Auxiliary Space.

Components

Input Space → Memory for input data (arrays, strings, graphs).

Auxiliary Space → Extra memory used:

Temporary variables.

Temporary data structures.

Recursion stack.

Formula
𝑆
𝐶
=
𝐼
𝑛
𝑝
𝑢
𝑡
 
𝑆
𝑝
𝑎
𝑐
𝑒
+
𝐴
𝑢
𝑥
𝑖
𝑙
𝑖
𝑎
𝑟
𝑦
 
𝑆
𝑝
𝑎
𝑐
𝑒
SC=Input Space+Auxiliary Space
Examples
Iterative Sum
for (int i = 0; i < n; i++) sum += arr[i];


Input = O(n) (array).

Aux = O(1).

Total = O(n).

Recursive Factorial
fact(n) → n * fact(n-1)


Input = O(1).

Aux = O(n) (stack).

Total = O(n).

Shortcut Memory Rule

👉 Auxiliary = created by you (temp workspace).
👉 Input = already given (data storage).