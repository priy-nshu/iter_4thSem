package CSW_2;

class garbage2 {
    private int ID;
    private String name;
    private int age;
    private static int nextID = 1;

    public garbage2(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextID++;
    }

    public void show() {
        System.out.println("Id=" + ID + "\nName=" + name + "\nAge=" + age);
    }

    public void showNextId() {
        System.out.println("Next employee id will be=" + nextID);
    }

    public static void main(String[] args) {
        garbage2 x=new garbage2("priyanshu",19);
    }
}
