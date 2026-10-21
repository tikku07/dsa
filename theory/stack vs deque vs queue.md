## ☕ Java Collections Cheat Sheet: Deque vs. Stack

### 🚀 Summary of the Core Concept
An `ArrayDeque` can act as **both a Stack and a Queue** depending entirely on the method pairs you use:
* **`add()` + `poll()`** \(\rightarrow\) **FIFO (Queue)**: Elements enter at the back, leave from the front.
* **`push()` + `pop()`** \(\rightarrow\) **LIFO (Stack)**: Elements enter at the front, leave from the front.

---

### 📋 Structural Comparison

| Feature | `ArrayDeque` (Recommended) | `Stack` (Legacy / Avoid) |
| :--- | :--- | :--- |
| **Performance** | **Fast** (No synchronization overhead) | **Slow** (Unnecessary thread locking) |
| **Thread Safety**| Not thread-safe | Thread-safe (Synchronized) |
| **Design Flaw**  | Enforces pure Queue/Stack behavior | Inherits from `Vector` (allows unsafe random access like `add(index)`) |
| **Architecture** | Implements the modern `Deque` interface | Concrete class from Java 1.0 |

---

### 🛠️ Code Reference

#### 1. LIFO (Stack) Behavior
```java
Deque<String> stack = new ArrayDeque<>();

stack.push("First");
stack.push("Second");

System.out.println(stack.peek()); // "Second" (Looks at top item)
System.out.println(stack.pop());  // "Second" (Removes from the front/top)
```

#### 2. FIFO (Queue) Behavior
```java
Deque<String> queue = new ArrayDeque<>();

queue.add("First");
queue.add("Second");

System.out.println(queue.peek()); // "First" (Looks at front item)
System.out.println(queue.poll()); // "First" (Removes from the front/head)
```

#### 3. Mutable String Stack (Bonus Snippet)
Because standard Java `String` objects are immutable, use `StringBuilder` inside your collection if you need to modify the characters directly within the stack.

```java
Deque<StringBuilder> mutableStack = new ArrayDeque<>();
mutableStack.push(new StringBuilder("Hello"));

// Modify the item directly without removing it
mutableStack.peek().append(" World!"); 

System.out.println(mutableStack.peek()); // Outputs: "Hello World!"
```

---

### 🔍 Method Cheat Sheet

| Role | Operation | Throws Exception | Returns Special Value (`null`/`false`) | Location |
| :--- | :--- | :--- | :--- | :--- |
| **FIFO (Queue)** | Insert | `add(e)` | `offer(e)` | Tail (Back) |
| | Remove | `remove()` | `poll()` | Head (Front) |
| | Examine | `element()` | `peek()` | Head (Front) |
| **LIFO (Stack)** | Insert | `push(e)` | *N/A* | Head (Front) |
| | Remove | `pop()` | *N/A* | Head (Front) |
| | Examine | *N/A* | `peek()` | Head (Front) |
