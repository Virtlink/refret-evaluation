test;
[CantBeInvokedOnReference]
    public class Simple {}
  
  class Usage {
    void foo() {
      Simple s = new Si<caret>mple();
    }
  }
