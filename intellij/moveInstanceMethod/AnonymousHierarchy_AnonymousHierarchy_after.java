test;
[AnonymousHierarchy]
    public class Test {
  
  }
  
  class Bar {
      public boolean perform() {
          final Dialog dialog = new Dialog() {
                      protected void invokeRefactoring() {
                           doRefactor();
                      }
  
                  };
          dialog.show();
          return dialog.isOK();
      }
  }
  
  class ID {
      void doRefactor() {
  
      }
  }
  
  class Dialog extends ID {
      public void show() {
      }
  
      public boolean isOK() {
          return false;
      }
  }
