test;
[Test]
    class Foo {
      void m(Runnable r) {}
      void ff(Runnable r) {
          m(r);
      }
      {
          m(() -> {});
      }
  }
