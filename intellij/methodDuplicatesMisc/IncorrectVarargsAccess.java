test;
[Test]
    class A {
    void bar(int i){
      method(1);
      method(i, "a");
      method(1, "a", "b");
    }
  
    void m<caret>(String... args) {
      method(1, args);
    }
  
    void method(int i, String... args) {
    }
  }
