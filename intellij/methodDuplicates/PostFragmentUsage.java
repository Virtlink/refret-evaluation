test;
[Test]
    class Post {
    private int myField;
  
    public int <caret>method(int param, int varFree) {
      int varIncapsulated = 2;
      return varFree + varIncapsulated + param + myField + this.hashCode();
    }
  
    public void contextVarFree(int param) {
      int varFree = 1;
      int varIncapsulated = 2;
      int var = varFree + varIncapsulated + param + myField + this.hashCode();
      int varPost = varFree;
    }
  
    public void contextVarIncapsulated(int param) {
      int varFree = 1;
      int varIncapsulated = 2;
      int var = varFree + varIncapsulated + param + myField + this.hashCode();
      int varPost = varIncapsulated;
    }
  
    public void contextParam(int param) {
      int varFree = 1;
      int varIncapsulated = 2;
      int var = varFree + varIncapsulated + param + myField + this.hashCode();
      int varPost = param;
    }
  
    public void contextField(int param) {
      int varFree = 1;
      int varIncapsulated = 2;
      int var = varFree + varIncapsulated + param + myField + this.hashCode();
      int varPost = myField;
    }
  
    public void contextThis(int param) {
      int varFree = 1;
      int varIncapsulated = 2;
      int var = varFree + varIncapsulated + param + myField + this.hashCode();
      int varPost = this.hashCode();
    }
  }
  
