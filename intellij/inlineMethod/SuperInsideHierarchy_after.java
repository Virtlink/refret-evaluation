test;
[Test]
    class A {
    void [[@1|foo]](){
      //do smth in A
    }
  }

  class B extends A {

      void test(){
          [[->1|foo|super.foo]]();  // Context: super
      }

    void foo() {
      //do smth
    }
  }
