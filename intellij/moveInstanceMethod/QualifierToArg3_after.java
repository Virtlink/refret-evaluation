test;
[Test]
    class CommandQueue {
  
      void f(CommandManager commandManager) {
        commandManager.notify();
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
          myManager.getCommandQueue().f(myManager);
      }
  }
