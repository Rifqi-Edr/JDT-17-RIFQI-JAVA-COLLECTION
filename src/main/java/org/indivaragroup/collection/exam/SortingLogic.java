package org.indivaragroup.collection.exam;

public class SortingLogic {
    public void sortByName(DTO persons) {
        int n = persons.getName().size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (persons.getName().get(j).compareTo(persons.getName().get(j + 1)) > 0) {

                    String tempName = persons.getName().get(j);
                    persons.getName().set(j, persons.getName().get(j + 1));
                    persons.getName().set(j + 1, tempName);

                    String tempAlamat = persons.getAlamat().get(j);
                    persons.getAlamat().set(j, persons.getAlamat().get(j + 1));
                    persons.getAlamat().set(j + 1, tempAlamat);

                    Double tempGaji = persons.getGaji().get(j);
                    persons.getGaji().set(j, persons.getGaji().get(j + 1));
                    persons.getGaji().set(j + 1, tempGaji);

                    Character tempJK = persons.getJenisKelamin().get(j);
                    persons.getJenisKelamin().set(j, persons.getJenisKelamin().get(j + 1));
                    persons.getJenisKelamin().set(j + 1, tempJK);
                }
            }
        }

        System.out.println("\nSorted by Name");
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + "." + " Nama: %s | Alamat: %s | Gaji: %.2f | Jenis Kelamin: %c%n",
                    persons.getName().get(i),
                    persons.getAlamat().get(i),
                    persons.getGaji().get(i),
                    persons.getJenisKelamin().get(i)
            );
        }
    }

    public void sortByGender(DTO persons) {
        int n = persons.getJenisKelamin().size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(persons.getJenisKelamin().get(j) > persons.getJenisKelamin().get(j + 1)) {
                    String tempName = persons.getName().get(j);
                    persons.getName().set(j, persons.getName().get(j + 1));
                    persons.getName().set(j + 1, tempName);

                    String tempAlamat = persons.getAlamat().get(j);
                    persons.getAlamat().set(j, persons.getAlamat().get(j + 1));
                    persons.getAlamat().set(j + 1, tempAlamat);

                    Double tempGaji = persons.getGaji().get(j);
                    persons.getGaji().set(j, persons.getGaji().get(j + 1));
                    persons.getGaji().set(j + 1, tempGaji);

                    Character tempJK = persons.getJenisKelamin().get(j);
                    persons.getJenisKelamin().set(j, persons.getJenisKelamin().get(j + 1));
                    persons.getJenisKelamin().set(j + 1, tempJK);
                }
            }
        }
        System.out.println("\nSorted by Gender");
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + "." + " Nama: %s | Alamat: %s | Gaji: %.2f | Jenis Kelamin: %c%n",
                    persons.getName().get(i),
                    persons.getAlamat().get(i),
                    persons.getGaji().get(i),
                    persons.getJenisKelamin().get(i)
            );
        }
        int jumL = 0;
        int jumP = 0;
        for (char jk : persons.getJenisKelamin()) {
            if (jk == 'L') {
                jumL++;
            } else {
                jumP++;
            }
        }
        System.out.println("Jumlah laki laki : " + jumL);
        System.out.println("Jumlah laki laki : " + jumP);
    }

    public void sortByCity(DTO persons) {
        int n = persons.getAlamat().size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (persons.getAlamat().get(j).compareTo(persons.getAlamat().get(j + 1)) > 0) {

                    String tempName = persons.getName().get(j);
                    persons.getName().set(j, persons.getName().get(j + 1));
                    persons.getName().set(j + 1, tempName);

                    String tempAlamat = persons.getAlamat().get(j);
                    persons.getAlamat().set(j, persons.getAlamat().get(j + 1));
                    persons.getAlamat().set(j + 1, tempAlamat);

                    Double tempGaji = persons.getGaji().get(j);
                    persons.getGaji().set(j, persons.getGaji().get(j + 1));
                    persons.getGaji().set(j + 1, tempGaji);

                    Character tempJK = persons.getJenisKelamin().get(j);
                    persons.getJenisKelamin().set(j, persons.getJenisKelamin().get(j + 1));
                    persons.getJenisKelamin().set(j + 1, tempJK);
                }
            }
        }

        System.out.println("\nSorted by City");
        for (int i = 0; i < n; i++) {
            System.out.printf((i +1) + "." +" Nama: %s | Alamat: %s | Gaji: %.2f | Jenis Kelamin: %c%n",
                    persons.getName().get(i),
                    persons.getAlamat().get(i),
                    persons.getGaji().get(i),
                    persons.getJenisKelamin().get(i)
            );
        }
    }

    public void sortByIncome(DTO persons) {
        int n = persons.getGaji().size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (persons.getGaji().get(j) < persons.getGaji().get(j + 1)) {

                    String tempName = persons.getName().get(j);
                    persons.getName().set(j, persons.getName().get(j + 1));
                    persons.getName().set(j + 1, tempName);

                    String tempAlamat = persons.getAlamat().get(j);
                    persons.getAlamat().set(j, persons.getAlamat().get(j + 1));
                    persons.getAlamat().set(j + 1, tempAlamat);

                    Double tempGaji = persons.getGaji().get(j);
                    persons.getGaji().set(j, persons.getGaji().get(j + 1));
                    persons.getGaji().set(j + 1, tempGaji);

                    Character tempJK = persons.getJenisKelamin().get(j);
                    persons.getJenisKelamin().set(j, persons.getJenisKelamin().get(j + 1));
                    persons.getJenisKelamin().set(j + 1, tempJK);
                }
            }
        }

        System.out.println("\nSorted by Income");
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + "." + " Nama: %s | Alamat: %s | Gaji: %.2f | Jenis Kelamin: %c%n",
                    persons.getName().get(i),
                    persons.getAlamat().get(i),
                    persons.getGaji().get(i),
                    persons.getJenisKelamin().get(i)
            );
        }
    }
}
