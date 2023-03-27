class Abc{
  int a=100; // if sttaic is not mentioned, then its instance
  static int b=2000;

  static void main(String[] args) {
    //a=200;  // invalid
    def obj1=new Abc(); // new operator always stores the object in 'Heap' memory
    obj1.a=87;
    Abc.b=5000; // valid
    println "Hello world123!"
  }
}
