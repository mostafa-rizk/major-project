# Major Project Option
At the teacher's discretion students may be assigned one of the following projects.

## Option 1: Dice Game
The rules to this casino game are simple. The player rolls a die; the casino rolls a die. The higher number wins. If it is a tie, the player wins big! 

### Setting up your file
Create variables to store each of the Player’s roll and the Casino’s roll. In the setup function, create a large window
In the draw function, begin by setting a background colour.

### Instructions Area
Add the words “Your Name’s Casino” in a big font. In a smaller, different font, write the following instructions:
* Hit the c key to roll the Casino’s die.
* Hit the p key to roll your die (P for player).
* Hit the w key to see if you are a winner.

### Part 1: Text Only Game
__KeyPressed Function__
* When the c key is pressed: randomly generate a number for the casino between 1 and 6. Tell the user what the casino rolled.
* When the p key is pressed: repeat the above for the player
* When the w key is pressed, use a three part ```if… else if…``` statement so that you tell the user:
  * the casino wins if its number is higher
  * the player wins if his/her number is higher
  * the player wins a million dollars if it is a tie

### Part 2: Adding Pictures
* You will need to do an onlin search and find 6 pictures of the different outcomes for a die. Call the pictures 1.jpg, 2.jpg, etc.
* Set Up Your Images Area
* In this version you need to allocate some space to hold the pictures of the dice.  
* Add text that says Casino’s Roll:  and Player’s Roll:
* Draw squares beside each of the above labels that are big enough to hold the pictures (perhaps 200x200).  For now, these squares will be empty. The pictures will go in the boxes.

### Adding to the KeyPressed Function
__When the c key is pressed:__
* Keep your existing code to randomly generate a number for the casino add the appropriate picture to the square. This will take a 6 part if-statement that chooses the right picture based on the roll.
* When the p key is pressed repeat the above for the player
* No new code is needed for the w key.
