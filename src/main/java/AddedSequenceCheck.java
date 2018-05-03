import java.util.HashMap;
import java.util.Map;

public class AddedSequenceCheck {

    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

    public int loopBackCheck(int position){
        for (Map.Entry<Integer, Integer> pair : myMap.entrySet()) {
            if(pair.getKey() == position)
                myMap.put(pair.getKey(), pair.getValue() + 1);
            if (pair.getValue() >= 1){
                position--;
            }
        }return position;
    }

}
