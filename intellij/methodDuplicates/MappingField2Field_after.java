test;
[Test]
    class Mapping1 {
    private int myInt;
    public void method() {
      int i = myInt;
    }
    public void context() {
        method();
    }
  }
  
  class Mapping2 {
    private int myInt;
    public void context() {
      int i = myInt;
    }
  }
  
