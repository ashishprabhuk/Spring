package org.Framework.SpringCore.Basics.Beans.SpringBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Product product = context.getBean(Product.class);
        product.setProductId("P123");
        product.setProductName("Laptop");
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
    }
}
