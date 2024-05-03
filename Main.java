import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // int[] arr = { 3, 4, 1, 7, 5 }; 
        // int leng = arr.length;
          
        // int x = 4; 

        // Linear Search Algorithm
        // System.out.println("Linear Search Algorithm:");
        // int index = LinearSearch.linearSerach(arr, x);

// --------------------------------------------------------------------------------------------------------------------        
        // Binary Search Algorithm 1 - Iterative
        // System.out.println("Binary Search Algorithm");
        // Arrays.sort(arr);
        // int index = BinarySearch.iterativeBinarySearch(arr, x);

// ---------------------------------------------------------------------------------------------------------------------
        // Binary Search Algorithm 2 - Recursive
        // System.out.println("Binary Search Algorithm");
        // Arrays.sort(arr);
        // int index = BinarySearch.recursiveBinarySearch(arr, 0, leng, x);

        // if (index == -1) 
        //     System.out.println("Element is not present in the array"); 
        // else
        //     System.out.println("Element found at position " + index); 

// --------------------------------------------------------------------------------------------------------------------

// ---------------------------------------------------------------------------------------------------------------------
        // Bubble Sort Algorithm
        // System.out.println("Bubble Sort Algorithm");
        // int[] arr1 = BubbleSort.bubbleSort(arr);
        // Arrays.stream(arr1).forEach(num -> System.out.print(num + " "));

// ----------------------------------------------------------------------------------------------------------------------
        // Insertion Sort Algorithm
        // System.out.println("Insertion Sort Algorithm:"); 
        // int[] arr2 = InsertionSort.insertionSort(arr);
        // Arrays.stream(arr2).forEach(num -> System.out.print(num + " "));
        
// ----------------------------------------------------------------------------------------------------------------------
        // Merge Sort Algorithm
        // System.out.println("Merge Sort Algorith:");
        // int arr3[] = { 12, 11, 13, 5, 6, 7 };

        // System.out.println("Given Array");
        // Arrays.stream(arr3).forEach(num -> System.out.print(num + " "));
        
        // // Calling of Merge Sort
        // MergeSort.sort(arr3, 0, arr3.length - 1);

        // System.out.println("\nSorted array");
        // Arrays.stream(arr3).forEach(num -> System.out.print(num + " "));

// ----------------------------------------------------------------------------------------------------------------------
        // Quick Sort Algorithm
        // System.out.println("Quick Sort Algorithm");

        // int arr4[] = {10, 7, 8, 9, 1, 5};
        // int n = arr4.length;
        // QuickSort.sort(arr4, 0, n-1);
 
        // System.out.println("sorted array");
        // Arrays.stream(arr4).forEach(num -> System.out.print(num + " "));
        
// ------------------------------------------------------------------------------------------------------------------------

// -----------------------------------------------------------------------------------------------------------------------
        // List<Integer> list = List.of(1,1,1,3,3,2,2);
        // System.out.println(LongestSubarray.longestSubarray(list));

// ------------------------------------------------------------------------------------------------------------------------        
        
        // System.out.println(JavaStack.isBalanced("{}{}"));
        // System.out.println(JavaStack.isBalanced("{}{"));
        // System.out.println(JavaStack.isBalanced("({()})"));

// -------------------------------------------------------------------------------------------------------------------------

        // System.out.println(CrashingStones.lastStoneWeight(List.of(2,4,5)));

// -------------------------------------------------------------------------------------------------------------------------

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        // String team = bufferedReader.readLine();

        // int year = Integer.parseInt(bufferedReader.readLine().trim());

        // int result = RestAPI.getTotalGoals(team, year);
        
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();

// ----------------------------------------------------------------------------------------------------------------------------

        // Some Notes:
        // Collections.unmodifiableList(numbers); // This code provides to make a list unmodifiable. So, it is Read-Only List.

        // String[] str = list.toArray(new String[0]); //Converting list to an array
 
        // List playersList = Arrays.asList(playersArray); // Converting array into Collection with asList() function.

        // String countryArray[]
        //     = { "India", "Pakistan", "Afganistan",
        //         "Srilanka" };
        // List<String> countryList = new ArrayList<>();
        // Collections.addAll(countryList, countryArray);
        // System.out.println("Converted ArrayList elements: " + countryList);


    }
}