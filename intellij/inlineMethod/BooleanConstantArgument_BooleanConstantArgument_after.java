test;
[BooleanConstantArgument]
    interface PsiElement {
    PsiElement getNextSibling();
    PsiElement getPrevSibling();
  }
  
  class Test1 {
    private void foo(PsiElement node) {
        PsiElement element = node.getNextSibling();
    }
  
    private void bar(PsiElement node) {
        PsiElement element = node.getPrevSibling();
    }
  
  }
