# 📂 Design Min Stack (Java)

An elegant, optimal implementation of a **MinStack** data structure that supports `push`, `pop`, `top`, and retrieving the minimum element (`getMin`) all in **O(1) constant time**.

---

## 💡 The Core Concept

A regular Stack only keeps track of the insertion order. To get the minimum element in O(1) time without searching the whole stack, we must store the state of the minimum element *at the exact moment each value is pushed*. 

We achieve this by coupling the elements together using a custom **`pair` custom object**:
*   `first`: Stores the actual value pushed onto the stack.
*   `second`: Stores the running minimum of the stack up to this current node.

---

## 🛠️ Complete Source Code

```java
import java.util.Stack;

class MinStack {
    // A standard Java Stack tracking our custom nested 'pair' class
    private Stack<pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            // If the stack is empty, the current value is automatically the minimum
            st.push(new pair(val, val));
        } else {
            // Find the minimum between the new value and the current top's minimum
            int currentMin = Math.min(val, st.peek().second);
            st.push(new pair(val, currentMin));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        // st.peek() fetches the pair node; .first extracts the top element value
        return st.peek().first;
    }

    public int getMin() {
        // st.peek() fetches the pair node; .second extracts the active minimum
        return st.peek().second;
    }

    /**
     * Nested static inner class to hold values paired together.
     * Must be declared inside MinStack because top-level classes cannot be static.
     */
    private static class pair {
        int first;
        int second;

        // Constructor accepting arguments to prevent variable shadowing
        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
```

---

## ⚠️ Critical Java Gotchas Learned

When implementing this structure in Java, remember these core syntax rules to avoid compilation failures:

1. **No Outbound Static Classes:** The `static` keyword can only be applied to inner/nested classes. The `pair` class must reside *inside* the `MinStack` class braces.
2. **Variable Shadowing Fix:** In the constructor, use `this.first = first;` to explicitly assign the incoming parameter to the instance field. A blank constructor block `pair() { this.first = first; }` is invalid because there is no local parameter named `first`.
3. **The Object Chain (`st.peek().first`):** This is completely valid. `st.peek()` returns a `pair` reference, allowing you to access its inner fields directly with dot notation.

---

## 📊 Complexity Analysis

*   **Time Complexity:** 
    *   `push()`: \(\mathcal{O}(1)\)
    *   `pop()`: \(\mathcal{O}(1)\)
    *   `top()`: \(\mathcal{O}(1)\)
    *   `getMin()`: \(\mathcal{O}(1)\)
*   **Space Complexity:** \(\mathcal{O}(N)\) where N is the number of elements pushed, as each element maps to a dedicated node tracking its state.
