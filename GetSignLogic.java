public class GetSignLogic {
    // 1月から順番に並べた星座
    final String[] SIGNS = {"やぎ座","みずがめ座","うお座","おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座"};
    // 順番に並べた星座の末日
    final int[] END_DAYS = {19,18,20,19,20,21,22,22,22,23,21,21};
    // 月末の日を1月から順番に並べた数字
    final int[] END_OF_MONTH = {31,29,31,30,31,30,31,31,30,31,30,31};
    
    public String getSign(int[] birthday){

        String sign ="";
        int month = birthday[0];
        int day = birthday[1];

        for(int i = 0; i < SIGNS.length; i++){
            if(month == i + 1){
                if(day <= END_DAYS[i]){
                    sign = SIGNS[i];
                    return sign;
                }else if(day <= END_OF_MONTH[i]){
                    sign = SIGNS[(i + 1) % SIGNS.length];
                    return sign;
                }
            }
        }
        String err = "入力された値は不正です"; 
        return err;   
    }
}
