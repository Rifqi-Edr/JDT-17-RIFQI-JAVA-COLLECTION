package org.indivaragroup.movie.service;

import org.indivaragroup.movie.dto.DTO;
import org.indivaragroup.movie.film.Film;

import java.util.*;

public class FilmService {
    private DTO dto;
    private Scanner scanner;

    public FilmService(DTO dto) {
        this.dto = dto;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Browse Category");
            System.out.println("2. Search by KODE_AV");
            System.out.println("3. Count Films per Category");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    browseCategories();
                    break;
                case "2":
                    System.out.print("Masukkan KODE_AV: ");
                    String kode = scanner.nextLine();
                    searchFilm(kode);
                    break;
                case "3":
                    countFilms();
                    break;
                case "0":
                    running = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    private void browseCategories() {
        try {
            var dataMap = dto.getData();

            String level1 = chooseOption("FILM CATEGORY", dataMap.keySet());
            if (level1 == null) return;
            var mapLevel2 = dataMap.get(level1);

            String level2 = chooseOption("SUB CATEGORY: " + level1, mapLevel2.keySet());
            if (level2 == null) return;
            var mapLevel3 = mapLevel2.get(level2);

            String level3 = chooseOption("SUB SUB CATEGORY: " + level2, mapLevel3.keySet());
            if (level3 == null) return;
            var mapLevel4 = mapLevel3.get(level3);

            String level4 = chooseOption("LEVEL 4: " + level3, mapLevel4.keySet());
            if (level4 == null) return;
            List<Film> films = mapLevel4.get(level4);

            displayFilms(level4, films);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Kembali ke menu utama.");
        }
    }

    private String chooseOption(String title, Set<String> options) {
        System.out.println("=== " + title + " ===");
        List<String> listOptions = new ArrayList<>(options);

        if (listOptions.isEmpty()) {
            System.out.println("(Tidak ada kategori turunan)");
            return null;
        }

        for (int i = 0; i < listOptions.size(); i++) {
            System.out.println((i + 1) + ". " + listOptions.get(i));
        }
        System.out.print("Pilih: ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice > 0 && choice <= listOptions.size()) {
                return listOptions.get(choice - 1);
            } else {
                System.out.println("Pilihan di luar jangkauan.");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
            return null;
        }
    }

    private void searchFilm(String kodeAv) {
        Optional<Film> result = dto.findFilmByKode(kodeAv);
        if (result.isPresent()) {
            displayFilms("SEARCH RESULT", Collections.singletonList(result.get()));
        } else {
            System.out.println("Film dengan KODE_AV '" + kodeAv + "' tidak ditemukan.");
        }
    }

    private void countFilms() {
        System.out.println("=== TOTAL FILM PER CATEGORY ===");
        Map<String, Long> counts = dto.getFilmsCountPerCategory();
        counts.forEach((cat, count) -> System.out.println("- " + cat + ": " + count + " film"));
    }

    private void displayFilms(String title, List<Film> films) {
        System.out.println("=== DATA FILM: " + title + " ===");
        System.out.println("===============================================================================");
        System.out.printf("| %-2s | %-13s | %-8s | %-14s | %-14s | %-16s |\n",
                "No", "NAMA_ARTIST", "KODE_AV", "TGL_RELEASE", "CATEGORY", "SUB_CATEGORY");
        System.out.println("===============================================================================");

        if (films == null || films.isEmpty()) {
            System.out.println("TIDAK ADA DATA FILM");
        } else {
            int no = 1;
            for (Film f : films) {
                System.out.printf("| %-2d | %-13s | %-8s | %-14s | %-14s | %-16s |\n",
                        no++, f.getNamaArtist(), f.getKodeAv(), f.getTanggalRelease().toString(),
                        f.getCategory(), f.getSubCategory());
            }
        }
        System.out.println("===============================================================================");
    }
}
