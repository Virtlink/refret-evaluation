test;
[Test]
    class CommandQueue {
  
      void f() {
      }
  }
  
  class CommandManager {
  
      void g() {
  
      }
  
      CommandQueue getCommandQueue() {
          return null;
      }
  }
  
  class Application {
      CommandManager myManager;
      {
          myManager.getCommandQueue().f();
      }
  }
