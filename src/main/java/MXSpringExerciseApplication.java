import model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MXSpringExerciseApplication {
    public static void main(String[] args) {
        //FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:/config/spring-exercise-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-configuration.xml");

        ApplicationContextProvider applicationContextProvider = new ApplicationContextProvider();
        applicationContextProvider.setApplicationContext(context);

        System.out.println("Task A: ");
        TaskA taskA =  (TaskA) context.getBean("taskA");
        System.out.println("\tstring Property is \"" + taskA.getStringProp() + "\"");
        System.out.println("\tpropertyTaskA is { id: " + taskA.getPropertyTaskA().getId() + ", name: \"" + taskA.getPropertyTaskA().getName() + "\" }");

        System.out.println("\nTask B: ");
        TaskB taskB =  (TaskB) context.getBean("taskB");
        taskB.displayStrings();

        System.out.println("\nTask C: ");
        TaskC taskC = (TaskC) context.getBean("taskC");
        taskC.displayProperties();

        System.out.println("\nTask D: ");
        TaskD taskD = (TaskD) context.getBean("taskD");
        taskD.displayMap();

        System.out.println("\nTask E: ");
        TaskE taskE = (TaskE) context.getBean("taskE");
        System.out.println("\tThe message is: " + taskE.getMessage());

        System.out.println("\nTask F: ");
        TaskF taskF = (TaskF) context.getBean("taskF");
        taskF.showMessage();

        System.out.println("\nTask G: ");
        TaskG taskG = (TaskG) context.getBean("taskG");
        taskG.displayMessage();

    }
}
