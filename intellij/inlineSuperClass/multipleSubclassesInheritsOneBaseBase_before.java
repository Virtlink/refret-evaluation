test;
[ISuper]
    interface ISuper {}
[Super]
    public interface Super extends ISuper{}
  
[Test]
    class Test implements Super {}
[Test1]
    class Test1 implements Super{
  }
