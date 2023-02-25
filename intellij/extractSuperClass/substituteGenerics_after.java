test;
[B]
    public class B extends A<String> {
      public B(String e) {
          super(e);
      }
  }
  
[AB]
    public class AB extends B {
    public AB(String s) {
      super(s);
    }
  }
  
[A]
    public class A<E> {
    public A(E e) {
    }
  }
  
