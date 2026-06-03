package org.indivaragroup.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class ContohIdentityHashMap {
    static void main() {
        String key1 = new String("kunci");
        String key2 = new String("kunci");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "nilai 1");
        hashMap.put(key2, "nilai 2");

        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, "nilai 1");
        identityHashMap.put(key2, "nilai 2");

        System.out.println("HashMap Size : " + hashMap.size());
        System.out.println("IdentityHashMap Size : " + identityHashMap.size());
    }
}
