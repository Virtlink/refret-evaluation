test;
[heavilyBrokenFile9]
    class X {
    void test() {
      final List<String> list;
      <caret>list = .foo;
    }
  }
