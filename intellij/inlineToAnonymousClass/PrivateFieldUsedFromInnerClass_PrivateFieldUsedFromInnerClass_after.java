test;
[PrivateFieldUsedFromInnerClass]
    class A {
  }
  
  class B {
      public void test() {
          Object inner = new Object() {
              private int myNonStaticField = 0;
            
              class InnerNonStatic {
                  private int myInsField = 0;
  
                  public void insMethod() {
                      myNonStaticField += myInsField;
                  }
              }
          };
      }
  }
