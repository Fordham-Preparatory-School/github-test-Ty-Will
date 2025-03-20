public class GameRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe"); 
        System.out.println("The goal of the game is to get 3 in a row in any direction");
        System.out.println("Your first move must be in the middle");  
        System.out.println("The coordinates for the tic tac toe board are 0, 1, 2"); 
        Game ticTacToe = new Game(); 
        ticTacToe.play(); 
        
        
    }
    
}
