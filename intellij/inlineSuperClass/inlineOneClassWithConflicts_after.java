test;
[Super]
    abstract class Super {
     public abstract void method() {}
  }
[Test]
    class Test {
    public void context() {
      method();
    }
  
    public void method() {}
  }
  
  class Test1 {
     public void method() {}
  }
  
  class U {
    Test t = new Test1();
  }
