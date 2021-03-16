

public class TestGetSignLogic {

    public static void main(String[] args)  {
        // インスタンス生成
        GetSignLogic gsl = new GetSignLogic();
        int[] birthday = new int[2];
        String sign;

        // 正常系
        // 誕生日が適正な数字だった時、星座がかえってくる
        birthday[0] = 1;
        birthday[1] = 1;
        sign = gsl.getSign(birthday);
        if (sign != null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        // 異常系
        // 誕生日が不正な数字だった時、星座はnullになる
        birthday[0] = 0;
        birthday[1] = 0;
        sign = gsl.getSign(birthday);
        if (sign == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        // 誕生日がnullだった時、星座はnullになる
        birthday[0] = 0;
        birthday[1] = 0;
        sign = gsl.getSign(birthday);
        if (sign == null){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }


        
    }
    
}
