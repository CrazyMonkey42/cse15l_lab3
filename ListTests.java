import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hola");
        list1.add("hi");
        list1.add("bonjour");
        StringChecker checker1 = new StringChecker_Concrete(); // should have StringChecker parent object 
                                                               // on left since it is used in the filter 
                                                               // method (not the concrete class)
        assertEquals(new ArrayList<>(Arrays.asList("hola", "hi")), ListExamples.filter(list1, checker1));
    }

    @Test
    public void testMerge() {
        List<String> mergerList_1A = new ArrayList<>();
        mergerList_1A.add("1");
        List<String> mergerList_1B = new ArrayList<>();
        mergerList_1A.add("2");
        mergerList_1A.add("3");
        assertEquals(new ArrayList<>(Arrays.asList("1", "2", "3")), ListExamples.merge(mergerList_1A, mergerList_1B));
    }
}