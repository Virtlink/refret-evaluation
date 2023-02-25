test;
[pack1] {
[Usage]
    package pack1;
  
  class Usage {
      @A(intValue = 11)
      void foo() {
      }
  
      @A(intValue = 42)
      void bar() {
      }
  }
[A]
    package pack1;
  
  public @interface A {
      int intValue();
  }
}
