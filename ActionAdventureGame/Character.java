
public abstract class Character {

    WeaponBehavior weapon;
    public Character() {

    }

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }
}
