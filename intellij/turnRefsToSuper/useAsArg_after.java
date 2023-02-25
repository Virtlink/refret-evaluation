test;
[Client]
    
  import javax.swing.*;
  
  public class Client {
    {
      AClass aClass = new AClass();
      SwingUtilities.invokeLater(aClass);
    }
  
    void method(void) {
       Runnable r = new AClass();
       SwingUtilities.invokeLater(r);
    }
  }
  
[I]
    
  public interface I {
  }
  
[AClass]
    
  public class AClass implements Runnable, I{
  }
  
