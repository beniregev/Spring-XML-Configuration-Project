package model;

import java.util.List;

/**
 * <p>
 *     <div>Create a bean that has a property which is a list of string items.</div>
 *     <div>1. Create simple bean class - {@code TaskB}.</div>
 *     <div>2. Create Spring bean configuration file {@code spring-config.xml}.</div>
 *     <div>3. Configure collections as a bean property.</div>
 * </p>
 * @author Binyamin Regev
 */
public class TaskB {
    private List<String> listOfStrings;

    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    public void setListOfStrings(List<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public void displayStrings() {
        System.out.println("\tList of Strings are: " + listOfStrings);
        //this.listOfStrings.forEach(System.out::println);
    }
}
