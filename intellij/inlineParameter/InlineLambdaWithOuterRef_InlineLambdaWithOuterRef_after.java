test;
[InlineLambdaWithOuterRef]
    interface A {
    void foo(int i);
  }
  class B {
    B() {
      System.out.println((A) i1 -> i1 + 42);
    }
  }
  class C {
    {
        B b = new B();
    }
  }
