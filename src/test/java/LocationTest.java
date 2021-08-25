import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocationTest {
    @Test
    public void createInstanceOfLocationsClass() {
        Locations location=setUpNewLocation();
        assertEquals(true,location instanceof Locations);
    }

    @Test
    public void allEntriesAreSaved() {
        Locations location=setUpNewLocation();
        Locations newLocation=new Locations("");
        try {
            location.save();
            assertEquals(Locations.all().get(0), location);
            newLocation.save();

        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }

    @Test
    public void entryIsDeletedSuccessfully() {
        Locations location=setUpNewLocation();
        Locations newLocation=new Locations("Zone B");
        location.save();
        newLocation.save();
        location.delete();
        assertEquals(null,Locations.find(location.getId()));
    }
    @Test
    public void allSightingsAreReturnedForRanger() {
        Locations location = setUpNewLocation();
        try {

            location.save();
            Sightings sighting=new Sightings(location.getId(),1,1);
            Sightings otherSighting=new Sightings(location.getId(),1,1);
            sighting.save();
            otherSighting.save();
            assertEquals(location.getLocationSightings().get(0),sighting);
            assertEquals(location.getLocationSightings().get(1),otherSighting);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }

    //helper function
    private Locations setUpNewLocation() {
        return new Locations("Zone A");
    }
}

