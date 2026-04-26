 /*public class Main {
    public static void main(String[] args) {

        System.out.println("=== Rahet Belek — Gestion des missions ===");

        Mission m1 = new Mission(1, "Acheter médicaments", "En attente");

        m1.afficherMission();

        m1.accepterMission();

        m1.afficherMission();

        m1.terminerMission();

        m1.afficherMission();
    }
} */
import backend.gestion_missions.Mission;
import backend.gestion_missions.MissionService;

public class Main {
    public static void main(String[] args) {
        // 1. On crée le service (le gestionnaire de liste)
        MissionService service = new MissionService();

        // 2. On crée deux exemples de missions
        // (Vérifie que ton constructeur dans Mission.java accepte bien : id, titre, description, statut)
        Mission m1 = new Mission(1, "Acheter médicaments", "Pour un senior à Sousse", "En attente");
        Mission m2 = new Mission(2, "Courses", "Porter les sacs lourds", "A faire");

        // 3. On les ajoute au gestionnaire
        service.ajouterMission(m1);
        service.ajouterMission(m2);

        // 4. On affiche le résultat final
        System.out.println("=== Application Rahet Belek - Sprint 2 ===");
        service.afficherMissions();
    }
}
