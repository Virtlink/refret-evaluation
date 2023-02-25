test;
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
