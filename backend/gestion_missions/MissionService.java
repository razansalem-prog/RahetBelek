package backend.gestion_missions;

import java.util.ArrayList;
import java.util.List;

public class MissionService {

    private List<Mission> listeDesMissions = new ArrayList<>();

    // AJOUTER mission
    public void ajouterMission(Mission m) {
        listeDesMissions.add(m);
    }

    // AFFICHER missions
    public void afficherMissions() {
        for (Mission m : listeDesMissions) {
            System.out.println(m.getId() + " - " + m.getTitre() + " - " + m.getStatut());
        }
    }
    public void modifierMission(int id, String nouveauTitre, String nouvelleDescription, String nouveauStatut) {
    for (Mission m : listeDesMissions) {
        if (m.getId() == id) {
            m.setTitre(nouveauTitre);
            m.setDescription(nouvelleDescription);
            m.setStatut(nouveauStatut);
        }
    }
}
public void supprimerMission(int id) {
    listeDesMissions.removeIf(m -> m.getId() == id);
}
}
