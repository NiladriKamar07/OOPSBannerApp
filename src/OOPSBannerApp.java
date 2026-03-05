import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        // Get character pattern map
        Map<Character, CharacterPatternMap> patternMap = CharacterPatternMap.initializePatterns();

        int height = 5; // Each character pattern has 5 lines

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPatternMap pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern.getPattern()[i]).append("   ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        // Initialize all supported characters
        public static Map<Character, CharacterPatternMap> initializePatterns() {

            Map<Character, CharacterPatternMap> map = new HashMap<>();

            map.put('O', new CharacterPatternMap('O', new String[]{
                    "OOOO",
                    "O  O",
                    "O  O",
                    "O  O",
                    "OOOO"
            }));

            map.put('P', new CharacterPatternMap('P', new String[]{
                    "PPPP",
                    "P   P",
                    "PPPP",
                    "P",
                    "P"
            }));

            map.put('S', new CharacterPatternMap('S', new String[]{
                    "SSSS",
                    "S",
                    "SSSS",
                    "   S",
                    "SSSS"
            }));

            return map;
        }
    }
}