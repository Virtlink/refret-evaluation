test;
[Test]
    interface A {
    void foo(int i);
  }
  class B {
    B(A <caret>a) {
      System.out.println(a);
    }
  }
  class C {
    B b = new B(i1 -> i1 + 42);
  }
