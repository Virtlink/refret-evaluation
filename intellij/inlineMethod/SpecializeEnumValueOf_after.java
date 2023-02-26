test;
[foo.bar.baz] {
[Test]
    package foo.bar.baz;

  class Test {
    enum X {A, [[B|B]], C};

    void test() {
        System.out.println([[->B|B|X.B]]);
    }
  }
}
