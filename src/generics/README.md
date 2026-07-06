# Why Generics Exist in Java

## Introduction

Generics were introduced in Java 5 to provide **type safety**, improve **code reusability**, and eliminate unnecessary **type casting**.

Before Generics existed, Java collections stored objects as `Object`, which often caused runtime errors and made code harder to maintain.

---

## The Problem Before Generics

Consider the following example:

```java
List list = new ArrayList();

list.add("Virak");
list.add(100);

String name = (String) list.get(0);
```

The code compiles successfully because a raw `List` can store any object.

However, the following code also compiles:

```java
String value = (String) list.get(1);
```

At runtime, Java tries to cast `100` (an `Integer`) to a `String`.

Result:

```text
java.lang.ClassCastException
```

The compiler cannot detect this mistake because it only knows that the list contains `Object`.

This means type-related errors are discovered only when the application is running.

---

## How Generics Solve the Problem

With Generics:

```java
List<String> names = new ArrayList<>();

names.add("Virak");
```

Now the compiler knows that the list should contain only `String` objects.

If someone tries to add another type:

```java
names.add(100);
```

Compilation fails:

```text
Required type: String
Provided: int
```

The error is caught before the application is executed.

---

## Benefits of Generics

### 1. Type Safety

Generics allow the compiler to verify that only the correct type is used.

```java
List<String> names = new ArrayList<>();

names.add("Virak"); // Valid
names.add(123);     // Compilation Error
```

This prevents many runtime errors.

---

### 2. No Explicit Casting

Without Generics:

```java
List list = new ArrayList();

list.add("Virak");

String name = (String) list.get(0);
```

With Generics:

```java
List<String> list = new ArrayList<>();

list.add("Virak");

String name = list.get(0);
```

The compiler automatically knows the returned type.

---

### 3. Better Readability

When another developer sees:

```java
List<User> users
```

it is immediately clear what the collection contains.

Without Generics:

```java
List users
```

The actual type is unknown until the code is inspected more closely.

---

### 4. Reusable Code

Generics allow one class or method to work with many different types.

Example:

```java
public class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

Usage:

```java
Box<String> stringBox = new Box<>();
Box<Integer> integerBox = new Box<>();
Box<User> userBox = new Box<>();
```

One implementation works for multiple types.

---

## Real-World Examples

Generics are used throughout the Java ecosystem.

### Collections

```java
List<String>
Set<User>
Map<String, Integer>
```

### Optional

```java
Optional<User>
```

### Spring Framework

```java
ResponseEntity<User>

JpaRepository<User, Long>

Page<User>
```

### API Responses

```java
ApiResponse<User>

ApiResponse<List<User>>
```

---

## Key Goal of Generics

Generics exist to move type checking from runtime to compile time.

Without Generics:

```text
Compile Successfully
        ↓
Application Runs
        ↓
ClassCastException
```

With Generics:

```text
Compilation Error
        ↓
Fix Immediately
        ↓
Application Runs Safely
```

---

## Summary

Generics were introduced to solve problems caused by storing everything as `Object`.

They provide:

* Type Safety
* Compile-Time Error Detection
* Elimination of Explicit Casting
* Better Readability
* Code Reusability

In simple terms:

> Generics allow Java to know the exact type of data you are working with, making code safer, cleaner, and easier to maintain.
