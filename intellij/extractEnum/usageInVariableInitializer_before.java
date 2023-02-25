test;
[Test]
    class Test {
    public static final int FOO = 0;
    public static final int BAR = 2;
    void foo() {
      System.out.println(FOO);
    }
  }
[Usage]
    class Usage {
    void foo() {
      int i = Test.FOO;
    }
  
    void bar(int i ) {
      i = B;
    }
  }
