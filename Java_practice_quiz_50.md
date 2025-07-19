# Java Assessment Practice Quiz - 50 Questions

## Instructions
- This quiz contains 50 multiple-choice questions  
- Choose the best answer for each question  
- Time yourself for 2 hours to simulate your actual assessment  
- Answers are provided at the bottom  

---

## Questions

**1. Which of the following is the correct way to declare a constant in Java?**
a) const int MAX = 100;  
b) final int MAX = 100;  
c) constant int MAX = 100;  
d) static int MAX = 100;

**2. What will be the output of the following code?**
```java
public class Test {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);
    }
}
```
a) 0 1  
b) 0 2  
c) 1 2  
d) 1 1

**3. Which of the following is NOT an OOP principle?**
a) Encapsulation  
b) Inheritance  
c) Polymorphism  
d) Compilation

**4. What is the size of an int in Java?**
a) 16 bits  
b) 32 bits  
c) 64 bits  
d) Platform dependent

**5. Which method must be implemented by all threads?**
a) wait()  
b) notify()  
c) run()  
d) start()

**6. What will happen if you compile and run the following code?**
```java
public class Test {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}
```
a) Prints 0  
b) Prints null  
c) Throws NullPointerException  
d) Compilation error

**7. Which keyword is used to refer to the current object in Java?**
a) self  
b) current  
c) this  
d) me

**8. What is the default value of a boolean variable in Java?**
a) true  
b) false  
c) 0  
d) null

**9. Which of the following correctly declares a two-dimensional array?**
a) int[][] arr = new int[3][4];  
b) int arr[][] = new int[3][4];  
c) int[] arr[] = new int[3][4];  
d) All of the above

**10. What will be the output?**
```java
System.out.println(10 + 20 + "Hello" + 10 + 20);
```
a) 30Hello30  
b) 30Hello1020  
c) 1020Hello1020  
d) 50Hello30

**11. Which interface is implemented by all collections in Java?**
a) List  
b) Set  
c) Collection  
d) Map

**12. What is the difference between ArrayList and LinkedList?**
a) ArrayList uses dynamic arrays, LinkedList uses doubly linked lists  
b) ArrayList is faster for random access, LinkedList is faster for insertion/deletion  
c) ArrayList implements List interface, LinkedList doesn't  
d) Both a and b

**13. Which exception is thrown when an array is accessed with illegal index?**
a) ArrayException  
b) IndexOutOfBoundsException  
c) ArrayIndexOutOfBoundsException  
d) IllegalArgumentException

**14. What will be the output?**
```java
String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1 == str2);
```
a) true  
b) false  
c) Compilation error  
d) Runtime error

**15. Which of the following is true about abstract classes?**
a) They cannot have constructors  
b) They cannot have concrete methods  
c) They cannot be instantiated  
d) They must have at least one abstract method

**16. What is method overriding?**
a) Having multiple methods with same name but different parameters  
b) Redefining a method of parent class in child class  
c) Making a method static  
d) Creating private methods

**17. Which keyword is used to prevent method overriding?**
a) static  
b) final  
c) private  
d) abstract

**18. What will be the output?**
```java
int[] arr = {1, 2, 3, 4, 5};
for(int x : arr) {
    if(x == 3) continue;
    System.out.print(x + " ");
}
```
a) 1 2 4 5  
b) 1 2 3 4 5  
c) 3  
d) 1 2

**19. Which of the following creates an infinite loop?**
a) for(;;)  
b) while(true)  
c) do{}while(true);  
d) All of the above

**20. What is the parent class of all classes in Java?**
a) Class  
b) Object  
c) Parent  
d) Super

**21. Which collection maintains insertion order?**
a) HashSet  
b) TreeSet  
c) LinkedHashSet  
d) All collections maintain insertion order

**22. What will be the output?**
```java
public class Test {
    static int count = 0;
    public Test() {
        count++;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(count);
    }
}
```
a) 0  
b) 1  
c) 2  
d) Compilation error

**23. Which operator is used for object comparison in Java?**
a) ==  
b) equals()  
c) compareTo()  
d) Both a and b

**24. What is the correct way to handle multiple exceptions?**
a) Use multiple try blocks  
b) Use multiple catch blocks  
c) Use nested try-catch  
d) All of the above

**25. Which of the following is true about interfaces?**
a) They can have concrete methods (Java 8+)  
b) All methods are public and abstract by default  
c) They support multiple inheritance  
d) All of the above

**26. What will be the output?**
```java
public class Test {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println(x + " " + y);
    }
}
```
a) 5 5  
b) 6 5  
c) 5 6  
d) 6 6

**27. Which keyword is used to import packages in Java?**
a) include  
b) import  
c) package  
d) using

**28. What is autoboxing in Java?**
a) Automatic conversion from primitive to wrapper class  
b) Automatic conversion from wrapper to primitive class  
c) Automatic memory management  
d) Automatic exception handling

**29. Which method is used to compare strings in Java (case-insensitive)?**
a) equals()  
b) equalsIgnoreCase()  
c) compareTo()  
d) compareToIgnoreCase()

**30. What will be the output?**
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);
```
a) Hello  
b) World  
c) Hello World  
d) Compilation error

**31. Which of the following is true about static methods?**
a) They can be overridden  
b) They belong to the class, not the instance  
c) They can access instance variables directly  
d) They must be public

**32. What is the correct syntax to create a generic ArrayList for integers?**
a) ArrayList<int> list = new ArrayList<int>();  
b) ArrayList<Integer> list = new ArrayList<Integer>();  
c) ArrayList<Integer> list = new ArrayList<>();  
d) Both b and c

**33. Which exception handling block is always executed?**
a) try  
b) catch  
c) finally  
d) throw

**34. What will be the output?**
```java
int a = 10, b = 20;
System.out.println((a > b) ? a : b);
```
a) 10  
b) 20  
c) true  
d) false

**35. Which of the following is used to create a package in Java?**
a) package keyword at the top of the file  
b) import keyword  
c) class keyword  
d) public keyword

**36. What is the difference between == and .equals() for strings?**
a) No difference  
b) == checks reference equality, .equals() checks content equality  
c) == checks content equality, .equals() checks reference equality  
d) .equals() is faster than ==

**37. Which loop is best when you don't know the number of iterations?**
a) for loop  
b) while loop  
c) do-while loop  
d) enhanced for loop

**38. What will be the output?**
```java
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 20));
    }
}
```
a) 10  
b) 20  
c) 30  
d) Compilation error

**39. Which access modifier provides the widest visibility?**
a) private  
b) protected  
c) public  
d) default

**40. What is the correct way to create a thread by implementing Runnable?**
a) class MyThread implements Runnable { public void run() {...} }  
b) class MyThread extends Runnable { public void run() {...} }  
c) class MyThread implements Thread { public void run() {...} }  
d) class MyThread extends Thread { public void start() {...} }

**41. What will be the output?**
```java
int[] arr = new int[5];
System.out.println(arr[0]);
```
a) null  
b) 0  
c) Garbage value  
d) Compilation error

**42. Which method is used to convert a string to integer?**
a) Integer.parseInt()  
b) Integer.valueOf()  
c) String.toInt()  
d) Both a and b

**43. What happens when you try to add a duplicate element to a HashSet?**
a) Throws an exception  
b) Adds the duplicate element  
c) Ignores the duplicate element  
d) Replaces the existing element

**44. What will be the output?**
```java
public class Test {
    public void method() {
        System.out.println("Parent");
    }
}
public class Child extends Test {
    public void method() {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Test t = new Child();
        t.method();
    }
}
```
a) Parent  
b) Child  
c) Compilation error  
d) Both Parent and Child

**45. Which keyword is used to define a subclass?**
a) implements  
b) extends  
c) inherits  
d) subclass

**46. What is the maximum number of catch blocks that can follow a try block?**
a) 1  
b) 2  
c) 5  
d) No limit

**47. What will be the output?**
```java
String str = "Java";
str = str.concat(" Programming");
System.out.println(str);
```
a) Java  
b) Programming  
c) Java Programming  
d) Compilation error

**48. Which method is called when an object is garbage collected?**
a) finalize()  
b) dispose()  
c) destroy()  
d) cleanup()

**49. What is the correct way to handle checked exceptions?**
a) Use try-catch block  
b) Declare with throws keyword  
c) Both a and b  
d) Ignore them

**50. What will be the output?**
```java
public class Test {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            result = 1;
        } finally {
            result = 2;
        }
        System.out.println(result);
    }
}
```
a) 0  
b) 1  
c) 2  
d) Exception is thrown

---

## Answer Key

1. **b)** final int MAX = 100;
2. **b)** 0 2
3. **d)** Compilation
4. **b)** 32 bits
5. **c)** run()
6. **c)** Throws NullPointerException
7. **c)** this
8. **b)** false
9. **d)** All of the above
10. **b)** 30Hello1020
11. **c)** Collection
12. **d)** Both a and b
13. **c)** ArrayIndexOutOfBoundsException
14. **a)** true (string pool)
15. **c)** They cannot be instantiated
16. **b)** Redefining a method of parent class in child class
17. **b)** final
18. **a)** 1 2 4 5
19. **d)** All of the above
20. **b)** Object
21. **c)** LinkedHashSet
22. **c)** 2
23. **d)** Both a and b
24. **d)** All of the above
25. **d)** All of the above
26. **b)** 6 5
27. **b)** import
28. **a)** Automatic conversion from primitive to wrapper class
29. **b)** equalsIgnoreCase()
30. **c)** Hello World
31. **b)** They belong to the class, not the instance
32. **d)** Both b and c
33. **c)** finally
34. **b)** 20
35. **a)** package keyword at the top of the file
36. **b)** == checks reference equality, .equals() checks content equality
37. **b)** while loop
38. **b)** 20
39. **c)** public
40. **a)** class MyThread implements Runnable { public void run() {...} }
41. **b)** 0
42. **d)** Both a and b
43. **c)** Ignores the duplicate element
44. **b)** Child (polymorphism)
45. **b)** extends
46. **d)** No limit
47. **c)** Java Programming
48. **a)** finalize()
49. **c)** Both a and b
50. **c)** 2 (finally block always executes)

---

## Performance Analysis

**Score Interpretation:**
- **45-50 correct:** Excellent! You're well-prepared for the assessment
- **40-44 correct:** Good preparation, review missed topics
- **35-39 correct:** Average, focus on weak areas before the exam
- **30-34 correct:** Need more study time, concentrate on fundamentals
- **Below 30:** Requires significant preparation, attend pre-assessment session

**Key Areas Covered:**
- Basic syntax and operators (Questions 1, 2, 10, 26, 34)
- Data types and variables (Questions 4, 8, 9, 41)
- Object-oriented programming (Questions 3, 15, 16, 17, 20, 44, 45)
- Exception handling (Questions 6, 13, 24, 33, 46, 49, 50)
- Collections framework (Questions 11, 12, 21, 25, 32, 43)
- String manipulation (Questions 14, 29, 30, 36, 47)
- Control structures (Questions 18, 19, 37)
- Threading (Questions 5, 40)
- Access modifiers and keywords (Questions 7, 27, 35, 39)
- Advanced concepts (Questions 28, 42, 48)

**Study Recommendations:**
Focus extra attention on any questions you missed, especially in these critical areas for your assessment.

**Time Management:**
- With 2 hours for the assessment, spend about 2.4 minutes per question maximum
- Skip difficult questions initially and return to them
- Read questions carefully - MCQs can have tricky wording

Good luck with your assessment!
