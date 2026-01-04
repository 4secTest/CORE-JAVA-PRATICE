// Asssignment Operator

1. What is an assignment operator?

An assignment operator is a symbol or set of symbols in programming languages used to assign a value to a variable. The most common assignment operator is = (the equals sign). It takes the value on the right-hand side and stores it in the variable on the left-hand side.

2. What is the return value of an assignment expression?

In Java, the return value of an assignment expression is the value that was assigned to the variable.

For example:

int a;
int b = (a = 10); // assignment expression (a = 10)
System.out.println(a); // 10
System.out.println(b); // 10

Here’s what happens:

    The expression (a = 10) assigns 10 to variable a, and its value is 10.
    That value (10) is then assigned to b.

This means assignment expressions in Java have a return value—the value assigned—and this return value can be used as part of a larger expression. For example:
Java

int x = 2;
int y = 3;
int z = (x = y + 1); // x becomes 4, z is also 4

3. Can assignment be used inside conditions?

Yes, assignment can be used inside conditions in Java.
However, it’s important to be careful, as it’s a common source of bugs (sometimes you might mean == but accidentally use =).

Example:
Java

int x;
if ((x = 5) > 3) {
    System.out.println("x is greater than 3");
}
// This will print: x is greater than 3

Here, x = 5 assigns 5 to x and the expression value is 5, so the condition 5 > 3 evaluates to true.

Caution:
Using assignment (=) inside conditions can cause bugs if you meant to compare (==) instead.

Example mistake:

int x = 5;
if (x = 3) { // Error! Assignment, not comparison
    System.out.println("Buggy code");
}

4. What happens internally when assigning primitives?

What happens internally:

    The value stored in the variable on the right is copied bit-by-bit into the memory location for the variable on the left.
    Both variables then hold independent copies of the value.
    Changing one does not affect the other.

5. What happens internally when assigning object references?

When assigning object references in Java, the reference (memory address) to the object is copied, not the actual object.

Example:

MyClass a = new MyClass();
MyClass b = a; // b now refers to the same object as a

6. Why is chained assignment is allowed?

Copilot said: **Chained assignment is allowed** in Java because

Chained assignment is allowed in Java because the assignment operator (=) returns the assigned value, allowing multiple assignments in a single statement.

Example:

int a, b, c;
a = b = c = 5; // All variables get the value 5

7. Is assignment an expression or a statement?

in Java, assignment is both an expression and a statement.

    As an expression:
    Assignment produces a value (the value assigned), so it can be used within larger expressions or conditions.

int a;
int b = (a = 10); // assignment expression

As a statement:
Assignment can also stand alone, ending with a semicolon.


int c = 5; // assignment statement


// Arithmetic Operators

1. List all arithmetic operators.

These are the all operators +, -, *, /, % 

2. What happens when dividing by zero?

In Java, the result of dividing by zero depends on the type of numbers involved:

A. Integer Division by Zero

    Throws a java.lang.ArithmeticException.

Example:
Java

int a = 5;
int b = 0;
int result = a / b; // Throws ArithmeticException: / by zero

B. Floating-point Division by Zero (float or double)

    Does not throw an exception.
    The result is:
        Infinity or -Infinity for non-zero numerator (5.0 / 0 → Infinity)
        NaN (“Not a Number”) for 0.0 / 0.0

Example:

double x = 5.0 / 0;   // x is Infinity
double y = 0.0 / 0.0; // y is NaN

3. How does JVM handle division?

When you write a division operation in Java (for example, int c = a / b;), the Java compiler translates your code into bytecode, which is executed by the Java Virtual Machine (JVM).

How it works internally:

    The JVM uses a stack-based architecture. Values (a, b) involved in the division are pushed onto the operand stack.
    For integer division, the JVM uses the idiv bytecode instruction; for floating-point division, it uses fdiv (for float) or ddiv (for double).
    The JVM pops the required operands from the stack, performs the division, and then pushes the result back onto the stack.
    The program can then access and use the division result as needed.

int a = 4;
int b = 5;
int c = a * b; // JVM uses 'imul' to multiply 4 and 5

The JVM multiplies the numbers and gives you the answer.
You don’t have to do anything extra—JVM handles it for you!

4. Why % works with negatives?

The % operator (modulo or remainder) works with negatives in Java because it calculates the remainder after dividing the first number (the dividend) by the second (the divisor), and the result takes the sign of the dividend (first number).

Example:
Java

int a = -9 % 4;  // result: -1
int b = 9 % -4;  // result: 1
int c = -9 % -4; // result: -1

Why does it work?
Java’s rules for the % operator allow both operands to be negative, zero, or positive. The calculation still finds the remainder, and the sign is determined by the dividend.

And other operator simple follow the math rule + - = -

5. Why does integer division truncate?

Integer division truncates in Java because integers cannot store fractions or decimals.
When dividing two integers, Java simply drops (truncates) any fractional part, keeping only the whole number.

6. Why is % expensive compared to +?

% involves division calculation to find the remainder, and division operations generally require more complex and slower CPU instructions.
+ is a simple arithmetic operation directly supported by hardware and executed in a single, very fast CPU step

7. Does Java guarantee evaluation order?

Java Evaluation Order - Summary

    Java guarantees left-to-right evaluation for arguments in method calls and for most expressions.
    Operators are grouped/calculated based on precedence and associativity, but individual parts (operands) are still evaluated left to right.
    Side effects (like printing or variable updates) also follow left-to-right order.
    Most normal code will behave in a predictable, left-to-right way when evaluating expressions.


// Shorthand Operators

1. What are shorthand operators?

Shorthand operators in Java (also known as compound assignment operators) are special operators that combine an arithmetic operation with assignment in a single step, making your code shorter and easier to read.

+=, -=, *=, /=, %= 

    Both forms do the same thing under the hood (add first, then assign).
    The Java compiler translates both into almost identical bytecode instructions.
    There is no speed or performance advantage for shorthand operators over normal assignments.

The shorthand operator += automatically handles type casting.
byte b = 10;
b += 5;  

