import java.util.Scanner;
public class Nim {
    private Player player1; 
    private Player player2; 

    public Nim()
    { 
        Scanner user = new Scanner(System.in); 


        System.out.println("Type in the name of player 1");
        player1 = new Player(user.nextLine());
        System.out.println();
        System.out.println("Type in the name of player 2");
        player2 = new Player(user.nextLine());
        System.out.println();

    }

    public void play()
    { 
        int x = (int) ((Math.random() * 10) + 1); 
        Player currentPlayer = player1;
        if (x % 2 == 0) 
        {      
            currentPlayer = player1;
            System.out.println(player1.getName() + " it is your turn");  
        }
        else 
        { 
            currentPlayer = player2; 
            System.out.println(player2.getName() + " it is your turn");    
        }
        while (Board.getNumPieces() > 0)
        {
            int remove = currentPlayer.takeTurn(); 
            Board.removePieces(remove);

            if (Board.getNumPieces() == 0)
            { 
                currentPlayer.incrScore();
                System.out.println("Game Over!");
                System.out.println(currentPlayer.getName() + " wins!");
                System.out.println(player1);
                System.out.println(player2);
                if (playAgain())
                { 
                    Board.populate();
                    play();
                }
            }
            
        
            

            if (currentPlayer == player1)
            { 
                currentPlayer = player2;
                System.out.println(player2.getName() + " it is your turn"); 
                System.out.println(); 
            }
            else 
            {
                currentPlayer = player1; 
                System.out.println(player1.getName() + " it is your turn");
                System.out.println(); 
            }
            
        }        
        
        
    }
        
        
    
        
    


    

    private static boolean playAgain()
    { 
        Scanner user = new Scanner(System.in); 

        boolean play = true; 
        System.out.println("Would you like to play again?");
        System.out.println("Please type yes if you would like to play again"); 
        String input = user.nextLine(); 
        if (input.equals("yes"))
        {
            return play;
        }
        else if (input.equals("Yes"))
        { 
            return play; 

        }
        else
        { 
            play = false; 
            return play;
        }


    }

}