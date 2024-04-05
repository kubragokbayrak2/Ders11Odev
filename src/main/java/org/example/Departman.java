package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Departman {
    private Personel teamLead;
    private ArrayList<Personel> personelList;
    private HashMap<String, Boolean> assignmentList;

    public Departman(Personel teamLead) throws Exception {
        if (teamLead == null) {
            throw new Exception("Team lead olmadan departman oluşturulamaz");
        }
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new HashMap<>();
    }

    public Personel getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Personel teamLead) {
        this.teamLead = teamLead;
    }

    public ArrayList<Personel> getPersonelList() {
        return personelList;
    }

    public void addPersonel(Personel newPersonel) {
        this.personelList.add(newPersonel);
    }

    public void removePersonel(Personel oldPersonel) {
        this.personelList.remove(oldPersonel);
    }

    public void changePersonel(Personel oldPersonel, Personel newPersonel) {
        removePersonel(oldPersonel);
        addPersonel(newPersonel);
    }

    public HashMap<String, Boolean> getAssignmentList() {
        return assignmentList;
    }

    public void addAssignment(String newAssignment) {
        this.assignmentList.put(newAssignment, false);
    }

    public void completeAssignment(String assignment) throws Exception {
        if (this.assignmentList.containsKey(assignment)) {
            this.assignmentList.put(assignment, true);
        } else {
            throw new Exception("Bu görev bulunmuyor");
        }
    }
}
