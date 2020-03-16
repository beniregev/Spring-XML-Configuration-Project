import model.TaskA;
import model.TaskB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MXSpringExerciseApplication {
    public static void main(String[] args) {
        //FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:/config/spring-exercise-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-configuration.xml");
        TaskA taskA =  (TaskA) context.getBean("taskA");
        System.out.println("TaskA String Property is \"" + taskA.getStringProp());
        TaskB taskB =  (TaskB) context.getBean("taskB");
        taskB.displayStrings();
    }
}
