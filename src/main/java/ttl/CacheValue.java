package ttl;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CacheValue {
    String value;
    long expiredAt;
}


