import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Arrays; 
import java.util.Random; 

public class PuzzleJava{
    public static ArrayList<Integer> arrGreaterThan10(){
        int[] originalArr = {3,5,1,2,7,9,8,13,25,32}; 
        ArrayList<Integer> resArr = new ArrayList<Integer>(); 
        int sum = 0; 

        for (int val : originalArr){
            sum += val; 
            if(val > 10){
                resArr.add(val); 
            }; 
        }; 

        System.out.println(""+ sum);
        return resArr; 
    }; 

    public static ArrayList<String> longNames(){
        ArrayList<String> Names = new ArrayList<String>(); 

        Names.add("Nancy");
        Names.add("Jinichi");
        Names.add("Fujibayashi");
        Names.add("Momochi");
        Names.add("Ishikawa"); 

        ArrayList<String> resNames = new ArrayList<String>(); 

        Collections.shuffle(Names); 

        for(String name : Names){
            System.out.println(name); 
            if(name.length() > 5){
                resNames.add(name); 
            };
        };

        return resNames; 
    }; 

    public static void shuffleAlpha(){
        ArrayList<String> alphabet = new ArrayList<String>(26);
        alphabet.addAll(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")); 

        Collections.shuffle(alphabet); 

        System.out.println("The last letter of the list is: " + alphabet.get(alphabet.size()-1)); 

        if(alphabet.get(0) == "a" || alphabet.get(0) == "e" || alphabet.get(0) == "i" || alphabet.get(0) == "o" || alphabet.get(0) == "u"){
            System.out.println("The first letter of the list is a vowel.");
        }; 

        System.out.println("The first letter of the list is: " + alphabet.get(0));    
    }; 

    public static Integer[] randomNumArray(){
        Integer[] randos = new Integer[10]; 
        Random myRando = new Random(); 

        for (int i = 0; i < 10; i++){
            randos[i] = myRando.nextInt(55); 
        }; 

        return randos; 
    }; 

    public static void randomNumArraySorted(){
        Integer[] newRandos = PuzzleJava.randomNumArray(); 
        ArrayList<Integer> resRandos = new ArrayList<Integer>(); 

        resRandos.addAll(Arrays.asList(newRandos)); 
        

        Collections.sort(resRandos);
        
        

    }; 
}