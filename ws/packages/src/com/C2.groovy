package com

public class C2 {

    static void main(String[] args) {
        println("Hello C2")

        def c1Obj=new C1();
        c1Obj.id1;
        c1Obj.id2; // default scope
        c1Obj.id3  // valid
        c1Obj.id4; // invalid

    }


}
