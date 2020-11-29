public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){

        double total = (legA * legA) + (legB * legB); 

        double hypotenuse = Math.sqrt(total); 

        return hypotenuse; 
    }
}