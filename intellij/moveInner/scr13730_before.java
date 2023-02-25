test;
[pack1] {
[TopLevel]
    package pack1;
  
  public class TopLevel { 
      public static class StaticInner {
          public class NonStaticInnerInner {
              private String name;
            
              public NonStaticInnerInner(String name) {
                  this.name = name;
              }
            
              public String toString() {
                  return name;
              }
          }
      }
  }
[Client]
    package pack1;
  
  public class Client { 
      public static void main(String[] args) {
          TopLevel.StaticInner staticInner = new TopLevel.StaticInner();
  
          TopLevel.StaticInner.NonStaticInnerInner nonStaticInnerInner
              = staticInner.new NonStaticInnerInner("Joe");
  
          System.out.println(nonStaticInnerInner.toString());
      }
  }
}
