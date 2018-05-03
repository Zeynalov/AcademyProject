import java.util.ArrayList;

public class AddedZeroCheckAndOutOfBounds {

    public boolean checkInZeroAndUneven(ArrayList<Integer> arrayList) {
        return (arrayList.get(0).equals(0) || arrayList.get(0) % 2 != 0);
    }
}
