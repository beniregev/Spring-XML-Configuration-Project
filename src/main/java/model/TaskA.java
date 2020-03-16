package model;

/**
 * Create a bean that has:
 *      i.	a property that refers to another bean
 *      ii.	a property of type string.
 * @author Binyamin Regev
 */
public class TaskA {
    private String stringProp;
//    private TaskAProp taskAProp;
//    public TaskA(TaskAProp taskAProp) {
//        this.taskAProp = taskAProp;
//    }
//    public TaskAProp getTaskAProp() {
//        return taskAProp;
//    }
//    public void setTaskAProp(TaskAProp taskAProp) {
//        this.taskAProp = taskAProp;
//    }

    public String getStringProp() {
        return this.stringProp;
    }

    public void setStringProp(String stringProp) {
        this.stringProp = stringProp;
    }
}
