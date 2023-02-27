test;
[Foo]
    public class Foo {
      String getComponent(Integer i) { return null; }
      Integer [[@1|myI]];

      public void usage() {
          if (myI != null)
              System.out.println(getComponent([[->1|myI]]) + getComponent([[->1|myI]]));
      }

  }
