test;
[Test]
    class A {
    void bar(int i){
        m(new String[0]);
        method(i, "a");
        m("a", "b");
    }
  
    void m(String... args) {
      method(1, args);
    }
  
    void method(int i, String... args) {
    }
  }
