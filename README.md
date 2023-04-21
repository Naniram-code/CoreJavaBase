#Day one 
Software
Software refers to the set of instructions or programs that are designed to perform specific tasks or functions on a computer system. It is a collection of digital data that tells the computer how to perform certain operations, such as executing a program, manipulating data, or controlling hardware devices.

Software can be divided into two main categories: system software and application software. System software is responsible for managing and controlling the computer hardware, while application software is designed to perform specific tasks or functions for the user, such as word processing, spreadsheet creation, or video editing.

Software is an essential component of modern computing and is used in a wide range of industries and applications, from business and education to entertainment and scientific research.


Static Keyword
Was introduced for better memory management.
Static can be applied to
* block
* variables
* Methods
* Classes
When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object

Static Block
static block that gets executed exactly once, when the class is first loaded.

Static variables
When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level

Static methods
They can only directly call other static methods. They can only directly access static data. They cannot refer to this or super in any way.
When to use static variables and methods?

Use the static variable for the property that is common to all objects

Static Classes

A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static
