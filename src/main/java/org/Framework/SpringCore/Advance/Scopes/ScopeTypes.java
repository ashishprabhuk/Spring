package org.Framework.SpringCore.Advance.Scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class ScopeTypes {

    // Singleton Scope
    @Component
    public static class SingletonBean{ // Default -> Singleton Scope
        // Singleton bean implementation
        public SingletonBean(){
            System.out.println("SingletonBean instance created");
        }
    }

    // Prototype Scope
    @Component
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public static class PrototypeBean{
        // Singleton bean implementation
        public PrototypeBean(){
            System.out.println("PrototypeBean instance created");
        }
    }

    // Request Scope
    @Component
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public static class RequestBean {
        public RequestBean() {
            System.out.println("RequestBean instance created");
        }
    }

    // Session Scope
    @Component
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public static class SessionBean {
        public SessionBean() {
            System.out.println("SessionBean instance created");
        }
    }

    // Application Scope
    @Component
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public static class ApplicationBean {
        public ApplicationBean() {
            System.out.println("ApplicationBean instance created");
        }
    }
    

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ScopeTypes.class)){
            System.out.println(context.getBean(SingletonBean.class));
            System.out.println(context.getBean(SingletonBean.class));
            System.out.println(context.getBean(SingletonBean.class));
            System.out.println();
            System.out.println(context.getBean(PrototypeBean.class));
            System.out.println(context.getBean(PrototypeBean.class));

            // Request, Session, and Application scopes are typically tested in web applications.

        }
    }
}