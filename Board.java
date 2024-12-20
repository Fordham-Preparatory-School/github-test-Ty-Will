public class Board {
    public static void main(String[] args) 
    { 

    }
    private static int pieces; 

    public static int getNumPieces()
    { 
        return pieces; 

    }
    public static void populate()
    { 
        pieces = (int) (Math.random() * 40) + 10; 
        System.out.println("The board has " + pieces + " pieces"); 
    }
    public static void removePieces(int n)
    { 
        pieces -= n; 
        if (n > 1)
        {
            System.out.println(n + " pieces have been removed. There are " + pieces + " pieces left"); 
        }
        else
        { 
            System.out.println(n + " piece has been removed. there are " + pieces + " pieces left"); 
        }

    }

}
