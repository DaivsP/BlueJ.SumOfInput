/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        String userin = input.nextLine();
        int userNumber = Integer.parseInt(userin);
        
        int sum = 0;
        
        for (int i = 1; i < (userNumber + 1); i++){
            sum += i;
            System.out.println("Sum is: " + sum);
        }
    }
}
//Create space for user input
//Allow user to input string
//Convert string to int
//Take user input and add it to an array
//Subtract 1 from user input, set it to new user input
//Add that to the array
//Stop doing that when reach 0
//Add all number in array