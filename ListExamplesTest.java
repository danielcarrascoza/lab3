import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

interface StringChecker { boolean checkString(String s); }


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

       ArrayList<String> correctWords = new ArrayList<String>();
       correctWords.add("apple");
       correctWords.add("apple pie");
       ListExamples sc = new ListExamples(correctWords);

       assertArrayEquals(list2.toArray(), ListExamples.filter(list1, sc).toArray());

    }


}

