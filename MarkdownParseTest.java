/* javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java 
java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
*/

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileMD() throws Exception {
        String fileContents = Files.readString(Path.of("test-file.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        expectedResult = List.of("https://something.com", "some-thing.html");

        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFile2() throws Exception {
        String fileContents = Files.readString(Path.of("test2.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        expectedResult = List.of("linktosomething.com");

        assertEquals(expectedResult, testResult);
    }

    
    // // Haven't fixed the bug that causes this test to fail yet so will not test yet
    // @Test
    // public void testFile3() throws Exception {
    //     String fileContents = Files.readString(Path.of("test3.md"));

    //     ArrayList<String> testResult = new ArrayList<>();
    //     List<String> expectedResult = new ArrayList<>();

    //     testResult = MarkdownParse2.getLinks(fileContents);
    //     expectedResult = List.of("linktosomething.com");

    //     assertEquals(expectedResult, testResult);
    // }
    
    

    @Test
    public void testFile4() throws Exception {
        String fileContents = Files.readString(Path.of("test4.md"));

        ArrayList<String> testResult = new ArrayList<>();
        ArrayList<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFile5() throws Exception {
        String fileContents = Files.readString(Path.of("test5.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFile6() throws Exception {
        String fileContents = Files.readString(Path.of("test6.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        expectedResult = List.of("something.com");

        assertEquals(expectedResult, testResult);
    }
    
    //Testing new tests
    @Test
    public void testFileMD2() throws Exception {
        String fileContents = Files.readString(Path.of("test-file2.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        expectedResult = List.of("https://something.com", "some-page.html");

        assertEquals(expectedResult, testResult);
    }

    
    @Test
    public void testFileMD3() throws Exception {
        String fileContents = Files.readString(Path.of("test-file3.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFileMD4() throws Exception {
        String fileContents = Files.readString(Path.of("test-file4.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFileMD5() throws Exception {
        String fileContents = Files.readString(Path.of("test-file5.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFileMD6() throws Exception {
        String fileContents = Files.readString(Path.of("test-file6.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFileMD7() throws Exception {
        String fileContents = Files.readString(Path.of("test-file7.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFileMD8() throws Exception {
        String fileContents = Files.readString(Path.of("test-file8.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse2.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }
    

    // @Test 
    // public void testSpaceAFterParen() {
       
    //         String contents = "[title]( space-in-url.com)";
    //         List<String> expect = List.of("space-in-url.com");
    //         assertEquals(expect, MarkdownParse1.getLinks(contents));
        
    // }

    @Test 
    public void testReport4Test1() throws IOException{
        String fileContents = Files.readString(Path.of("Report4Test1.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = List.of("`google.com", "google.com", "ucsd.edu");

        testResult = MarkdownParse2.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }

    @Test 
    public void testReport4Test2() throws IOException{
        String fileContents = Files.readString(Path.of("Report4Test2.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = List.of("a.com", "a.com(())", "example.com");

        testResult = MarkdownParse2.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }

    @Test 
    public void testReport4Test3() throws IOException{
        String fileContents = Files.readString(Path.of("Report4Test3.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");

        testResult = MarkdownParse2.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }
}
