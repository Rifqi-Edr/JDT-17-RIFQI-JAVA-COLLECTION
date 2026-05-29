package org.indivaragroup.movie.dto;

import org.indivaragroup.movie.film.Film;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class DTO {
    private Map<String, Map<String, Map<String, Map<String, List<Film>>>>> data = new LinkedHashMap<>();

    public DTO() {
        initData();
    }

    public Map<String, Map<String, Map<String, Map<String, List<Film>>>>> getData() {
        return data;
    }

    public List<Film> getAllFilms() {
        return data.values().stream()
                .flatMap(m2 -> m2.values().stream())
                .flatMap(m3 -> m3.values().stream())
                .flatMap(m4 -> m4.values().stream())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public Optional<Film> findFilmByKode(String kodeAv) {
        return getAllFilms().stream()
                .filter(f -> f.getKodeAv().equalsIgnoreCase(kodeAv))
                .findFirst();
    }

    public Map<String, Long> getFilmsCountPerCategory() {
        return getAllFilms().stream()
                .collect(Collectors.groupingBy(Film::getCategory, Collectors.counting()));
    }

    private void initData() {
        data.put("TEEN YO", new LinkedHashMap<>());
        data.get("TEEN YO").put("SCHOOL GIRL", new LinkedHashMap<>());
        data.get("TEEN YO").get("SCHOOL GIRL").put("UNIFORM", new LinkedHashMap<>());
        data.get("TEEN YO").get("SCHOOL GIRL").put("CASUAL", new LinkedHashMap<>());

        data.get("TEEN YO").put("COLLEGE", new LinkedHashMap<>());

        data.put("BEAUTIFUL GIRL", new LinkedHashMap<>());
        data.put("NEW COMER 2026", new LinkedHashMap<>());

        List<Film> summerEdition = new ArrayList<>();
        summerEdition.add(new Film("Artist A", "ABX-001", LocalDate.parse("2026-01-15"), "TEEN YO", "SUMMER EDITION"));
        summerEdition.add(new Film("Artist B", "ABX-002", LocalDate.parse("2026-02-20"), "TEEN YO", "SUMMER EDITION"));

        List<Film> weekendEdition = new ArrayList<>();
        weekendEdition.add(new Film("Artist C", "ABX-003", LocalDate.parse("2026-03-10"), "TEEN YO", "WEEKEND EDITION"));

        data.get("TEEN YO").get("SCHOOL GIRL").get("UNIFORM").put("SUMMER EDITION", summerEdition);
        data.get("TEEN YO").get("SCHOOL GIRL").get("CASUAL").put("WEEKEND EDITION", weekendEdition);
    }
}
