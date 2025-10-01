# Aufgabe 1 (Datenstrukturen):
Geben Sie eine Implementierung des DatentypsList (einfach verkettet) für ganzzahlige Werte mit den folgenden Operationen an:
- void add(int value) (fügt den übergebenen Wert in die Liste ein)
- void remove(int value) (löscht den übergebenen Wert einmal aus der Liste, falls er bereits enthalten ist)
- boolean contains(int value) (gibt an, ob der übergebene Wert in der Liste enthalten ist)
- boolean isEmpty() (gibt an, ob die Liste leer ist)
- int[] toArray() (gibt die Liste als Array zurück)

Specify an implementation of the List data type (single-concatenated) for integer values ​​with the following operations:

- void add(int value) (adds the passed value to the list)
- void remove(int value) (removes the passed value from the list once if it is already contained)
- boolean contains(int value) (indicates whether the passed value is contained in the list)
- boolean isEmpty() (indicates whether the list is empty)
- int[] toArray() (returns the list as an array)

The typical convention is:
- if the wording is List and not Stack, "add to end" is the expected behavior.
- add(int value) adds the new node at the end of the list (so your list keeps the order of insertion).
- This means you’ll usually keep a head pointer (start of the list) and walk to the end each time you add — or you keep a tail pointer for efficient appending.