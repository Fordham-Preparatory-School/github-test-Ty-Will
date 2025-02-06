import java.util.Arrays;
import java.util.Scanner; 
public class ArrayOperations {
    private static int[] arr = new int[10];


    // Displays the array elements before and after sorting
    public static void arraySort()
    { 
        int[] sortedArray;
        System.out.println("This is the array before sorting: "); 
        for (int n = 0; n < arr.length; n++) 
        { 
            
            System.out.print(arr[n] + " "); 
        }
        System.out.println(); 
        System.out.println("This is the array after sorting: ");
        for (int n = 0; n < arr.length; n++)
        {
            Arrays.sort(arr);
            sortedArray = arr; 
             
            System.out.print(arr[n] + " "); 

        }
    }

    // Returns the index of a target integer if it is found in the array
    public static int arrayPosition(int[] array, int target)
    {  
 
        for (int n = 0; n < array.length; n++) 
        { 
            if (target == array[n])
            { 
                return n; 
            }
            
        }  
        return -1; 
    }

    // Replaces an element in the array with a new value 
    public static int[] arrayReplace(int index, int newVal)
    { 
        arr[index] = newVal;  
        return arr; 
    }


    // Returns the sum of the array values 
    public static int arraySum()
    {
        int sum = 0;
        for (int n = 0; n < arr.length; n++)
        {
            sum += arr[n]; 
        }
        return sum; 
    }

    // Returns the average of the array values 
    public static double arrayAvg()
    { 
        double avg = arraySum(); 
        return avg / (arr.length); 
        
    }

    // Returns the maximum of the array values 
    public static int arrayMax()
    { 
        int max = Integer.MIN_VALUE;  
        for (int n = 0; n < arr.length; n++)
        { 
            if (arr[n] > max)
            { 
                max = arr[n]; 
            }
        }
        return max; 
    }

    // Returns the minimum of the array values 
    public static int arrayMin()
    { 
        int min = Integer.MAX_VALUE;  
        for (int n = 0; n < arr.length; n++)
        { 
            if (arr[n] < min)
            { 
                min = arr[n]; 
            }
        }
        return min; 
    }

    // Swaps 2 elements of the array that the user selects 
    public static int[] arraySwap(int firstNum, int secondNum )
    {  
        int ph = arr[firstNum]; 
        arr[firstNum] = arr[secondNum]; 
        arr[secondNum] = ph; 
        return arr; 
        
    }

    public static void main(String[] args) 
    {
        // Creates an integer array with 10 elements between 1 and 100
        for (int i = 0; i < arr.length; i++)
        { 
            arr[i] = (int)(Math.random() * 100 + 1);  
        }

        arraySort();

        System.out.println(); 
        System.out.println(); 
        
        System.out.println("Enter a value to search for in the array"); 
        Scanner userInput = new Scanner(System.in); 
        int input = userInput.nextInt();
        int found = arrayPosition(arr, input); 
        if (found == -1)
        { 
            System.out.println("The value was not found in the array");

        }
        else 
        { 
            System.out.println("The value was found at index " + found); 
        }

        System.out.println("Enter a new value to be replaced in the array "); 
        Scanner userInput2 = new Scanner(System.in); 
        int input2 = userInput2.nextInt();
        System.out.println("Enter the index where you want the new value to be replaced");
        Scanner userInput3 = new Scanner(System.in); 
        int input3 = userInput3.nextInt();
        int[] newArr = arrayReplace(input3, input2);
        System.out.println("The new array is:");
        for (int n = 0; n < arr.length; n++)
        { 
            System.out.print(arr[n] + " ");
        }
        System.out.println(); 
        System.out.println(); 
        


        System.out.println("The sum of the elements of the array is " + arraySum()); 
        System.out.println("The average of the elements of the array is " + arrayAvg()); 
        System.out.println("The maximum value of the elements of the array is " + arrayMax()); 
        System.out.println("The minimum value of the elements of the array is " + arrayMin()); 
        System.out.println(); 

        Scanner userInput4 = new Scanner(System.in); 
        System.out.println("Type in the first index you would like to swap"); 
        int firstIndex = userInput4.nextInt();
        System.out.println("Type in the second index you would like to swap"); 
        int secondIndex = userInput4.nextInt(); 
        System.out.println(); 

        int[] newArr2 = arraySwap(firstIndex, secondIndex); 
        System.out.println("The new array is: ");
        for (int n = 0; n < arr.length; n++)
        { 
            System.out.print(arr[n] + " ");
        }
        





        



        
    }

    


    
    
     

        
        
}