test;
[Test]
    import javax.swing.JComponent;
  
  class IdentityComplete {
    private int myField;
  
    public void method(boolean methodPar) {
      String methodVar = "var value";
      myField += methodPar ? methodVar.length() : this.hashCode();
  
      JComponent methodAnonymous = new JComponent() {
        private int myMethodAnonymousInt;
      };
    }
  
    public void context(boolean contextPar) {
        method(contextPar);
    }
  }
  
