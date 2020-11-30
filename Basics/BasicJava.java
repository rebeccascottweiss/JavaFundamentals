import java.util.Arrays; 

public class BasicJava{
//     Print 1-255
// Write a method that prints all the numbers from 1 to 255.

    public void print1To255(){
        int num = 1; 
        while(num < 256){
            System.out.println(num); 
            num++; 
        }
    }; 

// Print odd numbers between 1-255
// Write a method that prints all the odd numbers from 1 to 255.

    public void printOddTo255(){
        int num = 1; 
        while(num < 256){
            if(num%2 != 0){
                System.out.println(num); 
            }; 
            num++; 
        }; 
    }; 

// Print Sum
// Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:

// New number: 0 Sum: 0
// New number: 1 Sum: 1
// New number: 2 Sum: 3
// New number: 3 Sum: 6
// ...
// New number: 255 Sum: ___
// Do NOT use an array to do this exercise.

    public void printSum(){
        int num = 0; 
        int sum = 0; 
        while (num < 256){
            sum += num; 
            System.out.println("New number: " + num + " Sum: " + sum); 
            num++; 
        }
    }; 

// Iterating through an array
// Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.

    public void iterateArray(int[] newArr){
        for(int num : newArr){
            System.out.println(num); 
        }; 
    }; 

// Find Max
// Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.

    public Integer findMax(int[] newArr){
        int max = newArr[0]; 
        int idx = 0; 

        while(idx < newArr.length){
            if(newArr[idx] > max){
                max = newArr[idx];
            }; 
            idx++; 
        }; 

        return max; 
    };

// Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.

    public int getAverage(int[] newArr){
        int sum = 0; 
    
        for(int i : newArr){
            sum += i; 
        }; 

        return sum/newArr.length; 
    }

// Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].

    public String arrayWithOddNumbers(){
        int[] oddArray; 
        oddArray = new int[128]; 
        int idx = 0; 
        int num = 1; 

        while(idx < 128){
            oddArray[idx] = num; 
            idx++; 
            num +=2; 
        }; 

        return Arrays.toString(oddArray); 
    }

// Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).

    public int greaterThanY(int[] newArr, int y){
        int numGreater = 0; 

        for(int num : newArr){
            if(num > y){
                numGreater++; 
            }
        };

        return numGreater; 
    }

// Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].

    public String squareValues(int[] newArr){
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = newArr[i] * newArr[i]; 
        }

        return Arrays.toString(newArr); 
    }

// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].

    public String eliminateNegs(int[] newArr){
        for(int i = 0; i<newArr.length; i++){
            if(newArr[i] < 0){
                newArr[i] = 0; 
            }; 
        }; 

        return Arrays.toString(newArr); 
    }

// Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]

    public String maxMinAve(int[] newArr){
        int max = newArr[0]; 
        int min = newArr[1]; 
        int sum = 0; 
        
        for(int val : newArr){
            if(val > max){
                max = val; 
            }; 
            if(val < min){
                min = val; 
            }; 
            sum += val; 
        }; 

        int ave = sum/newArr.length; 

        int[] result = {max, min, ave}; 

        return Arrays.toString(result); 
    }

// Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.

    public String shiftValues(int[] newArr){
        for(int i = 1; i < newArr.length; i++){
            newArr[i-1] = newArr[i]; 
        }; 
        newArr[newArr.length-1] = 0; 
        return Arrays.toString(newArr); 
    }; 

}