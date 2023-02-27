test;
[Test]
    class Main {
      BitString test(long result, long mask) {
          BitString intersection = null;
          BitString [[@1|other]] = null;
          long intersectMask = mask & other.myMask;
          if ((result & mask & intersectMask) == (other.myBits & intersectMask)) {
              intersection = new BitString(result & mask | [[->b|&1|myBits|other.myBits]], mask | [[->m|&1|myMask|other.myMask]]);
          }
          assert intersection != null;
          return intersection;
      }
  }

  class BitString {
      final long [[@b|myBits]];
      final long [[@m|myMask]];

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
