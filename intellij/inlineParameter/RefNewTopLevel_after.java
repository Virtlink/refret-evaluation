test;
[Subject]
    public class Subject {
    private int myInt;
  
    public void withClass() {
      myInt += new TopLevel().hashCode();
    }
  }
  
  class User {
    private void oper() throws IOException {
      Subject subj = new Subject();
      subj.withClass();
    }
  }
  
  class TopLevel {}
