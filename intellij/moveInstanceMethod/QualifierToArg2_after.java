test;
[Test]
    class CommandQueue {

      void f(CommandManager [[@2|commandManager]]) {
        [[->1|&2|g|commandManager.g]]();
      }
  }

  class CommandManager {

      void [[@1|g]]() {

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
