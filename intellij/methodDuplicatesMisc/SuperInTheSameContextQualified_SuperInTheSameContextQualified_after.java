test;
[SuperInTheSameContextQualified]
    public class a {
      public void login() {
          System.out.println();
      }
  }
  
  class b extends a {
      public void doLogin() throws Exception {
          super.login();
      }
  
      public void foo() throws Exception {
        new Runnable() {
          public void run() {
              doLogin();
          }
        }.run();
      }
  }
  
  
