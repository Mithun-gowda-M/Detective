public class Suspect {
    int id;
    String name;
    String location;
    String alibi;

    public Suspect(int id, String name, String location, String alibi) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }

    public void displayDetails() {
        System.out.println(id + ". " + name
                + " | " + location
                + " | " + alibi);
    }

    public static void displayAll(Suspect[] suspects) {
        for (Suspect suspect : suspects) {
            suspect.displayDetails();
        }
    }
}
