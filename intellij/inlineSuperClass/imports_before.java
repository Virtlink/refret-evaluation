test;
[p1] {
[Super]
    package p1;
  public class Super {
     public void foo() {
       System.out.println("Hello");
     }
  }
[Usage]
    package p1;
  class Usage {
    void bar(Super s) {
      s.foo();
    }
  }
}
[p] {
[Test]
    package p;
  import p1.*;
  public class Test extends Super {} 
}
