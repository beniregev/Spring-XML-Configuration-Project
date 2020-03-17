package model;

/**
 * <p>
 *     <div>Create a bean that has: </div>
 *     <div>1. a property that refers to another bean. </div>
 *     <div>2. a property of type string. </div>
 * </p>
 * @author Binyamin Regev
 */
public class TaskA {
    private String stringProp;
    private PropertyTaskA propertyTaskA;

    public PropertyTaskA getPropertyTaskA() {
        return propertyTaskA;
    }

    public void setPropertyTaskA(PropertyTaskA propertyTaskA) {
        this.propertyTaskA = propertyTaskA;
    }

    public String getStringProp() {
        return this.stringProp;
    }

    public void setStringProp(String stringProp) {
        this.stringProp = stringProp;
    }
}
