import java.util.ArrayList;

public class AddedZeroCheckAndOutOfBounds {

    public boolean checkInZeroAndUneven(ArrayList<Integer> arrayList) {
        return (arrayList.get(0).equals(0) || arrayList.get(0) % 2 != 0);
    }

    public int checkIndexOutOfBounds(ArrayList<Integer> arrayList, int countStep, int position) {
        if (countStep + arrayList.get(position) > arrayList.size() - 1) {
            int temp = arrayList.get(position) - arrayList.size() - 1;
            countStep += arrayList.get(position) - temp;
        } else {
            countStep += arrayList.get(position);
        }
        return countStep;
    }
}
