test;
[Test]
    
  class Foobar {
      void m(Foobar _local) {
          class Local {
              {
                  System.out.println(_local);
              }
          };
      }
  }
  
