import java.util.ArrayList;

public class ClassRoom {

    int roomId, roomNumber;

    ArrayList<ClassRoom> classrooms = new ArrayList<>();

    public ClassRoom(int roomId, int roomNumber) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
