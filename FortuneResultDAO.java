import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FortuneResultDAO{

    public String execute(int resultNum){
        File file = new File("FortuneResult.txt");
            List<String> fortuneResult = new ArrayList<String>();
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                
                String line;
                while((line = br.readLine()) != null){
                    fortuneResult.add(line);
                }
               
                int targetNum = resultNum % (fortuneResult.size());
                String result = fortuneResult.get(targetNum);
                return result;
                
            } catch (Exception e){
                e.printStackTrace();
                return "結果を取得できませんでした";
            }
            
        }

}