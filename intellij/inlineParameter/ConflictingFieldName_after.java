test;
[Test]
    class A {
      private String [[@1|f]];

      public void m() {
          m1();
      }

      private void m1() {
          String f = [[->1|f|this.f]];
          if (!f.isEmpty()) {
              System.out.println(f);
          }
      }
  }
