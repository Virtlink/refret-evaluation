test;
[Test]
    class FirstClass {

      void y() {
          new SecondClass().[[->1|x]]();
      }
  }

  class SecondClass {
      SecondClass g() { return null; }

      void [[@1|x]]() {
          if (this != null) g().[[->1|x]]();
      }
  }
