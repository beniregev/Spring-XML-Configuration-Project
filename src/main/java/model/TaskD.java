package model;

import java.util.Map;

/**
 * <p>
 *     Create a bean that has a property which is a map
 *     that its key and value are strings
 * </p>
 * @author Binyamin Regev
 */
public class TaskD {
    private Map<String, String> mapTaskD;

    public Map<String, String> getMapTaskD() {
        return mapTaskD;
    }

    public void setMapTaskD(Map<String, String> mapTaskD) {
        this.mapTaskD = mapTaskD;
    }

    public void displayMap() {
        System.out.print("\tContent of map is: \n\t\t");
        this.getMapTaskD().forEach((k,v) -> System.out.print("{ key: \"" + k + "\", val: \"" + v + "\" } ; "));
        System.out.print("\n");
    }
}
