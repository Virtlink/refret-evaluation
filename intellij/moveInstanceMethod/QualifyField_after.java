test;
[Test]
    class Flim {
      Flam flam = new Flam();
  
      public static void main(String[] args) {
          Flim flim = new Flim();
          flim.flam.beep();
      }
  }
  
  class Flam {
      void beep() {}
  }
  
