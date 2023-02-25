test;
[package2.test] {
[A]
    package package2.test;
  
  public class A {
      static Object method() {
          return null;
      }
  }
}
[Usage]
    public class Usage {
      Object method() {
          return package2.test.A.method();
      }
  }
