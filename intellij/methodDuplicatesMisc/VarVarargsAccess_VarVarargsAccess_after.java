test;
[VarVarargsAccess]
    class A {
    void bar(int i){
        m(i, new String[0]);
        m(i, "a");
        m(i, "a", "b");
    }
  
    void m(int i, String... args) {
      method(i, args);
    }
  
    void method(int i, String... args) {
    }
  }
