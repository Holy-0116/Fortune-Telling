import java.util.Scanner;

class InputBirthday{
    public int[] accept(){
        Scanner sc = new Scanner(System.in);
        // 誕生日の入力を受け付ける
        int month = 0; int date = 0;
        do{
            try{
                System.out.println("誕生日の「月」を半角数字で入力してください");
                month = sc.nextInt();
                System.out.println("誕生日の「日にち」を半角数字で入力してください");
                date = sc.nextInt();
            } catch (Exception e){
                System.out.println("半角数字を入力してください");
                sc.next();
            }
        }while(month == 0 || date == 0);

        int[] birthday = {month, date};
        return birthday;

    }
}