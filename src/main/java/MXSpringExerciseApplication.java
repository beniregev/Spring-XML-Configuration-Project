import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MXSpringExerciseApplication {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/config/spring-exercise-config.xml");

    }
}
