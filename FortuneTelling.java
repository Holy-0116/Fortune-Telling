import java.util.Scanner;

public class FortuneTelling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 誕生日の入力を受け付ける
        
        System.out.println("誕生日の「月」を半角数字で入力してください");
        int month = sc.nextInt();
        System.out.println("誕生日の「日にち」を半角数字で入力してください");
        int date = sc.nextInt();

        // 星座を取得
        GetSignLogic gsl = new GetSignLogic();
        String sign = gsl.getSign(month, date);

        // 受け取った星座でナンバーを取得
        GetFortuneResult gfl = new GetFortuneResult();
        int resultNum = gfl.getResultNum(sign);
        // 受け取ったナンバーで運勢を取得
        FortuneResultDAO dao = new FortuneResultDAO();
        String result = dao.execute(resultNum);
        System.out.println(result);
       

    }
}