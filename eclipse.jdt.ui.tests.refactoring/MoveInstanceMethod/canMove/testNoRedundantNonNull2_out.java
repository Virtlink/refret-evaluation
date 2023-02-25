test;
[p] {
[Source]
    package p;
  
  import org.eclipse.jdt.annotation.NonNullByDefault;
  
  @NonNullByDefault
  public class Source {
      public String nonstatic1(String s, Target t) {
          return s + t.hashCode();
      }
  
  }
  
[Target]
    package p;
  
  import org.eclipse.jdt.annotation.NonNull;
  import org.eclipse.jdt.annotation.NonNullByDefault;
  
  @NonNullByDefault()
  public class Target {
  
      @NonNullByDefault({})
      public class Nested {
  
  		public @NonNull String nonstatic2(@NonNull String s) {
  		    return s + hashCode();
  		}
        
      }
  }
  
  
}
