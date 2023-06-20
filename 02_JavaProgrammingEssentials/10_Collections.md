## Colection in Java
- Cung cấp kiên trúc lưu trữ và thao tác với Objects như Searching, Sorting, Insertion, Deletion.
- Cung cấp nhiều interface and classes
  - Interface: Set, List, Queue, Deque
  - Classes: ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet

## Interface Colection
| Function          | Description               |
| ----------------- | ------------------------- |
| .add(object)      | Add a new element         |
| .remove(object)   | Remove an element         |
| .clear()          | Remove all elements       |
| .IsEmplty()       | Whether it is empty       |
| .contains(object) | Membership checking       |
| .size()           | The number of elements    |
| .iterator()       | Return an iterator        |

## Interface List
| Function             | Description                              |
| -------------------- | ---------------------------------------- |
| .add(index, object)  | Insert Object at position index          |
| .add(object)         | Append object to the end                 |
| .remove(index)       | Remove the index-th element              |
| .remove(object)      | Remove the element object                |
| .get(index)          | Return the index-th element              |
| .set(index, object)  | Replace the index-th element with object |

## Interface Map
| Function              | Description                           |
| --------------------- | ------------------------------------- |
| .put(key, value)      | Associate value with key              |
| .get(key)             | The value associated with key         |
| .containsKey(key)     | Whether contains a mapping for key    |
| .containsValue(value) | Whether contains a mapping to value   |
| .remove(key)          | Remove the mapping for key            |
| .Clear()              | Remove all mappings                   |
| .size()               | The number of pairs                   |
| .values()             | The collection of values              |
| .SetentrySet()        | Set of ket-value pairs                |
| .isEmpty()            | Whether it is empty                   |   
| .keySet()             | Set of keys                           |

## StringBuilder classes
- non-syschronozed (chạy không theo thứ tự)

## StringBuffer classes
- syschronozed (chạy có thứ tự)

## String - StringBuilder - StringBuffer

| Criteria      | String               | StringBuilder        | StringBuffer         |
| ------------- | -------------------- | -------------------- | -------------------- |
| Storage       | String pool		       | Heap                 | Heap                 |
| Modification 	| Immutable            | Mutable              | Mutable              |
| Thread safe 	| Safe  		           | UnSafe               | Safe                 |
| Performance   | Fast                 | Very Fast            | Slow                 |

## Autoboxing
- Chuyển từ primitive data => wrapper class
- Chuyển từ int => Integer
- Chuyển từ char => Char
- Chuyển từ long => Long

## Unboxing
- Chuyển từ wrapper class => rimitive data
- Chuyển từ Integer => int
- Chuyển từ Char => char
- Chuyển từ Long => long