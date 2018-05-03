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

    public void dancerMove() {
        int position = 0, countStep = 0, count = 0;
        addedSequenceCheck.myMap.put(position, count);
        try {
            while (true) {
                if (addedZeroCheckAndOutOfBounds.checkInZeroAndUneven(arrayList)) {
                    System.out.println("Вы ввели 0 или нечетное число, введите четное число, чтобы танцор мог двигаться");
                    break;
                }
                if (arrayList.get(position) % 2 == 0) {
                    position += arrayList.get(position);
                } else {
                    position -= arrayList.get(position);
                }
                countStep = addedZeroCheckAndOutOfBounds.checkIndexOutOfBounds(arrayList, countStep, position);
                position = addedSequenceCheck.loopBackCheck(position);
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Танцор сделал " + countStep + " шага(ов)");
        }
    }
}
