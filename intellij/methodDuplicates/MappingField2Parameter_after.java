test;
[Test]
    class Mapping {
    private int myInt;
  
    public void method(int p) {
      myInt = p + 1;
    }
  
    public void context1() {
        method(myInt);
    }
  
    public void context2() {
        method(this.myInt);
    }
  }
  
