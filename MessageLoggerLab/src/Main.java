// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MessageLogger messageLogger = MessageLogger.getInstance();
        messageLogger.logMessage("Message #1");
        messageLogger.logMessage("Message #2");
        messageLogger.logMessage("Message #3");
        messageLogger.printAll();
    }
}