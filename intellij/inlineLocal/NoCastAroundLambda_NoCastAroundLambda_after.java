test;
[NoCastAroundLambda]
    class Test {
    void test() {
        a(System::exit);
    }
  
    void a(I b) {}
  
    interface I {
      void i(int i);
    }
  }
  
