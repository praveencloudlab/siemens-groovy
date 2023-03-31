package grails.form

class UserController {
    def saveUser(){
        println(">>>> saving user")
        def user=new User(params)
        println(user.firstName)
        // after saving, redirect tp a view name
        render(view: "status")
    }
    def index() {
        println(">>>>>> index.... ")
        def user=new User()
        render(view: 'newUser',model: [user:user])
    }
}
