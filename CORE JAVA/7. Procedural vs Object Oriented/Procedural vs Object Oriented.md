
************************** (A) Core definitions *************************


1. What is procedural programming in your own words? What is the “unit of organization” in procedural code? 


     Imagine you're in a kitchen following a recipe. You write step-by-step instructions (functions/procedures) like "boil water", "add spices", "cook" — each step manipulates data (ingredients). This programming style structures the program as a list of functions, and data is handled through global variables or function calls. No classes/objects — just functions and data flow.

Unit of organization in procedural code:
The main unit is the function/procedure. Each function performs a specific task, and the program is organized as a sequence of functions. Data is passed to functions, but functions control everything.

Example analogy: Each "step" in your recipe is a function — it's the building block of the program


2. What is object-oriented programming (OOP) in your own words? What is the “unit of organization” in OOP?

Object-oriented programming (OOP) in my own words:
OOP is like building a house where everything is modeled as real-world "things" (objects) that have their own properties (data) and actions (methods). Instead of just writing a list of steps (like in procedural programming), you create blueprints (classes) for these things, and then make instances (objects) that interact with each other. For example, a "Car" class might have properties like color and speed, and methods like "drive" or "brake." It focuses on encapsulation (hiding data), inheritance (reusing blueprints), and polymorphism (flexible actions).

Unit of organization in OOP:
The main unit is the class. A class is like a blueprint or template that defines what an object can do and what data it holds. From classes, you create objects, and the whole program is organized around these classes and their relationships. Everything revolves around classes— they're the building blocks that group related data and behavior together.

Example analogy: In a kitchen, a class is like the "Recipe" blueprint, and objects are specific recipes (like "Pizza Recipe") that you instantiate and use.


3. In both styles, where does state (data) live and where does behavior (logic) live?

Procedural Programming (e.g., like C):

    State (Data): Lives in global variables or variables passed between functions. Data is often shared across the program and can be accessed/modified by any function.
    Behavior (Logic): Lives in standalone functions/procedures. Functions are separate from data—they take inputs, process them, and return outputs. The focus is on the sequence of function calls.

Example: In the food delivery app, totalAmount is a global variable (state), and placeOrder() is a function (behavior) that manipulates it.
Object-Oriented Programming (OOP) (e.g., like Java):

    State (Data): Lives inside objects (instances of classes). Each object has its own data (fields/properties), encapsulated within the class. Data is private and controlled.
    Behavior (Logic): Lives in methods within classes. Methods are tied to the class/object—they operate on the object's data. Objects bundle data and behavior together.


4. What is meant by: “procedural = functions act on data” vs “OOP = objects own data + behavior”? 

Procedural: Functions are separate and "act on" data (e.g., a function like add(5, 3) manipulates external numbers—data is passive and global).

OOP: Objects "own" both data and behavior (e.g., a Calculator object has its own data like result and methods like add()—everything is bundled and self-contained).

In procedural, data is acted upon; in OOP, objects do the acting. OOP promotes encapsulation: data + logic together for better organization.



************************* Data modeling & design thinking *************************





5. When you see a problem statement, how do you decide the key entities for OOP (classes/objects)?

When analyzing a problem statement for OOP, focus on identifying nouns (people, things, or concepts) that represent real-world entities. Here's a step-by-step way to decide key entities (classes/objects):
Steps:

    Read and Highlight Nouns: Scan the problem for nouns like "user," "order," "car," or "account." These are potential classes.

    Check for Data + Behavior: Ask if the noun has:
        Attributes (state/data): e.g., a "User" might have name, age.
        Actions (behavior/methods): e.g., a "User" might login() or updateProfile().

    Filter and Group: Eliminate irrelevant nouns (e.g., "system" or "process" might not need a class). Group related ones (e.g., "Pizza" and "Burger" could be under a "FoodItem" class).

    Look for Relationships:
        Has-a: Composition (e.g., Order has Items).
        Is-a: Inheritance (e.g., Dog is-a Animal).

    Avoid Over-Designing: Start with core entities. Don't make classes for everything—utility functions can be static methods.
