# Spotify New York City Technology Fellowship Program

## Question One
This class contains the sortByStrings() method which takes two strings s and t. The method sorts the string s by the
order characters occur in string t. To run from command line, go to where file is located:
```
javac QuestionOne.java
java QuestionOne s t
```

### Examples
* Given s = "weather" and t = "therapyw", method returns "theeraw"
* Given s = "good" and t = "odg", method returns "oodg"

## Question Two
This class contains the decodeString() method which takes a valid encoded string s and returns the corresponding decoded
string. The encoding rule is ```k[encoded_string]```, where the encoded_string inside the square brackets is repeated
exactly k times. Assume k is a positive number. To run from command line, go to where file is located:
```
javac QuestionTwo.java
java QuestionTwo s
```

### Examples
* Given s = "4[ab]", the method returns "abababab"
* Given s = "2[b3[a]]", the method returns "baaabaaa"

## Question Three
This class contains the changePossibilities() method which takes in an amount of money and an integer array of coin
denominations. Given these two things, the method returns the number of ways to make the amount of money using the coin
denominations available. To run from command line, go to where file is located:
```
javac QuestionThree.java
java QuestionThree a b b b b b b...
```
where a is the amount as an integer and subsequent b arguments make up the integer array of coin denominations.

### Examples
* Given amount = 4, coinDenominations=[1,2,3], run ```java QuestionThree 4 1 2 3```, method returns 4 possibilities which consist of 1, 1, 1, 1 and 1, 1, 2, and 1, 3, and 2, 2
