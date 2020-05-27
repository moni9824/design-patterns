public class EggBurger extends Decorateburger {

    public EggBurger(Burger burger) {
        super();
    }

    @Override
    public void make() {
        addEgg();
        super.make();
    }

    private void addEgg() {
        System.out.println("Add egg");
    }
}
