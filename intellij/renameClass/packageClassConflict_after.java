test;
[Fabric] {
[MetaFabric]
    package Fabric;
  public class MetaFabric { }
[Fabric]
    package Fabric;
  public class Fabric extends MetaFabric {
      public static Fabric create() {
          return new Fabric();
      }
  
      public static void main(String[] args) {
          Fabric f = Fabric.create();
  
      }
  }
}
