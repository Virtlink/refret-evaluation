test;
[A]
    import java.io;
  
  class A {
      public void test() {
          Object i = new Object() {
              public class A {
              }
            
              private A myA = new A();
            
              public String toString() {
                  A a = new A();
                  return a.toString();
              }
          };
      }
  }
  
  
