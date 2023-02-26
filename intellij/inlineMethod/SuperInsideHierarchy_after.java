test;
[Test]
    class A {
    void [[1|foo]](){
      //do smth in A
    }
  }

  class B {

      void test(){
          [[->1|foo|super.foo]]();
      }

    void foo() {
      //do smth
    }
  }
