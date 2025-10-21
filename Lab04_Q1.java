import java.util.Scanner;
public class Lab04_Q1 {
    /**
     * Pyramid constructor
     * Takes height veriable from user and
     * constructs a star pyramid according
     * to the height.
     * @author Oğuzhan Yılmaz (22401738)
     * @version 19.10.2025
     */
    public static void main(String[] args) {
        //veriables & scanner
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        int height;
        int row = 1;
        int star;
        int space;
        String invalidInput;
        //repeat
        while (repeat == true){
            System.out.print("Enter a valid height: ");
            if (scanner.hasNextInt()){
                height = scanner.nextInt();
                if (height < 30 && height > 0){
                //construct output and print it
                while (row <= height){
                    space = height;
                    star = 0;
                    while (space >= row+1){
                        System.out.print(" ");
                        space--;
                    }
                    while (star < (row*2)-1){
                        System.out.print("*");
                        star++;
                    }
                    System.out.println();
                    row++;
                    }

                repeat = false;
                }
                else{
                    System.out.println("Invalid input, try again.");
                }
            }

            else{
                 System.out.println("Invalid input, try again.");
                 invalidInput = scanner.nextLine();
            }
         }
    }  
}
    

