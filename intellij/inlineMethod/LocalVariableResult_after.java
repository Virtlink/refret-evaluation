test;
[Test]
    class A {

      Integer f(int i) {
          Integer [[@2|result]];
          if (i > 0) {
              [[->1|result]] = new Integer(i);
          }
          else {
              Integer [[@1|result]];
              [[->1|result]] = new Integer(0);
              [[->1|result]] = [[->1|result]];
          }
          return result;
      }

  }
