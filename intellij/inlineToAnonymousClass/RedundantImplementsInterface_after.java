test;
[Test]
    
  class A {
      private ActionListener b = new MyActionListener() {
          public void actionPerformed(int e) {
          }
      };
  
      private abstract class MyActionListener implements ActionListener {
      }
  
  }
  interface ActionListener {
      public void actionPerformed(int e);
  
  }
