# java-fundamentals

# Lab-01 ([basics](https://github.com/Qusay114/java-fundamentals/blob/main/basics/src/Main.java)):
###  <span style="color:red">pluralize method</span> :<br> a method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
###  <span style="color:red">flipNHeads method</span> :<br> a method that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
###  <span style="color:red">clock method </span> :<br> a method hat uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

<br><br>

# Lab-02 ([basicslibrary](https://github.com/Qusay114/java-fundamentals/blob/main/basiclibrary/lib/src/basiclibrary/Library.java))
### <span style="color:red">Rolling Dice method </span> :<br> a method that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.
###  <span style="color:red">Contains Duplicates method </span> :<br> a method that returns true or false depending on whether the array contains duplicate values.
### <span style="color:red">Calculating Averages method </span> :<br> a method that accepts an array of integers and calculates and returns the average of all the values in the array.
### <span style="color:red">Arrays of Arrays method </span> :<br> Given an array of arrays calculate the average value for each array and return the array with the lowest average.

<br><br>

# Lab-03 first part([basicslibrary](https://github.com/Qusay114/java-fundamentals/blob/main/basiclibrary/lib/src/basiclibrary/Library.java))
### <span style="color:red">Analyzing Weather Data method </span> :<br> a method to return the max , min and values between min and max doesn't exists in the 2D array provided
###  <span style="color:red">Tallying Election method </span> :<br> a method that accepts a List of Strings representing votes and returns one string to show what got the most votes.

<br><br>

# Lab-03 second part([linter](https://github.com/Qusay114/java-fundamentals/tree/main/linter/app/src/main/java/main))
### <span style="color:red">fix missing semicolons method </span> :<br> 
###### in this method the method will detect missing semicolons syntax error and will create a new file with name outpu.js that has the fixed code

# Lab-06 ([Inheritance](https://github.com/Qusay114/java-fundamentals/tree/main/inheritance/lib/src/main/java))

## Review Class :<br>
a class that has author , stars and reviews  properties, besides these methods :
* addReview : to add a review
* getReviews : to get the reviews .
* getStars : to get the average of the reviews .
* toString : to get the author and the stars of the review .

## Resturant Class :<br> 
a class extends Review class and has resturant name  and price category  properties, besides these methods :
* addPriceCategory : to set the price category for the restaurant .
* getPriceCategory : to get the price category .
* getName : to get the name of the restaurant .
* toString : to get the name , reviews and the price category of the restaurnt .



# Lab-07 ([Inheritance](https://github.com/Qusay114/java-fundamentals/tree/main/inheritance/lib/src/main/java))

## Review Class :<br>
a class that has author , stars and reviews  properties, besides these methods :
* addReview : to add a review
* getReviews : to get the reviews .
* getStars : to get the average of the reviews .
* toString : to get the author and the stars of the review .

## Resturant Class :<br>
a class extends Review class and has resturant name  and price category  properties, besides these methods :
* addPriceCategory : to set the price category for the restaurant .
* getPriceCategory : to get the price category .
* getName : to get the name of the restaurant .
* toString : to get the name , reviews and the price category of the restaurnt .

## Shop Class :<br>
a class extends Review class and has shop name  , description and number of dollar signs properties, which will be set in the constructor besides these methods :
* getName : to get the name of the shop
* getDescription : to get the description of the shop .
* getName : to get the name of the restaurant .
* toString : to get the name , description , review and dollar sings of the shop .

## Theater Class :<br>
a class extends Review class and has theater name  and movies list properties, which will be set in the constructor besides these methods :
* addMovie : to add a movie name to the movies list
* removeMovie : to remove a movie from the movies list.
* toString : to get the name of the theater and the names of the movies list that currently showing of theater .

