test;
[Test]
    class Test {
    public static final int FOO = 0, BAR = 2;
    void foo() {
      System.out.println(FOO);
    }
  }
[Usage]
    class Usage {
    void foo(int i) {
          switch (i) {
              case Test.FOO:
                  break;
              case Test.BAR:
                  break;
          }
      }
  
      void foobar() {
          foo(Test.FOO);
          foo(Test.BAR);
      }
  }
