test;
[Test]
    class Mapping {
    private int myInt;
    private Mapping myField;
  
    public void method(Mapping m) {
      myInt = m.hashCode();
    }
  
    public void context1() {
        method(Mapping.this);
    }
  
    public void context2() {
        method(this);
    }
  }
  
