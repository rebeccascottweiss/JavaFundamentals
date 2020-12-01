import java.util.Arrays; 

public class PuzzleJavaTesting{
    public static void main(String[] args){
        System.out.println(PuzzleJava.arrGreaterThan10()); 
        System.out.println(PuzzleJava.longNames()); 
        PuzzleJava.shuffleAlpha(); 
        Integer[] randoArray = PuzzleJava.randomNumArray();
        System.out.println(Arrays.toString(randoArray)); 
        PuzzleJava.randomNumArraySorted();  
        System.out.println("The random string is: " + PuzzleJava.randomString()); 
        System.out.println(PuzzleJava.arrayOfStrings()); 

    }
}