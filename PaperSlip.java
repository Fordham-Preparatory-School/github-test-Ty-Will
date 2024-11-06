public class PaperSlip {
    public static void main(String[] args) 
    {
        String t = "Tommy";  
        int firstLetter = 4; 
        while (firstLetter >= 0)
        {
            System.out.println(t.substring(firstLetter, firstLetter + 1));  
            firstLetter--; 

        } 
    }

}
