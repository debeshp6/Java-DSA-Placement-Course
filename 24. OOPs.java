/*

nowadays, modern programming languages are basically based on OOPs concept.

sooooo, let's start with Classes and Objects!

classes and objects were introduced in programming so that we can solve real world problems through coding/programming.

let's take an example of maruti-800 brand :)
before manufacturing the cars, they had to make a blueprint. after making the blueprint they started manufacturing the cars.

so, here we can say that: Objects are those cars, and Class is the blueprint.

object-oriented programming is a methodology or paradigm to design a program using classes and objects.
it simplifies the software development and maintenance by providing some concepts defined below:

class is a user-defined data type which defines its properties and its functions. class is the only logical representation of the data.
for example, human being is a class. the body parts of a human being are its properties, and the actions performed by the body parts are known as functions.
the class does not occupy any memory space till the time an object is instantiated. 

object is a run-time entity. it is an instance of the class. an object can represent a person, place or any other item.
an object can operate on both data members and member functions. 

*/




class Pen {
    String color;
    String type; //ballpoint, gel
    //functions which are defined inside the class, are called methods.
    public void write() { //method 
        System.out.println("writing something");
    }
    
    public void printColor() {
        //‘this’ is a keyword used to represent the method belonging to that particular current object.
        System.out.println(this.color); //this - used to access
    }
}

// main function
public class OOPS { //main function should be in public class
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //object 
        //each object has its own properties
        pen1.color = "blue";
        pen1.type = "gel";
        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();
       
    }
}





//when an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.

/*

constructor is a special method which is invoked automatically at the time of object creation.
it is used to initialize the data members of new objects generally. 

    >> constructors have the same name as class or structure.
    >> constructors don’t have a return type. (not even void)
    >> constructors are only called once, at object creation.

there can be three types of constructors in Java. 

    1. non-parameterized constructor: a constructor which has no argument is known as non-parameterized constructor(or no-argument constructor).
    it is invoked at the time of creating an object. if we don’t create one then it is created by default by Java.

    2. parameterized constructor: constructor which has parameters is called a parameterized constructor.
    it is used to provide different values to distinct objects.
    
    3. copy constructor:  copy constructor is an overloaded constructor used to declare and initialize an object from another 
    object. there is only a user defined copy constructor in java (c++ has a default one too).

>> constructor is a special type of function.
>> in java constructor's job is to create java objects.
>> in java program, the constructor name and class name should be same.
>> constructor's don't return anything. there is no return type. not even voids.
>> constructor's can be called only once in the class (not like other functions, we can call them again and again).

*/

class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

//main function
public class OOPS { //main function should be in public class
    public static void main(String[] args) {
       Student s1 = new Student(); //now this 'Student()' is also a special type function called -> Constructor
       s1.name = "aisha";
       s1.age = 26;
       s1.printInfo();
    }
}




//non-parameterized constructor
class Student {
  String name;
  int age;

public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
}

  Student() {
    System.out.println("constructor called");
  }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aisha";
        s1.age = 26;

        s1.printInfo();
    }
}






//parameterized constructor
class Student {
  String name;
  int age;

public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class OOPS {
    public static void main(String[] args) {
       Student s1 = new Student("aisha", 26);
       s1.printInfo();
    }
}






//copy constructor
class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
     Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
    }
    
    Student() {
        
    }
}

//main function
public class OOPS {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "aisha";
       s1.age = 26;
       
       Student s2 = new Student(s1);
       s2.printInfo();
    }
}



// unlike languages like c++, java has no Destructor. instead, java has an efficient garbage collector that deallocates memory automatically.



/*

Polymorphism:

polymorphism is the ability to present the same interface for differing underlying forms (data types).
with polymorphism, each of these classes will have different underlying data. precisely, poly means ‘many’ and morphism means ‘forms’. 

types -> 1. compile time polymorphism (static) <or you can say function overloading>
         2. runtime polymorphism (dynamic) [will discuss it in inheritance module]

let’s understand them one by one :)

*/



/*

>> compile time polymorphism -> the polymorphism which is implemented at the compile time is known as compile-time polymorphism.
example - Method Overloading.

    - method overloading: method overloading is a technique which allows you to have more than one function with the same function name
    but with different functionality. method overloading can be possible on the following basis:
    
    1) the type of the parameters passed to the function. 
    2) the number of parameters passed to the function.

*/

//polymorphism or function overloading
//compile time polymorphism
class Student {
    String name;
    int age;
    
    public void printInfo(String name) {
        System.out.println(name);
    }
    
    public void printInfo(int age) {
        System.out.println(age);
    }
    
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

//main function
public class OOPS {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "aisha";
       s1.age = 26;
       s1.printInfo(s1.name, s1.age);
    }
}

/*

>> runtime polymorphism -> runtime polymorphism is also known as dynamic polymorphism. function overriding is an example of runtime polymorphism.
function overriding means when the child class contains the method which is already present in the parent class. hence, the child class overrides the method of the parent class.
in case of function overriding, parent and child classes both contain the same function with a different definition. the call to
the function is determined at runtime is known as runtime polymorphism.

*/


/*

inheritance -> inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
in such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. in Java, the class which inherits the members of
another class is called derived class and the class whose members are inherited is called base class. the derived class is the specialized class for the base class. 

*/

class Shape {
    //base class or parent class
    String color;
}

class Triangle extends Shape { //Triangle class took the properties and methods too from Shape class
    //sub class or child class
}

public class OOPS {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}


/* let's see how many types of inheritance are there! */


/* 1. Single inheritance : when one class inherits another class, it is known as single level inheritance. */

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }
}





/* 2. hierarchial inheritance: hierarchical inheritance is defined as the process of deriving more than one class from a base class. */

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }
}

class Circle extends Shape {
     public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}





/* 3. multilevel inheritance: it is a process of deriving a class from another derived class. */

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }
}

class EquilateralTriangle extends Triangle {
     public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }
}





/* 4. hybrid inheritance: it is a combination of simple, multiple inheritance and hierarchial inheritance. */



/* package: package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.
built-in packages - java, util, io etc.

    import java.util.Scanner;
    import java.io.IOException;

access modifiers in java :

    >> private: the access level of a private modifier is only within the class. it cannot be accessed from outside the class.
    >> default: the access level of a default modifier is only within the package. it cannot be accessed from outside the package.
    if you do not specify any access level, it will be the default.
    >> protected: the access level of a protected modifier is within the package and outside the package through child class.
    if you do not make the child class, it cannot be accessed from outside the package.
    >> public: the access level of a public modifier is everywhere. it can be accessed from within the class, outside the class,
    within the package and outside the package.

*/

package bank;

class Account {
    public String name;
    protected String email;
    private String password;
    
    //getters
    public String getPassword() {
        return this.password;
    }
    //setter
    public void String setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "my bank";
        account1.email = "aisha90gmail.com";
        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }
}







/* encapsulation: encapsulation is the process of combining data and functions into a single unit called class. in encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class.
in simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. thus, encapsulation makes the concept of data hiding possible.
(data hiding ->  a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in java). 

data hiding is the process of protecting members of class from unintended changes whereas, abstraction is hiding the implementation details and showing only important/useful parts to the user. */




/* abstraction: we try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details. With definition of properties of problems, including the data which are affected
and the operations which are identified, the model abstracted from problems can be a standard solution to this type of problems. it is an efficient way since there are nebulous real-life problems that have similar properties.

in simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.

data binding: data binding is a process of binding the application UI and business logic. any change made in the business logic will reflect directly to the application UI.

abstraction is achieved in 2 ways:
    - abstract class
    - interfaces (pure abstraction)

1. abstract class:
- an abstract class must be declared with an abstract keyword.
- it can have abstract and non-abstract methods.
- it cannot be instantiated.
- it can have constructors and static methods also.
- it can have final methods which will force the subclass not to change the body of the method.

*/

abstract class Animal {
    abstract void walk();
    public void eat() {
        System.out.println("animal eats.");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs.");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}





/* 2. interfaces:
- all the fields in interfaces are public, static and final by default.
- all methods are public & abstract by default.
- a class that implements an interface must implement all the methods declared in the interface.
- interfaces support the functionality of multiple inheritance. */

interface Animal {
    public void walk(); //interface cannot have any constructor. there should not be any non-abstruct function.
}

interface Herbivore {
    
}

class Horse implements Animal, Herbivore {
    public void walk() { //here must be public 
        System.out.println("walks on 4 legs.");
    }
}

public class OOPS {
    public static void main(String[] args) {
        
    }
}





/*

----------- << static keyword >> -----------

static can be:

    - variable (also known as class variable)
    - method (also known as class method)
    - block
    - nested class

*/

class Student {
    String name;
    static String school;
    
    public static void changeSchool() {
        school = "newSchool";
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student.school = "SNVP";
        Student student1 = new Student();
        student1.name = "aisha";
        System.out.println(student1.school);
    }
}





/* <------------ YO DOIN GOOD JOB BRODA... ALL THE BEST! ------------> */
