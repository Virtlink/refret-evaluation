test;
[Test]
    class Mapping {
    private int myInt;
  
    public void method() {
      this.myInt++;
      Mapping.this.myInt--;
      myInt += hashCode();
    }
  
    public void context() {
        method();
    }
  }
  
