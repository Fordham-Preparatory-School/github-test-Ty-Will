public class Board {
    private final static int ROWS = 3; 
    private final static int COLS = 3; 
    public String[][] TBoard; 

    public Board() 
    { 
        TBoard = new String[ROWS][COLS]; 
        for (int i = 0; i < TBoard.length;i++)
        { 
            for (int j = 0; j < TBoard.length;j++)
            { 
                TBoard[i][j] = " "; 
            }
        }


    }
    public boolean addStringToPosition(String move, int r, int c)
    { 
        if(TBoard[r][c].equals(" ")) 
        { 
            
            if (move.equals("X") || move.equals("O"))

            { 
                TBoard[r][c] = move; 
                return true; 

            }
            else   
            {
                System.out.println("Invalid move");
                System.out.println("Please type in X or O");
                return false; 

            }
        } 
        else 
        { 
            System.out.println("Invalid move"); 
            return false;
        } 
         
        
        
        
        
        

    }

    public String checkWinState() 
    {  
        for (int i = 0; i < TBoard.length; i++)
        { 
            if(!(TBoard[i][0].equals(" ")) && TBoard[i][1].equals(TBoard[i][0]) && TBoard[i][2].equals(TBoard[i][0]))
            {
                return TBoard[i][0]; 


            }
            
        }
        for (int i = 0; i < TBoard[0].length; i++)
        { 
            if(!(TBoard[0][i].equals(" ")) && TBoard[1][i].equals(TBoard[0][i]) && TBoard[2][i].equals(TBoard[0][i]))
            {
                return TBoard[0][i];


            }   
        }
         
        if(!(TBoard[0][0].equals(" ")) && TBoard[1][1].equals(TBoard[0][0]) && TBoard[2][2].equals(TBoard[0][0]))
        {
            return TBoard[0][0];
        }
            
        
        if((TBoard[0][2].equals(" ")) && TBoard[1][1].equals(TBoard[0][2]) && TBoard[2][0].equals(TBoard[0][2]))
        {
            return TBoard[0][2];
        }


        for (int i = 0; i < TBoard.length; i++)
        { 
            for (int j = 0; j < TBoard.length; j++)
            { 
                if (TBoard[i][j].equals(" "))
                { 
                    return "None";
                }
                     
            }

            
        }
        return "Tie"; 


    }

    public void printBoard()
    {
        for (int i = 0; i < TBoard.length; i++)
        { 
            System.out.print("|"); 
            for (int j = 0; j < TBoard[0].length; j++)
            { 
                System.out.print(TBoard[i][j] + " ");
                
                
            }
            System.out.print("|"); 
            System.out.println(); 
            
        }

    }


    
}
