test;
[pack1] {
[TopLevel]
    package pack1;
  
  public class TopLevel {
  }
[Client]
    package pack1;
  
  public class Client { 
      public static void main(String[] args) {
          StaticInner staticInner = new StaticInner();
  
          StaticInner.NonStaticInnerInner nonStaticInnerInner
              = staticInner.new NonStaticInnerInner("Joe");
  
          System.out.println(nonStaticInnerInner.toString());
      }
  }
[StaticInner]
    package pack1;
  
  public class StaticInner {
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
