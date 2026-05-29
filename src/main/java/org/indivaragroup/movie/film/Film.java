package org.indivaragroup.movie.film;

import java.time.LocalDate;

public class Film {
    private String namaArtist;
    private String kodeAv;
    private LocalDate tanggalRelease;
    private String category;
    private String subCategory;

    public Film(String namaArtist, String kodeAv, LocalDate tanggalRelease, String category, String subCategory) {
        this.namaArtist = namaArtist;
        this.kodeAv = kodeAv;
        this.tanggalRelease = tanggalRelease;
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getNamaArtist() { return namaArtist; }
    public String getKodeAv() { return kodeAv; }
    public LocalDate getTanggalRelease() { return tanggalRelease; }
    public String getCategory() { return category; }
    public String getSubCategory() { return subCategory; }
}
