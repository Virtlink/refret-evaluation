test;
[Test]
    class IdentityComplete {
    private int myField;
  
    public void method(boolean bp) {
      // method begins
      String /*egg*/ var = /*egg*/"var value"; // inside method
      myField += bp ?/*egg*/ var.length() : /*egg*/ this.hashCode();  /* inside method */
      /* method ends */
    }
  
    public void context(boolean bp) {
      /* before fragment */
        method(bp);
        // after fragment
    }
  }
