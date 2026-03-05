public class OOPSBannerApp {

    public static void main(String[] args) {

        
        String[] banner = {

            String.join("   ", "OOOO", "OOOO", "PPPP", "SSSS"),
            String.join("   ", "O  O", "O  O", "P   P", "S"),
            String.join("   ", "O  O", "O  O", "PPPP", "SSSS"),
            String.join("   ", "O  O", "O  O", "P", "S"),
            String.join("   ", "OOOO", "OOOO", "P", "SSSS")

        };

       
        for (String line : banner) {
            System.out.println(line);
        }
    }
}