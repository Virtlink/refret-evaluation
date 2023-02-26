test;
[Test]
    
  class MyObjBuilder {
      private NewType memberVar1;
  
      public NewType convertToNewType(LegacyType arg) {
          return new NewType();
      }
  
      public MyObjBuilder memberVar1(NewType arg) {
          this.memberVar1 = arg;
          return this;
      }
  
      public MyObj memberVar2() {
          return new MyObj();
      }
  }
  
  class Main {
      public static void main(String[] args) {
          LegacyType lt = new LegacyType();
          MyObjBuilder myObjBuilder = MyObj.builder();
          myObjBuilder.memberVar1(myObjBuilder.convertToNewType(lt));
          MyObj obj = myObjBuilder
                  .memberVar2();
      }
  }
  
  class NewType {
  }
  
  class MyObj {
      public static MyObjBuilder builder() {
          return new MyObjBuilder();
      }
  }
  
  class LegacyType {}
