test;
[UsedInInnerClass2]
    class A {
      void foo(final MyObject obj) {
          new Runnable() {
              public void run() {
                  System.out.println(obj);
              }
          }.run();
      }
  }
