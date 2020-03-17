package model;

/**
 * <p>
 *     This class (bean) is a singleton that is used as a
 *     property of {@link TaskG} class
 * </p>
 * @author Binyamin Regev
 */
public class SingletonTaskG {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
