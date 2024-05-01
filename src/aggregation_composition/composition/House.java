package aggregation_composition.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms; // Composition

    public House() {
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public List<Room> getRooms() {
        return rooms;
    }

    // Other house-related methods
}


//Rooms are created and managed by the house, and they cannot exist independently outside the house.
// If the house is destroyed, the rooms are also destroyed.
