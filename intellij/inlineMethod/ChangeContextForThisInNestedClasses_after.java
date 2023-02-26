test;
[Test]
    abstract class Test {

      void [[1|foo]]() {
    }
  }
  class Test2 extends Test {

    {
        new Object() {
          void foo() {
            [[->1|Test.this.foo|Test2.this.foo]]();
          }
        };
    }
  }
