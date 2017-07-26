CSC220 Programming Project#4
============================
 
Due Date: Saturday August 12th, 2017
THERE WILL BE NO LATE SUBMISSIONS

- Implement poker game program in package PJ4:
 
      Part I  (40%) Implement Decks class
      Part II (60%) Implement VideoPoker class
 
  See PJ4/PlayingCard.java and PJ4/VideoPoker.java for more info. 
 

- Use TestVideoPoker.java to test correctness of your program

- Compile programs (you are in directory containing Readme file):
    
  javac PJ4/*.java 
  javac TestVideoPoker.java

- Run programs (you are in directory containing Readme file):

  // Run tests in PJ4 classes 
  java PJ4.Decks
  java PJ4.VideoPoker

  // Run main test program
  java TestVideoPoker


******************************************************************************************
  
- Sample output :  java PJ4.Decks


*******    Create 2 decks of cards      ********

getNumberDecks:2
getWithJokers:true

************************************************

Loop # 0

Before shuffle:108 cards

    [Joker #1, Joker #1, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades, Joker #1, Joker #1, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]

==============================================

After shuffle:108 cards

    [A Diamonds, 8 Clubs, 6 Diamonds, 8 Diamonds, K Spades, 6 Clubs, K Spades, 10 Diamonds, 6 Hearts, 2 Spades, J Spades, J Hearts, A Diamonds, 10 Hearts, 3 Clubs, J Diamonds, 2 Hearts, 3 Spades, 8 Hearts, J Clubs, 4 Spades, A Hearts, K Hearts, Joker #1, 5 Diamonds, 10 Hearts, 5 Clubs, 4 Diamonds, A Clubs, J Hearts, A Spades, 7 Spades, 7 Diamonds, 3 Diamonds, 7 Spades, 4 Hearts, 7 Clubs, 5 Diamonds, A Hearts, Q Spades, Joker #1, A Spades, J Diamonds, K Hearts, 9 Spades, 4 Spades, 9 Diamonds, 9 Hearts, Joker #1, 5 Hearts, Q Clubs, K Clubs, 9 Diamonds, 5 Spades, 9 Hearts, 5 Clubs, 2 Clubs, 5 Spades, 8 Clubs, 8 Spades, 9 Spades, 2 Diamonds, 10 Clubs, 3 Hearts, 5 Hearts, K Clubs, 3 Diamonds, 10 Diamonds, Q Spades, 2 Clubs, 4 Diamonds, 6 Spades, Joker #1, 6 Hearts, 4 Hearts, 2 Hearts, 8 Hearts, 2 Spades, 7 Diamonds, 10 Spades, Q Diamonds, Q Clubs, 7 Hearts, Q Hearts, 8 Diamonds, 4 Clubs, K Diamonds, 8 Spades, K Diamonds, J Spades, 10 Clubs, A Clubs, 7 Hearts, 6 Spades, 3 Spades, J Clubs, Q Diamonds, 9 Clubs, 6 Diamonds, 6 Clubs, 10 Spades, 3 Hearts, 3 Clubs, 4 Clubs, 7 Clubs, 9 Clubs, Q Hearts, 2 Diamonds]


Hand 0:27 cards

    [Q Clubs, 7 Hearts, Q Hearts, 8 Diamonds, 4 Clubs, K Diamonds, 8 Spades, K Diamonds, J Spades, 10 Clubs, A Clubs, 7 Hearts, 6 Spades, 3 Spades, J Clubs, Q Diamonds, 9 Clubs, 6 Diamonds, 6 Clubs, 10 Spades, 3 Hearts, 3 Clubs, 4 Clubs, 7 Clubs, 9 Clubs, Q Hearts, 2 Diamonds]


Remain:81 cards

    [A Diamonds, 8 Clubs, 6 Diamonds, 8 Diamonds, K Spades, 6 Clubs, K Spades, 10 Diamonds, 6 Hearts, 2 Spades, J Spades, J Hearts, A Diamonds, 10 Hearts, 3 Clubs, J Diamonds, 2 Hearts, 3 Spades, 8 Hearts, J Clubs, 4 Spades, A Hearts, K Hearts, Joker #1, 5 Diamonds, 10 Hearts, 5 Clubs, 4 Diamonds, A Clubs, J Hearts, A Spades, 7 Spades, 7 Diamonds, 3 Diamonds, 7 Spades, 4 Hearts, 7 Clubs, 5 Diamonds, A Hearts, Q Spades, Joker #1, A Spades, J Diamonds, K Hearts, 9 Spades, 4 Spades, 9 Diamonds, 9 Hearts, Joker #1, 5 Hearts, Q Clubs, K Clubs, 9 Diamonds, 5 Spades, 9 Hearts, 5 Clubs, 2 Clubs, 5 Spades, 8 Clubs, 8 Spades, 9 Spades, 2 Diamonds, 10 Clubs, 3 Hearts, 5 Hearts, K Clubs, 3 Diamonds, 10 Diamonds, Q Spades, 2 Clubs, 4 Diamonds, 6 Spades, Joker #1, 6 Hearts, 4 Hearts, 2 Hearts, 8 Hearts, 2 Spades, 7 Diamonds, 10 Spades, Q Diamonds]

==============================================

After shuffle:81 cards

    [J Spades, 3 Hearts, 10 Spades, 3 Spades, J Diamonds, Q Spades, 8 Hearts, 2 Diamonds, 9 Diamonds, 10 Clubs, K Spades, 5 Diamonds, 6 Hearts, 4 Diamonds, 9 Spades, 6 Spades, Q Clubs, A Clubs, A Diamonds, 9 Hearts, J Diamonds, 2 Spades, 7 Diamonds, 8 Clubs, 4 Diamonds, 9 Hearts, 9 Diamonds, 7 Spades, 5 Hearts, 10 Diamonds, J Clubs, Q Spades, 10 Diamonds, Joker #1, 5 Spades, 9 Spades, 8 Diamonds, 5 Diamonds, 2 Spades, 4 Hearts, 10 Hearts, 4 Spades, 6 Diamonds, A Diamonds, 2 Hearts, J Hearts, 5 Clubs, 3 Diamonds, 3 Diamonds, Q Diamonds, 3 Clubs, K Spades, 2 Clubs, 7 Diamonds, 2 Clubs, A Spades, 4 Hearts, 7 Spades, Joker #1, 10 Hearts, A Hearts, 4 Spades, 8 Spades, K Hearts, 6 Clubs, 7 Clubs, K Hearts, K Clubs, 5 Spades, 5 Hearts, 6 Hearts, 2 Hearts, A Spades, 8 Hearts, J Hearts, Joker #1, A Hearts, 8 Clubs, Joker #1, 5 Clubs, K Clubs]


Hand 1:27 cards

    [2 Clubs, A Spades, 4 Hearts, 7 Spades, Joker #1, 10 Hearts, A Hearts, 4 Spades, 8 Spades, K Hearts, 6 Clubs, 7 Clubs, K Hearts, K Clubs, 5 Spades, 5 Hearts, 6 Hearts, 2 Hearts, A Spades, 8 Hearts, J Hearts, Joker #1, A Hearts, 8 Clubs, Joker #1, 5 Clubs, K Clubs]


Remain:54 cards

    [J Spades, 3 Hearts, 10 Spades, 3 Spades, J Diamonds, Q Spades, 8 Hearts, 2 Diamonds, 9 Diamonds, 10 Clubs, K Spades, 5 Diamonds, 6 Hearts, 4 Diamonds, 9 Spades, 6 Spades, Q Clubs, A Clubs, A Diamonds, 9 Hearts, J Diamonds, 2 Spades, 7 Diamonds, 8 Clubs, 4 Diamonds, 9 Hearts, 9 Diamonds, 7 Spades, 5 Hearts, 10 Diamonds, J Clubs, Q Spades, 10 Diamonds, Joker #1, 5 Spades, 9 Spades, 8 Diamonds, 5 Diamonds, 2 Spades, 4 Hearts, 10 Hearts, 4 Spades, 6 Diamonds, A Diamonds, 2 Hearts, J Hearts, 5 Clubs, 3 Diamonds, 3 Diamonds, Q Diamonds, 3 Clubs, K Spades, 2 Clubs, 7 Diamonds]

==============================================

After shuffle:54 cards

    [6 Diamonds, 4 Spades, A Clubs, 2 Spades, 5 Clubs, 10 Clubs, 9 Spades, 5 Hearts, A Diamonds, A Diamonds, 5 Diamonds, Q Spades, 8 Hearts, 10 Hearts, K Spades, 2 Diamonds, 9 Diamonds, 10 Spades, 3 Diamonds, 6 Spades, J Diamonds, Q Clubs, 6 Hearts, 4 Diamonds, 8 Clubs, 7 Diamonds, 4 Diamonds, Q Diamonds, J Clubs, 10 Diamonds, 9 Diamonds, 4 Hearts, 3 Diamonds, 3 Clubs, 8 Diamonds, 9 Hearts, 2 Spades, 7 Diamonds, 7 Spades, 5 Spades, J Spades, J Hearts, 3 Spades, 5 Diamonds, J Diamonds, Q Spades, 9 Spades, K Spades, 10 Diamonds, 3 Hearts, Joker #1, 2 Clubs, 2 Hearts, 9 Hearts]


Hand 2:27 cards

    [Q Diamonds, J Clubs, 10 Diamonds, 9 Diamonds, 4 Hearts, 3 Diamonds, 3 Clubs, 8 Diamonds, 9 Hearts, 2 Spades, 7 Diamonds, 7 Spades, 5 Spades, J Spades, J Hearts, 3 Spades, 5 Diamonds, J Diamonds, Q Spades, 9 Spades, K Spades, 10 Diamonds, 3 Hearts, Joker #1, 2 Clubs, 2 Hearts, 9 Hearts]


Remain:27 cards

    [6 Diamonds, 4 Spades, A Clubs, 2 Spades, 5 Clubs, 10 Clubs, 9 Spades, 5 Hearts, A Diamonds, A Diamonds, 5 Diamonds, Q Spades, 8 Hearts, 10 Hearts, K Spades, 2 Diamonds, 9 Diamonds, 10 Spades, 3 Diamonds, 6 Spades, J Diamonds, Q Clubs, 6 Hearts, 4 Diamonds, 8 Clubs, 7 Diamonds, 4 Diamonds]

==============================================

After shuffle:27 cards

    [A Clubs, 6 Hearts, 4 Diamonds, 8 Hearts, J Diamonds, 10 Clubs, 2 Spades, 7 Diamonds, Q Clubs, 4 Spades, 6 Spades, 2 Diamonds, Q Spades, 8 Clubs, 6 Diamonds, 5 Clubs, A Diamonds, 10 Spades, 4 Diamonds, 10 Hearts, 5 Hearts, 9 Diamonds, 9 Spades, 3 Diamonds, A Diamonds, 5 Diamonds, K Spades]


Hand 3:27 cards

    [A Clubs, 6 Hearts, 4 Diamonds, 8 Hearts, J Diamonds, 10 Clubs, 2 Spades, 7 Diamonds, Q Clubs, 4 Spades, 6 Spades, 2 Diamonds, Q Spades, 8 Clubs, 6 Diamonds, 5 Clubs, A Diamonds, 10 Spades, 4 Diamonds, 10 Hearts, 5 Hearts, 9 Diamonds, 9 Spades, 3 Diamonds, A Diamonds, 5 Diamonds, K Spades]


Remain:0 cards

    []

==============================================

After shuffle:0 cards

    []


Hand 4:27 cards
*** In catch block:PlayingCardException:Error Msg: Not enough cards to deal

************************************************

Loop # 1

Before shuffle:108 cards

    [Joker #1, Joker #1, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades, Joker #1, Joker #1, A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]

==============================================

After shuffle:108 cards

    [5 Hearts, 9 Spades, 10 Hearts, 4 Clubs, K Spades, 4 Spades, 6 Hearts, 9 Spades, Joker #1, K Clubs, 5 Spades, 4 Hearts, K Clubs, K Spades, Q Diamonds, Joker #1, Q Diamonds, 8 Clubs, 3 Spades, 3 Diamonds, 10 Hearts, J Clubs, 2 Clubs, 2 Diamonds, 9 Diamonds, 6 Diamonds, A Hearts, 10 Clubs, K Diamonds, A Diamonds, Q Clubs, A Hearts, 7 Clubs, 8 Hearts, 2 Diamonds, J Diamonds, 4 Spades, 2 Spades, A Spades, 3 Clubs, 8 Spades, Q Clubs, 9 Clubs, J Diamonds, J Hearts, 9 Diamonds, A Diamonds, 5 Clubs, Q Spades, 6 Diamonds, 10 Diamonds, 5 Clubs, 7 Clubs, 5 Diamonds, 3 Clubs, 9 Hearts, 8 Diamonds, 8 Hearts, 8 Diamonds, 5 Spades, Joker #1, 2 Hearts, 4 Diamonds, 6 Hearts, K Hearts, A Clubs, 3 Spades, Q Spades, 10 Spades, J Hearts, 5 Diamonds, J Clubs, 3 Diamonds, 7 Spades, 4 Diamonds, J Spades, 10 Diamonds, 8 Spades, 9 Clubs, K Hearts, 6 Spades, 3 Hearts, 2 Clubs, 9 Hearts, 3 Hearts, J Spades, 6 Clubs, 7 Diamonds, 7 Hearts, 4 Hearts, 7 Diamonds, Q Hearts, K Diamonds, 10 Spades, A Spades, 8 Clubs, 2 Spades, Q Hearts, 2 Hearts, 10 Clubs, A Clubs, 6 Spades, 6 Clubs, 7 Spades, 4 Clubs, Joker #1, 7 Hearts, 5 Hearts]


Hand 0:27 cards

    [3 Hearts, 2 Clubs, 9 Hearts, 3 Hearts, J Spades, 6 Clubs, 7 Diamonds, 7 Hearts, 4 Hearts, 7 Diamonds, Q Hearts, K Diamonds, 10 Spades, A Spades, 8 Clubs, 2 Spades, Q Hearts, 2 Hearts, 10 Clubs, A Clubs, 6 Spades, 6 Clubs, 7 Spades, 4 Clubs, Joker #1, 7 Hearts, 5 Hearts]


Remain:81 cards

    [5 Hearts, 9 Spades, 10 Hearts, 4 Clubs, K Spades, 4 Spades, 6 Hearts, 9 Spades, Joker #1, K Clubs, 5 Spades, 4 Hearts, K Clubs, K Spades, Q Diamonds, Joker #1, Q Diamonds, 8 Clubs, 3 Spades, 3 Diamonds, 10 Hearts, J Clubs, 2 Clubs, 2 Diamonds, 9 Diamonds, 6 Diamonds, A Hearts, 10 Clubs, K Diamonds, A Diamonds, Q Clubs, A Hearts, 7 Clubs, 8 Hearts, 2 Diamonds, J Diamonds, 4 Spades, 2 Spades, A Spades, 3 Clubs, 8 Spades, Q Clubs, 9 Clubs, J Diamonds, J Hearts, 9 Diamonds, A Diamonds, 5 Clubs, Q Spades, 6 Diamonds, 10 Diamonds, 5 Clubs, 7 Clubs, 5 Diamonds, 3 Clubs, 9 Hearts, 8 Diamonds, 8 Hearts, 8 Diamonds, 5 Spades, Joker #1, 2 Hearts, 4 Diamonds, 6 Hearts, K Hearts, A Clubs, 3 Spades, Q Spades, 10 Spades, J Hearts, 5 Diamonds, J Clubs, 3 Diamonds, 7 Spades, 4 Diamonds, J Spades, 10 Diamonds, 8 Spades, 9 Clubs, K Hearts, 6 Spades]

==============================================

After shuffle:81 cards

    [Q Clubs, 6 Diamonds, 4 Hearts, Joker #1, 9 Hearts, 5 Spades, Q Spades, 3 Clubs, 4 Clubs, 4 Spades, 6 Hearts, 10 Hearts, 8 Clubs, 7 Clubs, J Diamonds, A Hearts, 8 Hearts, 3 Spades, Q Diamonds, J Spades, 9 Diamonds, 3 Clubs, 4 Spades, 9 Spades, 2 Diamonds, A Diamonds, Q Diamonds, 10 Spades, Joker #1, K Hearts, A Spades, J Hearts, 5 Hearts, 6 Diamonds, 8 Diamonds, 10 Diamonds, 3 Diamonds, 10 Hearts, K Spades, 8 Diamonds, Q Clubs, 9 Clubs, 10 Diamonds, Joker #1, 5 Spades, 7 Clubs, J Clubs, 2 Clubs, 2 Hearts, J Clubs, 6 Hearts, 9 Diamonds, 9 Clubs, 5 Clubs, J Diamonds, Q Spades, K Spades, 5 Clubs, 2 Spades, 8 Hearts, J Hearts, A Diamonds, A Clubs, 6 Spades, 5 Diamonds, 3 Diamonds, 9 Spades, 8 Spades, 5 Diamonds, 4 Diamonds, 8 Spades, K Hearts, K Diamonds, 3 Spades, 4 Diamonds, 2 Diamonds, 10 Clubs, 7 Spades, K Clubs, A Hearts, K Clubs]


Hand 1:27 cards

    [J Diamonds, Q Spades, K Spades, 5 Clubs, 2 Spades, 8 Hearts, J Hearts, A Diamonds, A Clubs, 6 Spades, 5 Diamonds, 3 Diamonds, 9 Spades, 8 Spades, 5 Diamonds, 4 Diamonds, 8 Spades, K Hearts, K Diamonds, 3 Spades, 4 Diamonds, 2 Diamonds, 10 Clubs, 7 Spades, K Clubs, A Hearts, K Clubs]


Remain:54 cards

    [Q Clubs, 6 Diamonds, 4 Hearts, Joker #1, 9 Hearts, 5 Spades, Q Spades, 3 Clubs, 4 Clubs, 4 Spades, 6 Hearts, 10 Hearts, 8 Clubs, 7 Clubs, J Diamonds, A Hearts, 8 Hearts, 3 Spades, Q Diamonds, J Spades, 9 Diamonds, 3 Clubs, 4 Spades, 9 Spades, 2 Diamonds, A Diamonds, Q Diamonds, 10 Spades, Joker #1, K Hearts, A Spades, J Hearts, 5 Hearts, 6 Diamonds, 8 Diamonds, 10 Diamonds, 3 Diamonds, 10 Hearts, K Spades, 8 Diamonds, Q Clubs, 9 Clubs, 10 Diamonds, Joker #1, 5 Spades, 7 Clubs, J Clubs, 2 Clubs, 2 Hearts, J Clubs, 6 Hearts, 9 Diamonds, 9 Clubs, 5 Clubs]

==============================================

After shuffle:54 cards

    [Q Diamonds, 8 Clubs, Q Diamonds, 8 Diamonds, 5 Hearts, 3 Spades, 3 Clubs, 8 Hearts, Joker #1, 2 Hearts, J Clubs, 6 Hearts, 5 Spades, 4 Hearts, J Diamonds, K Spades, 9 Diamonds, 2 Diamonds, 6 Diamonds, A Spades, 9 Clubs, 6 Hearts, 3 Clubs, 10 Diamonds, 9 Spades, J Hearts, Q Spades, 10 Diamonds, 10 Hearts, 4 Clubs, A Diamonds, 8 Diamonds, 4 Spades, 3 Diamonds, 9 Hearts, 9 Diamonds, K Hearts, 9 Clubs, Joker #1, 7 Clubs, Joker #1, 5 Spades, J Clubs, 2 Clubs, 7 Clubs, Q Clubs, 10 Hearts, 6 Diamonds, Q Clubs, J Spades, 5 Clubs, A Hearts, 10 Spades, 4 Spades]


Hand 2:27 cards

    [10 Diamonds, 10 Hearts, 4 Clubs, A Diamonds, 8 Diamonds, 4 Spades, 3 Diamonds, 9 Hearts, 9 Diamonds, K Hearts, 9 Clubs, Joker #1, 7 Clubs, Joker #1, 5 Spades, J Clubs, 2 Clubs, 7 Clubs, Q Clubs, 10 Hearts, 6 Diamonds, Q Clubs, J Spades, 5 Clubs, A Hearts, 10 Spades, 4 Spades]


Remain:27 cards

    [Q Diamonds, 8 Clubs, Q Diamonds, 8 Diamonds, 5 Hearts, 3 Spades, 3 Clubs, 8 Hearts, Joker #1, 2 Hearts, J Clubs, 6 Hearts, 5 Spades, 4 Hearts, J Diamonds, K Spades, 9 Diamonds, 2 Diamonds, 6 Diamonds, A Spades, 9 Clubs, 6 Hearts, 3 Clubs, 10 Diamonds, 9 Spades, J Hearts, Q Spades]

==============================================

After shuffle:27 cards

    [9 Clubs, J Hearts, 5 Spades, 3 Clubs, 9 Diamonds, J Diamonds, J Clubs, Q Diamonds, 6 Diamonds, Joker #1, Q Spades, 6 Hearts, 8 Diamonds, 10 Diamonds, 2 Hearts, 4 Hearts, 9 Spades, 5 Hearts, 8 Clubs, 2 Diamonds, 3 Clubs, A Spades, 8 Hearts, K Spades, 6 Hearts, 3 Spades, Q Diamonds]


Hand 3:27 cards

    [9 Clubs, J Hearts, 5 Spades, 3 Clubs, 9 Diamonds, J Diamonds, J Clubs, Q Diamonds, 6 Diamonds, Joker #1, Q Spades, 6 Hearts, 8 Diamonds, 10 Diamonds, 2 Hearts, 4 Hearts, 9 Spades, 5 Hearts, 8 Clubs, 2 Diamonds, 3 Clubs, A Spades, 8 Hearts, K Spades, 6 Hearts, 3 Spades, Q Diamonds]


Remain:0 cards

    []

==============================================

After shuffle:0 cards

    []


Hand 4:27 cards
*** In catch block:PlayingCardException:Error Msg: Not enough cards to deal

- Sample output : java PJ4.VideoPoker

[A Hearts, 10 Hearts, Q Hearts, J Hearts, K Hearts]
Royal Flush!
-----------------------------------
[9 Hearts, 10 Hearts, Q Hearts, J Hearts, K Hearts]
Straight Flush!
-----------------------------------
[9 Hearts, 10 Hearts, Q Hearts, J Hearts, 8 Clubs]
Straight!
-----------------------------------
[9 Hearts, 10 Hearts, Q Hearts, J Hearts, 5 Hearts]
Flush!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, 8 Hearts]
Four of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, J Spades]
Three of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, J Diamonds, 8 Diamonds, J Spades]
Full House!
-----------------------------------
[8 Spades, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
Two Pairs!
-----------------------------------
[3 Diamonds, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
One Pair!
-----------------------------------
[3 Diamonds, 9 Diamonds, 3 Spades, 8 Diamonds, J Spades]
One Pair!
-----------------------------------
[3 Diamonds, 9 Diamonds, 6 Spades, 8 Diamonds, J Spades]
Sorry, you lost!
-----------------------------------

******************************************************************************************

$ java TestVideoPoker 1000


=> java TestVideoPoker 1000


Payout Table          Multiplier
=======================================
Royal Flush     |       1000
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       10
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
One Pair        |       1



-----------------------------------
Balance:$1000
Enter bet:200
Hand:[3 Diamonds, 9 Diamonds, K Clubs, 8 Hearts, J Clubs]
Enter positions of cards to replace (e.g. 1 4 5 ):        <---- keep all cards
Hand:[3 Diamonds, 9 Diamonds, K Clubs, 8 Hearts, J Clubs]
Sorry, you lost!

Your balance:$800, one more game (y or n)?y

Want to see payout table (y or n)y



Payout Table          Multiplier
=======================================
Royal Flush     |       1000
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       10
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
One Pair        |       1



-----------------------------------
Balance:$800
Enter bet:200
Hand:[A Clubs, 2 Clubs, 2 Spades, 4 Hearts, 4 Diamonds]
Enter positions of cards to replace (e.g. 1 4 5 ):1 4 5  <--- keep 2 3
Hand:[K Clubs, 2 Clubs, 2 Spades, Q Clubs, K Spades]
Two Pairs!

Your balance:$1000, one more game (y or n)?y

Want to see payout table (y or n)n
-----------------------------------
Balance:$1000
Enter bet:500
Hand:[6 Clubs, 2 Spades, 5 Spades, J Hearts, 2 Hearts]
Enter positions of cards to replace (e.g. 1 4 5 ):1 2 3 4 5 <---- replace all cards
Hand:[4 Hearts, 2 Diamonds, 10 Clubs, 7 Hearts, 3 Spades]
Sorry, you lost!

Your balance:$500, one more game (y or n)?n

Bye!