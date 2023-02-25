test;
[p] {
[Source]
    package p;
  
  import org.eclipse.jdt.annotation.NonNullByDefault;
  
  @NonNullByDefault
  public class Source {
      public String nonstatic2(String s, Target.Nested t) {
          return s + t.hashCode();
      }
  
  }
  
[Target]
    package p;
  
  import org.eclipse.jdt.annotation.NonNullByDefault;
  
  @NonNullByDefault()
  public class Target {
  
      @NonNullByDefault({})
      public class Nested {
        
      }
  
  	public String nonstatic1(String s) {
  	    return s + hashCode();
  	}
  }
  
  
}
