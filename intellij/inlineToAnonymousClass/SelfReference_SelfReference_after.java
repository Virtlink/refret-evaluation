test;
[SelfReference]
    class A {
  }
  
  class B {
      private Object b = new Object() {
          private Object myI;
          private Object myI2;
      };
  
  }
