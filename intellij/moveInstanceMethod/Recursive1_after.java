test;
[Test]
    class FirstClass {

      void y() {
          [[->1|new SecondClass().x()]];
      }
  }

  class SecondClass {
      SecondClass g() { return null; }

      void [[@1|x]]() {
          if (this != null) [[->1|g().x()]];
      }
  }
