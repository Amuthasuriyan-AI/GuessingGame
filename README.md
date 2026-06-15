Real-Time Number Guessing Game
Cognifyz Technologies Internship – Task 1
Project Overview

This project is developed as part of Task 1 of the Cognifyz Technologies Internship Program. It is a Java-based text game where the computer generates a random number for each execution, and the player must guess the number within a limited number of attempts. The game provides hints such as "Too High" or "Too Low" until the correct number is guessed or the attempts are exhausted.

Objectives
Implement a simple text-based game using Java.
Use conditional statements for game logic.
Practice loops, user input handling, and random number generation.
Develop problem-solving and debugging skills.
Features
Random secret number generated on every run.
User-friendly interaction through the console.
Hint system (Too High / Too Low).
Limited attempts.
Win/Lose conditions.
Simple and beginner-friendly implementation.
Technologies Used
Java
Scanner Class
Random Class
Conditional Statements
Loops
ER Diagram
+-------------+           Makes Guess           +-------------+
|   Player    | ------------------------------> |    Game     |
+-------------+                                 +-------------+
| Player Name |                                 | Secret No.  |
| Attempts    |                                 | Max Attempts|
+-------------+                                 | Result      |
                                                +-------------+
                                                        |
                                                        |
                                                        v
                                               +----------------+
                                               | Guess Feedback |
                                               +----------------+
                                               | Too High       |
                                               | Too Low        |
                                               | Correct        |
                                               +----------------+
How to Run
Compile
javac GuessingGame.java
Execute
java GuessingGame
Sample Output
=== Number Guessing Game ===
Guess the number between 1 and 100
You have 7 attempts.

Enter your guess: 50
Too Low!

Enter your guess: 75
Too High!

Enter your guess: 68
Congratulations! You guessed correctly.
Learning Outcomes
Understanding conditional statements (if-else)
Using loops (while)
Generating random numbers
Handling user input
Designing simple game logic
Internship Details

Internship Provider: Cognifyz Technologies
Task: Task 1 – Develop a Basic Text-Based Game
Project: Real-Time Number Guessing Game

Author

Amuthasuriyan J
Software Engineering Enthusiast | Java Learner | Cognifyz Intern
