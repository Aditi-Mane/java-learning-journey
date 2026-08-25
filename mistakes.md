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
