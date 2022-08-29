# OOPs
Brief notes on OOPs Concept and it's code snippet (Java)

💨Class
•	A class is a template for an object, and an object is an instance of a class.
•	A class creates a new data type that can be used to create objects.

When you declare an object of a class, you are creating an instance of that class.
Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)

💨Object
Objects are characterized by three essential properties:
•	State
•	Identity
•	behavior.
The state of an object is a value from its data type. The identity of an object distinguishes one object from another.
It is useful to think of an object’s identity as the place where its value is stored in memory.
The behavior of an object is the effect of data-type operations.

•	The dot operator links the name of the object with the name of an Instance Variable (All the Variables inside the object).
Example= sout(student1.rollno)
•	Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.
•	The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it.
•	This reference is, more or less, the address in memory of the object allocated by new.
•	This reference is then stored in the variable.
•	Thus, in Java, all class objects must be dynamically allocated.
