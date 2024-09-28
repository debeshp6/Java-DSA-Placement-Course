/*

<---------------------------------------- TIME COMPLEXITY ---------------------------------------->

Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input.
In other words we can say that, Time Complexity is the relation between Input Size & Running Time (Operations).

////////////// EXAMPLE //////////////

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=0; i<n; i++) { -----> n times running
    System.out.print("hello");
  }
}

We can say that if the input is n, the number of operation/running time will be n too.
Time complexity is nothing but the number of operations we are doing in the code. Time complexity is proportional to input n here.
So, it's a Linear Relation.

/////////////////////////////////////

Time Complexity [Cases]:

Numbers: [1, 2, 3, 4, 5]
search for '1'

  1) Best Case (takes minimum time to run the code):
      1 2 3 4 5
      '1' is found in the first position, we don't have to search anymore. It took only one operation/one unit of time.
      This is called Best Case Scenario.
      
  2) Average Case (takes average time to run the code):
      2 1 3 4 5 
      2 3 4 1 5
      (1 + 2 + ..... n) / n
      => n(n+1) / 2n = (n+1) / 2
      
  3) Worst Case (takes a long time to run the code)
      5 4 3 2 1
      n = 5
      so, it becomes like 10^5.


(i) Best Case Representation --> Ω(1)
(ii) Average Case Representation --> θ((n+1)/2)
(iii) Worst Case Representation --> O(n)


<<<<<<<<<< WE WILL STUDY ABOUT WORST CASE SCENARIO ONLY HERE >>>>>>>>>>

////////////// EXAMPLE //////////////

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=0; i<n; i++) {
    for(int j=0; j<n; j++) {
      System.out.println("hello");
    }
  }
}

n = 5 (in the first loop)
i = 0 ----> j = 0, 1, 2, 3, 4.... n (second/nested loop)
i = 1 ----> j = 0, 1, 2, 3, 4.... n
i = 2 ----> j = 0, 1, 2, 3, 4.... n
i = 3 ----> j = 0, 1, 2, 3, 4.... n
i = 4 ----> j = 0, 1, 2, 3, 4.... n

Total time taken or you can say Total Operations here = [n x n].
So, the worst time complexity of this code will be O(n^2).

----------------------------------------------------------------------------------

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  for(int i=0; i<n; i++) {
    for(int j=0; j<m; j++) {
      System.out.println("hello");
    }
  }
}

i = 0 ----> j = 0, 1, 2.... m (second/nested loop)
i = 1 ----> j = 0, 1, 2.... m
i = n ----> j = 0.......... m

Outer loop is running n times and Inner loop is running m times.
Total time taken or you can say Total Operations here = [n x m].
So, the worst time complexity of this code will be O(n x m).

----------------------------------------------------------------------------------

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();

  for(int i=0; i<n; i++) {  
    System.out.println("hello");
  }
  for(int j=0; j<m; j++) {
    System.out.println("hello");
  }
}

In this code there are two different for loops. First one starts from i = 0 to n, and the Second one starts from j = 0 to m.
First loop's number of operations = n
Second loop's number of operations = m

Total time taken or you can say Total Operations here = [n + m].
So, the worst time complexity of this code will be O(n + m).
If (n >>>>> m), then it becomes O(n). #SpecialCase

----------------------------------------------------------------------------------

Compare:    O(n)    O(n^2)    O(n^3)
n = 1        1         1        1
n = 2        2         4        8
n = 3        3         9        27

Best Time Complexity is -------> O(n)




<---------------------------------------- SPACE COMPLEXITY ---------------------------------------->

Space complexity is a measure of the amount of memory an algorithm uses, expressed in terms of the size of the input. It refers to the total space required to execute the algorithm and solve a problem, including both the space needed for the input data and the auxiliary space used by the algorithm.
Auxiliary space, also known as extra space or temporary space, is a part of the total space complexity.

*/
