test;
[Test]
    class Outer {
  
      public void checkIt() {
          Inner inner = new Inner();
          inner.step1().step2();
          System.out.println(" INNER.I = " + inner.i);
      }
  
      class Inner {
          int i = 3;
  
          public Inner step1() {
              return this;
          }
  
          public Inner step2() {
              i = 2;
              return this;
  
          }
  
  
      }
  }
  
