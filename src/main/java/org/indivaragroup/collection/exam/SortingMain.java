package org.indivaragroup.collection.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMain {
    static void main() {
        ArrayList<String> listNama = new ArrayList<>();
        ArrayList<String> listAlamat = new ArrayList<>();
        ArrayList<Double> listGaji = new ArrayList<>();
        ArrayList<Character> listJenisKelamin = new ArrayList<>();

        listNama.addAll(Arrays.asList(
                "Eko Prasetyo",
                "Fara Nabila",
                "Gilang Dirga",
                "Hana Saraswati",
                "Irfan Hakim",
                "Julia Perez",
                "Michael",
                "Budi Perkasa",
                "Reka Wilantara",
                "Bandung Bondowoso"
        ));

        listAlamat.addAll(Arrays.asList(
                "Medan",
                "Tangerang Selatan",
                "Semarang",
                "Banda Aceh",
                "Denpasar",
                "Nusa Tenggara Barat",
                "Jakarta",
                "Tanggerang Selatan",
                "Bandung",
                "Bandung"
        ));

        listGaji.addAll(Arrays.asList(
                4500000.0,
                7200000.0,
                9100000.0,
                6500000.0,
                8000000.0,
                12000000.0,
                20000000.0,
                2000000.0,
                6000000.0,
                8000000.0
        ));

        listJenisKelamin.addAll(Arrays.asList(
                'L',
                'P',
                'L',
                'P',
                'L',
                'P',
                'L',
                'L',
                'P',
                'L'
        ));

        DTO person = new DTO(listNama, listAlamat, listGaji, listJenisKelamin);
        SortingLogic sort = new SortingLogic();
        sort.sortByName(person);
        sort.sortByGender(person);
        sort.sortByCity(person);
        sort.sortByIncome(person);
    }
}
