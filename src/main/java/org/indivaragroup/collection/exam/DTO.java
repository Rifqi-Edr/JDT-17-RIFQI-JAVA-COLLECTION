package org.indivaragroup.collection.exam;

import java.util.ArrayList;

public class DTO {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> alamat = new ArrayList<>();
    ArrayList<Double> gaji = new ArrayList<>();
    ArrayList<Character> jenisKelamin = new ArrayList<>();

    public DTO(ArrayList<String> name, ArrayList<String> alamat, ArrayList<Double> gaji, ArrayList<Character> jenisKelamin) {
        this.name = name;
        this.alamat = alamat;
        this.gaji = gaji;
        this.jenisKelamin = jenisKelamin;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public ArrayList<Double> getGaji() {
        return gaji;
    }

    public ArrayList<Character> getJenisKelamin() {
        return jenisKelamin;
    }
}
