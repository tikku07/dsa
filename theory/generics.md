# Creating Generic Data Types in Java

## 📌 Overview

Generics in Java allow classes, interfaces, and methods to operate on different data types while providing **type safety and code reusability**.

Instead of creating separate classes for different data types, we can create a single generic class that works with multiple types.

Generics are commonly used in collections, stacks, queues, linked lists, and other data structures.

## 💡 Core Concept

A generic class uses a type parameter to represent the data type that will be specified when an object is created.

The general syntax is:

```java
class ClassName<T> {
    T value;
}
```

Here:
- `T` is a type parameter that represents a data type.
- The actual type is specified when creating an object.
- Generics provide compile-time type checking and reduce the need for explicit type casting.

For example:

```java
Box<Integer> b1 = new Box<>();
Box<String> b2 = new Box<>();
```

In this example, the same `Box` class can store different types of values.

## 🛠️ Example: Creating a Generic Pair Class

A Min Stack can store each element along with its current minimum using a pair. We can make the `Pair` class generic so that it can hold different data types.

### Java Implementation

```java
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
```

Here:
- `T` represents the data type of the first value.
- `U` represents the data type of the second value.
- The constructor initializes both fields using the supplied values.

### Creating Objects

```java
Pair<Integer, Integer> p1 = new Pair<>(10, 5);
Pair<String, Integer> p2 = new Pair<>("Age", 20);

System.out.println(p1.first);
System.out.println(p1.second);

System.out.println(p2.first);
System.out.println(p2.second);
```

**Output:**

```text
10
5
Age
20
```

The same generic class can store different combinations of data types.

## 📚 Applying Generics to Min Stack

In the Min Stack example, each entry stores:
- The actual integer value.
- The minimum integer value up to that point.

A generic pair can be used to represent these two values.

```java
import java.util.Stack;

class MinStack {
    private Stack<Pair<Integer, Integer>> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair<>(val, val));
        } else {
            int currentMin = Math.min(val, st.peek().second);
            st.push(new Pair<>(val, currentMin));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        return st.peek().first;
    }

    public int getMin() {
        return st.peek().second;
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
```

In this implementation, `Pair<Integer, Integer>` specifies that both fields store integer values. The `Pair` class itself, however, can be reused with other data types.

## 🔍 Advantages of Generics

1. **Code Reusability:** The same class can work with different data types.
2. **Type Safety:** Invalid types can be detected at compile time.
3. **Reduced Type Casting:** Values can be accessed without manually converting their types.
4. **Maintainability:** A single generic implementation can replace multiple type-specific classes.

## ⚠️ Important Points

- Type parameters such as `T`, `E`, `K`, `V`, and `U` are conventional names.
- Primitive types such as `int`, `double`, and `char` cannot be used directly as generic type arguments. Use wrapper classes such as `Integer`, `Double`, and `Character`.
- The diamond operator (`<>`) allows Java to infer generic type arguments from the declaration.
- A generic class can have multiple type parameters, such as `Pair<T, U>`.

## ⏱️ Complexity Analysis

Generics do not inherently change the time or space complexity of an algorithm. The complexity depends on the underlying operations and data structure.

For the Min Stack example:
- **Time Complexity:** O(1) for `push()`, `pop()`, `top()`, and `getMin()`.
- **Space Complexity:** O(N) for storing N stack entries.

## 🚀 Key Takeaway

**Generics allow us to create reusable, type-safe classes that work with different data types.** By defining type parameters, we can build flexible components such as generic pairs and collections without duplicating code.
