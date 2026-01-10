1. What is a method in Java? How is it different from a function in C?

    Definition:
    A method in Java is a block of code within a class that performs a specific action.
    It is always associated with objects and classes, helping structure the code into reusable units.

    Declaration:
    Java methods are declared within classes using a specific syntax including visibility modifiers and return types.
    This approach emphasizes encapsulation and access control for code organization.

    Invocation:
    Methods are invoked on objects (or statically on classes) using dot notation.
    Calling a method requires an instance or class reference, enforcing object-oriented principles.

    Inheritance and Polymorphism:
    Java methods support overriding and overloading, which enable flexible and dynamic behavior.
    This allows subclasses to provide specific implementations for inherited methods.

    Encapsulation and Access Control:
    Methods can be private, protected, or public, controlling how they are accessed.
    This ensures data hiding and maintains integrity within class boundaries.

2. What is a method signature? Exactly what parts belong to the signature in Java?

A method signature in Java defines the unique identity of a method within a class.
It is used by the Java compiler to distinguish between different methods, especially during method overloading.

The method signature consists of:

    The method name
    The parameter list (number, order, and types of parameters)

Return type, access modifiers (like public, private), and exceptions thrown do not belong to the method signature in Java.
Only the name and the parameter list are part of the method's signature.

3. What is access modifier ?

An access modifier in Java is a keyword that sets the visibility or accessibility level of classes, methods, and variables.
It controls whether other parts of your program or other programs can use or access a particular member.

The main access modifiers in Java are:

    public: Accessible from anywhere.
    private: Accessible only within the same class.
    protected: Accessible within the same package and subclasses.
    (default, no modifier): Accessible only within the same package.

access modifiers are mainly used inside classes in Java.
They control how members (variables and methods) of a class can be accessed from other classes and packages.

You apply them to variables, methods, constructors, and even the class itself, but always within a class definition.
Their main purpose is to maintain security and encapsulation in your code.

4. What is the difference between:
    method name
    parameter list
    return type
    method body

Method Name:
This is the identifier used to call the method; it tells the compiler and programmer which action the method performs.
The name should be meaningful and follow Java naming conventions.

Parameter List:
This is the collection of inputs (variables) the method accepts when called; it specifies the type, order, and number of arguments.
It appears in parentheses after the method name.

Return Type:
This specifies the type of value the method gives back after execution (like int, double, void, etc.).
It appears before the method name in the method declaration.

Method Body:
This is the block of code inside curly braces {} that is executed when the method runs.
It contains the statements and logic that define what the method actually does.

5. What does it mean that Java is “pass-by-value”? How does that affect method calls?

When we say Java is “pass-by-value,” it means that Java passes a copy of the actual value of each argument to methods, not the original variable itself.
Changes made to the parameter inside the method do not affect the original variable outside the method.

For primitive types (like int, double), the method receives a copy of the value, so changes have no effect outside.
For objects, Java passes a copy of the reference (address) to the object; changes to the object’s data inside the method affect the original object, but reassigning the reference does not change the original reference outside the method.

6. What is the diffrence between parameter and argument ?

Copilot said: **Parameter:** A parameter is a variable

Parameter:
A parameter is a variable defined in a method’s declaration; it acts as a placeholder for values that will be passed when the method is called.
Parameters specify what types and how many values a method expects to receive.

Argument:
An argument is the actual value or expression supplied to the method when it is called.
Arguments fill the placeholders (parameters) during the method invocation.

7. What is the difference between declaring a method and invoking a method?

Declaring a Method:
Declaring a method means specifying its name, return type, parameter list, and writing its body in a class.
It defines what the method does and how it should be called.

Invoking a Method:
Invoking a method means calling or executing the method by writing its name (with parameters, if any) somewhere in your code.
This runs the instructions inside the method and may use the result it returns.

8. Why does Java require methods to be inside a class?

Java requires methods to be inside a class because it is a pure object-oriented language; everything is organized into objects and classes.
This approach enforces structure, encapsulation, and reusability, keeping related data and behavior grouped together.

In Java, methods represent behaviors or actions that belong to objects (instances of classes), not to the program as a whole.
This design promotes code security, modularity, and the principles of object-oriented programming.

9. What is the difference between instance method and static method?

Instance Method:
An instance method belongs to an object (instance) of a class and works with the specific data (fields) of that object.
You must create an object of the class to call instance methods; they can access instance variables and other instance methods.

Static Method:
A static method belongs to the class itself, not any particular object, and is associated with the class as a whole.
You can call static methods without creating an object; they can only access static variables and other static methods.

10. When should a method be static? When should it not?

A method should be static when:

    It does not need to access or modify instance (object) variables or methods.
    Its behavior is independent of object state and relates to the class as a whole, like utility or helper functions.

A method should not be static when:

    It needs to work with specific data or states held by each object (instance variables).
    Its behavior depends on properties unique to individual instances of the class.

11. What is this in the context of method calls?

In the context of method calls, this is a special reference variable in Java that refers to the current object whose method is being executed.
It helps access instance variables and methods, distinguish between local and instance variables, and pass the current object as a parameter.

For example, inside an instance method, this.variableName refers to the variable of the current object, helping avoid ambiguity if a local variable has the same name as an instance variable.

12. Is it legal to have multiple return statements in a method? When is it a good idea vs bad idea?

Yes, it is legal to have multiple return statements in a Java method; you can use them to exit and return values at different points in the method.
This is often used in conditional logic, where you want to immediately return a result after a specific condition is met.

Good idea:

    When it makes the code easier to read and avoids unnecessary complex logic or deep nesting.
    When you need early exits for error checking, validation, or specific conditions.

Bad idea:

    When it makes the method harder to follow, especially if there are many scattered returns that confuse flow.
    When it decreases maintainability or makes debugging more difficult due to unexpected exits.

13. Can a method return null? When is it valid and when is it dangerous?

Copilot said: **Yes, a method can return `null` if

Yes, a method can return null if its return type is an object (e.g., String, List, etc.), but not if it's a primitive type (e.g., int, boolean).

    Valid:
    Returning null is valid when you want to indicate "no result," "not found," or "error" without using exceptions.

    Dangerous:
    It becomes dangerous if the calling code isn't ready to handle null, leading to NullPointerException and possible crashes.

14. Can a method return void and still “produce a result”? How (patterns)?

Yes, a method can return void and still "produce a result" by causing side effects rather than returning a value.
Such methods often modify object state, print output, write to files, or interact with external systems.

Common patterns:

    Changing object fields:
    Setters or update methods change values inside an object.

    Printing/logging:
    Methods like System.out.println() print data to the console.

    Saving data:
    Methods write to databases or files without returning values.

    Triggering actions:
    Methods initiate processes (like starting a thread or sending a message).

These results are “produced” by actions, not by returning a value.




************************* (definition + anatomy) ***********************

1. What is a method in Java, and why do we use methods instead of writing everything inside main?


    A method in Java is a block of code within a class that performs a specific task. Methods can accept input (parameters) and return a value.
    We use methods instead of writing everything in the main method because:
        Methods make code reusable.
        They keep code organized and easier to read.
        Methods simplify debugging and testing.
        They avoid repetition of code.
        In teamwork, methods help divide the work.
    If you put all the logic in the main method, your code becomes complicated, hard to maintain, and difficult to reuse.

    
    No, Java does not allow you to declare a method directly inside the main method or any other method.
    Methods must be declared inside a class but outside of other methods.
    If you try to declare a method inside the main method, you will get a syntax error.
    The correct approach is to declare all methods at the class level, and then call them from main or other methods.

************************* (Return type and Return) ***********************

2. What does return do? What’s the difference between return; and return value; ? 

    The return statement is used to exit a method and optionally send a value back to the place where the method was called.
    When a method reaches a return statement, it ends right there. No further code in that method will run.

3. Can a void method return a value? Can a non-void method omit return? Explain compiler behavior.

A method with void return type means it doesn’t send any value back.
You can write return; to simply end the method early, but you cannot write return something; (like return 5; or return "abc";) inside a void method.

No, a non-void method must always return a value.

    If a method is declared to return a value (like int, String, etc.), it MUST have a return statement that provides a value of that type.
    If you forget to return a value, compiler will show an error:
    “Missing return statement”
    All code paths must return a value.

4. What is “unreachable code” in relation to return and how can it happen?

Unreachable code means code that the compiler detects will never execute.
It often happens when you place statements after a return in a method, because return exits the method and any code after it cannot be run.'

************************* (Scope & lifetime) ***********************

