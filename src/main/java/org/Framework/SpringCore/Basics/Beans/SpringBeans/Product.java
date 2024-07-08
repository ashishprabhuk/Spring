package org.Framework.SpringCore.Basics.Beans.SpringBeans;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String productId;
    private String productName;

    // Constructor
    public Product() {}

    // Getter for productId
    public String getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }
}
