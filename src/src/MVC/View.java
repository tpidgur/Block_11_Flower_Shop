package MVC;

/**
 * View generates an output to the user.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.06.2016)
 */
public class View {
    // Text's constants
    public static final String CREATE_BOUQUET = "\n1) THE FOLLOWING BOUQUET HAS BEEN CREATED:\n";


    /** prints 1 String
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**prints 1-to many strings
     * @param message
     */
    public void concatenationAndPrint(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
    }
}
