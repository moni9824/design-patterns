public abstract class Decorateburger implements Burger {

    Burger burger;

    public void DecorateBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void make() {
        burger.make();
    }
}
