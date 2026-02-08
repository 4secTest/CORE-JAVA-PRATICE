********************* Core Definition ***********************


1. What is a data type?  
 
 data type is a classification that specifies what kind of value a variable can    hold in programming and computer science. It defines the type of data (such as integer, float, character, string, boolean, etc.) and what operations can be performed on that data.

2. Why does Java need data types at all?

Java needs data types to ensure that variables store only valid values, allow the compiler to detect errors early, and optimize how the program manages memory and performs operations. This makes Java programs safer, more efficient, and more reliable.

3. primitive vs non-primitive ?

Primitive data types are the basic, predefined types provided by the language. They store single values and are not objects.

Non-primitive data types (also called reference types) are not predefined; they are created by the programmer or Java and can store multiple values or complex data.

4. What does it mean that Java is strongly typed and statically typed?

 **Strongly typed (in Java)** means Java enforces
Strongly typed (in Java) means Java enforces type rules strictly: values have specific types, and the language/runtime generally won’t let you treat one type as another without an explicit conversion. If you try, you usually get a compile-time error (or sometimes a runtime exception).

5. Why is char considered an integer type internally?

In Java, the char data type is considered an integer type internally because it stores characters as their corresponding Unicode numeric values. Every character has a unique integer code (Unicode code point), so a char is essentially stored and manipulated as a 16-bit unsigned integer representing that code.

    ASCII: Represents basic English characters using values 0–127.
    Example: 'A' has value 65.

    Unicode: Covers characters from all languages using values 0–65535.
    Example: 'A' is 65, 'अ' (Hindi) is 2309, '字' (Chinese) is 23383.

    Java char: Is a 16-bit unsigned data type, storing values from 0 to 65535 (always positive). It holds the Unicode value of any character.

    Signed: A number type that can represent both negative and positive values (uses one bit for the sign).
Example: int in Java is signed.

    Unsigned: A number type that represents only zero and positive values,     giving a larger max positive range.

    Summary:
    Java char can store any character’s Unicode value (e.g., English, Hindi, Chinese). It uses 16 bits, so values must be between 0 and 65535, and cannot be negative.

char ch = 127;        // Storing integer 127 in char
System.out.println(ch);         // Output: (a special control character, usually not visible)
System.out.println((int)ch);    // Output: 127

6. Why does char behave differently from byte/short in many conversions?

`char` is different because it’s meant for
char is different because it’s meant for characters, not “small numbers”.

byte and short can be negative (they are signed).
char is never negative (it’s unsigned) because it stores a character code (0 to 65535).
So when Java converts them:

byte/short may keep the minus sign.
char always stays positive, so the result can look different.


7. Why does Java not use platform-dependent data type sizes?

Java uses fixed data type sizes so that programs produce consistent and predictable results everywhere, making Java "write once, run anywhere."

Because java is an platform independent data type.

8. What is the default value of each primitive data type?

Here’s a table of the default values for each primitive data type in Java:
Data Type	Default Value
byte	0
short	0
int	0
long	0L
float	0.0f
double	0.0d
char	'\u0000' (null char)
boolean	false

9. Where are primitive variables stored in memory?

Local primitive variables (declared inside methods):
    Stored on the stack memory.

    Instance variables / fields (declared in a class, but outside any method):
    Stored on the heap memory as part of the object.

    Static primitive variables (declared with static in a class):
    Stored in the method area (or sometimes considered as part of the heap by JVMs).

10. Why is boolean size not clearly defined in Java?

java aims for platform independence and leaves implementation details to the JVM, allowing it to optimize memory as needed.
A boolean logically requires only one bit (true/false), but most CPUs and memory systems work with bytes (8 bits) or larger units.
JVMs might store boolean values using 1 byte, 4 bytes, or other sizes depending on how variables are grouped or for efficient access.

11. Can a primitive be null? Why / why not?

Primitive data types (like int, char, boolean, etc.) store actual values directly in memory, not references or object addresses.
    null is a special literal in Java which means "no object" or "no reference."
    Since primitives are not objects or references, they cannot be set to null.

12. Why did Java designers separate them?

Primitive data types store actual values (e.g., int, char, boolean).
    Reference data types store references (addresses) to objects (e.g., String, arrays, custom classes).

To make Java faster and more memory efficient for basic values (primitives), and more flexible for storing complex data (objects). This separation makes simple data quick to access, while allowing objects to support features like inheritance and polymorphism.

13. What happens internally when you assign one primitive to another?

When you assign one primitive variable to another in Java, the value is copied from the source variable to the target variable. After assignment, both variables hold independent copies of the value.

14. What happens internally when you assign one object reference to another?

When you assign one object reference to another in Java, both variables point to the same object in memory. No new object is created—only the reference (address) is copied.

15. Why is Java called strongly typed?

Java is called strongly typed because every variable and expression has a specific data type, and the compiler strictly checks that types are used correctly. You cannot use a value of one type as another type without an explicit conversion. This helps prevent type errors and improves program safety.

16. What is type safety?

Type safety means the programming language ensures that values are only used in ways allowed by their data types. It prevents you from doing invalid operations, like treating an integer as a string or using an object as the wrong type.

17. What is implicit type conversion?

Implicit type conversion (also called “automatic” or “type coercion”) is when the Java compiler automatically converts a value from one data type to another compatible type, without you having to write any extra code.

Example:
Java

int a = 10;
double b = a;

18. What is explicit type casting?

Explicit type casting is when you manually convert a value from one data type to another by writing the target type in parentheses before the value.

Example:
Java

double a = 12.5;
int b = (int) a; 

    
19. Why does Java allow implicit conversion but not implicit casting? 
Java allows implicit conversion (also called widening conversion) only when no data loss will occur, such as converting a smaller type to a larger, compatible type (e.g., int to double). This is safe because all possible values of the smaller type fit into the larger type.

Java does not allow implicit casting (narrowing conversion, like double to int) because it can lead to data loss or unexpected results. Requiring an explicit cast reminds the programmer that the conversion may lose information and should be done intentionally.

note: widening is implicit 
      narrowing is explicit.

20. Why is char incompatible with byte directly?

byte → char (direct w/ cast)
Java

byte b = 65;
char c = (char) b; // Explicit cast
System.out.println(c);  // Output: A

 Certainly! Here are examples of **direct** and

Certainly! Here are examples of direct and indirect conversion between byte and char in Java:
 Direct Conversion (with explicit cast)

Since byte and char have incompatible types and ranges, you must cast explicitly, and data loss is possible.
byte → char (direct w/ cast)
Java

byte b = 65;
char c = (char) b; // Explicit cast
System.out.println(c);  // Output: A

char → byte (direct w/ cast)
Java

char c = 'A';      // Unicode 65
byte b = (byte) c; // Explicit cast
System.out.println(b);  // Output: 65

But, if char value is out of byte range (e.g., char c = 'क';), data loss will happen:
Java

char c = 'क';      // Unicode 2325
byte b = (byte) c; // Out of byte range!
System.out.println(b);  // Output: -27  (data lost)


You can convert using int as an intermediary, which may help clarify the conversion but doesn’t prevent data loss if the value overflows.
byte → int → char
Java

byte b = 65;
int i = b & 0xFF; // Ensure positive value (since byte is signed)
char c = (char) i;
System.out.println(c);  // Output: A

char → int → byte
Java

char c = 'A';    // Unicode 65
int i = (int) c; // Upcast to int (safe)
byte b = (byte) i; // Downcast to byte (possible overflow)
System.out.println(b);  // Output: 65

21. Why does Java promote all arithmetic to int?

A. Safety Against Overflow

    byte and short have small ranges. Doing math directly on them could easily overflow (go outside their limits).
    Promoting to int (which has a much bigger range) helps avoid silent data loss during calculations.

B. Processor Efficiency

    Most CPUs work best with data sizes of 32 bits or larger (which is what an int is).
    Doing arithmetic as int is faster and easier for the processor.

c. Language Simplicity

    Always converting to int makes the rules simpler and code more predictable.

22. What is numeric promotion?

Numeric promotion in Java is the automatic conversion of smaller numeric types (byte, short, char) to a larger type (int or double) when performing arithmetic operations, to avoid data loss and make calculations consistent.

Types:

    Unary Numeric Promotion:
        When applying a unary operator (like +, -, ~), byte, short, or char is promoted to int.

    Binary Numeric Promotion:
        When doing arithmetic with two different types, both are promoted to the largest type involved (at least int).
        Example: byte + byte → both become int; int + double → both become double.

23. What happens when int overflows ?

int a = Integer.MAX_VALUE; // 2147483647
a = a + 1;
System.out.println(a);     // Output: -2147483648

    Here, adding 1 to max value wraps it to min value.

No error or exception is thrown—Java just wraps the number.

24. How does Java internally handle overflow?

Java internally handles overflow using a mechanism called two’s complement arithmetic for integer types (byte, short, int, long):
What happens

    When an arithmetic operation (like addition or multiplication) exceeds the max or min value that a type can store, the result wraps (“overflows” or “underflows”) around the valid range.
    No error or exception is thrown — the bits are simply truncated to fit the storage size.


TO Be Continued.. 