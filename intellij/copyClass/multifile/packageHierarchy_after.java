test;
[p2.p1.p11] {
[S11]
    package p2.p1.p11;
  class S11 {}
}
[p2.p1] {
[S2]
    package p2.p1;
  
  public class S2 {
    S1 s1;
    void foo() {
      s1.foo();
    }
  }
[S1]
    package p2.p1;
  
  public class S1 {
    S2 s2;
    void foo() {
      s2.foo();
    }
  }
}
[p1.p11] {
[S11]
    package p1.p11;
  class S11 {}
}
[p1] {
[S2]
    package p1;
  public class S2 {
    S1 s1;
    void foo() {
      s1.foo();
    }
  }
[S1]
    package p1;
  public class S1 {
    S2 s2;
    void foo() {
      s2.foo();
    }
  }
}
