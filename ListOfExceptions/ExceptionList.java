import java.util.ArrayList; 

public class ExceptionList{
    public static void multiClass(){
        ArrayList<Object> myList = new ArrayList<Object>();

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("The integer is: " + castedValue + "."); 
            } catch(ClassCastException e){
                System.out.println("This list element isn't an integer..."); 
            }; 
        }; 

    }; 
}