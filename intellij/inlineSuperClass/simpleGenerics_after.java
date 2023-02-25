test;
[Usage]
    import p.Test;
  
  class Usage {
    void bar(Test s) {
      s.foo(null);
    }
  }
[p] {
[Test]
    package p;
  
  public class Test {
      public void foo(String t) {
        System.out.println("Hello");
      }
  }
}
