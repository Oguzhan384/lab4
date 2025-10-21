import java.util.Scanner;
public class Lab04_Q2 {
    /**
     * Palindrome finder
     * Decides whether the input is
     * palindrome or not
     * @author Oğuzhan Yılmaz (22401738)
     * @version 19.10.2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        boolean palindrome;
        while (repeat = true){
        palindrome = true;
            System.out.print("Enter a positive integer (0 to quit): ");
            //taking and determine if veriable is legit
            if (scanner.hasNextInt()){
                int numberHolder = scanner.nextInt();
                //terminate
                if (numberHolder == 0){
                    System.out.println("Program ended.");
                    System.exit(0);
                }
                if (numberHolder > 0){
                    String number = "" + numberHolder;
                    int numberLenght = number.length()-1;
                    //determine if the number is palindrome
                    for (int i = 0;i <= number.length();i++){
                        if (numberLenght < 0){
                            break;
                        }
                        char char1 = number.charAt(i);
                        char char2 = number.charAt(numberLenght);
                        numberLenght--;
                        if (char1 != char2){
                            palindrome = false;
                            break;
                        }
                    }
                    //output
                    if (palindrome == false){
                        System.out.println(number +" is not a palindrome.");
                    }
                    else{
                        System.out.println(number + " is a palindrome.");
                    }

                    }
                else{
                    System.out.println("Only positive integers are allowed.");
                    String invalidInput = scanner.nextLine();
                }

            }
            else{
                System.out.println("Only positive integers are allowed.");
            }
        }

    }
}
