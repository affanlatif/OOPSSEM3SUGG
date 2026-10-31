# OOPS Semester 3 — Java Programming Question Bank

A structured collection of **14 Java practical questions with complete solutions** covering arrays, strings, matrices, object-oriented programming, inheritance, polymorphism, searching, sorting, recursion, and mathematical logic.

## Question Bank

| No. | Section | Question | Solution |
|:---:|---|---|---|
| 1 | Arrays, Matrices & Strings | String array processing: longest, shortest and reverse order | [View Solution](Section-A/Q01-String-Array/StringArrayProcessing.java) |
| 2 | Arrays, Matrices & Strings | Character analysis: vowels, consonants, digits, spaces and special characters | [View Solution](Section-A/Q02-Character-Analysis/CharacterAnalysis.java) |
| 3 | Arrays, Matrices & Strings | Compare String literals and String objects using `==` and `equals()` | [View Solution](Section-A/Q03-String-Comparison/StringComparison.java) |
| 4 | Arrays, Matrices & Strings | Check whether two strings are anagrams | [View Solution](Section-A/Q04-Anagram/AnagramCheck.java) |
| 5 | Arrays, Matrices & Strings | Demonstrate important String built-in methods | [View Solution](Section-A/Q05-String-Methods/StringMethods.java) |
| 6 | Arrays, Matrices & Strings | Menu-driven matrix addition, subtraction and multiplication | [View Solution](Section-A/Q06-Matrix-Operations/MatrixOperations.java) |
| 7 | Object-Oriented Programming | Classroom using a parameterized constructor | [View Solution](Section-B/Q07-Classroom/Classroom.java) |
| 8 | Object-Oriented Programming | Multilevel inheritance using Person, Employee and Manager | [View Solution](Section-B/Q08-Multilevel-Inheritance/MultilevelInheritance.java) |
| 9 | Object-Oriented Programming | Method overriding and runtime polymorphism | [View Solution](Section-B/Q09-Method-Overriding/EmployeeSalary.java) |
| 10 | Algorithms & Logic | Search an element using Binary Search | [View Solution](Section-C/Q10-Binary-Search/BinarySearch.java) |
| 11 | Algorithms & Logic | Sort six elements using Bubble Sort | [View Solution](Section-C/Q11-Bubble-Sort/BubbleSort.java) |
| 12 | Algorithms & Logic | Calculate factorial using recursion | [View Solution](Section-C/Q12-Factorial/Factorial.java) |
| 13 | Algorithms & Logic | Generate the Fibonacci series | [View Solution](Section-C/Q13-Fibonacci/Fibonacci.java) |
| 14 | Algorithms & Logic | Convert Celsius to Fahrenheit | [View Solution](Section-C/Q14-Temperature-Conversion/TemperatureConversion.java) |

## Repository Structure

```text
OOPSSEM3SUGG/
├── README.md
├── Section-A/
│   ├── Q01-String-Array/
│   ├── Q02-Character-Analysis/
│   ├── Q03-String-Comparison/
│   ├── Q04-Anagram/
│   ├── Q05-String-Methods/
│   └── Q06-Matrix-Operations/
├── Section-B/
│   ├── Q07-Classroom/
│   ├── Q08-Multilevel-Inheritance/
│   └── Q09-Method-Overriding/
└── Section-C/
    ├── Q10-Binary-Search/
    ├── Q11-Bubble-Sort/
    ├── Q12-Factorial/
    ├── Q13-Fibonacci/
    └── Q14-Temperature-Conversion/
```

## How to Compile and Run

Make sure a **Java Development Kit (JDK)** is installed. Open a terminal in the folder containing the required Java file:

```bash
javac FileName.java
java ClassName
```

Example:

```bash
javac StringArrayProcessing.java
java StringArrayProcessing
```

> **Important:** The Java filename must exactly match the public class name.

## Topics Covered

- Arrays and String Arrays
- Character Processing
- String Pool and String Comparison
- Anagrams and String Methods
- Two-Dimensional Arrays and Matrix Operations
- Constructors
- Inheritance and Multilevel Inheritance
- Method Overriding and Runtime Polymorphism
- Binary Search and Bubble Sort
- Recursion and Fibonacci Series
- Mathematical Conversion

## Notes

- All programs use beginner-friendly **Core Java** concepts.
- Programs requiring user interaction use `Scanner`.
- **Binary Search requires sorted data**, so Question 10 sorts the input before searching.
- Matrix operations validate dimensions before calculation.
- Question 9 uses illustrative allowances of ₹10,000 for a Developer and ₹20,000 for a Manager because the question does not specify allowance values.
- The factorial program accepts values from **0 to 20** to keep results within Java's `long` range.

---

### Java Practical Solutions — OOPS Semester 3

Each solution is stored independently, making it easy to compile, run, study, and submit individual programs.
