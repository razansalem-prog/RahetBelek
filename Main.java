public class Main {
    public static void main(String[] args) {

        System.out.println("=== Rahet Belek — Gestion des missions ===");

        Mission m1 = new Mission(1, "Acheter médicaments", "En attente");

        m1.afficherMission();

        m1.accepterMission();

        m1.afficherMission();

        m1.terminerMission();

        m1.afficherMission();
    }
}
