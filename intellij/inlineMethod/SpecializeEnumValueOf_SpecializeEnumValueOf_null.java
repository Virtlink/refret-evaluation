test;
[foo.bar.baz] {
[SpecializeEnumValueOf]
    package foo.bar.baz;
  
  class Test {
    enum X {A, B, C};
  
    void test() {
      System.out.println(X.value<caret>Of("B"));
    }
  }
}
