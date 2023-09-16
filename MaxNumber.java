public class MaxNumber {
    public static void main(String[] args) {
        
        int[] numbers = {10, 5, 8, 20, 3, 15};

       
        int maxNumber = numbers[0];

        
        for (int number : numbers) {
           
            if (number > maxNumber) {
                
                maxNumber = number;
            }
        }

        
        System.out.println("The largest number is: " + maxNumber);
    }
}
