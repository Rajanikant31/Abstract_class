package com.company;

abstract class Parent{
void message(){

}
}
class a extends Parent{
    void message(){
        System.out.println("This is first class");
    }
}
class b extends Parent{
    void message(){
        System.out.println("This is second class");
    }
}
public class Main{
    public static void main(String[] args) {
        a c1=new a();
        b c2=new b();
        c1.message();
        c2.message();
    }
}

