test;
[Test]
    class A {
  }

  class [[@b|B]] {

      void bar() {
        new Runnable() {
          @Override
          public void run() {
            System.out.println([[->b|b|B.this]]);
          }
        }.run();
      }
  }
