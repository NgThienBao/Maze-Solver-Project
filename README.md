
# Rat Maze Solver Project
## Overview 
This project involves the simulation of a rat navigating through a complex maze. The maze is represented by a 2D grid where: - Yellow paths (`'p'`) indicate the routes the rat can move. - Black squares (`'w'`) represent walls that the rat cannot pass through. - The rat is represented by a red square (`'r'`). - The goal is represented by an open space (`'o'`) located in the right corner and surrounded by a pink border. The project explores pathfinding algorithms, client-server communication, and graphical user interface
## Project Structure
F:.
|   .gitattributes
|   .gitignore
|   Client.java
|   Grid.java
|   GUI.java
|   Maze.java
|   Rat.java
|   Server.java
|
+---maze
|       Grid.class
|       GUI.class
|       Maze.class
|       Server.class
|
\---rat
        Client.class
        Rat.class
## Prerequisites
- Java Development Kit (JDK) installed
- Visual Studio Code or any other IDE

## Running the Project

1. **Compile Java source files into bytecode**
  Example:
     ```bash
     cd "F:Rat-Maze-master"
     ```
Navigate to the `Rat-Maze-master` directory:
Run javac -d . Client.java Grid.java GUI.java Maze.java Rat.java Server.java

## Running the Server:
- In one terminal run:
java maze.Maze   
## Running the Client:
- In another terminal run:
java rat.Client  


