public abstract class Npc {
    private int attack;
    private int protection;
    private int shot;
    private int[] damage;
    private int health;
    private int speed;
    private int delivery;
    private Boolean magic;
    private String name;

    public Npc(int attack, int protection, int shot, int[] damage, int health, int speed, int delivery, Boolean magic, String name) {
        this.attack = attack;
        this.protection = protection;
        this.shot = shot;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "attack = " + attack +
                ", protection = " + protection + 
                ", shot = " + shot + 
                ", damage = " + damage + 
                ", health = " + health + 
                ", speed = " + speed + 
                ", delivery = " + delivery + 
                ", magic = " + magic + 
                ", name = " + name ;
    }
}
