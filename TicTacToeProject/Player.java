import java.util.Scanner; 
public class Player {

    private String name; 
    private String letter; 
    private int score; 
    public Player(String name, String letter)
    { 
        this.name = name; 
        this.score = 0; 
        this.letter = letter; 
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
        score++; 
    }

    public String toString()
    { 
        return "Player Name: " + this.name + "\n" + "Player Score: " + this.score; 
    }
    
    public void makeMove(Board b)
    { 
        boolean t = false; 
        while (t == false)
        { 
            Scanner scanner = new Scanner (System.in);
            System.out.println("In what row would you like to make your move?"); 
            int input1 = scanner.nextInt(); 
            System.out.println("In what column would you like to make your move?"); 
            int input2 = scanner.nextInt();
            
            if ((input1 <= 2 && input1 >= 0) || (input2 <= 2 && input2 >= 0))
            { 
                t = b.addStringToPosition(letter, input1, input2);
            }
            else 
            { 
                System.out.println("Invalid move"); 
                System.out.println("Please select a valid row and column"); 
            }
            

            
        }
         

        
    
         
        
        




        


    }


    
    
}
