test;
[Test]
    class Test {
    void doTest(boolean <caret>b) {}
    void doTest() {
      doTest(false);
    }
  }
