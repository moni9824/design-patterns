public class Menu {

    private FirstBuger firstBuger;
    private SecondBurger secondBurger;
    private ThirdBurger thirdBurger;

    public Menu() {
        firstBuger = new FirstBurgerImpl();
        secondBurger = new SecondBurgerImpl();
        thirdBurger = new ThirdBurgerImpl();
    }

    public void classicBurger() {
        firstBuger.classicBurger();
    }

    public void cheeseBurger() {
        secondBurger.cheeseBurger();
    }

    public void eggBurger() {
        thirdBurger.eggBurger();
    }

}
