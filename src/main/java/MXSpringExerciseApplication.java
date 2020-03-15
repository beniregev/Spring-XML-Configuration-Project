
import model.TaskA;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MXSpringExerciseApplication {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:/config/spring-exercise-config.xml");
        TaskA taskA = context.getBean("taskA", TaskA.class);
    }
}
