test;
[AssignedVarUpdatedAfterRead]
    public class AssignedVarUpdatedAfterRead {
  
    public void test() {
      String replacement = "foo";
  
      String original;
      System.out.println(replacement);
  
      replacement = "bar";
  
      original = replacement;
      System.out.println(original);
    }
  
  }
