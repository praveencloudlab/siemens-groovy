static void main(String[] args) {
  println "Hello world!"


  // Collection API

  /**
   * List
   * Set
   * Map
   */

  def list=[1,5,43,2,45,3,5]
  //println(list)
  //println(list[3])
  // iterate
  // for loop

  /*
  for(int i=0;i<list.size();i++){
    print(list[i]+" ")
  }

  println()
  for(int i=list.size()-1;i>=0;i--){
    print(list[i]+" ")
  }
  */


  // for each
  //list.forEach {it->println(it)} // recursive functions

  //def setObj=[10,54,87,2,12,5,54] as Set
  //println(setObj)
  //println(setObj.size())
  def map1 = [name: "John", age: 30,'name':'Abc']
  println(map1.get("name"))
  println(map1)

















}