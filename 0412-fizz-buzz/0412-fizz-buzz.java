class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            // If divisible by both 3 and 5, add "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } 
            // If divisible by 3, add "Fizz"
            else if (i % 3 == 0) {
                result.add("Fizz");
            } 
            // If divisible by 5, add "Buzz"
            else if (i % 5 == 0) {
                result.add("Buzz");
            } 
            // Otherwise, add the number itself as a string
            else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }
}