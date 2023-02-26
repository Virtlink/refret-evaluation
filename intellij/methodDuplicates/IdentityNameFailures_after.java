test;
[Test]
    import javax.swing.JComponent;
  
  class IdentityComplete {
    private int myField;
  
    public void method() {
      class MethodLocal {
        private int myMethodLocalInt;
        public void methodLocalInc() {
          myMethodLocalInt++;
        }
      }
  
      JComponent methodAnonymous = new JComponent() {
        private int myMethodAnonymousInt;
        public void methodAnonymousInc() {
          myMethodAnonymousInt++;
        }
      };
    }
  
    public void context() {
        method();
    }
  }
  
