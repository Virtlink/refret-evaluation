test;
[ParamWithNoConstructor]
    public class P {
    public P(Class clazz) {
    }
  }
  
  class PP extends P {
      PP(Class clazz) {
          super(clazz);
      }
  }
