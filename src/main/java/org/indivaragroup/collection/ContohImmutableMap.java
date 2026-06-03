package org.indivaragroup.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContohImmutableMap {
    static void main() {
        Map mapKosong = Collections.emptyMap();
        Map satuData = Collections.singletonMap("key", "value");
        Map mapModern = Map.of("k1", "v1", "k2", "v2", "k3", "v3");

        Map existingMap = new HashMap();
        existingMap.put("nama", "budi");
        existingMap.put("kota", "Jakarta");

        Map immutableDariExisting = Collections.unmodifiableMap(existingMap);
        System.out.println("mapKosong = " + mapKosong);
        System.out.println("satuData = " + satuData);
        System.out.println("mapModern = " + mapModern);
        System.out.println("immutableDariExisting = " + immutableDariExisting);

        try {
            existingMap.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("mapKosong tidak bisa diubah: " + e);
        }
        try {
            satuData.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("satuData tidak bisa diubah : " + e);
        }
        try {
            mapModern.put("x", "y");
        }catch (UnsupportedOperationException e) {
            System.out.println("mapModern tidak bisa diubah : " + e);
        }
        try {
            immutableDariExisting.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("immutableDariExisting tidak bisa diubah : " + e);
        }
    }

}
