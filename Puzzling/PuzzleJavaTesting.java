import java.utils.Arrays; 

public class PuzzleJavaTesting{
    public static void main(String[] args){
        System.out.println(PuzzleJava.arrGreaterThan10()); 
        System.out.println(PuzzleJava.longNames()); 
        PuzzleJava.shuffleAlpha(); 
        int[] randoArray = PuzzleJava.randomNumArray();
        System.out.println(Arrays.toString(randoArray)); 
         

    }
}