test;
[Foo]
    public class Foo {
      String getComponent(Integer i) { return null; }
      Integer myI;
  
      public void usage() {
          if (myI != null)
              System.out.println(getComponent(myI) + getComponent(myI));
      }
  
  }
