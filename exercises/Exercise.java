import java.util.HashMap;
import java.util.Scanner;;

public abstract class Exercise {
    
    private static Scanner scanner = new Scanner(System.in);
    
    abstract String getTitle();
    abstract String[] getOptions();
    abstract void selectOption(int option);

    void run() {
        println("*******************************************");
        println(getTitle().toUpperCase());
        println("*******************************************");
        String[] options = getOptions();
        for (int i = 0; i < options.length; i++) {
            println(i + 1, "-", options[i]);
        }
        print("Enter option: ");
        int option = readInt();
        selectOption(option - 1);
    }


	public static void println(Object... args) {
		for (Object arg : args) {
			System.out.print(arg.toString() + " ");
		}
		System.out.println("");
    }

	public static void print(Object... args) {
		for (Object arg : args) {
			System.out.print(arg.toString());
		}
    }

    public static String readString() {
        return scanner.next();
    }

    public static int readInt() {
        return scanner.nextInt();
    }
}