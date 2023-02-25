test;
[InlineBitString]
    class Main {
      BitString test(long result, long mask) {
          BitString intersection = null;
          BitString other = super.getBitwiseMask();
          long intersectMask = mask & other.myMask;
          if ((result & mask & intersectMask) == (other.myBits & intersectMask)) {
              intersection = new BitString(result & mask | other.myBits, mask | other.myMask);
          }
          assert intersection != null;
          return intersection;
      }
  }
  
  class BitString {
      final long myBits;
      final long myMask;
  
      BitString(long bits, long mask) {
          myBits = bits & mask;
          myMask = mask;
      }
      BitString intersect(BitString other) {
          long intersectMask = myMask & other.myMask;
          if ((myBits & intersectMask) != (other.myBits & intersectMask)) return null;
          return new BitString(myBits | other.myBits, myMask | other.myMask);
      }
  }
