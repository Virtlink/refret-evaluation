test;
[Test]
    class A {
    {
        m(new String[0]);
        m("a");
        m("a", "b");
    }
  
    void m(String... args) {
      method(1, args);
    }
  
    void method(int i, String... args) {
    }
  }
