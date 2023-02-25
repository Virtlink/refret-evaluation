test;
[Client]
    
  public class Client {
      {
          ASuper aClass;
          aClass.foo();
      }
  }
[AClass]
    
  public class AClass extends ASuper2 {
      public void foo() {
      }
  }
[ASuper2]
    
  public class ASuper2 extends ASuper {
  }
[ASuper]
    
  public class ASuper {
      public void foo(){}
  }
