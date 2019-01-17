package hashTable.leftJoin;

import java.util.HashMap;
import java.util.Set;

public class LeftJoin {

    public static HashMap leftJoin(HashMap<String, String> left, HashMap<String, String> right){

        HashMap leftJoin = new HashMap();
        Set<String> keys = left.keySet();

        for (String key : keys){
            if (right.containsKey(key)){
                leftJoin.put(key, new String[] {left.get(key),right.get(key)});
            } else {
                leftJoin.put(key, new String[] {left.get(key), null});
            }
        }
        return leftJoin;
    }
}
