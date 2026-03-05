public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Banner array
        String[] banner = new String[o.length];

        // Combine letters line by line
        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join("   ",
                    o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[]{
                "PPPP",
                "P   P",
                "PPPP",
                "P",
                "P"
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[]{
                "SSSS",
                "S",
                "SSSS",
                "   S",
                "SSSS"
        };
    }
}