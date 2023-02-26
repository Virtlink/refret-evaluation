test;
[foo.bar.baz] {
[Test]
    package foo.bar.baz;
  
  class Test {
    enum X {A, B, C};
  
    void test() {
      System.out.println(X.A.<caret>name());
    }
  }
}
