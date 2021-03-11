import java.io.File;
import java.io.IOException;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SignDAO  {
    private final File file = new File("fortuneData.txt");
    
    public String execute(MonthDay birthday){
        // 取得したデータを格納するハッシュマップ
        HashMap<String, List<MonthDay>> fortuneData = new HashMap<String, List<MonthDay>>();

        try{
            Scanner sc = new Scanner(file,"UTF-8");
            while(sc.hasNext()){
                // 行の中身を取得
                String inputLine = sc.nextLine();
                // カンマ区切りを分割
                String[] result = inputLine.split(",");
                // 日付を格納するための配列を初期化
                List<MonthDay> days = new ArrayList<MonthDay>();
                // 受け取った日付をLocalDateクラスに変換(2回)
                for(int i = 1; i < 3; i++){
                    // 「/」区切りの日付からMonthDayクラスを生成
                    String[] num = result[i].split("/");
                    int month = Integer.parseInt(num[0]);
                    int dayOfMonth = Integer.parseInt(num[1]);
                    MonthDay day = MonthDay.of(month, dayOfMonth);
                    // 配列に追加
                    days.add(day);
                }
                // ハッシュマップに「星座」と配列を追加
                fortuneData.put(result[0], days);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        // 誕生日とハッシュマップの要素を照合して星座を取得して、戻り値に指定する
        for(Map.Entry<String, List<MonthDay>> entry : fortuneData.entrySet()){
            List<MonthDay> days = entry.getValue();

            if(birthday.isAfter(days.get(0)) && birthday.isBefore(days.get(1))){
                String sign = entry.getKey();
                return  sign;
            }
        }
        
        return null;
    }    
    
    
}
