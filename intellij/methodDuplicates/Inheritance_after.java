test;
[Inheritance]
    public class Inheritance {}
  
  class Base {
    void foo(){
      System.out.println("");
    }
  }
  
  class Child extends Base {
     void bar() {
         foo();
     }
  }
