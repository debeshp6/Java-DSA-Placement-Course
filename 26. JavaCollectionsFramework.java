/*

the java platform includes a collections framework. a collection is an object that represents a group of objects.
a collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated
independently of implementation details. the primary advantages of a collections framework are that it:

  >> reduces programming effort by providing data structures and algorithms so you don't have to write them yourself.
  >> increases performance by providing high-performance implementations of data structures and algorithms.
  because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.
  >> provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth.

  ETC!
  
actually it's 5 a.m. and i am still going strong - no breaks, just the grind :)

BUT,
if you want, you can go through this whole documentation --> https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html

collection of classes & interfaces:

                           iterable
                              ↑
                          collection
                              ↑
         ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
         │                    │                         │ 
         │                    │                         │
        list                queue                      set




methods on collections:

  1. add
  2. size
  3. remove
  4. iterate
  5. addAll
  6. removeAll
  7. clear


i) list interface:

  1. ArrayList
  2. LinkedList
  3. Vector --> Stack


 ii) queue interface (FIFO):

   1. PriorityQueue
   2. LinkedList
   3. Deque (double ended queue) --> ArrayDeque


iii) set interface:

  1. HashSet
  2. LinkedHashSet
  3. SortedSet --> TreeSet


iv) map interface:

  1. HashMap
  2. LinkedHashMap
  3. SortedMap --> TreeMap
  4. Hashtable

*/
