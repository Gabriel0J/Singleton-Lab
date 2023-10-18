import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MessageLogger {
    private static MessageLogger single_instance = null;
    private File log;
    private FileWriter logger;
    private Scanner scan;

    private MessageLogger() {
        try {
            log = new File("msgs.txt");
            logger = new FileWriter(log);
            scan = new Scanner(log);
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
    public static MessageLogger getInstance() {
        if (single_instance == null) {
            single_instance = new MessageLogger();
        }
        return single_instance;
    }

    public void logMessage(String message) {
        try {
            logger.write(message+"\n");
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
    public void printAll() {
        try {
            logger.close();
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
