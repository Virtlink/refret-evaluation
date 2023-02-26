test;
[Test]
    class Test {
    class A {
      private Integer [[1|i]] = 0;

    }

    class B extends A {
      void bar(A a) {
          [[->1|i|a.i]].toString();
      }
    }
  }
