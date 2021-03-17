package root;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FortuneResultDAO{
    // 星座一覧を格納した配列
    private final List<String> SIGNS = Arrays.asList("やぎ座","みずがめ座","うお座","おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座");
    // 占い結果を格納したテキストファイルを指定
    private final File FILE = new File("text/FortuneResult.txt");
    
        
    public String execute(String sign){
            // 星座が適正か確認
            if (SIGNS.contains(sign) == false){
                return null;
            }
            // 占い結果テキストの中身を格納する配列
            List<String> fortuneResult = new ArrayList<String>();
            // テキストの読み込みをして配列に格納
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE),"UTF-8"));
                
                String line;
                while((line = br.readLine()) != null){
                    fortuneResult.add(line);
                }
                // 実行した日（今日）を生成
                LocalDate today = LocalDate.now();
                int y = today.getYear();
                int m = today.getMonthValue();
                int d = today.getDayOfMonth();
                
                // 受け取った星座のindex番号を配列から取得
                int indexOfSIGNS = SIGNS.indexOf(sign);
                // index番号と今日の日付を使って占い結果のindex番号を生成
                int targetNum = (y * m / d * (indexOfSIGNS + 1)) % (fortuneResult.size());
                // 占い結果の配列からindex番号のものを取得
                String result = fortuneResult.get(targetNum);
                return result;
                
            } catch (Exception e){
                e.printStackTrace();
                return "結果を取得できませんでした";
            }
            
        }

}