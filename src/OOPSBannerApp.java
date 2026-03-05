import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        // Initialize pattern map
        Map<Character, String[]> patternMap = initializePatterns();

        // Render banner
        renderBanner(word, patternMap);
    }

    // Initialize all character patterns
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        });

        map.put('P', new String[]{
                "PPPP",
                "P   P",
                "PPPP",
                "P",
                "P"
        });

        map.put('S', new String[]{
                "SSSS",
                "S",
                "SSSS",
                "   S",
                "SSSS"
        });

        return map;
    }

    // Render banner function
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("   ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}