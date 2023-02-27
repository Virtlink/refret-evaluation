test;
[Test]
    class B extends A {
  }

  class A {
    void [[@1|m]](){}
  }

  class C {
      void n(B [[@2|b]]){
        [[->1|&2|m|b.m]]();
      }
  }
