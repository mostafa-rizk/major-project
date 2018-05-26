# Working Title: Tic-tac-toe
## Name of Lead Designer(s): Mostafa Rizk 

* Theme/Look: ASCII-art grid in Linux Bash Shell

## Materials & Methods
_What programing language will you be using? If you are not planing to use Processing explain why you chose a different programing language._

I will be using Java for this project. This is because I have no experience in processing and have grown fond of the language. Due to the extensive use of java in this course, I've become familiar with how to program using it and find it easier to use than trying to learn a new programming language to use.

## Program Specifications
_Fully describe your project below in one paragraph (minimum 5 sentences). Is it a game? A tool? If it is a game, what game genre is it?_

The project that I'm working on is a Tic-tac-toe game played in the Linux Bash Shell against a computer opponent. The game is played through a text interface, but there is a grid drawn using ASCII characters to help the human player visualize what the grid looks like and what moves they can make. The genre for this is strategy. The computer opponent is designed so that it should never lose on a 3x3 Tic-tac-toe grid - it will always win or tie, but never lose. Though this is a game, it's also a small demonstration of an algorithm that can make "smart" decisions in an environment involving a grid system and the ability for each player to move.

## Potential Challenges
_Potential challenges. What are some of the challenges you think you will have to solve? How are you planing to solve them? What will you do if you are unable to solve some challenges?_

One of the challenges I will have to solve is creating an algorithm that allows the computer opponent to react to the human player in a "smart" manner. The computer opponent should always be making the best possible decision, and should be doing so without it being hard-coded. There should exist some system by which the computer opponent can adapt if the human player makes a move that the programmer did not anticipate or account for. This is the biggest challenge for this challenge. To solve this, the algorithm should have some built-in mechanisms to respond to the human player when it is not obvious what the best move would be. My solution would be to only allow the computer opponent to select the center tile or a corner tile for it's first move. Both decision should be equally likely, meaning that a random number should be generated, either 1 or 2, and that will decide what action the computer opponent takes. The computer opponent should also look for specific grid configurations by the end of turn 1 so as to respond appropriately to the human player. Past both players' first turn, the computer opponent should be able to make decisions on it's own by determining whether the human player has a win condition and whether it itself has a win condition. The priority should be for the computer opponent to block any possible win condition for the human player, then try to satisfy the win condition for itself. On a 3x3 grid, only the first two actions need to be built-in for the computer player, the rest of it's actions can be determined using an algorithm. I do not believe I will be unable to solve some challenges, however if my suggested method does not work then the algorithm can play through all possible game scenarios and store the results in a text file so as to run on the Raspberry Pi. The data can then be compared against the current grid layout and the best move can be made that way.

## Time Line
_Describe in detail what you will complete by the end of each week (end of Friday class)._
* Week 1: I will complete most of the project, needing only minor bits and pieces of code to be able to play against the computer opponent.
* Week 2: The program should work fully now. No extra code is required, however it can be improved to run more efficiently or run with less assistance from the programmer. 
* Week 3: The program is finished. Extra features may be added, such as the ability to run through a shell script, however nothing that is necessary to the project still remains.

# Evaluation
## 60%
_What will a 60% project look like?  In other words, what is the minimum expectations you have for yourself?  List some specific features of your project that are needed to reach 60%._

The program should compile. It should run and be able to play against the human player without needing to be hard-coded.

## 80%
_What does 80% look like?   List some specific features of your project that are needed to reach 80%._

The program should not lose, only win or tie. It should run smoothly and not crash.

## 90+%
_What does 90+% look like?   List some specific features of your project that are needed to reach 90+%._

The program should account for errors and weird user input. It should play like it's supposed to, and be fun to play.
