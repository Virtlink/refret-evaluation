test;
[Test]
    class Test {
    class A {
      private Integer [[@1|i]] = 0;

    }

    class B extends A {
      void bar(A [[@2|a]]) {
          [[->1|&2|i|a.i]].toString();
      }
    }
  }
