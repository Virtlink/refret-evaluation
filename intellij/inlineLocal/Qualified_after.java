test;
[A]
    public class A {
    int f = 23;
  
    static class B {
      static int f = 42;
    }
  
    int foo() {
        A B = this;
      return A.B.f;
    }
  
    public static void main(String[] args) {
      System.out.println(new A().foo());
    }
  }
