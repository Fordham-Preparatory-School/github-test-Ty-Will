import java.util.Scanner; 
public class Game {

    Player playerX; 
    Player playerO;
    Board board; 
 

    public Game()
    { 
        Scanner player = new Scanner(System.in); 
        System.out.println("Type in the name of player X");
        playerX = new Player(player.nextLine(), "X");
        System.out.println("Type in the name of player O");
        playerO = new Player(player.nextLine(), "O"); 
        board = new Board(); 
    }

    public void play()
    { 
        int x = (int) ((Math.random() * 10) + 1); 
        Player currentPlayer; 
        if (x % 2 == 0)
        { 
            currentPlayer = playerX; 
            System.out.println(playerX.getName() + " it is your turn"); 
        }
        else 
        { 
            currentPlayer = playerO; 
            System.out.println(playerO.getName() + " it is your turn"); 
        }
        
        
        String w = "None";
        while(w.equals("None"))
        { 
            board.printBoard();
            currentPlayer.makeMove(board); 
            w = board.checkWinState();


            if (w.equals("Tie"))
            { 
                System.out.println("Game Over!"); 
                System.out.println("It was a tie"); 
                
                
                if (playAgain())
                { 
                    board = new Board();
                    play(); 
                }
            }
            else if (w.equals("X"))
            { 
                currentPlayer.incrScore();
                System.out.println("Game Over!"); 
                System.out.println(currentPlayer.getName() + " wins!"); 
                System.out.println(playerX);
                System.out.println(playerO);
                if (playAgain())
                { 
                    board = new Board();
                    play(); 
                }

            }
            else if (w.equals("O"))
            {
                currentPlayer.incrScore(); 
                System.out.println("Game Over!"); 
                System.out.println(currentPlayer.getName() + " wins!"); 
                System.out.println(playerX);
                System.out.println(playerO); 
                if (playAgain())
                {    
                    board = new Board(); 
                    play(); 
                }
                
            }
            if (currentPlayer == playerX)
            { 
                currentPlayer = playerO; 
                System.out.println(playerO.getName() + " it is your turn"); 

            }

            else if (currentPlayer == playerO)
            { 
                currentPlayer = playerX; 
                System.out.println(playerX.getName() + " it is your turn"); 
            }
        }
        
        

    }

    private static boolean playAgain()
    { 
        Scanner scanner = new Scanner(System.in); 
        boolean play = false; 

        System.out.println("Would you like to play again?"); 
        System.out.println("Please type yes if you would like to play again"); 
        String input = scanner.nextLine(); 
        if (input.equals("yes"))
        { 
              
            play = true; 
            
            return play; 
        }
        else if (input.equals("Yes"))
        { 
            play = true; 
            return play; 
        }
        else 
        { 
            play = false; 
            return play; 
            
            
        }
    }

}
