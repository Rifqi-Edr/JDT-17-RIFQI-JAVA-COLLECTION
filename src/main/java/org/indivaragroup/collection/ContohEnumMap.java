package org.indivaragroup.collection;

import java.util.EnumMap;
import java.util.Map;

public class ContohEnumMap {
    static void main() {
        EnumMap<Hari, String> jadwal = new EnumMap<>(Hari.class);

        jadwal.put(Hari.SENIN, "Meeting");
        jadwal.put(Hari.RABU, "Workshop");
        jadwal.put(Hari.JUMAT, "Review");

        for (Map.Entry<Hari, String> entry : jadwal.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Jadwal Rabu: " + jadwal.get(Hari.RABU));
        System.out.println("Apakah ada jadwal hari Kamis ? " + jadwal.containsKey(Hari.KAMIS));
    }
}
