test;
[Test]
    class Mapping {
    public void method(Mapping methodPar) {
      methodPar.hashCode();
    }
  
    public void context() {
      Mapping contextVar = new Mapping();
        method(contextVar);
    }
  }
  
