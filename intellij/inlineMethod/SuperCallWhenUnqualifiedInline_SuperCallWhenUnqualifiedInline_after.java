test;
[SuperCallWhenUnqualifiedInline]
    class A {
    void bar() {}
  }
  
  class B extends A {
    void foo() {
      super.bar();
    }
  
    void err() {
        super.bar();
    }
  }
