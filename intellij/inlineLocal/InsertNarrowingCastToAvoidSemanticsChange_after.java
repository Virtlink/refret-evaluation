test;
[Test]
    
  class Cat {}
  class DomesticCat extends Cat {}
  
  class Test {
    public static void main(String[] args) {
        petCat((Cat) new DomesticCat());
    }
  
    static void petCat(Cat cat) {
      System.out.println("A Cat");
    }
  
    static void petCat(DomesticCat domesticCat) {
      System.out.println("A DomesticCat");
    }
  }
