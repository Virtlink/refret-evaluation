test;
[InlineThis]
    public class InlineThis {
      public InlineThis() {
          System.out.println("code block here");
      }
  
      public InlineThis(String str) {
          this();
      }
  
  
  
  
      public static void main(String[] args) {
          InlineThis aInlineThis = new InlineThis();
          InlineThis aInlineThis1 = new InlineThis();
      }
  }
