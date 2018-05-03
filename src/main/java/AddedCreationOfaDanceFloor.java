import java.util.ArrayList;

public class AddedCreationOfaDanceFloor {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    AddedSequenceCheck addedSequenceCheck = new AddedSequenceCheck();
    AddedZeroCheckAndOutOfBounds addedZeroCheckAndOutOfBounds = new AddedZeroCheckAndOutOfBounds();

    public void createPlatform(int... sequenceNumbers) {
        if (sequenceNumbers == null) return;
        for (int c : sequenceNumbers) {
            if (arrayList.size() <= 50) {
                arrayList.add(c);
            } else {
                System.out.println("Размер площадки должен быть от 1 до 50");
                break;
            }
        }
    }
}
