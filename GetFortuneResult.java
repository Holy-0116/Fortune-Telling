import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GetFortuneResult {
    
    private final List<String> SIGNS = Arrays.asList("やぎ座","みずがめ座","うお座","おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座");

    public int getResultNum(String sign){
        LocalDate today = LocalDate.now();
        int y = today.getYear();
        int m = today.getMonthValue();
        int d = today.getDayOfMonth();
        
        int indexOfSIGNS = SIGNS.indexOf(sign);
        int resultNum = (y * m / d * (indexOfSIGNS + 1));
        return resultNum;

        
    }
}
