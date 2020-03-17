package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

@SuppressWarnings("unchecked")
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextProvider.applicationContext = applicationContext;
    }

    public static <T> T getBeanByName(String beanName) {
        return (T) getContext().getBean(beanName);
    }

    public static <T> Map<String, T> getBeansOfType(Class<T> type) {
        return getContext().getBeansOfType(type);
    }

    public static ApplicationContext getContext() {
        if (applicationContext == null) {
            throw new IllegalStateException("The applicationContext member has not been injected (yet).");
        }
        return applicationContext;
    }

}
