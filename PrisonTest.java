public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.sentence = 4;
        bubba.prisonerInformation();

        Prisoner twitch = new Prisoner();
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.sentence = 3;
        twitch.prisonerInformation();

        System.out.println(bubba);
        System.out.println(twitch);
    }
}
