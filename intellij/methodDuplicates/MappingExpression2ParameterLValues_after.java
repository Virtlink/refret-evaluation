test;
[Test]
    class Mapping {
    private Mapping myMapping;
  
    public void <caret>method(Mapping m) {
      m = null;
    }
  
    public void context() {
        method(this.myMapping);
    }
  }
  
