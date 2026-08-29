1. If `byte`, `short`, or `char` participate in most arithmetic operations, they are promoted to `int`.

   ```text
   byte + byte     → int
   short + short   → int
   char + char     → int

   int + int       → int
   long + long     → long
   float + float   → float
   double + double → double
   ```

   **Example:**

   ```java
   byte a = 100;
   byte b = 50;

   // Has to be cast to "byte" because Java promotes "a + b" to "int"
   byte c = (byte) (a + b);
   ```
2. Instance/static fields get default values. 
Local variables DON'T get default values. Example:
   ```java
   class Test {
    //static fields
    static int a;
    static boolean b;
    static String c;

    public static void main(String[] args) {
        int d; //local variable (not assigned any value)
   
        System.out.println(a); // 0
        System.out.println(b); // false
        System.out.println(c); // null
   
        System.out.println(d); //compile-time error
    }
   }
   ```
3. The famous SCANNER PROBLEM:

   ```java
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter age: ");
   int age = sc.nextInt();
   sc.nextLine(); //clears the leftover newline from the buffer

   
   System.out.print("Enter name: ");
   String name = sc.nextLine();
   
   System.out.println(name);

| Code Executed | Input Buffer State | Variable Value |
| :--- | :--- | :--- |
| `sc.nextInt()` | User types `25` + Enter (`25\n`) | `age = 25` (leaves `\n` in buffer) |
| `sc.nextLine()` | Sees `\n` instantly, consumes it | `name = ""` (empty string) |

4. If-Else Condition Ordering Mistake,
I wrote the conditions in this order:

```java
if (num % 3 == 0) {
    // Divisible by 3
} else if (num % 5 == 0) {
    // Divisible by 5
} else if (num % 3 == 0 && num % 5 == 0) {
    // Divisible by both 3 and 5
}
```

Key Rule to Remember

> In an `if → else if → else` chain, put more specific conditions before more general conditions.

Example

```text
Both 3 AND 5?
      ↓
Divisible by 3?
      ↓
Divisible by 5?
      ↓
Neither?
```
5. Java Division Rule: Java determines the type of the **operation first**, then assigns the result.

```text
int / int → int
int / double → double
double / int → double
```

So:

```java
double avg = total / count;
```

If both are `int`, integer division happens first:
10 / 3 → 3 → 3.0


To get decimals:

```java
double avg = (double) total / count;
```

```text
10 / 3 → 3.333...
```

The variable's type doesn't change how the calculation is performed.

5. ```Arrays.toString(chars)``` is for displaying an array, meanwhile ```new String(chars)``` constructs a String from the characters.


6. Enhanced For-Loop — Modifying Array Elements

* In an enhanced `for` loop, the loop variable is a **copy of the array element**.
* Changing the loop variable does **not** modify the original array.

```java
char[] chars = {'a', 'b', 'c'};

for (char ch : chars) {
    ch = (char)(ch - 32);  // Only changes the copy
}
```

The array remains:

```text
[a, b, c]
```

* To actually modify the array, use an index-based loop:

```java
for (int i = 0; i < chars.length; i++) {
    //a character internally has a numeric value
    chars[i] = (char)(chars[i] - 32);
}
```

**Remember:**
`for (type x : array)` → good for **reading/traversing**
`array[i]` → use when you need to **modify elements**


7. String literal concatenation can be resolved at compile time,
   while variable-based concatenation generally happens at runtime.
   ```java 
   //String literal concatenation happens at compile time
   String a = "Hello";
   String b = "Hel" + "lo";

   System.out.println(a == b); //true
   
   //Variable based concatenation happens at runtime
   String a = "Hello";
   String x = "Hel";
   String b = x + "lo";
   
   System.out.println(a == b); //false
   ```
8. After string - concatenation - ```s+20+10 = s2010``` and before string - arithmetic - ```20+10+s = 30s```

9. ```s = s.replace("a", "o")``` - in this case the replace works because s is being assigned with the changed format


