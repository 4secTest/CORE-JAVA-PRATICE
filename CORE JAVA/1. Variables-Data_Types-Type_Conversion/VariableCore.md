************************* Core Definition *************************

1. What is a variable in Java? How is it different from a value and an object?

Variable = a named storage location that holds a value (or a reference to an object) and whose content can change during program execution.

Value
The actual data stored/used
For primitives: value is the number/char/boolean itself
For references: value is the reference (address-like handle), not the object

Object
A real instance of a class created in memory (heap)
Has state (fields) + behavior (methods)

2. What is declaration vs initialization vs assignment? Give a tiny example for each.

Declaration: tells Java a variable’s type + name (creates the variable).
Initialization: gives the variable its first value at the time of declaration.
Assignment: sets/changes the value of an already-declared variable (can be first time too, but typically after declaration).

int x;      // declaration
x = 10;     // (first) assignment -> also counts as initialization in general terms
x = 20;     // assignment (re-assignment)

*********************** Types and categories of variables ***********************


3. List the 4 main variable categories in Java: local, instance, static, parameter. Define each in 1–2 lines.

Local variable

Declared inside a method/constructor/block.
Scope is within that block only; must be initialized before use.

Instance variable (non-static field)

Declared inside a class but outside methods, without static.
Each object gets its own separate copy; gets default values if not initialized.

Static variable (class variable)

Declared in a class with static.
One shared copy per class (not per object); initialized when the class loads; gets default values if not initialized.


Parameter variable

Declared in a method/constructor header.
Receives a value when the method is called; scope is inside that method/constructor.

4. Where are local variables stored conceptually? Where are instance fields stored?

1) Local variables
Stored in the stack frame of the current method call (i.e., the thread’s call stack).
If a local is a reference variable, the reference is on the stack, but the object it points to is on the heap.
2) Instance fields (non-static fields)
Stored inside the object, so conceptually on the heap (because objects live on the heap).
Each object has its own copy of its instance fields.

5. Which variable types get default values automatically? Which do not? Why?

1) Get default values automatically

Instance variables (fields)
If you don’t initialize them, Java assigns defaults (e.g., 0, false, null) when the object is created.
Static variables (class variables)
If you don’t initialize them, Java assigns defaults when the class is loaded/initialized.
Array elements
Every element gets a default value when the array object is created.

2) Do NOT get default values automatically

Local variables (inside methods/blocks)
No default value; you must assign before use.
Parameters
No “default by Java”; they get a value only from the method call (or are set by the caller). They are considered definitely assigned when the method starts.

Why this difference?

Fields (instance/static) + array elements belong to objects/classes that Java initializes in a well-defined lifecycle, so Java can safely set them to defaults.

Local variables live in method stack frames and Java forces definite assignment to prevent reading garbage/undefined values (and to catch bugs at compile time).

************************* Scope and lifetime *************************

6. Define scope and lifetime of a variable. How are they related but different?

Scope
Scope = the region of code where a variable name is visible and can be used (accessible by its identifier).

Lifetime
Lifetime = the time duration during execution for which the variable’s storage (or referenced object) exists and is valid.

 Relationship

They are related because both describe “where/when a variable works”, but:

Scope is about visibility in code (compile-time concept).
Lifetime is about existence in memory during runtime.
So a variable can be out of scope while the data it pointed to may still exist (common with objects).

7. Can you declare a variable with the same name in an inner block? When is it allowed and when does it cause an error?

Local vs local (nested blocks): same name → error (because outer local still in scope).

Field vs local: same name → allowed (local shadows field).

Parameter vs local: same name → error (parameter is in scope).

Same name in two separate blocks: allowed if earlier one’s scope ended.


*************************** Initialization rules and compiler behavior ***************************

8. Why does Java force definite assignment for local variables? What does “might not have been initialized” mean?

Java forces definite assignment for local variables to prevent you from reading garbage/unknown values and to catch bugs at compile time.

“Might not have been initialized” means: based on the code paths (if/else/loops), the compiler sees that there is at least one possible path where the variable is used before any value is assigned.

9. What happens here and why?


class A { int x; }
System.out.println(new A().x);

x is an instance variable (field) of A.
Instance variables get default values automatically when an object is created.
For type int, the default value is 0.
new A() creates an object of A with x = 0, so new A().x is 0.

************************* Final Variable *****************************

10. What does final mean for a primitive variable?

final for a primitive variable means: the variable can be assigned exactly once (after that its value cannot change).

For an instance variable (field), final means it must be set exactly once for each object and then it can’t be changed.

11. What does final mean for a reference variable (e.g., final ArrayList<Integer> list)


final for a reference variable means the reference can’t be changed (you can’t make it point to a different object), but the object itself can still change if it’s mutable.

Java
final ArrayList<Integer> list = new ArrayList<>();
list.add(1);                 // OK: modifying the same object
list = new ArrayList<>();    // ERROR: cannot reassign final reference
If you want the object’s contents to not change, that’s immutability (or use an unmodifiable wrapper), not final alone.

Allowed (because you don’t change the reference)

final ArrayList<Integer> list = new ArrayList<>();
list.add(10);        // OK
list.remove(0);      // OK
list.clear();        // OK
list.set(0, 99);     // OK (if element exists)

NOT allowed (because it changes the reference)


final ArrayList<Integer> list = new ArrayList<>();
list = new ArrayList<>(); // ERROR: cannot assign a value to final variable list
list = null;

12. When can a final variable be initialized? Mention at least: declaration time, constructor, initializer block.

A final variable can be initialized exactly once, and it can be done in these places:

a. At declaration time
final int a = 10;

b. In an instance initializer block (for instance final fields)
final int b;
{ b = 20; }

c. In a constructor (for instance final fields; must be set on every constructor path)
final int c;
A() { c = 30; }

*********************** Static vs Instance Fields *********************

13. What is the difference between instance field and static field in terms of:

    ownership (object vs class)
    memory count (per object vs shared)
    access style

1) Ownership
Instance field: owned by the object (each new object has its own field).
Static field: owned by the class itself (belongs to ClassName, not to any single object).

2) Memory count
Instance field: one copy per object
Create 5 objects → 5 separate copies.
Static field: one shared copy per class
Create 5 objects → still 1 shared copy.

3) Access style (how you should use it)
Instance field: access via an object reference
obj.x

Static field: access via the class name (best practice)
ClassName.x
(You can access it via an object, obj.x, but it’s misleading because it’s still the class’s single shared field.)

14. class C { static int s; int i; }
If you create 3 objects, how many s and how many i exist?

For class C { static int s; int i; }:

s (static): 1 copy total (shared by the class, no matter how many objects)
i (instance): 3 copies (one per object)
So with 3 objects: 1 s and 3 i exist.

***************** Shadowing and naming conflicts ***************

15. What is shadowing? Give an example where a local variable shadows an instance field.

Shadowing means: a variable declared in an inner scope has the same name as a variable in an outer scope, so the inner one hides the outer one in that region.

class A {
  int x = 10;        // instance field

  void f() {
    int x = 20;      // local variable shadows the field x
    System.out.println(x);      // 20 (local)
    System.out.println(this.x); // 10 (field)
  }
}

16. In a constructor, why do we use this.x = x;? What exactly is happening on both sides?

 We use `this.x = x;` because the
We use this.x = x; because the parameter x shadows the instance field x inside the constructor.

What’s happening on each side
Left side: this.x = the instance field x that belongs to the current object being constructed (this).
Right side: x = the constructor parameter/local variable x.
So the statement means:

“Put the parameter value x into this object’s field x.”

17. Can a local variable shadow a static field? What about a parameter shadowing a field?

1) Can a local variable shadow a static field?
Yes. A local variable can have the same name as a static field, and inside that block the local name is used.

2) Can a parameter shadow a field?
Yes. A method/constructor parameter can shadow an instance field (or static field) with the same name.

Revision line: local/parameter can shadow fields (instance or static); use this.field or ClassName.field to access the hidden field.


*********************  Pass-by-value and variables *********************

18. Java is pass-by-value. What exactly is copied when passing:

    a primitive variable?
    an object reference variable?

Java is **pass-by-value**: the **value stored in
Java is pass-by-value: the value stored in the variable is copied into the parameter.

1) Passing a primitive variable
The primitive value itself is copied (e.g., int number, double, char, boolean).
Changes to the parameter do not affect the caller’s variable.

static void f(int a) { a = 99; }

int x = 10;
f(x);          // copies 10 into a
// x is still 10

2) Passing an object reference variable
The reference value is copied (the “address/handle” pointing to the object).
Caller and parameter now refer to the same object, so mutating the object is visible.
But reassigning the parameter does not change the caller’s reference.


static void g(ArrayList<Integer> p) {
  p.add(1);                 // affects caller's object (same object)
  p = new ArrayList<>();    // only changes p (the copied reference)
}

ArrayList<Integer> list = new ArrayList<>();
g(list);
// list contains [1]

************************* Type Inference *****************************

19. What is var in Java? Is it a keyword? What does the compiler do?

var lets you declare a local variable where the type is inferred from the initializer.

var n = 10;          // inferred as int
var list = new ArrayList<String>(); // inferred as ArrayList<String>

Not a “real” reserved keyword like int or class. It’s a reserved type name (you generally can’t use var as a type name for local declarations, but it’s not reserved everywhere).

What does the compiler do?
At compile time, the compiler infers the exact static type from the right-hand side and rewrites it as that type.
There is no runtime “dynamic typing”—after compilation it behaves like you wrote the explicit type.

20. Where is var allowed and where is it not allowed? (local only? fields? parameters?)

var is allowed
Local variables with an initializer (inside methods/constructors/blocks)
Enhanced for-loop variable
Lambda parameters only if all parameters use var (and you may want annotations)

var is NOT allowed
Fields (instance or static)
Method/constructor parameters (normal parameter lists)
Return types
Local var without initializer
Multiple declarations in one statement

