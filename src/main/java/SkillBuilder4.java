
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <Daniel Kissi>
 * @version 1.0
 */

public class SkillBuilder4 {
    static Boolean notT = false;


    public static String findTYPattern(String s)
    {
        notT = false;
        String place = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T' || s.charAt(i) == 't') {
                notT = true;
            }
            if (notT == true) {
                place += s.charAt(i);
                if (s.charAt(1) == 'Y' || s.charAt(i) == 'y') {
                    notT = false;
                }
            }
            if (place.contains("y") || place.contains("Y")) {
                return place;
            }
        }

        return "";
    }
}

