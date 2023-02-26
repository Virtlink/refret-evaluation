test;
[Test]
    public class Test {
  }
  
  
  class JetElement {
      void acceptChildren(JetVisitor v) {}
  
      private void prepareAnonymousClasses() {
          acceptChildren(new JetVisitor() {
              public void visitJetElement(JetElement element) {
                  element.acceptChildren(this);
              }
          });
      }
  }
  
  class JetVisitor {}
