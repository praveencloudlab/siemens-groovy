package com

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Product {
    @Id
    int id;
    String name;
    float price;
    String description;

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    float getPrice() {
        return price
    }

    void setPrice(float price) {
        this.price = price
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }
}
