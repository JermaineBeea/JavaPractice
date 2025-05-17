# Java Streams: forEach and Filtering Operations

This document explains the use of forEach and filtering operations with Java streams, as implemented throughout the KataSolutions class.

## Table of Contents
1. [Introduction to Streams](#introduction-to-streams)
2. [The forEach Operation](#the-foreach-operation)
3. [Filtering Operations](#filtering-operations)
4. [Common Stream Operations in KataSolutions](#common-stream-operations-in-katasolutions)
5. [Best Practices](#best-practices)
6. [Performance Considerations](#performance-considerations)

## Introduction to Streams

Java streams, introduced in Java 8, provide a modern way to process collections of objects. A stream represents a sequence of elements and supports various operations that can be chained to produce a desired result. Streams don't modify the original data structure and are processed on-demand.

Key characteristics of streams:
- **Not a data structure**: A stream is an abstraction of a sequence of elements, not a collection.
- **Functional in nature**: Operations are expressions, not statements.
- **Laziness-seeking**: Many stream operations are lazy and only executed when needed.
- **Possibly unbounded**: Streams can represent an infinite sequence.
- **Consumable**: A stream can only be traversed once.

## The forEach Operation

The `forEach` operation is a terminal operation that performs an action for each element in the stream.

### Syntax
```java
stream.forEach(element -> action);
```

### Examples from KataSolutions

1. **Basic forEach with Collection**:
   ```java
   Arrays.stream(numbers.split(" ")).forEach(n -> intList.add(Integer.parseInt(n)));
   ```
   This code from `highAndLow` parses each string in the array to an integer and adds it to a list.

2. **forEach with Character Stream**:
   ```java
   combined.chars().distinct().filter(n -> Character.isAlphabetic(n))
           .forEach(k -> result.append((char) k));
   ```
   This code from `uniqueLetters2` appends each filtered character to a StringBuilder.

### Benefits of forEach
- **Readability**: Code is more concise and expressive.
- **Functional style**: Encourages immutable operations.
- **Easier parallelization**: Can be easily adapted for parallel execution.

## Filtering Operations

Filtering operations select elements based on a predicate (condition).

### Common Filtering Methods

1. **filter(Predicate<T> predicate)**:
   Returns a stream consisting of elements that match the given predicate.

2. **distinct()**:
   Returns a stream with duplicate elements removed.

3. **limit(long maxSize)**:
   Returns a stream truncated to be no longer than the given size.

### Examples from KataSolutions

1. **Simple filter**:
   ```java
   return (int) str.toLowerCase().chars()
                  .filter(k -> "aeiou".indexOf(k) >= 0)
                  .count();
   ```
   This code from `vowelCount2` filters characters that are vowels.

2. **Chained filtering operations**:
   ```java
   return s.chars()
           .distinct()
           .sorted()
           .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
           .toString();
   ```
   This code from `uniqueLetters3` creates distinct and sorted characters.

3. **Filtering with complex condition**:
   ```java
   return (int) Arrays.stream(integers)
                  .filter(n -> evenDivisor ? n % 2 != 0 : n % 2 == 0)
                  .findFirst()
                  .getAsInt();
   ```
   This code from `findOutlier` filters numbers based on whether they're odd or even.

## Common Stream Operations in KataSolutions

### 1. Character Processing

Converting a string to a character stream:
```java
str.chars() // returns an IntStream of character codes
```

This is used extensively in methods like `vowelCount2`, `uniqueLetters2`, and `pangram2`.

### 2. Transformations

Converting the type of elements:
```java
Arrays.stream(numbers.split(" ")).map(Integer::parseInt)
```

This pattern appears in `highAndLow2`.

### 3. Aggregation

Computing a single result from a stream:
```java
int sum = Arrays.stream(integers)
             .limit(3)
             .map(i -> Math.abs(i) % 2)
             .sum();
```

This pattern is used in `findOutlier2`.

### 4. Finding Elements

Finding the first element that matches a condition:
```java
Arrays.stream(integers)
     .filter(n -> Math.abs(n) % 2 == mod)
     .findFirst()
     .getAsInt()
```

This code from `findOutlier2` finds the outlier number.

## Best Practices

1. **Use Appropriate Terminal Operations**:
   - `forEach` when you need to perform side effects
   - `collect` when you need to gather results into a collection
   - `reduce` when you need to combine elements

2. **Prefer Method References**:
   Instead of:
   ```java
   stream.map(n -> Integer.parseInt(n))
   ```
   
   Use:
   ```java
   stream.map(Integer::parseInt)
   ```

3. **Use Specialized Streams When Appropriate**:
   - `IntStream` for streams of primitive integers
   - `LongStream` for streams of primitive longs
   - `DoubleStream` for streams of primitive doubles

4. **Avoid Unnecessary Operations**:
   Chain operations efficiently to reduce intermediate steps.

## Performance Considerations

1. **Lazy Evaluation**:
   Intermediate operations are only executed when a terminal operation is invoked.

2. **Short-Circuit Operations**:
   Operations like `findFirst()`, `anyMatch()`, and `allMatch()` don't process the entire stream.

3. **Parallel Streams**:
   For large data sets, consider using parallel streams:
   ```java
   return Arrays.stream(integers)
              .parallel()
              .filter(n -> Math.abs(n) % 2 == mod)
              .findFirst()
              .getAsInt();
   ```
   This is used in `findOutlier2` for potential performance improvement.

4. **Stream Reuse**:
   Streams cannot be reused after a terminal operation is called.

By understanding these concepts, you can leverage the power of Java streams to write more concise, readable, and efficient code, as demonstrated throughout the KataSolutions class.
