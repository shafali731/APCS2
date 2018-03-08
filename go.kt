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
    I expect to see the main board to be mostly filled and possibly some of the 1st layer of -1's to be filled with the "move" number.
Q5: How long do you expect it to run?
    For closer to a minute because the default delay time is 500 milliseconds, which is half a second and this would be true of every time it goes
    through another move.
Q6: What does ANSI stand for? (You are permitted some intertubes searching here…). What is it good for?
    American National Standards Institute. It establishes computer standards, for example, ASCII. 
