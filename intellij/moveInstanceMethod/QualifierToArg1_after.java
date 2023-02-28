test;
[Test]
    class CommandQueue {

      void [[@1|f]]() {
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
          [[->1|myManager.getCommandQueue().f()]];
      }
  }
