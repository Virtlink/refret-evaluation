test;
[Subject]
    public class Subject {
    private int myInt;
  
    public void withClass() {
      myInt += new User.Local().new InnerLocal().hashCode();
    }
  }
  
  class User {
    private void oper() throws IOException {
      Subject subj = new Subject();
      subj.withClass();
    }
  
    class Local {
      class InnerLocal {}
    }
  }
  
