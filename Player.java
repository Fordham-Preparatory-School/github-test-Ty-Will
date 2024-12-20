import java.util.Scanner; 
public class Player {

    private String name; 
    private int score; 
    public Player(String name)
    { 
        this.name = name;  
        this.score = 0; 

    }

    public String getName()
    { 
        return this.name; 
    }
    public int getScore()
    { 
        return this.score; 
    }
    public void incrScore()
    { 
        this.score++; 
        
    }
    public String toString()
    { 
        return "Player Name: " + this.name + "\n" + "Player Score: " + this.score; 
    }
    public int takeTurn()
    { 
        
        Scanner userInput = new Scanner(System.in); 
        if (Board.getNumPieces() >= 3)
        { 
            System.out.println("You may take 1, 2, or 3 pieces"); 
            
        }
        else if (Board.getNumPieces() == 2)
        { 
            System.out.println("You may take 1 or 2 pieces");
            

        }
        else if (Board.getNumPieces() == 1)
        { 
            System.out.println("You may take 1 piece"); 
           
        }
        int input = userInput.nextInt();

        while (input <= 0 || input > 3 || input > Board.getNumPieces())
        {
            System.out.print("This is not an option, try again"); 
            System.out.println();
            input = userInput.nextInt();

        }
        
        


        System.out.println(); 
        return input; 
    


    }
        
        
         



} 

    