test;
[p] {
[B]
    package p;
  
  class B {
      private B() {
          System.out.println("Constructor");
      }
  
      static void foo(){}
  }
  
[A]
    package p;
  
  class A {
      public void test() {
          B.foo();
      }
  
  }
}
