// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  public static boolean isPrime(int number) {

    // return results for if number is 2 or less than two
    // boolean result == false;
    if (number == 2) {
      return true;
    }
    // boolean result == true
    else if (number < 2) {
      return false;
    }
    
    // check to see if number is prime
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  // method to return an ArrayList of prime numbers
  public static ArrayList<Integer> onlyPrimes(int[] numbers) {

    // create arraylist instance
    ArrayList<Integer> primes = new ArrayList<Integer>();

    // add all prime numbers from the passed array to the new ArrayList
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }

    //System.out.println(primes);
    return primes;
  }
  
  // method for filtering out odd or even numbers in an array
  public static int[] oddEvenFilter(int[] nums, String oddEven) {
    
    // create String variable to use in final print
    String oddEvenStr = null;

    // make input lowercase
    oddEven = oddEven.toLowerCase();

    // create a new empty ArrayList to fill with the filtered data
    ArrayList<Integer> filteredArrayList = new ArrayList<Integer>();

    // filter given array to only include selected values in new array
    if (oddEven.equals("odd")) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 != 0) {
          filteredArrayList.add(nums[i]);
        }
      }
      oddEvenStr = "odd";
    }
    else if (oddEven.equals("even")) {
      for (int number : nums) {
        if (number % 2 == 0) {
          filteredArrayList.add(number);
        }
      }
      oddEvenStr = "even";
    }
    else {
      System.out.println("Invalid input");
    }

    // copy ArrayList to an array
    int j = 0;
    int[] filteredArray = new int[filteredArrayList.size()];
    for (int number : filteredArrayList) {
      filteredArray[j] = filteredArrayList.get(j);
      j++;
    }

    // print out the results
    System.out.println("The " + oddEvenStr + " numbers from the array are: ");
    for(int i: filteredArray) {
      System.out.println(i);
    }
    return filteredArray;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    
    // create instance to filter prime numbers from the numbers array
    ArrayList<Integer> pdPrimes = pd.onlyPrimes(numbers);
    System.out.println("The prime numbers from the array are: " + pdPrimes);
    
    // call oddEvenFilter method to filter the numbers array for odd numbers
    pd.oddEvenFilter(numbers, "odd");

    // call oddEvenFilter method to filter the numbers array for even numbers
    pd.oddEvenFilter(numbers, "Even");
  }
}