test;
[Test]
    class A {
    void [[@1|bar]]() {}
  }

  class B extends A {
    void foo() {
      super.bar();
    }

    void err() {
        [[->1|bar|super.bar]]();
    }
  }
