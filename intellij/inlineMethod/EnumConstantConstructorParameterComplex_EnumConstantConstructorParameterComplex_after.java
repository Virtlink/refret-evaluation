test;
[EnumConstantConstructorParameterComplex]
    public enum EEE {
      a(new Object() {
          String evaluate() {
              System.out.println("q");
              return "";
          }
      }.evaluate());
  
      EEE(String s) {
      }
  
  }
  
