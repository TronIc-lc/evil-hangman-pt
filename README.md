# evil-hangman-pt
Mimir Link - https://class.mimir.io/projects/648c4c68-b1d7-4f1a-acc2-a5a1a6be9cc6
Due 9/9/21

-> To minimize the length of test runs and make debugging easier, Mimir testing uses a simplified dictionary for testing. Your dictionary must include the same words used for testing, which can be found here: dictionary.txt
-> Your program should read the "dictionary.txt" file from the current directly. That is, no folder paths should be included to link to the file. For example, new File("Evil Hangman/dictionary.txt") will not work whereas reading the file from the current directly (e.g. new File("dictionary.txt")) will work.
-> Your project should include Driver.java that drives your program. You can create a second driver to execute your own creative, personlized version of the game if you would like to (this will not be tested).
-> In case of a tie with the maximum word family, choose the word family that does not include the guess letter (that is, the word family with all dashes), if possible. For instance, if the active words were {"at", "by"} and the user guesses "a", there would be a tie on the max word family: "at" would belong to "a-" and "by" would belong to "--". Both word families have a word count of 1. In this case, your program should select "--" since it does not include the guess letter. To keep processing simple, there are NO testing scenarios where you need to break a tie between word families where the "all dash" family is not part of the tie (e.g. "a-" vs "-a").
-> Only incorrect guesses decrement the remaining guesses in the game. If the user guesses a letter correctly, you should NOT decrement the remaining guesses. 
-> Input/output test cases are listed below. Please note: To keep processing simple, all test cases input "n" for the "Play again (y/n)? " prompt. Therefore, you do NOT need to account for play again functionality in your program.


TEST CASE EXAMPLES

+----------------------------+

EXAMPLE INPUT/OUTPUT #1 (user input in bold)
Word length? 2
Number of guesses? 5
Running total (y/n)? y

Remaining guesses: 5
Guesses: []
Running total: 3
--
Guess? t
Correct

Remaining guesses: 5
Guesses: [t]
Running total: 2
-t
Guess? a
Incorrect

Remaining guesses: 4
Guesses: [t, a]
Running total: 1
-t
Guess? i
Correct

You won! The word was: it
Play again (y/n)? n


 

EXAMPLE INPUT/OUTPUT #2 (user input in bold)
Word length? 2
Number of guesses? 5
Running total (y/n)? y

Remaining guesses: 5
Guesses: []
Running total: 3
--
Guess? b
Incorrect

Remaining guesses: 4
Guesses: [b]
Running total: 2
--
Guess? t
Correct


Remaining guesses: 4
Guesses: [b, t]
Running total: 2
-t
Guess? c
Incorrect

Remaining guesses: 3
Guesses: [b, t, c]
Running total: 2
-t
Guess? d
Incorrect

Remaining guesses: 2
Guesses: [b, t, c, d]
Running total: 2
-t
Guess? e
Incorrect

Remaining guesses: 1
Guesses: [b, t, c, d, e]
Running total: 2
-t
Guess? f
Incorrect

You lost!
Play again (y/n)? n

 
EXAMPLE INPUT/OUTPUT #3 (user input in bold)
Word length? 8
Error - try again.
Word length? -50
Error - try again.
Word length? 2
Number of guesses? -10
Error - try again.
Number of guesses? 5
Running total (y/n)? asdf
Error - try again.
Running total (y/n)? aslkdjf
Error - try again.
Running total (y/n)? y

Remaining guesses: 5
Guesses: []
Running total: 3
--
Guess? &
Error - try again.
Guess? 9
Error - try again.
Guess? park
Error - try again.
Guess? p
Incorrect

Remaining guesses: 4
Guesses: [p]
Running total: 3
--
Guess? a
Incorrect

Remaining guesses: 3
Guesses: [p, a]
Running total: 2
--
Guess? r
Incorrect

Remaining guesses: 2
Guesses: [p, a, r]
Running total: 2
--
Guess? k
Incorrect

Remaining guesses: 1
Guesses: [p, a, r, k]
Running total: 2
--
Guess? t
Correct

Remaining guesses: 1
Guesses: [p, a, r, k, t]
Running total: 1
--
Guess? u
Incorrect

You lost!
Play again (y/n)? n
