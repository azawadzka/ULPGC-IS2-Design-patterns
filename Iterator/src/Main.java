public class Main {

    public static void main(String[] args) {

        VideoShop BeverlyHills = new VideoShop("BEVERLY HILLS", new Movies70s("70s"), new Movies80s("80s"), new Movies90s("90s"));
        BeverlyHills.printOffer();

    }
}
