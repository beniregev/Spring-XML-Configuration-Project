package model;

/**
 * <p>
 *     Create a bean that has an init() method that is
 *     called after the bean is initialized, and print
 *     “Hello World”.
 * </p>
 * @author Binyamin Regev
 */
public class TaskF {
    public void init() {
        System.out.println("TaskF.init() say: Hello World");
    }

    public void showMessage() {
        System.out.println("\tMessage from init() method was printed already, see at the beginning of the log.");
    }
}
