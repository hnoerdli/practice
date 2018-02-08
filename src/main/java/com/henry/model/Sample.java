package com.henry.model;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.google.common.collect.Range;

public class Sample {

    String something = "";
    
    private void spitItOut() {
       String doubleUrlEncoded = "https://medtronic-mitg.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fmedtronic-mitg--apttus-qpcomply.na48.visual.force.com%252Fapex%252Fapttus_qpcomply__ProposalAgreementCreate%253Fid%253Da7I0B000000PWde%2526recordTypeId%253D012U0000000MgSGIA0";
       try {
        String decodedUrl = java.net.URLDecoder.decode(doubleUrlEncoded, "UTF-8");
        System.out.println(decodedUrl);
        
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    }
    
    
    private int upYours()
    {
        int upper = 0;
        Range<Integer> range = Range.closed(0, 9);
        if (range.hasUpperBound())
        {
            upper = range.upperEndpoint();
        }
        
        System.out.println("I've upped mine; now up yours! " + upper);
        return upper; 
    }
    
    
    private void testStringFormat()
    {
      String sample = "Format this %s bitch.";
      
      System.out.println(String.format(sample, "YES"));
      System.out.println(String.format(sample, null));
    }
    
    private void messinWithDate()
    {
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.YEAR, -1);
        Date today30 = cal.getTime();
        System.out.println(today30);
    }
    
    private void sub()
    {
        String s = "MY_NICE_STRING_AG";
        System.out.println(s.substring(0,s.indexOf("_AG")));
    }
    
    public static void main(String[] args) {
        
        Sample s = new Sample();
        s.something = "a new string";
        //s.upYours();
        //s.spitItOut();
        //System.out.println("upper limit? " + Sample.convertToUpperLimit(" 1 - 2 "));
        //System.out.println("upper limit? " + Sample.convertToUpperLimit("3 - 9"));
        
        //s.testStringFormat();
        //s.messinWithDate();
        s.sub();
 
    }
    
    public static String NUMBER_REGEX = "^\\d+$";
    public static int convertToUpperLimit(String s) {
        
       if (s.matches(NUMBER_REGEX)) {
           return Integer.parseInt(s);
       } else if (s.contains("-")) {
           
           Map<Integer, String> myNumbers = new TreeMap<>();
           String[] range = s.split("-");
           for (String i : range) {
               myNumbers.put(new Integer(Integer.parseInt(i.trim())), i);
           }
           
           Set<Integer> numberSet = myNumbers.keySet();
           return Integer.parseInt(numberSet.toArray()[numberSet.size() - 1].toString());

       } else {
           return -1;
       }

    }
    

//    import static com.google.common.base.Preconditions.checkNotNull;
//
//    import com.google.common.base.Equivalence;
  //  import com.google.common.base.Function;
//    import com.google.common.base.Predicate;

    //import javax.annotation.Nullable;
/*
    @SuppressWarnings("rawtypes")
    class Range<C extends Comparable> implements Predicate<C>, Serializable {

      private static final Function<Range, Cut> LOWER_BOUND_FN =
          new Function<Range, Cut>() {
            @Override
            public Cut apply(Range range) {
              return range.lowerBound;
            }
          };

      @SuppressWarnings("unchecked")
      static <C extends Comparable<?>> Function<Range<C>, Cut<C>> lowerBoundFn() {
        return (Function) LOWER_BOUND_FN;
      }

      private static final Function<Range, Cut> UPPER_BOUND_FN =
          new Function<Range, Cut>() {
            @Override
            public Cut apply(Range range) {
              return range.upperBound;
            }
          };

      @SuppressWarnings("unchecked")
      static <C extends Comparable<?>> Function<Range<C>, Cut<C>> upperBoundFn() {
        return (Function) UPPER_BOUND_FN;
      }

      static final Ordering<Range<?>> RANGE_LEX_ORDERING = new RangeLexOrdering();

      static <C extends Comparable<?>> Range<C> create(Cut<C> lowerBound, Cut<C> upperBound) {
        return new Range<C>(lowerBound, upperBound);
      }


      public static <C extends Comparable<?>> Range<C> open(C lower, C upper) {
        return create(Cut.aboveValue(lower), Cut.belowValue(upper));
      }

      public static <C extends Comparable<?>> Range<C> closed(C lower, C upper) {
        return create(Cut.belowValue(lower), Cut.aboveValue(upper));
      }


      public static <C extends Comparable<?>> Range<C> range(
          C lower, BoundType lowerType, C upper, BoundType upperType) {
        checkNotNull(lowerType);
        checkNotNull(upperType);

        Cut<C> lowerBound =
            (lowerType == BoundType.OPEN) ? Cut.aboveValue(lower) : Cut.belowValue(lower);
        Cut<C> upperBound =
            (upperType == BoundType.OPEN) ? Cut.belowValue(upper) : Cut.aboveValue(upper);
        return create(lowerBound, upperBound);
      }

  
      public static <C extends Comparable<?>> Range<C> singleton(C value) {
        return closed(value, value);
      }


      public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> values) {
        checkNotNull(values);
        if (values instanceof ContiguousSet) {
          return ((ContiguousSet<C>) values).range();
        }
        Iterator<C> valueIterator = values.iterator();
        C min = checkNotNull(valueIterator.next());
        C max = min;
        while (valueIterator.hasNext()) {
          C value = checkNotNull(valueIterator.next());
          min = Ordering.natural().min(min, value);
          max = Ordering.natural().max(max, value);
        }
        return closed(min, max);
      }

      final Cut<C> lowerBound;
      final Cut<C> upperBound;

      private Range(Cut<C> lowerBound, Cut<C> upperBound) {
        this.lowerBound = checkNotNull(lowerBound);
        this.upperBound = checkNotNull(upperBound);
        if (lowerBound.compareTo(upperBound) > 0
            || lowerBound == Cut.<C>aboveAll()
            || upperBound == Cut.<C>belowAll()) {
          throw new IllegalArgumentException("Invalid range: " + toString(lowerBound, upperBound));
        }
      }

      public boolean hasLowerBound() {
        return lowerBound != Cut.belowAll();
      }


      public C lowerEndpoint() {
        return lowerBound.endpoint();
      }


      public BoundType lowerBoundType() {
        return lowerBound.typeAsLowerBound();
      }


      public boolean hasUpperBound() {
        return upperBound != Cut.aboveAll();
      }


      public C upperEndpoint() {
        return upperBound.endpoint();
      }


      public BoundType upperBoundType() {
        return upperBound.typeAsUpperBound();
      }


      public boolean isEmpty() {
        return lowerBound.equals(upperBound);
      }

      public boolean contains(C value) {
        checkNotNull(value);
        // let this throw CCE if there is some trickery going on
        return lowerBound.isLessThan(value) && !upperBound.isLessThan(value);
      }


      public boolean containsAll(Iterable<? extends C> values) {
        if (Iterables.isEmpty(values)) {
          return true;
        }

        // this optimizes testing equality of two range-backed sets
        if (values instanceof SortedSet) {
          SortedSet<? extends C> set = cast(values);
          Comparator<?> comparator = set.comparator();
          if (Ordering.natural().equals(comparator) || comparator == null) {
            return contains(set.first()) && contains(set.last());
          }
        }

        for (C value : values) {
          if (!contains(value)) {
            return false;
          }
        }
        return true;
      }


      public boolean isConnected(Range<C> other) {
        return lowerBound.compareTo(other.upperBound) <= 0
            && other.lowerBound.compareTo(upperBound) <= 0;
      }

      public Range<C> canonical(DiscreteDomain<C> domain) {
        checkNotNull(domain);
        Cut<C> lower = lowerBound.canonical(domain);
        Cut<C> upper = upperBound.canonical(domain);
        return (lower == lowerBound && upper == upperBound) ? this : create(lower, upper);
      }


      @Override
      public boolean equals(@Nullable Object object) {
        if (object instanceof Range) {
          Range<?> other = (Range<?>) object;
          return lowerBound.equals(other.lowerBound) && upperBound.equals(other.upperBound);
        }
        return false;
      }


      @Override
      public int hashCode() {
        return lowerBound.hashCode() * 31 + upperBound.hashCode();
      }


      @Override
      public String toString() {
        return toString(lowerBound, upperBound);
      }

      private static String toString(Cut<?> lowerBound, Cut<?> upperBound) {
        StringBuilder sb = new StringBuilder(16);
        lowerBound.describeAsLowerBound(sb);
        sb.append('\u2025');
        upperBound.describeAsUpperBound(sb);
        return sb.toString();
      }


      private static <T> SortedSet<T> cast(Iterable<T> iterable) {
        return (SortedSet<T>) iterable;
      }

      Object readResolve() {
        if (this.equals(ALL)) {
          return all();
        } else {
          return this;
        }
      }

      @SuppressWarnings("unchecked") // this method may throw CCE
      static int compareOrThrow(Comparable left, Comparable right) {
        return left.compareTo(right);
      }


      private static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        @Override
        public int compare(Range<?> left, Range<?> right) {
          return ComparisonChain.start()
              .compare(left.lowerBound, right.lowerBound)
              .compare(left.upperBound, right.upperBound)
              .result();
        }

        private static final long serialVersionUID = 0;
      }

      private static final long serialVersionUID = 0;
    }
*/

}
