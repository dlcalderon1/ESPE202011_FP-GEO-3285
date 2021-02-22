package ws15q01solution;

import java.util.Scanner;

public class WS15Q01Solution {

    public static void main(String[] args) {

        int totalPlayers = 0;
        String[] players;
        float[] goalAverages;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("PLEASE ENTER THE AMOUNT OF PLAYERS YOU WANT TO RECORD: ");
        totalPlayers = scanner.nextInt();
        
        players = new String[totalPlayers];
        goalAverages = new float[totalPlayers];

        for (int i = 0; i < totalPlayers; i++) {
            scanner.nextLine();
            System.out.println("PLEASE ENTER THE NAME OF PLAYER #" + i + " --> ");
            players[i] = scanner.nextLine();
            System.out.println("PLEASE ENTRER " + players[i] + " GOALS AVERAGE --> ");
            goalAverages[i] = scanner.nextFloat();
        }
        
        for (int i = 0; i < totalPlayers; i++) {
            System.out.println(players[i] + " --> \t" + goalAverages[i]);

        }

    }

}
