import java.lang.*;
import java.util.Scanner;
import com.cezary.Expression;

/**
 * Program which imitate work of terminal in system based on Linux kernel. You can show all commands by typing 'show opitions'.
 * @author Cezary Daniłowski
 * @version 1.0 1st February 2019
 */

public class Main {
    /**
     * Main function to call all others methods of implementations of classes.
     * @param args
     */

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
	    System.out.print("Terminal 2019 (R) Cezary Daniłowski\n");

	    while (true) {
	        System.out.print(" > ");
            String command = in.next();

            if (command.equals("echo")) {
                String argument = in.nextLine();
                Expression expression = new Expression(command, argument);
                expression.choice();
            } else if (command.equals("exit")) {
                in.close();
                Expression.exit();
            } else {
                Expression expression = new Expression(command);
                expression.choice();
            }
        }
    }
}
