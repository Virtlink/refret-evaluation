test;
[pack2] {
[Client]
    
  package pack2;
  
  import pack1.AnInterface;
  
  public class Client {
      {
          AnInterface aClass;
      }
  }
[Client2]
    
  package pack2;
  
  import pack1.AClass;
  import pack1.AnInterface;
  
  public class Client {
      {
          AnInterface aClass = new AClass();
      }
  }
}
[pack1] {
[AClass]
    
  package pack1;
  
  public class AClass implements AnInterface {
  }
[AnInterface]
    
  package pack1;
  
  public interface AnInterface {
  }
}
