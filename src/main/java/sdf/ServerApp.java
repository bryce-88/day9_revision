package sdf;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public final class ServerApp {
    
    private ServerApp() {
    }

    //convert this programt to server/client

    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(2000);
        Socket s = ss.accept();
        System.out.println("Connected to localhost:2000");

        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);
        Integer myGuess = 0;

        

        while (myGuess != guessNumber) {

            Scanner scan = new Scanner(System.in);
            myGuess = scan.nextInt();

            if (myGuess < guessNumber) {
                System.out.println("Your number is lower");
            } else if (myGuess > guessNumber) {
                System.out.println("Your number is higher");
            } else {
                System.out.println("You're correct");
                // System.exit(0) -> to exit the program;
            }

            scan.close();
        }
    }
}
