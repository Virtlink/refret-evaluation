test;
[RefNewTopLevel]
    public class Subject {
    private int myInt;
  
    public void withClass(Object <caret>o) {
      myInt += o.hashCode();
    }
  }
  
  class User {
    private void oper() throws IOException {
      Subject subj = new Subject();
      subj.withClass(new TopLevel());
    }
  }
  
  class TopLevel {}
