#Blackjack
*A text-based Blackjack game with a dealer and one player (user)*

'Blackjack' is a simple Java application that I wrote for an AP Computer Science class, taken in high school.  It currently lacks a GUI, but contains all the correct logic and fun of an actual game of Blackjack (Five Card Charlie is even a way to win!)

##How to Play

BlackJack is a card game in which the object of the game is to get closer to a hand value of 21 than the dealer.  The value of the cards is as follows:
Two - Ten are face value
Jack - King are valued at 10
Ace is valued as either 11 or 1 (based on hand)

Both the dealer and the player are originally dealt 2 cards each, but the dealer only shows one, while you show both.  To take another card, hit, if you are satisfied with your hand, stay, if you'd like to double your bet, you must take one card and one card only by doubling down.

The most basic way to win is by getting closer to 21 than the dealer without exceeding 21, but you may also win by:
BlackJack- hand contains an ace and a card of value 10
Five Card Charlie- obtaining five cards with a  value that is <= 21
Dealer bust- dealer's hand exceeds 21

To play the game, simply follow the in-game instructions.

##Table of Contents

src/card contains source code for:\
- Card\
- CardTester\
- Deck\
- DeckTester\
- Shoe\
- ShoeTester\
- Hand\
- HandTester\
- Dealer\
- Player\
- GUI\
README file contains instructions and table of contents\
dist/javadoc contains JavaDocs HTML\
\

\b OUTPUT
\b0 \
\

\b Run 1:
\b0 \
Welcome to Jack Kasbeer's BlackJack!\
What is your name?\
Jack\
Welcome to BlackJack, Jack!\
How much money would you like to start with?\
10000\
Please place a bet:\
500\
Dealer is showing:\
\
Rank: King\
Suit: Clubs\
Numeric Value: 10\
\
\
Your Cards:\
\
Rank: Ten\
Suit: Spades\
Numeric Value: 10\
\
Rank: Nine\
Suit: Spades\
Numeric Value: 9\
\
Would you like to hit(1), stay(2), or double down(3)?\
2\
YOUR HAND:\
\
Rank: Ten\
Suit: Spades\
Numeric Value: 10\
\
Rank: Nine\
Suit: Spades\
Numeric Value: 9\
\
DEALER'S HAND:\
\
Rank: King\
Suit: Clubs\
Numeric Value: 10\
\
Rank: Ten\
Suit: Diamonds\
Numeric Value: 10\
\
Dealer wins!\
\
Your current bank roll: 9500.0\
Would you like to play again? 1 for YES, 2 for NO.\
2\
Thanks for playing!\
\

\b Run 2:
\b0 \
Welcome to Jack Kasbeer's BlackJack!\
What is your name?\
Jake\
Welcome to BlackJack, Jake!\
How much money would you like to start with?\
10000000\
Please place a bet:\
200098.4\
Dealer is showing:\
\
Rank: Five\
Suit: Diamonds\
Numeric Value: 5\
\
\
Your Cards:\
\
Rank: Jack\
Suit: Clubs\
Numeric Value: 10\
\
Rank: Eight\
Suit: Diamonds\
Numeric Value: 8\
\
Would you like to hit(1), stay(2), or double down(3)?\
1\
YOUR HAND: \
\
Rank: Jack\
Suit: Clubs\
Numeric Value: 10\
\
Rank: Eight\
Suit: Diamonds\
Numeric Value: 8\
\
Rank: Five\
Suit: Clubs\
Numeric Value: 5\
\
Bust!\
\
Your current bank roll: 9799901.6\
Would you like to play again? 1 for YES, 2 for NO.\
1\
Please place a bet:\
78.99999\
Dealer is showing:\
\
Rank: Four\
Suit: Diamonds\
Numeric Value: 4\
\
\
Your Cards:\
\
Rank: Six\
Suit: Hearts\
Numeric Value: 6\
\
Rank: Three\
Suit: Diamonds\
Numeric Value: 3\
\
Would you like to hit(1), stay(2), or double down(3)?\
3\
YOUR HAND:\
\
Rank: Six\
Suit: Hearts\
Numeric Value: 6\
\
Rank: Three\
Suit: Diamonds\
Numeric Value: 3\
\
Rank: Two\
Suit: Hearts\
Numeric Value: 2\
\
\
DEALER'S HAND:\
\
Rank: Four\
Suit: Diamonds\
Numeric Value: 4\
\
Rank: Eight\
Suit: Diamonds\
Numeric Value: 8\
\
Rank: Five\
Suit: Clubs\
Numeric Value: 5\
\
Dealer wins!\
\
Your current bank roll: 9799743.600019999\
Would you like to play again? 1 for YES, 2 for NO.\
2\
Thanks for playing!\
\

\b SIDE NOTES
\b0 \
\
In the event of a tie, dealer wins\
You earn 1.5 times your bet if you have Blackjack or Double Down and win\
\

\b KNOWN BUGS\
\

\b0 My BlackJack is fairly solid, but you cannot enter in a String for starting amount of money.\
There is also an issue with the Ace, every now and then it doesn't change value when you bust.\
Insurance is not an option\
\

\b HIGHLIGHTS\
\

\b0 I still plan on finishing my GUI so that I can truly be proud of my game, but as of now I am proud of my use of try/catch methods because it solidifies the game.  I am also proud of my use of recursion because it is more efficient for try/catches and is more complex than what we've learned.  I think that I deserve a 95% on this project because I didn't do insurance, but it is a clean text-based display with minimal bugs.}
