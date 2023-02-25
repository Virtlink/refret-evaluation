test;
[pack1] {
[C]
    package pack1;
  public class C {}
[A]
    package pack1;
  
  public class A {
      private static void bar(){}
  
      public static void foo() {
          bar();
      }
  }
}
