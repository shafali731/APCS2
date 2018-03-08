Q0: What do you make of the multiple class definitions in a single .java file?
      The first class is not a public class, so it is a default class, possibly meaning that there can be multiple classes without protection,
      but only one with protection.
Q1: How are the command line arguments processed?
    They are processed using Integer.parseInt and then it checks the validity of those arguments using a try and catch.  They are then stored in variables
    to be used later on in other methods.
Q2: What happens if no command line arguments are given?
    Then the default board size and delay time are used.
Q3: What is the nature/purpose of the recursion? Is it necessary for the animation?
    The purpose of the recursion is to get a random board spot every time.
Q4: What do you expect to see when you run it?
    I expect to see the main board to be mostly filled with the "move" number.
Q5: How long do you expect it to run?
    For closer to a minute because the default delay time is 500 milliseconds, which is half a second and this would be true of every time it goes
    through another move.
Q6: What does ANSI stand for? (You are permitted some intertubes searching here…). What is it good for?
    American National Standards Institute. It establishes computer standards, for example, ASCII.


Q7: How did your expectations compare to your observations?
    They were what I predicted.

Q8: How might you adapt this framework to animate a probing for a Knight’s Tour?
    The recursive calls can block off the inhabitable spots on the board. The "moves" would calculate how many spaces we have filled. There could be
    8 choices (the 8 ways the knight can move) and one of them would be randomly chosen. If the move is valid, then the knight will  move there, but if
    it's not, the knight will move a different way. If it comes to a dead end, then it would remove previously chosen moves.
