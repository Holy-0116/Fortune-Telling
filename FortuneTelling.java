import java.time.MonthDay;
import java.util.Scanner;

public class FortuneTelling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 誕生日の入力を受け付ける
        
        System.out.println("誕生日の「月」を半角数字で入力してください");
        int month = sc.nextInt();
        System.out.println("誕生日の「日にち」を半角数字で入力してください");
        int date = sc.nextInt();
        

        // 入力された日付から誕生日を生成
        MakeDate md = new MakeDate();
        MonthDay birthday = md.makeDate(month, date);
        
        // DAOにアクセスして星座を取得
        SignDAO dao = new SignDAO();
        String sign = dao.execute(birthday);
        System.out.println(sign);
       

    }
}