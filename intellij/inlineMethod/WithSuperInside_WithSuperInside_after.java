test;
[WithSuperInside]
    public class Usage {
    void foo() {
        new W() {
          protected void www() {
            super.www();
          }
        };
    }
  
  }
  
  class W {
    protected void www() {}
  }
