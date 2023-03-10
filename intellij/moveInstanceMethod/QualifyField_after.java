test;
[Test]
    // Unsupported: guess access through field `flam`.

    class Flim {
      Flam [[@3|flam]] = new Flam();

      public static void main(String[] args) {
          Flim [[@2|flim]] = new Flim();
          [[->1|&2|&3|flim.beep()|flim.flam.beep()]];
      }
  }

  class Flam {
      void [[@1|beep]]() {}
  }

