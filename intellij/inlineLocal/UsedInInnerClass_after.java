test;
[Test]
    class A {
      void foo(final MyObject obj) {
          new Runnable() {
              public void run() {
                  System.out.println(obj);
              }
          }.run();
      }
  }
