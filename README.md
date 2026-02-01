# ♞ Knight’s Tour Problem (Backtracking – Java)

## 📌 Overview
This project implements the Knight’s Tour problem using Backtracking in Java.
A knight is placed on an empty N × N chessboard and must visit every square exactly once, following standard chess knight moves.

## 🧠 Approach
Uses Depth First Search (DFS) with Backtracking
Tries all 8 possible knight moves
Marks a cell with the move number
Backtracks if a dead end is reached
Stops when all N × N cells are visited

## ⚙️ Key Concepts Used
Recursion
Backtracking
2D Arrays
Chess Knight movement logic

## ▶️ How It Works
Initialize the board with -1
Start the knight from (0,0)
Recursively explore valid moves
Backtrack on failure
Print the board when a valid tour is found

## 📤 Output
Each cell displays the order in which the knight visits it, starting from 0.
Example:

 0  59  38  33  30  17   8  63
37  34  31  60   9  62  29  16
58   1  36  39  32  27  18   7
35  48  41  26  61  10  15  28
42  57   2  49  40  23   6  19
47  50  45  54  25  20  11  14
56  43  52   3  22  13  24   5
51  46  55  44  53   4  21  12

## 🛠️ Technologies
Java
Backtracking Algorithm

## 📚 Use Case
Learning recursion & backtracking
DSA practice
Interview preparation

## 🧑‍💻 Author
Gayatri Chippawar
