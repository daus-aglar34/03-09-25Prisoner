public class CameraTest {
    public static void main(String[] args) {
        Camera remote1 = new Camera();
        Camera remote2 = new Camera();

        remote1.play();
        remote2.play();

        Camera remote3 = new Camera();
        Camera remote4 = remote3;

        remote3.play();
        remote4.stop();

        Camera remote5 = new Camera();
        remote5.play();
        remote5.menu();
    }
}
