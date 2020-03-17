package model;

import java.util.List;

/**
 * <p>
 *     Create a bean that has one property which is a
 *     list of items (each of that item refers to other
 *     bean) and another property that refers to another
 *     bean.
 * </p>
 * @author Binyamin Regev
 */
public class TaskC {
    private List<PropertyTaskC> listOfPropertyTaskCs;
    private PropertyTaskC propertyTaskC;

    public List<PropertyTaskC> getListOfPropertyTaskCs() {
        return listOfPropertyTaskCs;
    }

    public void setListOfPropertyTaskCs(List<PropertyTaskC> listOfPropertyTaskCs) {
        this.listOfPropertyTaskCs = listOfPropertyTaskCs;
    }

    public PropertyTaskC getPropertyTaskC() {
        return propertyTaskC;
    }

    public void setPropertyTaskC(PropertyTaskC propertyTaskC) {
        this.propertyTaskC = propertyTaskC;
    }

    public void displayProperties() {
        System.out.print("\tList of PropertyTaskCs are: ");
        this.listOfPropertyTaskCs.forEach(x -> System.out.print(x.getId() + ", \"" + x.getName() + "\"; "));
        System.out.println("\n\tPropertyTaskC is { id: " + propertyTaskC.getId() + ", name: \"" + propertyTaskC.getName() + "\" }");
    }

}
