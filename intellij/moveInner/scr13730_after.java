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
          [[->SI|StaticInner]] staticInner = new [[->SIc|StaticInner]]();

          [[->NSII|NonStaticInnerInner|StaticInner.NonStaticInnerInner]] nonStaticInnerInner
              = staticInner.new [[->NSIIc|NonStaticInnerInner]]("Joe");

          System.out.println(nonStaticInnerInner.toString());
      }
  }
[StaticInner]
    package pack1;

  public class [[@SI|StaticInner]] {
      public [[@SIc|StaticInner]]() {}
      public class [[@NSII|NonStaticInnerInner]] {
          private String name;

          public [[@NSIIc|NonStaticInnerInner]](String name) {
              this.name = name;
          }

          public String toString() {
              return name;
          }
      }
  }

}
