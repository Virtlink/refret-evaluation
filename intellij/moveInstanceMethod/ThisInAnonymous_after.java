test;
[Test]
    public class Test {
  }


  class JetElement {
      void [[@1|acceptChildren]](JetVisitor v) {}

      private void prepareAnonymousClasses() {
          [[->1|aClass.acceptChildren|acceptChildren]](new JetVisitor() {   // Context: this
              public void visitJetElement(JetElement element) {
                  element.acceptChildren(this);
              }
          });
      }
  }

  class JetVisitor {}
