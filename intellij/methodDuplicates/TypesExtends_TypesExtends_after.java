test;
[TypesExtends]
    class Types {
    public void method(Object v) {
      int i = v.hashCode();
    }
  
    public void context() {
      String v = "child type";
        method(v);
    }
  }
  
