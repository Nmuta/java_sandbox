## Java language basics :  Exercises

## Prereqs: 
* This lesson is for people with no Java experience. 
* You are encouraged to read the JS curriculum , as it contains valuable information which we will build upon in these exercises. 
* The JS curriculum can be found here: https://github.com/gSchool/java-curriculum .  Unit 01 syntax can be read. 

## Lesson objectives: By the end of this unit, you should be able to : 
* Fluently set up Java classes and write methods that use various Java primitives. 
* Fluently explain the difference between public and private methods and variables
* Execute functions based on user input 

imports needed: 

```
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

```

### I do: 
* Compile and run a basic Java program using Atom and the command line. 
* (If you're doing this at home, see https://github.com/gSchool/java-curriculum/tree/master/Unit-1-Syntax ) 

### We do: 
* (Same as above) : Compile and run a basic Java program using Atom and the command line. 


### We do: 
* Set up a Java project in Eclipse 
* (video if you're stuck): https://github.com/Nmuta/java_sandbox/blob/master/JavaProjectSetup.mov

### We do: 
* Discuss variable types: int, double , float, String, boolean, char
* Discuss arrays
* Use System.out to manipulate and echo variables in the console
* Use System.out in a loop to echo out all numbers in an array 
* Discuss Strings and String concatenation

## We do: 
* Accepting input from the user 
``` 
String city_choice = JOptionPane.showInputDialog("Where do you live? ");

``` 

## You do :  (Exercise ) : 
* Accept a user's name , and after that information is accepted, System.out 
"Hello _name_ , your name has _number_ characters " !  



## I do: 
* Functions and function scope

## You do: 
* Outsource your "Hello _name_ .... written above " !  functionality to a function. 

## I do: 
* Demonstrate the use of Math.random 
``` 
int rand_num = new Random().nextInt(8);

``` 
## You do: 
* Create a random array of food dishes.  In the code above, when you greet the user, greet them with a random food item from the list.  For example : 
``` 
Greetings, Jacq ! Please enjoy this plate of spaghetti . 

```
where spaghetti is a random food from the list. 

## Finish ! 

