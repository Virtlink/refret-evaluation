test;
[RespectProjectScopeSrcConstructorCall]
    import java.io.File;
  import java.io.FileInputStream;
  
  class Launcher<T> {
      {
          try {
              FileInputStream f = new FileInputStream("" != null ? new File("") : null);
            catch (Exception e) {
              e.printStackTrace();
          }
      }
  }
