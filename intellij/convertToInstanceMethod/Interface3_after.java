test;
[Test]
    interface PsiAntElement {
      void m();
  }
  
  interface AntElement extends PsiAntElement {
  }
  
  class AntElementImpl implements AntElement {
      public void m() {
      }
  }
  
  interface AntNameIdentifier extends AntElement {
  }
  
  class AntNameIdentifierImpl extends AntElementImpl implements AntNameIdentifier {
  }
  
  interface AntStructuredElement extends AntElement {
  }
  
  class AntStructuredElementImpl extends AntElementImpl implements AntStructuredElement {
  }
  
  interface AntTask extends AntStructuredElement {
  }
  
  class AntTaskImpl extends AntStructuredElementImpl implements AntTask {
  }
  
  interface AntMacroDef extends AntTask {
  }
  
  class AntMacroDefImpl extends AntTaskImpl implements AntMacroDef {
  }
  
  class X {
  }
