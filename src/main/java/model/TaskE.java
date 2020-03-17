package model;

/**
 * <p>
 *     Create a bean that is initialized with a constructor
 *     that gets a string value.
 * </p>
 * @author Binyamin Regev
 */
public class TaskE {
    private String message;

    public TaskE(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
