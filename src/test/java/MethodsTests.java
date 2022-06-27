import org.junit.jupiter.api.*;


public class MethodsTests {
    DifferentMethods differentMethods = new DifferentMethods();
    static int i = 1;
    @BeforeAll
    static void thisFirst(){
        System.out.println("Executed firstly");
    }

    @BeforeEach
     void testCounter(){
        System.out.println("Test #"+i);
        i++;
    }
    @AfterAll
    static void thisLast(){
        System.out.println("Tests executed");
    }

    @Tag("Dev")
    @Test
    void test1(){
        Assertions.assertEquals((double)5/10,differentMethods.mathFunction(5));
    }
    @Test
    void test2(){
        Assertions.assertEquals((double)5/10/10,differentMethods.hardMathFunction(5));
    }
    @Test
    void test3(){
        Assertions.assertEquals(true,differentMethods.someIntsAreTrue(3));
    }
    @Test
    void test4(){
        Assertions.assertEquals(false,differentMethods.someIntsAreTrue(2));
    }
    @Test
    void test5(){
        Assertions.assertEquals("salve".substring(0,1),differentMethods.cutString("salve"));
    }

}
