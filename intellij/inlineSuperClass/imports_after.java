test;
[p1] {
[Usage]
    package p1;
  
  import p.Test;
  
  class Usage {
    void bar(Test s) {
      s.foo();
    }
  }
}
[p] {
[Test]
    package p;
  
  public class Test {
      public void foo() {
        System.out.println("Hello");
      }
  }
}
