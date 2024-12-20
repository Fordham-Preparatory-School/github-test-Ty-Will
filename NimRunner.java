public class NimRunner {
    public static void main(String[] args)
    { 
        System.out.println("Welcome to the Game of Nim!"); 
        System.out.println("The goal of the game is to take the last piece on the board"); 
        Board.populate(); 
        Nim gameOfNim = new Nim(); 
        gameOfNim.play(); 
    }

}
