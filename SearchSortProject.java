import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner; 

public class SearchSortProject {
    private static int[] integerArray = new int[10000];
    public static void main(String[] args) 
    { 
        for (int i = 0; i < integerArray.length; i++)
        { 
            integerArray[i] = (int) (Math.random() * 2000000 - 999999); 
        }
        Scanner scan = new Scanner(System.in); 
        System.out.println("What value do you want to search for using linear search?"); 
        int x = scan.nextInt();
        LocalTime l1 = LocalTime.now(); 
        int index = linearSearch(x, integerArray); 
        LocalTime l2 = LocalTime.now();
        if (index > -1)
        { 
            System.out.println("Your value was found at index " + index);
        }
        else
        { 
            System.out.println("Your value was not found in the array"); 
        }
        System.out.println("This array took " + Duration.between(l1,l2).toMillis() + " milliseconds to run");
        System.out.println(); 

        LocalTime l5 = LocalTime.now(); 
        integerArray = insertSort(integerArray); 
        LocalTime l6 = LocalTime.now(); 
        System.out.println("This array took " + Duration.between(l5,l6).toMillis() + " milliseconds to sort");


        System.out.println("What value do you want to search for using binary search?"); 
        int y = scan.nextInt();
        LocalTime l3 = LocalTime.now(); 
        int index2 = binarySearch(y, integerArray); 
        LocalTime l4 = LocalTime.now();
        if (index2 > -1)
        { 
            System.out.println("Your value was found at index " + index2);
        }
        else
        { 
            System.out.println("Your value was not found in the array"); 
        }
        System.out.println("This array took " + Duration.between(l3,l4).toMillis() + " milliseconds to run");


         




         
         
        

    }
    

    private static int linearSearch(int target, int[] intArray)
    { 
        for (int i = 0; i < intArray.length; i++)
        {
            if (intArray[i] == target)
            { 
                return i; 
            }
             
        }
        return -1; 

    }
    private static int binarySearch(int target, int[] intArray)
    { 
        int mid = 0; 
        int i = 0; 
        int j = intArray.length - 1; 
        while (i <= j)
        { 
            mid = (i + j) / 2; 
            if (intArray[mid] == target) 
            { 
                return mid; 
            }
            else if (intArray[mid] > target)
            { 
                j = mid-1; 

            }
            else 
            { 
                i = mid+1; 
            }
            

        } 
        return -1; 

    }
    private static int[] insertSort(int[] intArray)
    {
        for (int i = 1; i < intArray.length; i++)
        {
            int j = i; 
            while(j > 0 && intArray[j - 1] > intArray[j])
            { 
                int temp = intArray[j]; 
                intArray[j] = intArray[j-1];
                intArray[j-1] = temp; 
                j--;  
            }


        }
        return intArray; 



    }

}
