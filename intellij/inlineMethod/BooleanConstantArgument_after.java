test;
[Test]
    interface PsiElement {
    PsiElement getNextSibling();
    PsiElement getPrevSibling();
  }

  class Test1 {
    private void foo(PsiElement [[@1|node]]) {
        PsiElement element = [[->1|node]].getNextSibling();
    }

    private void bar(PsiElement [[@2|node]]) {
        PsiElement element = [[->2|node]].getPrevSibling();
    }

  }
