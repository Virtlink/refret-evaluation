test;
[MappingLocalVar2LocalVar]
    class Mapping {
    public void method() {
      Mapping methodVar = new Mapping();
      methodVar.hashCode();
    }
  
    public void context() {
        method();
    }
  }
  
