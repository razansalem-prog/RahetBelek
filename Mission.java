public class Mission {
    private int id;
    private String description;
    private String statut;

    public Mission() {}

    public Mission(int id, String description, String statut) {
        this.id = id;
        this.description = description;
        this.statut = statut;
    }
public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public void accepterMission() {
        System.out.println("Mission acceptée");
        this.statut = "Acceptée";
    }

    public void terminerMission() {
        System.out.println("Mission terminée");
        this.statut = "Terminée";
    }

    public void afficherMission() {
        System.out.println("Mission: " + description + " | Statut: " + statut);
    }
}
   
