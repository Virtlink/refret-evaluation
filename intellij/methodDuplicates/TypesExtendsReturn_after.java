test;
[Test]
    class Types {
    public String method(Object v) {
      return v.toString();
    }
  
    public void context() {
      String v = "child type";
      Object o = method(v);
    }
  }
  
