public class Client {

    public static void main(String[] args) {
        Burger burger = new BurgerMake();
        burger.make();

        System.out.println("\n+--- Decorate CheeseBurger ---+");
        Decorateburger cheeseBurger = new CheeseBurger(burger);
        cheeseBurger.make();

        System.out.println("\n+--- Decorate EggBurger ---+");
        Decorateburger eggBurger = new EggBurger(burger);
        eggBurger.make();
    }

}
