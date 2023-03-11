import java.util.Scanner;

public class Main {
    boolean hasQuit = true;
    public static void main(String[] args) {
        new Main().gameLoop();
    }

    private void gameLoop() {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean running = true;
        boolean hasExecuted = false;
        do {
            do {
                input = sc.nextLine();
                hasExecuted = executeCommand(input);
            } while (!hasExecuted);
            running = (!hasQuit);
        } while (running);
        sc.close();
    }

    private boolean executeCommand(String input) {
        return (handleGameCommands(input) || handleSystemCommands(input));
    }

    private boolean handleGameCommands(String input) {
        return true;
    }

    private boolean handleSystemCommands(String input) {
        switch (input) {
            case "q":
            case "quit":
                hasQuit = true;
                return true;
            default:
                return false;
        }
    }
}
