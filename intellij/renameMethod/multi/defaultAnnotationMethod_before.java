test;
[pack1] {
[Usage]
    package pack1;
  
  class Usage {
      @A(11)
      void foo() {
      }
  
      @A(value = 42)
      void bar() {
      }
  }
[A]
    package pack1;
  
  public @interface A {
      int value();
  }
}
