package product.application

import grails.gorm.transactions.Transactional


@Transactional
class ProductController {

    def index() {
        redirect(action: "list")
    }

    def list() {
        [productList: Product.list()]
    }

    def create() {
        [productInstance: new Product()]
    }

    def save() {
        def productInstance = new Product(params)
        if (productInstance.save(flush: true)) {
            flash.message = "Product successfully added"
            redirect(action: "list")
        } else {
            render(view: "create", model: [productInstance: productInstance])
        }
    }

    def edit(int id) {
        def productInstance = Product.get(id)// pulls data from database against id
        if (!productInstance) {
            flash.message = "Product not found"
            redirect(action: "list")
            return
        }
        [productInstance: productInstance]
    }

    def update(int id) {
        def productInstance = Product.get(id)
        if (!productInstance) {
            flash.message = "Product not found"
            redirect(action: "list")
            return
        }

        productInstance.properties = params

        if (productInstance.save(flush: true)) { // save will save to database if primary key is not available. otherwise it with edit
            flash.message = "Product successfully updated"
            redirect(action: "list")
        } else {
            render(view: "edit", model: [productInstance: productInstance])
        }
    }

    def delete(int id) {
        def productInstance = Product.get(id)
        if (!productInstance) {
            flash.message = "Product not found"
            redirect(action: "list")
            return
        }
        productInstance.delete(flush: true)
        flash.message = "Product successfully deleted"
        redirect(action: "list")
    }
}
