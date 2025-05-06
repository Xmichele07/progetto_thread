public class GaraCorsa {
    public static void main(String[] args) throws Exception {
        Corridore corridore1 = new Corridore("Mister");
        Corridore corridore2 = new Corridore("Abba");
        Corridore corridore3 = new Corridore("Betti");
        Corridore corridore4 = new Corridore("Trava");

        corridore1.start();
        corridore2.start();
        corridore3.start();
        corridore4.start();

        try {
            corridore1.join();
            corridore2.join();
            corridore3.join();
            corridore4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        System.out.println("La gara è terminata!");
    }
}

