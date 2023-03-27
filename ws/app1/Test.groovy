def name="Praveen"
def age=994
println "Name is ${name}"

// GString

def s1="Name is ${name} and age is ${age}"
println s1

person {
    name 'John Doe'
    age 30
    address {
        street '123 Main St'
        city 'Anytown'
        state 'CA'
        zip '12345'
    }
}

