*************************** What is Instance *************************]]

1. What is an instance variable (field)? Where is it stored conceptually?

An instance variable is a variable that is declared inside a class but outside any method.
Each object (instance) of the class gets its own separate copy of the instance variables.

In simple terms:
When an object is created from a class

Memory is allocated for its instance variables

Different objects store different values in their own instance variables

Where is it stored conceptually?
Instance variables are stored in the Heap Memory

Since objects are created in the heap, their instance variables are part of the object in heap memory

Key Points:
Memory is allocated when the object is created

Memory is released when the object is destroyed (garbage collected)

Instance variables get default values (e.g., int = 0, boolean = false, Object = null).

2. What is an instance method? What does it mean that it is called “on an object”?

An instance method is a method defined in a class that belongs to individual objects (instances) of that class. It can access and modify the object's data (fields) and perform actions specific to that object. Unlike static methods (which are class-level), instance methods require an object to be called.

It means you invoke the method using a specific object instance, like objectName.methodName(). The method operates on that object's data—each object can have its own version of the data, so the same method might behave differently for different objects.

3. Why can two objects of the same class have different values for the same instance variable?

Because instance variables (also called fields) are per-object—each object gets its own separate copy of them. The class is just a blueprint that defines what instance variables exist, but when you create objects (instances), each one allocates its own memory for those variables. So, even though the class is the same, the data inside each object can differ.

4. 