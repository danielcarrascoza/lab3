import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

interface StringChecker { boolean checkString(String s); }

class testString implements StringChecker{
    public boolean checkString(String s) { return s.length()>4; }
  }

public class ListExamplesTest{
    @Test
public void testMerge(){
    List<String> list1 = Arrays.asList("pear","banana");
    List<String> list2 = Arrays.asList( "lemon");

    List<String> result = Arrays.asList( "pear","banana","lemon");
    assertArrayEquals(result.toArray(), ListExamples.merge(list1, list2).toArray());

}

 @Test
   public void testFilter(){
       List<String> list1 =  Arrays.asList("","pear","apple","apple","apple pie");
       List<String> list2 =  Arrays.asList("apple","apple","apple pie");

       List<String> result = ListExamples.filter(list1, new testString());
       assertEquals(list2, result);



    }


}

