# Aufgabe 1 (Datenstrukturen):
## 1a. SLL
Geben Sie eine Implementierung des DatentypsList (einfach verkettet) für ganzzahlige Werte mit den folgenden Operationen an:
```java
- void add(int value) (fügt den übergebenen Wert in die Liste ein)
- void remove(int value) (löscht den übergebenen Wert einmal aus der Liste, falls er bereits enthalten ist)
- boolean contains(int value) (gibt an, ob der übergebene Wert in der Liste enthalten ist)
- boolean isEmpty() (gibt an, ob die Liste leer ist)
- int[] toArray() (gibt die Liste als Array zurück)
```
### English
Specify an implementation of the List data type (single-concatenated) for integer values ​​with the following operations:
```java
- void add(int value) (adds the passed value to the list)
- void remove(int value) (removes the passed value from the list once if it is already contained)
- boolean contains(int value) (indicates whether the passed value is contained in the list)
- boolean isEmpty() (indicates whether the list is empty)
- int[] toArray() (returns the list as an array)
```
The typical convention is:
- if the wording is List and not Stack, "add to end" is the expected behavior.
- add(int value) adds the new node at the end of the list (so your list keeps the order of insertion).
- This means you’ll usually keep a head pointer (start of the list) and walk to the end each time you add — or you keep a tail pointer for efficient appending.

## 1b. doppelt verkettete Liste

Geben Sie eine Implementierung des Datentyps List (doppelt verkettet) für ganzzahlige Werte mit den folgenden Operationen an:
```java
- void add(int value) (fügt den übergebenen Wert in die Liste ein)
- void remove(int value) (löscht den übergebenen Wert einmal aus der Liste, falls er bereits enthalten ist)
- boolean contains(int value) (gibt an, ob der übergebene Wert in der Liste enthalten ist)
- boolean isEmpty() (gibt an, ob die Liste leer ist)
```
### english

  Specify an implementation of the List (doubly concatenated - doubly linked list (DLL)) data type for integer values with the following operations:
```java
    - void add(int value) (adds the passed value to the list)
    - void remove(int value) (removes the passed value from the list once if it is already contained)
    - boolean contains(int value) (indicates whether the passed value is contained in the list)
    - boolean isEmpty() (indicates whether the list is empty)
```
## 1c. Stack

Geben Sie eine Implementierung des Datentyps Stack für ganzzahlige Werte mit den folgenden Operationen an:
```java
- `void push(int value)` (fügt den übergebenen Wert oben auf dem Stack ein)
- `int pop()` (entfernt den obersten Wert im Stack und gibt diesen zurück; diese Operation darf nur auf einem nicht-leeren Stack ausgeführt werden)
- `boolean isEmpty()` (gibt an, ob der Stack leer ist)
```
### eng

  Specify an implementation of the Stack data type for integer values with the following operations:
```java
    - `void push(int value)` (inserts the passed value at the top of the stack)
    - `int pop()` (removes the top value from the stack and returns it; this operation may only be performed on a non-empty stack)
    - `boolean isEmpty()` (indicates whether the stack is empty)
```
  A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. It can be implemented using a [linked list](https://www.geeksforgeeks.org/dsa/linked-list-data-structure/), where each element of the stack is represented as a node. The head of the linked list acts as the top of the stack.


## 1d Queue

Geben Sie eine Implementierung des Datentyps Queue für ganzzahlige Werte mit den folgenden Operationen an:

- `void offer(int value)` (fügt den übergebenen Wert hinten in der Queue ein)
- `int poll()` (entfernt den vordersten Wert aus der Queue und gibt diesen zurück; diese Operation darf nur auf einer nicht-leeren Queue ausgeführt werden)
- `boolean isEmpty()` (gibt an, ob die Queue leer ist)
### english

  Specify an implementation of the Queue data type for integer values with the following operations:

    - void offer(int value) (inserts the passed value to the back of the queue)
    - int poll() (removes the frontmost value from the queue and returns it; this operation may only be performed on a non-empty queue)
    - boolean isEmpty() (indicates whether the queue is empty)

  A **Queue Data Structure** is a fundamental concept in computer science used for storing and managing data in a specific order.

    - It follows the principle of "**First in, First out**" **(FIFO)**, where the first element added to the queue is the first one to be removed.
    - It is used as a buffer in computer systems where we have speed mismatch between two devices that communicate with each other. For example, CPU and keyboard and two devices in a network
    - Queue is also used in Operating System algorithms like CPU Scheduling and Memory Management, and many standard algorithms like Breadth First Search of Graph, Level Order Traversal of a Tree.

  https://www.geeksforgeeks.org/dsa/queue-data-structure/

  > “you queue at the tail and poll at the head“
>