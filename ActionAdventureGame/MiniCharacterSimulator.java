public class MiniCharacterSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character knight = new Knight();
        knight.fight();

        Character queen = new Queen();
        queen.fight();

        Character troll = new Troll();
        troll.fight();

        System.out.println("Setting behavior dynamically");

        king.setWeapon(new BowAndArrowBehavior());
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
