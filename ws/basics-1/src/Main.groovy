static void main(String[] args) {
  def s1="Abc"
  s1=100

  println "${s1}"

  def myData={name->
    println("Hello ${name}")
  }

  myData("Praveen")
  myData("John")

  def numbers=[3,54,32,89,98,12]

          def evenNos=numbers.findAll{it%2==0}
        println(evenNos)

}
