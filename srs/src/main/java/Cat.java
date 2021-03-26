public class Cat extends Animal implements IPet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        return "Miau mIAU";
    }

    @Override
    public boolean roll() {
        System.out.println("Es demasiado gordo para girar.");
        return false;
    }

    @Override
    public String sayLoveYourMaster(String masterName) {
        return String.format("*Ronronea a su Maestro %s*.", masterName);
    }

    @Override
    public boolean eat() {
        System.out.println("Está a dieta, así que recibe comida especial que no quiere comer.");
        return false;
    }
}
