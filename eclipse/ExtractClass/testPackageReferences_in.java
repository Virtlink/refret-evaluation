test;
[p] {
[PackageReferences]
    package p;
  
  import p.subPack.PackEx;
  
  public class PackageReferences extends PackEx{
  	private class PrivateInner {
		
  	}
  
  	protected class ProtectedInner {
		
  	}
  	ProtectedInner protectedInner= new ProtectedInner();
  	PrivateInner privateInner= new PrivateInner();
  	OtherPackageProteced packEx= new OtherPackageProteced();
  }
  
}
[p.subPack] {
[PackEx]
    package p.subPack;
  
  public class PackEx {
  	protected class OtherPackageProteced {
  		public OtherPackageProteced(){}
  	}
  }
  
}
