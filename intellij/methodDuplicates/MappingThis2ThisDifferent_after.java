test;
[Test]
    class Mapping1 {
    private int myInt;
    public void method() {
      Object o = this;
    }
    public void context() {
        method();
    }
  }
  
  class Mapping2 {
    private int myInt;
    public void context() {
      Object o = this;
    }
  }
  
