test;
[Holder]
    public class Holder<E> {
    private final E elem;
  
    private Holder(E elem) { this.elem = elem; }
  
    public static <E> Holder<E> of(E elem) { return new Holder<E>(elem); }
  }
