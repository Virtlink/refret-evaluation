test;
[Test]
    class StaticMethodReplacement {
    static void main(StaticMethodReplacement r) {
      r.bar();
    }
  
    void bar(){}
  
    void foo() {
        main(StaticMethodReplacement.this);
    }
  }
