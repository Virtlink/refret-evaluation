test;
[Test]
    class A {
    void m() {
      class Local {}
      n();
    }
    void n() {}
  }

  class B extends A {
    void [[1|n]]() {}
  }

  class C extends B {
    {
        class Local {}
        [[->1|n]]();
    }
  }
