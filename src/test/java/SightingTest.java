//import org.junit.Test;
//import static org.junit.Assert.*;
//
//
//public class SightingTest {
//    @Test
//    public void Sighting_Instantiating_correctly() {
//        Sighting sighting = new Sighting("zone 1","Kim");
//        assertEquals(true, sighting instanceof Sighting);
//    }
//    @Test
//    public void all_returnsAllInstancesOfSihgting_true() {
//        Sighting firstSighting = new Sighting("zone 1","Kim");
//        Sighting secondSighting = new Sighting("zone 2","Paul");
//        assertEquals(true, Sighting.all().get(0).equals(firstSighting));
//        assertEquals(true, Sighting.all().get(1).equals(secondSighting));
//    }
//
//    @Test
//    public void Animals_instantiatesWithLocation_String(){
//        Sighting sighting  = new Sighting("Zone 2", "Park");
//        assertEquals(sighting.getLocation(), "Park");
//    }
//    @Test
//    public void Animals_instantiatesWithRanger_name_String(){
//        Sighting sighting  = new Sighting("zone 1", "Kim");
//        assertEquals(sighting .getRanger_name(), "Kim");
//    }
//
//    @Test
//    public void equals_returnsTrueIfNamesAreTheSame(){
//        Sighting sighting = new Sighting ("Zone 3", "Paul");
//        Sighting  firstsighting = new Sighting ("Zone 3", "Paul");
//        assertTrue(sighting .equals(firstsighting));
//    }
//
//}
