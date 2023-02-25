test;
[package1.test] {
[A]
    package package1.test;
  
  public class A {
      static Object method() {
          return null;
      }
  }
}
[Usage]
    public class Usage {
      Object method() {
          return package1.test.A.method();
      }
  }
