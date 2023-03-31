package product.application

class Product {
    int id
    String name
    BigDecimal price
    String description

    static constraints = {
        id(autoIncrement: true)
        name nullable: false, blank: false
        price nullable: false, min: 0.0
        description nullable: true, maxSize: 500
    }
}
