test;
[foo.impl] {
[B]
    package foo.impl;
  
  public class B {
      public static B getInstance() {
          return null;
      }
  }
  
}
[foo] {
[A]
    package foo;
  
  import foo.impl.B;
  
  public class A {
    public static void main(String[] args) {
      B b = B.getInstance();
    }
  }
  
}
