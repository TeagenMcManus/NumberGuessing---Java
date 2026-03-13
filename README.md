# NumberGuessing Java
main() {
  ask the user what mode they want to play
  if statment to push them to the repecsted class/object
}

playingGuessing() {
  random number gets generated
  add it to a variable
  while statement that doesnt close until the correct number is guess {
    adds +1 to attempts
    ask the user their given number
    checks to see if its to high
      if so tells them so 
    checks to see if its to low
      if so tells the user 
    checks to see if the answer is correct
      if so tells the user that its correct and how many attempts it took
    wrong input catch
      tells the user if they input a wrong input and subtracts 1 from attempts
  }
}

computerGuessing() {
  ask the user what their number is
  adds it to a variable 
  checks to see if the user did a number lower than 1 or high than 100
  shows the number so user doesnt forget it
  while statement that doesnt close until the correct number is guess {
    add +1 to attempts
    computer grabs a random number from low(starting:1) - high(starting:100)
    ask what the number is (correct, low, or high)
    checks to see what the user said
    if number is low then add to low variable
    if number is high then add to high variable
    if number is correct then tells the user how many attmepts it took the computer
  }
}

Documentation: https://docs.google.com/document/d/1c-bkPV10dnZqa_1a7Jp62i48IifBKibyjbhrqONqDQg/edit?usp=sharing
it works i tried the link with a different account and doest take to google drive.

commands for me:
git add .
git commit -m "Describe your changes"
git push origin main

Runs the code
javac guessing.java
java guessing
