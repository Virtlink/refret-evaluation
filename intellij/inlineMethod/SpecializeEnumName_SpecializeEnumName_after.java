test;
[foo.bar.baz] {
[SpecializeEnumName]
    package foo.bar.baz;
  
  class Test {
    enum X {A, B, C};
  
    void test() {
        System.out.println("A");
    }
  }
}
