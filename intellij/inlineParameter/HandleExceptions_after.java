test;
[Subject]
    import java.io.*;
  public class Subject {
    private int myInt;
  
    public void withClass() throws IOException {
      myInt += new ThirdParty(false).hashCode();
    }
  }
  
  class User {
    private void oper() throws IOException {
      Subject subj = new Subject();
      subj.withClass();
    }
  }
  
  class ThirdParty {
    public ThirdParty() {
    }
  
    public ThirdParty(boolean b) throws IOException {
      if (b) {
        throw new IOException();
      }
    }
  }
  
