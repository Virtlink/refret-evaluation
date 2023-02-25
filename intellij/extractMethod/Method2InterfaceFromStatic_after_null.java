test;
[Method2InterfaceFromStatic]
    interface I {
      static void foo () {
          newMethod();
      }
  
      static void newMethod() {
          System.out.println("hello");
      }
  }
