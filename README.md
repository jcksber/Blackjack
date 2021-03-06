#Blackjack
*A text-based Blackjack game with a dealer and one player (user)*

Blackjack is a simple Java application that I wrote for an AP Computer Science class, taken in high school.  It currently lacks a GUI, but contains all the correct logic and fun of an actual game of Blackjack (Five Card Charlie is even a way to win!)

***Note:*** A `.zip` download is also availble on [my site](http://jackkasbeer.co).

##How to Play

BlackJack is a card game in which the object of the game is to get closer to a hand value of 21 than the dealer.  The value of the cards is as follows:
- 2-10 are face value
- Jack-King are valued at 10
- Ace is valued as either 11 or 1 (based on hand)

Both the dealer and the player are originally dealt 2 cards each, but the dealer only shows one, while you show both.  To take another card, hit, if you are satisfied with your hand, stay, if you'd like to double your bet, you must take one card and one card only by doubling down.

The most basic way to win is by getting closer to 21 than the dealer without exceeding 21, but you may also win by:
- **BlackJack:** hand contains an ace and a card of value 10
- **Five Card Charlie:** obtaining five cards with a  value that is <= 21
- **Dealer bust:** dealer's hand exceeds 21

To play the game, simply follow the in-game instructions.

##Table of Contents

`src/card` contains source code for:
- Card
- CardTester
- Deck
- DeckTester
- Shoe
- ShoeTester\
- Hand
- HandTester
- Dealer
- Player
- GUI

`dist/javadoc` contains JavaDocs HTML

##Contributing
If you're interested in pulling this project, I'd love to accept your request! Make a GUI for it and push it through!

##Example Output

Welcome to Jack Kasbeer's BlackJack!<br>
*What is your name?*<br>
Jack<br>
Welcome to BlackJack, Jack!<br>
*How much money would you like to start with?*<br>
10000<br>
Please place a bet:<br>
500

**Dealer is showing:**<br>
Rank: King<br>
Suit: Clubs<br>
Numeric Value: 10

**Your Cards:**<br>
Rank: Ten<br>
Suit: Spades<br>
Numeric Value: 10

Rank: Nine<br>
Suit: Spades<br>
Numeric Value: 9<br>

Would you like to hit(1), stay(2), or double down(3)?<br>
2<br>

**YOUR HAND:**<br>
Rank: Ten<br>
Suit: Spades<br>
Numeric Value: 10

Rank: Nine<br>
Suit: Spades<br>
Numeric Value: 9

**DEALER'S HAND:**<br>
Rank: King<br>
Suit: Clubs<br>
Numeric Value: 10

Rank: Ten<br>
Suit: Diamonds<br>
Numeric Value: 10

**Dealer wins!**

Your current bank roll: 9500.0<br>
*Would you like to play again?* 1 for YES, 2 for NO.<br>
2

Thanks for playing!<br>

##Side notes
In the event of a tie, dealer wins.
You earn 1.5 times your bet if you have Blackjack or Double Down and win

##Known Bugs
My BlackJack is fairly solid, but you cannot enter in a String for starting amount of money.
There is also an issue with the Ace: every now and then it doesn't change value when you bust.

##Future additions
- Add "insurance" options
- Allow the user to "split" when they have a pair
- Graphic User Interface
- Multiple players in one game
- Play against your friends without an AI

##Highlights
***Note:*** *This section was part of my assignment for the class, and isn't really useful to someone interested in downloading the game.*

I still plan on finishing my GUI so that I can truly be proud of my game, but as of now I am proud of my use of try/catch methods because it solidifies the game.  I am also proud of my use of recursion because it is more efficient for try/catches and is more complex than what we've learned.
