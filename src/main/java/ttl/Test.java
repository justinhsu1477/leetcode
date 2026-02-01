package ttl;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public void test() {
        Map<String, CacheValue> map = new HashMap<>();

        map.put("code", new CacheValue(
                "123456",
                System.currentTimeMillis() + 5 * 60 * 1000));

        CacheValue cache = map.get("code");
        if (cache == null || cache.expiredAt < System.currentTimeMillis()) {
            map.remove("code");
        }

    }
}
