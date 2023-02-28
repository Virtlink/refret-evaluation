test;
[Test]
    class Flim {
      Flam flam = new Flam();

      public static void main(String[] args) {
          Flim [[@2|flim]] = new Flim();
          [[->1|&2|flim.beep()|flim.flam.beep()]];
      }
  }

  class Flam {
      void [[@1|beep]]() {}
  }

