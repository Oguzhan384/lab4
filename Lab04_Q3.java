import java.util.Random;
import java.util.Scanner;
public class Lab04_Q3 {
    /**
     * Battleship table game
     * @author Oğuzhan Yılmaz (22401738)
     * @version 20.10.2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        //veriables
        int player;
        String playerGrid = "~ ~ ~ ~ ~\n~ ~ ~ ~ ~\n~ ~ ~ ~ ~\n~ ~ ~ ~ ~\n~ ~ ~ ~ ~";
        String actualGrid = "0 0 0 0 0\n0 0 0 0 0\n0 0 0 0 0\n0 0 0 0 0\n0 0 0 0 0";
        int player1 = 0;
        int player2 = 0;
        int player3 = 0;
        int round = 1;
        int shipFound = 0;
        int row = 0;
        int column = 0;
        char selectedChar;
        boolean legitInput = false;
        int turn;
        int totalGuess = 0;
        int totalRound = 0;
        int a = 1;
        System.out.println("Welcome to Battleship!\nThe grid is 5x5. There are 5 hidden ships.");
        System.out.println("\nInitial Grid:\n" + playerGrid);
        //GAME FLOW
        //randomising ship placement
        for (;a <= 5;a++){
            int gridShipPlacement = r.nextInt(0,25)*2;
            if (gridShipPlacement == 50){
                gridShipPlacement--;
            }
            if (actualGrid.charAt(gridShipPlacement) == "1".charAt(0)){
                a--;
            }
            actualGrid = actualGrid.substring(0,gridShipPlacement) + "1" + actualGrid.substring(gridShipPlacement+1);
        }
        System.out.println(actualGrid);
        //game
        while (shipFound <= 5){
            System.out.println("\n###### Round #" + round);
            turn = 1;
            //player 1
            while (turn == 1){
                System.out.println("## Player1 ##");
                System.out.println("Previous Grid:\n" + playerGrid);
                while (legitInput == false){
                    System.out.print("Guess row: ");
                    row = scanner.nextInt();
                    if (row < 0 || row > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }
                while (legitInput == false){
                    System.out.print("Guess column: ");
                    column = scanner.nextInt();
                    if (column < 0 && column > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }        
                int selectedPosition = (column*2 + row*10);
                selectedChar = playerGrid.charAt(selectedPosition);
                if (playerGrid.charAt(selectedPosition) != "X".charAt(0) && playerGrid.charAt(selectedPosition) != "O".charAt(0)){
                    if (actualGrid.charAt(selectedPosition) == "1".charAt(0)){
                        System.out.println("Hit!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "X" + playerGrid.substring(selectedPosition+1);
                        player1++;
                        shipFound++;
                        totalGuess++;
                    }
                    else{
                        System.out.println("Miss!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "O" + playerGrid.substring(selectedPosition+1);
                        totalGuess++;
                    }
                    turn = 2; 
                }
                else if (playerGrid.charAt(selectedPosition) == "X".charAt(0)){
                    System.out.println("Already hit this ship!");
                }
                else{
                    System.out.println("Already guessed here!");
                } 
            }
            if (shipFound == 5){
                    break;
            }
            //player 2
            while (turn == 2){
                System.out.println("\n## Player2 ##");
                System.out.println("Previous Grid:\n" + playerGrid);
                while (legitInput == false){
                    System.out.print("Guess row: ");
                    row = scanner.nextInt();
                    if (row < 0 || row > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }
                while (legitInput == false){
                    System.out.print("Guess column: ");
                    column = scanner.nextInt();
                    if (column < 0 && column > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }
                int selectedPosition = (column*2 + row*10);
                selectedChar = playerGrid.charAt(selectedPosition);
                if (playerGrid.charAt(selectedPosition) != "X".charAt(0) && playerGrid.charAt(selectedPosition) != "O".charAt(0)){
                    if (actualGrid.charAt(selectedPosition) == "1".charAt(0)){
                        System.out.println("Hit!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "X" + playerGrid.substring(selectedPosition+1);
                        player2++;
                        shipFound++;
                        totalGuess++;
                    }
                    else{
                        System.out.println("Miss!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "O" + playerGrid.substring(selectedPosition+1);
                        totalGuess++;
                    }
                    turn = 3;
                }
                else if (playerGrid.charAt(selectedPosition) == "X".charAt(0)){
                    System.out.println("Already hit this ship!");
                }
                else{
                    System.out.println("Already guessed here!");
                    }
            } 
            if (shipFound == 5){
                break; 
            }
            //player 3
            while (turn == 3){
                System.out.println("\n## Player3 ##");
                System.out.println("Previous Grid:\n" + playerGrid);
                while (legitInput == false){
                    System.out.print("Guess row: ");
                    row = scanner.nextInt();
                    if (row < 0 || row > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }
                while (legitInput == false){
                    System.out.print("Guess column: ");
                    column = scanner.nextInt();
                    if (column < 0 && column > 4){
                        System.out.println("Invalid guess. Try again.");
                    }
                    else{
                        break;
                    }
                }
                int selectedPosition = (column*2 + row*10);
                selectedChar = playerGrid.charAt(selectedPosition);
                if (playerGrid.charAt(selectedPosition) != "X".charAt(0) && playerGrid.charAt(selectedPosition) != "O".charAt(0)){
                    if (actualGrid.charAt(selectedPosition) == "1".charAt(0)){
                        System.out.println("Hit!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "X" + playerGrid.substring(selectedPosition+1);
                        player3++;
                        shipFound++;
                        totalGuess++;
                    }
                    else{
                        System.out.println("Miss!");
                        playerGrid = playerGrid.substring(0,selectedPosition) + "O" + playerGrid.substring(selectedPosition+1);
                        totalGuess++;
                    }
                    totalRound++;
                    turn = 1;
                }
                else if (playerGrid.charAt(selectedPosition) == "X".charAt(0)){
                    System.out.println("Already hit this ship!");
                }
                else{
                    System.out.println("Already guessed here!");
                    }
                } 
            if (shipFound == 5){
            break;
            }    
        }
        //winner player 1
        if (player1 > player2 && player1 > player3){
            System.out.println("*********************\n" + 
                                "Game finished!\n" + 
                                "Total rounds played: " + totalRound + "\n" + 
                                "Total guesses: " + totalGuess + "\n" + 
                                "Player1 score: " + player1 + " ships found\n" + 
                                "Player2 score: " + player2 + " ships found\n" + 
                                "Player3 score: " + player3 + " ships found\n" +
                                "Winner: Player1");
        }
        //winner player 2
        else if (player2 > player1 && player2 > player3){
            System.out.println("*********************\n" + 
                                "Game finished!\n" + 
                                "Total rounds played: " + totalRound + "\n" + 
                                "Total guesses: " + totalGuess + "\n" + 
                                "Player1 score: " + player1 + " ships found\n" + 
                                "Player2 score: " + player2 + " ships found\n" + 
                                "Player3 score: " + player3 + " ships found\n" +
                                "Winner: Player2");
        }
        //winner player 3
        else if (player3 > player1 && player3 > player2){
            System.out.println("*********************\n" + 
                                "Game finished!\n" + 
                                "Total rounds played: " + totalRound + "\n" + 
                                "Total guesses: " + totalGuess + "\n" + 
                                "Player1 score: " + player1 + " ships found\n" + 
                                "Player2 score: " + player2 + " ships found\n" + 
                                "Player3 score: " + player3 + " ships found\n" +
                                "Winner: Player3");
        }
        //tie
        else{
            System.out.println("*********************\n" + 
                                "Game finished!\n" + 
                                "Total rounds played: " + totalRound + "\n" + 
                                "Total guesses: " + totalGuess + "\n" + 
                                "Player1 score: " + player1 + " ships found\n" + 
                                "Player2 score: " + player2 + " ships found\n" + 
                                "Player3 score: " + player3 + " ships found\n" +
                                "It's a tie!");
            
        }
    }
}

