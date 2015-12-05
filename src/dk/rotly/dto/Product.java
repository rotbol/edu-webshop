package dk.rotly.dto;

import java.math.BigDecimal;

public class Product {

  String productName;
  String description;
  BigDecimal price;
  
  public Product() {
    super();
  }

  public Product(String productName, String description, BigDecimal price) {
    super();
    this.productName = productName;
    this.description = description;
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
