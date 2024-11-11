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

types -> 1. compile time polymorphism (static)
         2. runtime polymorphism (dynamic)

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



/*

>> runtime polymorphism -> runtime polymorphism is also known as dynamic polymorphism. function overriding is an example of runtime polymorphism.
function overriding means when the child class contains the method which is already present in the parent class. hence, the child class overrides the method of the parent class.
in case of function overriding, parent and child classes both contain the same function with a different definition. the call to
the function is determined at runtime is known as runtime polymorphism.

*/
