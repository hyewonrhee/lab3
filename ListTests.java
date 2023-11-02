import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input1.add("c$");
        input1.add("d");
        StringChecker sc = new CodeWordChecker(1, 3, "$");
        List<String> result = new ArrayList<>();
        result.add("a");
        result.add("b");
        result.add("d");
        assertEquals(result, ListExamples.filter(input1, sc));
    }
}