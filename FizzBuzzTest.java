public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz instFB = new FizzBuzz(); 
        String test1 = instFB.fizzBuzz(3); 
        String test2 = instFB.fizzBuzz(5); 
        String test3 = instFB.fizzBuzz(15); 
        String test4 = instFB.fizzBuzz(2); 

        String results = String.format("The result of testing number 3 is: %s.%nThe result of testing number 5 is: %s.%nThe result of testing number 15 is: %s.%nThe result of testing number 2 is: %s.", test1, test2, test3, test4);

        System.out.println(results);
    }
}