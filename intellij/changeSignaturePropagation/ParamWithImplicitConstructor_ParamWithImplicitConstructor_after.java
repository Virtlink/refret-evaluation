test;
[ParamWithImplicitConstructor]
    public class P {
    public P(Class clazz) {
    }
  }
  
  class PP extends P {
    public PP(Class clazz){
        super(clazz);
    }
  }
