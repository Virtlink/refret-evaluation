test;
[RenameMethodNoCollisionWithOtherSignatureMethodRef]
    class Test {
  
    static void foo2() {}
    static void foo2(int i) {}
  
    {
      Runnable r = Test ::foo2;
    }
  }
