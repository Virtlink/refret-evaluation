test;
[Test]
    class PrivateInitUser {
          public void method() {
              final CustomType customType = new CustomType("a");
              new Object() {
                  {
                      privateMethod(customType);
                  }
  
                  private void privateMethod(CustomType customType) {
                  }
              };
              final CustomType customType1 = new CustomType("b");
              new Object() {
                  {
                      privateMethod(customType1);
                  }
  
                  private void privateMethod(CustomType customType) {
                  }
              };
          }
  
          public static class CustomType {
                  public CustomType(String s) {
                  }
          }
  }
  
  
