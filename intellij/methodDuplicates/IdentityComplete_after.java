test;
[Test]
    class IdentityComplete {
    private int myField;
  
    public void method(boolean bp) {
      String var = "var value";
      myField += bp ? var.length() : this.hashCode();
    }
  
    public void context(boolean bp) {
        method(bp);
    }
  }
