package model;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * <b>*** Bonus: ***</b>
 * <br/>
 * <p>
 *     <div>Create a singleton bean A which has a getter for bean B (getB). and bean B.</div>
 *     <div>i.	    Each time you call getB(), it should get a new instance of B.</div>
 *     <div>ii.	    Implement this in 2 ways.</div>
 *     <div>iii.    Hint: </div>
 *     <div>option 1: Use ‘lookup-method’ element in bean A. By calling {@code context.getBean("beanB")}.</div>
 *     <div>option 2: Configure ObjectFactory on bean A that will create bean B.</div>
 *     <code>
 *         private ObjectFactory<BeanB> option2
 *         BeanB beanB = option2.
 *     </code>
 * </p>
 * <p>
 *     <div>
 *         This class {@code TaskG} is the singleton bean A and {@link BeanB} is bean B
 *         that will be created by the 2 options
 *     </div>
 * </p>
 * @author Binyamin Regev
 */
public class TaskG {
    private final int LOOKUP_METHOD = 1;
    private final int OBJECT_FACTORY = 2;

    private ApplicationContext context;
    ObjectFactory<BeanB> objectFactory;
    private BeanB beanB;
    private BeanB newBeanB;

    public BeanB getB(final int option) {
        BeanB newBeanB = null;
        switch (option) {
            case LOOKUP_METHOD:
                System.out.println("Option 1: Lookup-method");
                newBeanB = getBeanBOption1();
                break;
            case OBJECT_FACTORY:
                System.out.println("Option 2: ObjectFactory");
                newBeanB = getBeanBOption2();
                break;
        }
        return newBeanB;
    }

    private BeanB getBeanBOption1() {
        BeanB newBeanB = objectFactory.getObject();
        if (newBeanB == beanB) {
            System.out.println("The new BeanB is the same as existing BeanB? " + (newBeanB == beanB) + " ... " + newBeanB);
        }
        return newBeanB;
    }

    private BeanB getBeanBOption2() {
        BeanB newBeanB = objectFactory.getObject();
        if (newBeanB == beanB) {
            System.out.println("The new BeanB is the same as existing BeanB? " + (newBeanB == beanB) + " ... " + newBeanB);
        }
        return newBeanB;
    }

    public void displayMessage() {
        ApplicationContext context = ApplicationContextProvider.getApplicationContext();
        System.out.println("ApplicationContext contains bean TaskG? " + context.containsBean("taskG"));
    }
}
