test;
[A]
    public class A {
  }
  
  class B {
    void foo(String s) {
      System.out.println(s);
    }
  
      void foo() {
        foo("");
        if (false) {
          foo();
        }
    }
  }
  
  
  
