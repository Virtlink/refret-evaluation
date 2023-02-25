test;
[pack1] {
[C]
    package pack1;
  public class C {
      static void bar(){}
  }
[A]
    package pack1;
  
  public class A {
  
      public static void foo() {
          C.bar();
      }
  }
}
