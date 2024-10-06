/*

Operators: Symbols that tell compiler to perform some operation.

Arithmetic Operators:                 

        Binary          Unary               
        +                ++ -> increment
        -                -- -> decrement
        *
        /
        % -> modulo

Suppose, A = 10, B = 5

------ Binary ------ 
A + B = 10 + 5 = 15
A - B = 10 - 5 = 5
A * B = 10 * 5 = 50
A / B = 10 / 5 = 2
A % B = 10 % 5 = 0 -> it's the reminder

------ Unary ------
a = a + 1 = a++
a = a - 1 = a--


*/


// Post Increment
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // 1. use value
        // 2. change value
        int a = 10;
        int b = 0;
        b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}


// Pre Increment
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // 1. change value
        // 2. use value
        int a = 10;
        int b = 0;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}


// Post Decrement
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // 1. use value
        // 2. change value
        int a = 10;
        int b = 0;
        b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}


// Pre Decrement
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // 1. change value
        // 2. use value
        int a = 10;
        int b = 0;
        b = --a;
        System.out.println(a);
        System.out.println(b);
    }
}



/*

Relational Operators
        ==
        !=
        >
        <
        >=
        <=

Suppose, A = 10, B = 5

A == B -> 10 == 5 -> False
A != B -> 10 != 5 -> True
A > B -> 10 > 5 -> True
A < B -> 10 < 5 -> False
A >= B -> 10 >= 5
A <= B -> 10 <= 5

-------------------------------------------------------------------------------

Logical Operators:
&& (logical AND)
|| (logical OR)
! (logical NOT)

Suppose, a = 10, b = 20, c = 30

if(a < b && b < c) --> true [AND operator]
if(a < b || c < a) --> false [OR operator]
if(! (a < b)) --> false (reverse of the result) [NOT operator]

-------------------------------------------------------------------------------

Bitwise Operators:
& (binary AND)
| (binary OR)
^ (binary XOR)
~ (binary One's Complement)
<< (binary Left Shift)
>> (binary Right Shift)

Suppose, A = 0101
         A << 1 [left shift by 1]
         A = 1010
         A >> 1 [right shift by 1]
         A = 0010

-------------------------------------------------------------------------------

Assignment Operators:
=
+=
-=
*=
/=

Suppose, A = 10, B = 5

A = B -> A = 5
A += B -> A = A + B
A -= B -> A = A - B
A *= B -> A = A * B
A /= B -> A = A / B

*/
