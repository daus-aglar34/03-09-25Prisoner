public class Prisoner {
    public String name;
    public double height;
    public int sentence;

    public void prisonerInformation() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence + " years");
    }
    public void think() {
        System.out.println("I'll have my revenge");
    }
}
