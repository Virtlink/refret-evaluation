test;
[ExpData]
    public class ExpData {
  
    private Object provideObject() {
      return new Object();
    }
  
    public static void useStatic(Object p) {
      System.out.println(p);
    }
  
    public void context() {
      inlineE(provideObject());
    }
  
    public static void inlineE(Object <caret>subj) {
      useStatic(subj);
    }
  }
  
