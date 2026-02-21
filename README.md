# DecodeLabs-Internship
TASK-1
# Number Game

A fun, interactive console-based Java game where the computer generates a secret random number, and the user has to guess it! 

## Features
* **Random Number Generation:** Automatically generates a secret number between 1 and 100 using Java's `Random` utility.
* **Smart Feedback:** Guides the user after every guess by telling them if their guess was "Too High" or "Too Low."
* **Limited Attempts (Enhancement):** Increases the challenge by giving the user a maximum number of guesses per round.
* **Multiple Rounds (Enhancement):** Allows the user to play again without having to restart the entire program.
* **Score Tracking (Enhancement):** Calculates and displays the user's final score based on how many attempts it took to win.

## Technologies & Concepts Used
* **Language:** Java
* **Concepts:** `Random` class, User Input (`Scanner`), Loops (`while` or `do-while`), Conditional Statements (`if-else`).

## Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your computer. You can check this by opening your terminal or command prompt and running:
`java -version`

## How to Run

1. **Save the file:** Save your Java code in a file named `NumberGame.java`.
2. **Open Terminal/Command Prompt:** Navigate to the folder where you saved the file.
3. **Compile the code:** Run the following command to compile the program:
   ```bash
   javac NumberGame.java

TASK-2
# Student Grade Calculator

A simple, console-based Java application that calculates a student's total marks, average percentage, and final grade based on their performance across multiple subjects.

## Features
* **Dynamic Subject Input:** Allows the user to enter marks (out of 100) for multiple subjects.
* **Total Marks Calculation:** Automatically sums up the marks obtained in all subjects.
* **Average Percentage:** Computes the accurate average percentage based on the total marks.
* **Grade Assignment:** Evaluates the average percentage and assigns a final letter grade (e.g., A, B, C, D, F) using conditional logic.
* **Clear Display:** Outputs the final results in a neat, easy-to-read summary format.

## Technologies & Concepts Used
* **Language:** Java
* **Concepts:** Variables, Loops (to gather marks for each subject), Arithmetic Operations, Conditional Statements (`if-else-if` for grading), User Input (`Scanner`).

## Prerequisites
Ensure you have the Java Development Kit (JDK) installed on your system. You can verify this by opening your terminal or command prompt and running:
`java -version`

## How to Run

1. **Save the file:** Save your Java code in a file named `GradeCalculator.java`.
2. **Open Terminal/Command Prompt:** Navigate to the folder where you saved your file.
3. **Compile the code:** Run the following command to compile the program:
   ```bash
   javac GradeCalculator.java

TASK-3
# ATM Interface

A simple, console-based Java application that simulates a basic ATM machine. This project is built using Object-Oriented Programming (OOP) principles to cleanly separate the user interface from the underlying bank account data.

## Features
* **Encapsulated Bank Account:** Uses a dedicated `BankAccount` class to securely store and manage the user's balance.
* **ATM Operations:** A separate `ATM` class that provides a menu-driven interface to interact with the account.
* **Check Balance:** View the current available funds in the account.
* **Deposit Money:** Add funds to the account. Includes validation to ensure the deposit amount is a valid, positive number.
* **Withdraw Money:** Remove funds from the account. Includes strict validation to check for sufficient balance and prevent overdrawing.
* **Input Validation:** Handles incorrect user inputs gracefully and displays clear, appropriate transaction messages (e.g., "Insufficient balance" or "Deposit successful").

## Technologies & Concepts
* **Language:** Java
* **Concepts:** Classes & Objects, Methods, Encapsulation, Input Validation (`Scanner`), Conditional Logic.

## Prerequisites
To run this program, you must have the Java Development Kit (JDK) installed on your system. You can verify your installation by opening your terminal or command prompt and typing:
`java -version`

## How to Run

1. **Save the file:** Save your Java code in a file named `Main.java` (assuming your public class with the `main` method is named `Main`).
2. **Open Terminal/Command Prompt:** Navigate to the folder where you saved your file.
3. **Compile the code:** Run the following command to compile the program:
   ```bash
   javac Main.java

TASK-4
# Currency Converter

A simple, console-based Java program that allows users to convert money from one currency to another. 

## Features
* **Select Currencies:** Choose a base currency (the money you have) and a target currency (the money you want).
* **Custom Amount:** Enter any valid numerical amount to be converted.
* **Instant Conversion:** Calculates the converted amount using predefined exchange rates.
* **Clear Display:** Formats the output so the user can easily see the original amount and the final converted value.

## Technologies & Concepts Used
* **Language:** Java
* **Concepts:** Variables, User Input (`Scanner`), Arithmetic Operations, `switch` statements/conditional logic.

## Prerequisites
To run this program, you need to have the Java Development Kit (JDK) installed on your system. You can verify your installation by opening your terminal or command prompt and running:
`java -version`

## How to Run

1. **Save the file:** Save the Java code in a file named `CurrencyConverter.java`.
2. **Open Terminal/Command Prompt:** Navigate to the folder where you saved your file.
3. **Compile the code:** Run the following command to compile the program:
   ```bash
   javac CurrencyConverter.java

TASK-5

# Student Management System

A simple, console-based Java application to manage student records. This project uses Object-Oriented Programming (OOP) concepts and Java Collections (`ArrayList`) to store and manage data in memory.

## Features
* **Add Student:** Add a new student with their Name, Roll Number, and Grade. Prevents duplicate roll numbers.
* **Remove Student:** Delete a student's record using their Roll Number.
* **Search Student:** Find and display a specific student's details using their Roll Number.
* **Show All:** Display a list of all current students in the system.
* **Input Validation:** Basic error handling to prevent the program from crashing if incorrect data types (like typing letters instead of numbers for the roll number) are entered.

## Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your computer. You can check this by opening your terminal or command prompt and typing:
`java -version`

## How to Run

1. **Save the file:** Save the provided Java code in a file exactly named `Main.java`.
2. **Open Terminal/Command Prompt:** Open your terminal and navigate to the folder where you saved `Main.java`.
3. **Compile the code:** Run the following command to compile the Java file:
   ```bash
   javac Main.java
