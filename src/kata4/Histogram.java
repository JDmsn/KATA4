package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <T> {
    
    private final Map<T, Integer> hm = new HashMap<>();

    public boolean containsValue(Object value) {
        return hm.containsValue(value);
    }
    
    public Integer get(Object key) {
        return hm.get(key);
    }

    public Set<T> keySet() {
        return hm.keySet();
    }
    
    public boolean containsKey(Object key) {
        return hm.containsKey(key);
    }
    
    public Integer increment(T key) {
        return hm.put(key, hm.containsKey(key)? hm.get(key) + 1 : 1);
    }
    
}
