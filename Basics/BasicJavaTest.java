public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava basic13 = new BasicJava(); 
        basic13.print1To255(); 
        basic13.printOddTo255(); 
        basic13.printSum(); 
        int [] myArray = {1,3,5,7,9,13}; 
        basic13.iterateArray(myArray); 
        System.out.println(basic13.findMax(myArray)); 
        int [] array2 = {-3, -5, -7}; 
        System.out.println(basic13.findMax(array2)); 
        int [] array3 = {2, 10, 3}; 
        System.out.println(basic13.getAverage(array3)); 
        System.out.println(basic13.arrayWithOddNumbers()); 
        System.out.println(basic13.greaterThanY(myArray, 6)); // should return 3 
        int [] array4 = {1, 5, 10, -2};
        int [] array5 = {1, 5, 10, -2}; 
        int [] array6 = {1, 5, 10, -2};
        System.out.println(basic13.squareValues(array4)); 
        System.out.println(basic13.eliminateNegs(array5)); 
        System.out.println(basic13.maxMinAve(array6)); 
        int [] array7 = {1, 5, 10, 7, -2}; 
        System.out.println(basic13.shiftValues(array7)); 

        

    }
}