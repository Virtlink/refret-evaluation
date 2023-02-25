test;
[B]
    public class B extends A<String>{
    public B(String s) {
      super(s);
    }
  }
  
[A]
    public class A<E> {
    public A(E e) {
    }
  }
  
