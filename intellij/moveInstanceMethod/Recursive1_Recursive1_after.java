test;
[Recursive1]
    class FirstClass {
  
      void y() {
          new SecondClass().x();
      }
  }
  
  class SecondClass {
      SecondClass g() { return null; }
  
      void x() {
          if (this != null) g().x();
      }
  }
