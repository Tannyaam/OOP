import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> characterList = new ArrayList<>();
        characterList.add(new Monk("Robert"));
        characterList.add(new Peasant("Carl"));
        characterList.add(new Robber("Serg"));
        characterList.add(new Sniper("Nick"));
        characterList.add(new Wizard("Mort"));
        characterList.add(new Pikeman("Bart"));
        characterList.add(new Crossbowman("Tom"));

        characterList.forEach(n -> System.out.println(n));  // или characterList.forEach(System.out::println);

    }
}
