package com.mad.backend.dtos;

import com.mad.backend.models.Product;

/**
 * Created by alex on 2/25/17.
 */
public class ProductDto {

    private Integer id;
    private Integer price;
    private Integer quantity;
    private Integer supplierId;
    private String name;
    private String description;

    public ProductDto() {
        // initialize with non-existing ids to prevent exception throwing when used by repositories
        this.id = -1;
        this.supplierId = -1;
    }

    public ProductDto(Product product) {
        this.id = product.getId();
        this.price = product.getPrice();
        this.quantity = product.getQuantity();
        this.supplierId = product.getSupplier().getId();
        this.name = product.getName();
        this.description = product.getDescription();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
