test;
[CallInFor]
    public class C {
      public void doSomething() {
          final String text1 = "hello";
          for (Iterator it = getSomeObjects(text1).iterator(); it.hasNext();) {
              String text = (String)it.next();
              System.out.println("text = " + text);
          }
      }
  
      private Collection getSomeObjects(String text) {
          final List list = new ArrayList();
          list.add(text);
          return list;
      }
  }
