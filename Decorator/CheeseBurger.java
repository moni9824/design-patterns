public class CheeseBurger extends Decorateburger {

    public CheeseBurger(Burger burger) {
        super();
    }

    @Override
    public void make() {
        addCheese();
        super.make();

    }

    private void addCheese() {
        System.out.println("Add Cheese");
    }
}
