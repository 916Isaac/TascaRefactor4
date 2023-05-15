import java.util.Arrays;
import java.util.List;

public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer,
                               boolean isPregnant, boolean isOver60yearsold, boolean hepatic, boolean kidnevDisease,
                               boolean respiratoryDisease, String provincia) {
        boolean isHighTemperature = bodyTemperature >= 38;

        if (isHighTemperature && (difficultyBreathing || diabetes || cancer || isPregnant || isOver60yearsold ||
                hepatic || kidnevDisease || respiratoryDisease)) {
            return "/diagnostico/" + provincia;
        } else if (isHighTemperature) {
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }

}
