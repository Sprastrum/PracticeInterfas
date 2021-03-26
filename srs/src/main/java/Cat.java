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
        System.out.println("It's too fat to roll.");
        return false;
    }

    @Override
    public String sayLoveYourMaster(String masterName) {
        return String.format("*Purr to its Master %s*.", masterName);
    }

    @Override
    public boolean eat() {
        System.out.println("He is on a diet, so he receives special food that he does not want to eat.");
        return false;
    }
}
