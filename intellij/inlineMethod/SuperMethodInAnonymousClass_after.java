test;
[Test]
    class A {

      public void g() {
      }
    }

    class B extends A {
      public void [[@1|g]]() {

      }
      public void h() {
        new Runnable() {

          @Override
          public void run() {
              [[->1|g()]];
          }
        }.run();
      }
    }

