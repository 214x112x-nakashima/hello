import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {   

        Scanner sc = new Scanner(System.in);

        int truth = (int)(Math.random()*90 + 10);
        System.out.println("10~99で数字を予想してください。" + truth);

        for(int i=1;i<=5;i++){

            System.out.printf(i + "回目の入力：");
            int input = sc.nextInt();

            if(truth == input){
                System.out.println("正解です！！！！！");
                break;
            }else if(truth > input){
                if(truth >= input+20){
                    System.out.println("正解は20以上大きいです。");
                }else{
                    System.out.println("正解はもっと大きいです。");
                }
            }else{
                if(truth <= input-20){
                    System.out.println("正解は20以上小さいです。");
                }else{
                    System.out.println("正解はもっと小さいです。");
                }

            }

            if(i==5){
                System.out.println("正解は" + truth + "でした。");
            }

        }

    }
}
