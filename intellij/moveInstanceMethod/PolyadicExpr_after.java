test;
[Test]
    class A {

      void n(B [[@2|b]]) {
          [[->1|&2|m(this)|b.m(this)]];
      }

  }

  class B {
      private final int i;

      public B(int i) {
          this.i = i;
      }


      public int getI() {
          return i;
      }

      void [[@1|m]](A a) {
          System.out.print("display for me the shape" + a + " " + getI() + "times");
      }
  }
