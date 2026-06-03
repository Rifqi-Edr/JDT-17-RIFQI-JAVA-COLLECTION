package org.indivaragroup.collection;

import java.util.EnumSet;

public class ContohEnumSet {
    static void main() {
        EnumSet<Hari> hariKerja = EnumSet.of(
                Hari.SENIN, Hari.SELASA, Hari.RABU, Hari.KAMIS, Hari.JUMAT
        );

        EnumSet<Hari> akhirPekan = EnumSet.of(
                Hari.SABTU, Hari.MINGGU
        );
        EnumSet<Hari> semuaHari = EnumSet.allOf(Hari.class);
        System.out.println(hariKerja);
        System.out.println(akhirPekan);
        System.out.println(semuaHari);

    }
}
