public class Concentration {

   // newBoard() should return a new Board that is already set up to play concentration.
   // IE, make, shuffle, deal a deck. Etc
   public static Board newBoard(){
       // Complete this code.
       Board b = new Board();
       Deck d = new Deck();
       b.fillBoard(d);
       return b;
   }
   // Things to consider:
   // Keep track of whose turn it is, playerA or B.
   // Keep track of score = number of matches.
   // Play as long as there are cards on the board.
   // If player matches, they get to go again.
   public static void play() {
       // Complete this code.
       int ab = 1; // playerA’s turn if 1
       int Playera = 0;
       int Playerb = 0;
       String input = "";
       int r = 0;
       int c = 0;
       int ro = 0;
       int co = 0;
       boolean matched = false;
       Card c1 = new Card();
       Card c2 = new Card();
       Scanner in = new Scanner(System.in);
       while(b.openSpots() != 0) {
           System.out.println("Enter row and column of card, the two numbers separated by comma");
           if(ab == 1) {
               input = in.nextLine();
               r = Integer.parseInt(input.substring(0,1));
               c = Integer.parseInt(input.substring(1,2));
               c1 = b.get(r,c);
               System.out.println("Enter row and column of second card, the two numbers separated by comma");
               input = in.nextLine();
               r1 = Integer.parseInt(input.substring(0,1));
               co = Integer.parseInt(input.substring(1,2));
               c2 = b.get(r,c);
               if(c1.equals(c2) == true) {
                   matched = true;
                   Playera += 10;
                   b.remove(r,c);
                   b.remove(ro,co);
                   System.out.println("You got a match! Plus 10 points");
               }
               if(matched == true) {
                   ab = 1;
                   matched = false;
               }
           }
           if(ab == 0) {
               input = in.nextLine();
               r = Integer.parseInt(input.substring(0,1));
               c = Integer.parseInt(input.substring(1,2));
               c1 = b.get(r,c);
               System.out.println("Enter row and column of second card, the two numbers separated by comma");
               input = in.nextLine();
               ro = Integer.parseInt(input.substring(0,1));
               co = Integer.parseInt(input.substring(1,2));
               c2 = b.get(r,c);
               if(c1.equals(c2) == true) {
                   matched = true;
                   Playerb += 10;
                   b.remove(r,c);
                   b.remove(ro,co);
                   System.out.println("You got a match! Plus 10 points");
               }
               if(matched == true) {
                   ab = 0;
                   matched = false;
               }
           }
       }
   } // end play()
   public static void pressEnterToContinue(){
       // Complete this code.
       System.out.println("Press Enter to continue");
       try { System.in.read();}
       catch(Exception e){    e.printStackTrace();}
   }
}


class Board {
   // Instance variables
   private Card[][] board;
   private boolean[][] isHidden;
   // Constructors
   public Board(){
       // Complete this code
       for(int x = 0; x <= 6; x++) {
           for(int y = 0; y <= 7; y++) {
               isHidden[x][y] = true;
           }
       }
   }
   public Board(int rows, int columns){
       // Complete this code.
       for(int x = 0; x <= rows; x++) {
           for(int y = 0; y <= columns; y++) {
               isHidden[x][y] = true;
           }
       }
   }
   // Nonstatic methods
   public void printBoard(){
       // Print board with row col headers
       // You may assume board is set up.

       // Complete this code.
       for(int r = 0; r <= board.length; r++) {
           System.out.print(r + "\t");
           System.out.print("\n");
       }
       for(int r = 0; r <= board.length; r++) {
           System.out.print(r);
           for(int c = 0; c <= board[r].length; c++) {
               if(isHidden[r][c] == true) System.out.print("??\t");
               else System.out.print(board[r][c].toString() + "\t");
           }
           System.out.println();
       }

   }
   // Place cards from argument Deck d onto the Board, left to right, top down.
   // If the Board is bigger than the deck, then you should have null in empty spots.
   // If the Board is smaller than the deck, then you should stop placing cards
   // after the last spot.
   public void fillBoard(Deck d){
       // Complete this code.
       int index = 0;
       d.shuffle();
       for(int r = 0; r <= board.length; r++) {
           for(int c = 0; c <= board[r].length; c++) {
               board[r][c] = d[index++];
               if(index > 52) board[r][c] = null;
           }
       }
   }
   // Set all cards face up. This method does not print anything.
   public void unhide(){
       // Complete this code.
       for(int x = 0; x <= 6; x++) {
           for(int y = 0; y <= 7; y++) {
               isHidden[x][y] = false;
           }
       }
   }
   // Set one card face up
   public void unhide(int row, int column){
       // Complete this code.
       isHidden[row][column] = false;
   }
   // Set all cards face down. This method does not print anything.
   public void hide(){
       // Complete this code.
       for(int x = 0; x <= 6; x++) {
           for(int y = 0; y <= 7; y++) {
               isHidden[x][y] = true;
           }
       }
   }
   // Set one card face down.
   public void hide(int row, int column){
       // Complete this code.
       isHidden[row][column] = true;
   }
   // Place argument Card c onto the Board at spot row,column.
   public void place(Card c, int row, int column){
       // Complete this code.
       board[row][column] = c;
   }
   // Return a pointer to the card at spot row,column on the Board.
   // Do not remove the card from the Board.
   public Card get(int row, int column){
       // Complete this code.
       return board[row][column];
   }
   // Return a pointer to the card at spot row,column on the Board.
   // Remove the card from the Board.
   public Card remove(int row, int column){
       // Complete this code.
       Card c = board[row][column];
       board[row][column] = null;
       return c;
   }
   // Count the number of open spots on the Board.
   // Open = no card is placed at that spot.
   public int openSpots(){
       // Complete this code.
       int full = 0;
       for(int r = 0; r <= board.length; r++) {
           for(int c = 0; c <= board[r].length; c++) {
               if(board[r][c] != null) full++;
           }
       }
       return full;
   }
}

import java.util.Random;
public class Deck {
   // Instance variables
   private Card[] cards = new Card[52];
   // This is your deck position telling you which cards have been dealt.
   private int nextCard = 0;
   // Constructors. Create the actual 52 cards, AS-KD
   public Deck(){
       // Complete this code.
	int index = 0;
for(int f = 1; f <= 13; f++) {
		for(int s = 1; s <= 4; s++) {
			cards[index] = new Card(f,s);
			index++
		}
	}
   }
   // Nonstatic methods
   public void shuffle(){
       Random rand = new Random();
       // This is how you get a random int 0-9.
       int randomIndex= rand.nextInt(10);
	int nextcard = rand.nextInt(10);
       // Shuffle Algorithm: Go through each card in the deck
       // and swap it with a card in a random spot.
       // Complete this code.
	Card holder = cards[nextcard];
	cards[nextcard] = cards[randomIndex];
	cards[randomIndex] = holder

   }
   // Print out each 2 character card on the same line separated by a single space.
   public void print(){
       // Complete this code.
	int index = 1
	for(int f = 1; f <= 13; f++) {
		for(int s = 1; s <= 4; s++) {
			System.out.println(cards[index].toString());
			index++
		}
	}
   }
   // Return a pointer to the next card, and move to the next.
   public Card next(){
       // Complete this code.
	nextCard++;
	return cards[nextCard];
   }
}

public class Card {
   // Instance Variables
   // 1=A, 2-9, 10=X, 11=J, 12=Q, 13=K
   // Error value = 0 and " " (space, not empty String!)
   private int face;
   // 1=S, 2=H, 3=C, 4=D
   // Error value = 0 and " " (space, not empty String!)
   private int suit;
   // Constructors
   public Card(){
       // Complete this code.
	
   }
   public Card(int face, int suit){
       // Complete this code.
	if(face <= 0) face = 1;
	if(suit < 1 || suit > 4 || suit == null) suit = 1;
	this.face = face;
	this.suit = suit;
   }
   // Getters/Setters
   // Complete this code.
   public getSuit() { return this.suit; }
   public getFace() { return this.face; }
   // Static methods
   // Given 1-13, return A-K
   public static String convertFace(int face){
       // Complete this code.
       String[] facea = {‘’,’A’,’1’,’2’,’3’,’4’,’5’,’6’,’7’,’8’,’9’,’10’,’J’,’Q’,’K’};
       return facea[face];
   }
   // Given A-K, return 1-13
   public static int convertFace(String face){
       // Complete this code.
       int num = 0;
       int[] facei = {1,2,3,4,5,6,7,8,9,10,11,12,13};
       for(int x = 1; x <= 13; x++) {
           if(convertFace(facei[x]).compareTo(face) == 0) {
              num = x;
              break;
           }
       }
       return num;
   }
   // Given 1-4, return SHCD
   public static String convertSuit(int suit){
       // Complete this code.
       String[] s = {‘’,’S’,’H’,’C’,’D’};
       return s[suit];
   }
   // Given SHCD, return 1-4
   public static int convertSuit(String suit){
       // Complete this code.
       int num = 0;
       int[] suiti = {1,2,3,4};
       for(int x = 1; x <= 4; x++) {
           if(convertFace(suiti[x]).compareTo(suit) == 0) {
              num = x;
              break;
           }
       }
       return num;
   }

   // Nonstatic methods
   // toString() should return a 2 character card.
   public String toString(){
       // Complete this code.
       String c = “”;
       c += convertFace(this.face) + “” + convertFace(this.suit);
       return c;

   }
   // True if face values are equal.
   public boolean equals(Card c){
       // Complete this code.
       if(c.getFace() == this.face && c.getSuit() == this.suit) return true;
       else return false;
   }
}
