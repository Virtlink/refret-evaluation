test;
[Test]
    class A {
  }
  
  class B extends A {
    public void foo() {}
  
    void err() {
    }
  }
  
  class C extends B {
    @Override
    public void foo() {}
  }
  
  class B1 extends A {
    public void foo() {}
  
    void err() {
    }
  }
  
  interface IA {
    void foo();
  }
  
  class C1 extends B implements IA {
    @Override
    public void foo() { }
  }
