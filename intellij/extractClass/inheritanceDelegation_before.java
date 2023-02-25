test;
[I]
    interface I {
    void foo();
  }
[Test]
    class Test implements I {
    void foo() {
       System.out.println("");
    }
  }
