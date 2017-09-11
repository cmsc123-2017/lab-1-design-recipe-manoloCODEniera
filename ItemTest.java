import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTripCreated() {
    Item t = new Item("cow", 1200 );
    
    assertEquals("cow", t.name);
    assertEquals(1200, t.price);
  }
  
  public void testChangeNoDiscount() {
    Item t = new Item( "spaceship", 999);
    
    assertEquals(999, t.salePrice1000());
  }
  
  public void testChangeDiscount() {
    Item t = new Item( "pizzacake", 2000);
    
    assertEquals(1800, t.salePrice1000());
  }
}