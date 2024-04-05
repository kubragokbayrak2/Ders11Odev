package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personel p1 = new ErkekPersonel(
                "Mustafa",
                "Fırat",
                LocalDate.of(1999, 1, 2)
        );
        Personel p2 = new KadinPersonel(
                "Kübra",
                "Gökbayrak",
                LocalDate.of(2000, 1, 2)
        );
        Personel p3 = new KadinPersonel(
                "Esra",
                "Gökbayrak",
                LocalDate.of(2000, 1, 2)
        );

        try {
            Departman webDepartmani = new Departman(p1);
            webDepartmani.addPersonel(p2);
            webDepartmani.addPersonel(p3);
            System.out.println(webDepartmani.getTeamLead());
            System.out.println(webDepartmani.getPersonelList());
            webDepartmani.removePersonel(p3);
            System.out.println(webDepartmani.getPersonelList());
            webDepartmani.changePersonel(p2, p3);
            System.out.println(webDepartmani.getPersonelList());

            webDepartmani.addAssignment("Test yazılacak");
            webDepartmani.addAssignment("Kod yazılacak");
            System.out.println(webDepartmani.getAssignmentList());

            webDepartmani.completeAssignment("Test yazılacak");
            System.out.println(webDepartmani.getAssignmentList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}