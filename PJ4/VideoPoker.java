package PJ4;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Ref: http://en.wikipedia.org/wiki/Video_poker
 *      http://www.freeslots.com/poker.htm
 *
 *
 * Short Description and Poker rules:
 *
 * Video poker is also known as draw poker. 
 * The dealer uses a 52-card deck, which is played fresh after each playerHand. 
 * The player is dealt one five-card poker playerHand. 
 * After the first draw, which is automatic, you may hold any of the cards and draw 
 * again to replace the cards that you haven't chosen to hold. 
 * Your cards are compared to a table of winning combinations. 
 * The object is to get the best possible combination so that you earn the highest 
 * payout on the bet you placed. 
 *
 * Winning Combinations
 *  
 * 1. One Pair: one pair of the same card
 * 2. Two Pair: two sets of pairs of the same card denomination. 
 * 3. Three of a Kind: three cards of the same denomination. 
 * 4. Straight: five consecutive denomination cards of different suit. 
 * 5. Flush: five non-consecutive denomination cards of the same suit. 
 * 6. Full House: a set of three cards of the same denomination plus 
 * 	a set of two cards of the same denomination. 
 * 7. Four of a kind: four cards of the same denomination. 
 * 8. Straight Flush: five consecutive denomination cards of the same suit. 
 * 9. Royal Flush: five consecutive denomination cards of the same suit, 
 * 	starting from 10 and ending with an ace
 *
 */


/* This is the video poker game class.
 * It uses Decks and Card objects to implement video poker game.
 * Please do not modify any data fields or defined methods
 * You may add new data fields and methods
 * Note: You must implement defined methods
 */



public class VideoPoker {

    // default constant values
    private static final int startingBalance=100;
    private static final int numberOfCards=5;

    // default constant payout value and playerHand types
    private static final int[] multipliers={1,2,3,5,6,10,25,50,1000};
    private static final String[] goodHandTypes={ 
	  "One Pair" , "Two Pairs" , "Three of a Kind", "Straight", "Flush	", 
	  "Full House", "Four of a Kind", "Straight Flush", "Royal Flush" };

    // must use only one deck
    private final Decks oneDeck;

    // holding current poker 5-card hand, balance, bet    
    private List<Card> playerHand;
    private int playerBalance;
    private int playerBet;
    
    private boolean keepPlaying = true;
    private int multiplierIndex = 9;

    /** default constructor, set balance = startingBalance */
    public VideoPoker()
    {
	this(startingBalance);
    }

    /** constructor, set given balance */
    public VideoPoker(int balance)
    {
	this.playerBalance= balance;
        oneDeck = new Decks(1, false);
    }

    /** This display the payout table based on multipliers and goodHandTypes arrays */
    private void showPayoutTable()
    { 
	System.out.println("\n\n");
	System.out.println("Payout Table   	      Multiplier   ");
	System.out.println("=======================================");
	int size = multipliers.length;
	for (int i=size-1; i >= 0; i--) {
		System.out.println(goodHandTypes[i]+"\t|\t"+multipliers[i]);
	}
	System.out.println("\n\n");
    }

    /** Check current playerHand using multipliers and goodHandTypes arrays
     *  Must print yourHandType (default is "Sorry, you lost") at the end of function.
     *  This can be checked by testCheckHands() and main() method.
     */
    private void checkHands()
    {
        // implement this method!
        this.multiplierIndex = 9;
        
        if (this.royalFlush()) {
            this.multiplierIndex = 8;
        } else if (this.straightFlush()) {
            this.multiplierIndex = 7;
        } else if (this.fourOfAKind()) {
            this.multiplierIndex = 6;
        } else if (this.fullHouse()) {
            this.multiplierIndex = 5;
        } else if (this.flush()) {
            this.multiplierIndex = 4;
        } else if (this.straight()) {
            this.multiplierIndex = 3;
        } else if (this.threeOfAKind()) {
            this.multiplierIndex = 2;
        } else if (this.twoPairs()) {
            this.multiplierIndex = 1;
        } else if (this.onePair()) {
            this.multiplierIndex = 0;
        } else {
            this.multiplierIndex = 9;
        }
        
        if (this.multiplierIndex <= 8) {
            System.out.println(this.goodHandTypes[this.multiplierIndex].replaceAll("\\s+$", "") + "!");
        } else {
            System.out.println("Sorry, you lost!");
        }
    }

    /*************************************************
     *   add new private methods here ....
     *
     *************************************************/

    private void placeBet() {
        Scanner input = new Scanner(System.in);
        boolean canBet = true;
        do {
            System.out.print("Enter bet:\t$");
            this.playerBet = input.nextInt();
            canBet = this.playerBet <= this.playerBalance && this.playerBet > 0;
        } while (!canBet);
        this.playerBalance -= this.playerBet;
    }
    
    private void replaceHand() {
        Scanner input = new Scanner(System.in);
        boolean keepAsking = true;
        
        while (keepAsking) {
            keepAsking = false;
            // Copy of user's hand
            List handBackup = new ArrayList<Card>(this.playerHand);
            System.out.print("Enter positions of cards to replace (e.g. 1 4 5): ");
            String line = input.nextLine();
            // Remove cards
            if (!line.isEmpty()) {
                String[] split = line.trim().split("\\s+");
                if (split.length <= 5 && split.length > 0) {
                    try {
                        for (int i = 0; i < split.length; i++) {
                            // Offset by 1 and i (card position changes each iteration)
                            int cardPosition = Integer.parseInt(split[i]) - 1 - i;
                            this.playerHand.remove(cardPosition);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        // If user enters something like "4 20" then the 4th card is recovered
                        keepAsking = true;
                        this.playerHand = handBackup;
                    }
                } else {
                    keepAsking = true;
                }
            }
            // Draw new cards from deck after removing selected cards
            if (this.playerHand.size() < 5) {
                try {
                    this.playerHand.addAll(this.oneDeck.deal(5 - this.playerHand.size()));
                } catch (PlayingCardException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    private void updateBalance() {
        if (this.multiplierIndex <= 8 && this.multiplierIndex >= 0) {
            this.playerBalance += this.playerBet * this.multipliers[multiplierIndex];
        }
    }
    
    private boolean playAgain() {
        Scanner input = new Scanner(System.in);
        boolean keepAsking = true;
        boolean retData = true;
        while (keepAsking) {
            System.out.print("One more game (y or n)?: ");
            String response = input.next();
            if (response.equalsIgnoreCase("y")) {
                keepAsking = false;
                retData = true;
            } else if (response.equalsIgnoreCase("n")) {
                keepAsking = false;
                retData = false;
                this.keepPlaying = false;
            }
        }
        return retData;
    }
    
    private void askPayoutTable() {
        Scanner input = new Scanner(System.in);
        boolean keepAsking = true;
        boolean showTable = false;
        while (keepAsking) {
            System.out.print("Want to see payout table (y or n)?: ");
            String response = input.next();
            if (response.equalsIgnoreCase("y")) {
                keepAsking = false;
                showTable = true;
            } else if (response.equalsIgnoreCase("n")) {
                keepAsking = false;
                showTable = false;
            }
        }
        if (showTable) {
            this.showPayoutTable();
        }
    }
    
    private void sortHand() {
        // Temporary hands for sorted cards
        List<Card> sortRank = new ArrayList<Card>();
        List<Card> sortSuit = new ArrayList<Card>();
        
        // Sorts hand by rank first
        for (int i = 0; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    sortRank.add(this.playerHand.get(j));
                }
            }
        }
        
        // Sort hand by suit if cards are same rank
        for (int i = 0; i <= 13; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k < 5; k++) {
                    if (sortRank.get(k).getRank() == i && sortRank.get(k).getSuit() == j) {
                        sortSuit.add(sortRank.get(k));
                    }
                }
            }
        }
        
        // Replace old hand with fully sorted hand
        this.playerHand.clear();
        this.playerHand = sortSuit;
    }
    
    
    // Poker hands //////////////////////////////////////////
    private boolean royalFlush() {
        // Ace-high straight flush
        // All cards must have same suit and consecutive rank from 10 to A
        int suitTracker = this.playerHand.get(0).getSuit();
        int suitCounter = 1;
        boolean flush = false;
        
        int cardCounter = 1;
        boolean straight = false;
        boolean ace = false;
        
        // Flush
        for (int i = 1; i < 5; i++) {
            if (this.playerHand.get(i).getSuit() == suitTracker) {
                suitCounter++;
            }
        }
        
        // Find ace
        for (int i = 0; i < 5; i++) {
            if (this.playerHand.get(i).getRank() == 1) {
                ace = true;
            }
        }
        
        // Straight
        for (int i = 10; i <= 13; i++) {
            firstPointer:
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (this.playerHand.get(j).getRank() == i && this.playerHand.get(k).getRank() == i + 1) {
                        cardCounter++;
                        break firstPointer;
                    }
                }
            }
        }
        
        flush = suitCounter == 5;
        straight = cardCounter == 4;
        return flush && straight && ace;
    }
    
    private boolean straightFlush() {
        // All cards must have same suit and consecutive rank
        int suitTracker = this.playerHand.get(0).getSuit();
        int suitCounter = 1;
        boolean flush = false;
        
        int cardCounter = 1;
        boolean straight = false;
        
        // Flush
        for (int i = 1; i < 5; i++) {
            if (this.playerHand.get(i).getSuit() == suitTracker) {
                suitCounter++;
            }
        }
        
        // Straight
        for (int i = 1; i <= 13; i++) {
            firstPointer:
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (this.playerHand.get(j).getRank() == i && this.playerHand.get(k).getRank() == i + 1) {
                        cardCounter++;
                        break firstPointer;
                    }
                }
            }
        }
        
        flush = suitCounter == 5;
        straight = cardCounter == 5;
        return flush && straight;
    }
    
    private boolean fourOfAKind() {
        // Four cards in the hand have same rank
        int rankCounter = 0;
        
        outerLoop:
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                    if (rankCounter == 4) {
                        break outerLoop;
                    }
                }
            }
            rankCounter = 0;
        }
        
        return rankCounter == 4;
    }
    
    private boolean fullHouse() {
        // Both three of a kind and one pair in a hand
        int rankCounter = 0;
        
        // Three of a kind
        boolean triple = false;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                }
            }
            if (rankCounter == 3) {
                triple = true;
                break;
            }
            rankCounter = 0;
        }
        
        // Pair
        boolean pair = false;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                }
            }
            if (rankCounter == 2) {
                pair = true;
                break;
            }
            rankCounter = 0;
        }
        
        return triple && pair;
    }
    
    private boolean flush() {
        // All cards must have same suit
        int suitTracker = this.playerHand.get(0).getSuit();
        int suitCounter = 1;
        
        for (int i = 1; i < 5; i++) {
            if (this.playerHand.get(i).getSuit() == suitTracker) {
                suitCounter++;
            }
        }
        
        return suitCounter == 5;
    }
    
    private boolean straight() {
        // 5 cards of consecutive rank
        int cardCounter = 1;
        boolean straight = false;
        boolean ace = false;
        
        // Straight
        for (int i = 1; i <= 13; i++) {
            firstPointer:
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (this.playerHand.get(j).getRank() == i && this.playerHand.get(k).getRank() == i + 1) {
                        cardCounter++;
                        break firstPointer;
                    }
                }
            }
        }
        
        // Find ace
        for (int i = 0; i < 5; i++) {
            if (this.playerHand.get(i).getRank() == 1) {
                ace = true;
                break;
            }
        }
        
        if (ace) {
            straight = cardCounter == 4;
        } else {
            straight = cardCounter == 5;
        }
        return (straight) || (straight && ace);
    }
    
    private boolean threeOfAKind() {
        // Three cards in the hand have same rank
        int rankCounter = 0;
        
        outerLoop:
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                    if (rankCounter == 3) {
                        break outerLoop;
                    }
                }
            }
            rankCounter = 0;
        }
        
        return rankCounter == 3;
    }
    
    private boolean twoPairs() {
        // Two pairs of cards that have same rank
        int rankCounter = 0;
        int pairCounter = 0;
        
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                    if (rankCounter == 2) {
                        pairCounter++;
                        break;
                    }
                }
            }
            rankCounter = 0;
        }
        
        return pairCounter == 2;
    }
    
    private boolean onePair() {
        // Two cards in hand have same rank
        int rankCounter = 0;
        
        outerLoop:
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.playerHand.get(j).getRank() == i) {
                    rankCounter++;
                    if (rankCounter == 2) {
                        break outerLoop;
                    }
                }
            }
            rankCounter = 0;
        }
        
        return rankCounter == 2;
    }
    /////////////////////////////////////////////////////////

    public void play() 
    {
    /** The main algorithm for single player poker game 
     *
     * Steps:
     * 		showPayoutTable()
     *
     * 		++	
     * 		show balance, get bet 
     *		verify bet value, update balance
     *		reset deck, shuffle deck, 
     *		deal cards and display cards
     *		ask for positions of cards to replace 
     *          get positions in one input line
     *		update cards
     *		check hands, display proper messages
     *		update balance if there is a payout
     *		if balance = O:
     *			end of program 
     *		else
     *			ask if the player wants to play a new game
     *			if the answer is "no" : end of program
     *			else : showPayoutTable() if user wants to see it
     *			goto ++
     */

        // implement this method!
        this.showPayoutTable();
        
        this.playerHand = new ArrayList<Card>();
        while (this.keepPlaying) {
            System.out.println("-----------------------------------\n");
            System.out.println("Balance:\t$" + this.playerBalance);
            this.placeBet();
            
            this.oneDeck.reset();
            this.oneDeck.shuffle();
            
            try {
                this.playerHand = new ArrayList<Card>(this.oneDeck.deal(5));
            } catch (PlayingCardException e) {
                e.printStackTrace();
            }
            
            // Hand is sorted before printed
            this.sortHand();
            System.out.println("Hand: " + this.playerHand);
            this.replaceHand();
            this.sortHand();
            System.out.println("Hand: " + this.playerHand);
            
            this.checkHands();
            this.updateBalance();
            this.playerBet = 0;
            this.playerHand.clear();
            
            System.out.print("\nYour balance:\t$" + this.playerBalance + "\n");
            
            if (this.playerBalance <= 0) {
                this.keepPlaying = false;
                System.out.println("Insufficient balance");
            } else if (this.playAgain()) {
                this.askPayoutTable();
            }
        }
        System.out.println("\nBye!");
    }

    /*************************************************
     *   Do not modify methods below
    /*************************************************

    /** testCheckHands() is used to test checkHands() method 
     *  checkHands() should print your current hand type
     */ 

    public void testCheckHands()
    {
      	try {
    		playerHand = new ArrayList<Card>();

		// set Royal Flush
		playerHand.add(new Card(3,1));
		playerHand.add(new Card(3,10));
		playerHand.add(new Card(3,12));
		playerHand.add(new Card(3,11));
		playerHand.add(new Card(3,13));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Straight Flush
		playerHand.set(0,new Card(3,9));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Straight
		playerHand.set(4, new Card(1,8));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Flush 
		playerHand.set(4, new Card(3,5));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// "Royal Pair" , "Two Pairs" , "Three of a Kind", "Straight", "Flush	", 
	 	// "Full House", "Four of a Kind", "Straight Flush", "Royal Flush" };

		// set Four of a Kind
		playerHand.clear();
		playerHand.add(new Card(4,8));
		playerHand.add(new Card(1,8));
		playerHand.add(new Card(4,12));
		playerHand.add(new Card(2,8));
		playerHand.add(new Card(3,8));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Three of a Kind
		playerHand.set(4, new Card(4,11));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Full House
		playerHand.set(2, new Card(2,11));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set Two Pairs
		playerHand.set(1, new Card(2,9));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set One Pair
		playerHand.set(0, new Card(2,3));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set One Pair
		playerHand.set(2, new Card(4,3));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");

		// set no Pair
		playerHand.set(2, new Card(4,6));
		System.out.println(playerHand);
    		checkHands();
		System.out.println("-----------------------------------");
      	}
      	catch (Exception e)
      	{
		System.out.println(e.getMessage());
      	}
    }

    /* Quick testCheckHands() */
    public static void main(String args[]) 
    {
	VideoPoker pokergame = new VideoPoker();
	pokergame.testCheckHands();
    }
}
