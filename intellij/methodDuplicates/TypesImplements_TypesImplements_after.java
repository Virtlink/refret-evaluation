test;
[TypesImplements]
    class Types {
    public char method(CharSequence v) {
      return v.charAt(0);
    }
  
    public void context() {
      String v = "child type";
      char c = method(v);
    }
  }
  
