test;
[SimpleConstant]
    class Test {
      public static final String ABC = "abc";
      void foo() {
          System.out.println(ABC);
      }
  }
  
  class Foo {
      void bar() {
          System.out.println(Test.ABC);
      }
  }
