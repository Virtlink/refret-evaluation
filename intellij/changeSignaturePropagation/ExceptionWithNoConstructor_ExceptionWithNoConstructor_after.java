test;
[ExceptionWithNoConstructor]
    public class P {
    public P() throws Exception {
    }
  }
  
  class PP extends P {
      PP() throws Exception {
          super();
      }
  }
