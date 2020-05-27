public class Client {

    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("Customer Order：");
        menu.classicBurger();
        menu.cheeseBurger();
        menu.eggBurger();
    }

}
