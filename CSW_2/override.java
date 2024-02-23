package CSW_2;

public class override {

    class AnimalProperties {
        public void sound() {
            System.out.println("This is top level animal class sound");
        }
    }

    class Cat extends AnimalProperties {
        @Override
        public void sound() {
            System.out.println("Meooww");
        }
    }
    public void main(String args[]) {
        AnimalProperties Obj = new Cat();
        Obj.sound();
    }

}
