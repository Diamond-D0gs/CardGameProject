package Game;

import java.io.IOException;

public class Test {
    private NetworkHandler networkHandler;

    public Test() {
        networkHandler = new NetworkHandler();
    }

    public static void main(String[] args) {
        new Test().Run();
    }

    public void Run() {
        networkHandler.FindConnection();

        ClearConsole();

        System.out.println("Success!");

        try {
            networkHandler.close();
        }
        catch (IOException e) {
            System.out.println("Error closing the NetworkHandler.");
        }
    }

    public static void ClearConsole() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
