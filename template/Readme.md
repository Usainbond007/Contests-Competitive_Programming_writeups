
# Java Competitive Programming Template

A comprehensive **Java template for competitive programming** designed for speed, efficiency, and convenience during contests.
This template includes fast I/O, commonly used data structures, and helper utilities frequently required in programming contests.

It is useful for platforms like:

* Codeforces
* LeetCode
* CodeChef
* AtCoder
* ICPC style contests

---

## Features

This template includes several components commonly required in competitive programming:

### Fast Input / Output

Custom byte-based input reader for faster parsing compared to `Scanner`.

Supported methods:

* `ni()` → read integer
* `nl()` → read long
* `ns()` → read string
* `na(n)` → read integer array

Output is handled using `PrintWriter`.

---

### Pair Class

A utility class for storing pairs of values with built-in:

* comparison
* hashing
* equality checks

Useful in:

* sorting
* priority queues
* maps and sets

---

### Graph Builders

Efficient adjacency list graph constructors without using `ArrayList`.

Functions:

```
ng(n, e, from, to, undirected)
```

Used for building graphs for:

* BFS
* DFS
* tree problems
* graph traversal

---

### DSU (Disjoint Set Union)

Union-Find data structure with path compression and union by size.

Commonly used in:

* connectivity problems
* minimum spanning tree
* dynamic components

---

### Fenwick Tree (Binary Indexed Tree)

Supports:

* prefix sum queries
* point updates
* range queries

Useful for problems involving:

* inversion count
* prefix sums
* frequency queries

---

### Segment Tree

Supports:

* range queries
* point updates

Useful for problems involving:

* range sums
* minimum / maximum queries
* interval problems

---

### Sieve of Eratosthenes

Efficient prime number generation.

Useful for problems involving:

* primes
* factorization
* number theory

---

### Mathematical Utilities

Included helper methods:

```
gcd(a, b)
pow(a, b)
```

Used in modular arithmetic and number theory problems.

---

### Shuffle Function

Prevents Java `Arrays.sort()` from worst-case behavior.

Usage:

```
shuffle(arr);
Arrays.sort(arr);
```

This technique avoids adversarial test cases.

---

### Grid Direction Arrays

Predefined direction arrays for grid traversal:

```
dx, dy        // 4 directions
ddx, ddy      // 8 directions
```

Used in:

* BFS
* DFS
* grid problems

---

## Project Structure

```
Main.java
│
├── solve()                // Write contest logic here
├── Fast Input Methods
├── Pair Class
├── Graph Builders
├── DSU
├── Fenwick Tree
├── Segment Tree
├── Sieve
└── Utility Functions
```

All problem-specific logic should be written inside the `solve()` method.

---

## Example Usage

```java
void solve() throws Exception {

    int n = ni();
    int[] arr = na(n);

    shuffle(arr);
    Arrays.sort(arr);

    out.println(arr[n-1]);
}
```

---

