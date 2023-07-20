package run;

import method.Ending;
import method.Mentality;
import question1.Bus;
import question1.MyCar;
import question1.Subway;
import question2.DontGo;
import question2.Go;
import question3.ChiliBulgogi;
import question3.PorkCutlet;
import question3.SoftTofuStew;
import question3.Tteokbokki;
import question4.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("직장인 무사히 퇴근하기 게임을 시작합니다.");

        Scanner sc = new Scanner(System.in);

        System.out.println("==========게임룰========== \n 옳바른 선택지를 선택해서 무사히 퇴근하면 됩니다." + "\n");

        while (true) {
            System.out.print("출근하시겠습니까? (y/n) : ");
            String anwser = sc.nextLine();

            if (anwser.equalsIgnoreCase("n")) {

                System.out.println("연차를 다 소진해서 반드시 출근해야합니다.");

            } else {
                System.out.println("출근합니다.");
                System.out.println();
                break;

            }
        }

        Mentality player = new Mentality(100);
        System.out.println("Player Mental : " + player.getMental() + "\n");

            System.out.println("출근할때 이용할 교통수단을 선택해주세요.\n 1. 버스 \n 2. 지하철 \n 3. 자차");
            int anwser1 = sc.nextInt();
            Bus bus = new Bus();
            Subway subway = new Subway();
            MyCar myCar = new MyCar();

            if (anwser1 == 1) {
                player.takeDamage(25);
                bus.condition3();
            } else if (anwser1 == 2) {
                subway.condition1();
            } else if (anwser1 == 3) {
                myCar.condition2();
                player.takeDamage(10);
            } else {

            }
        System.out.println();
            System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");


        System.out.println("오전에 열심히 일하고 있는 당신, 갑자기 화장실 신호가 오는데!!....");
        System.out.println("\n 1. 화장실을 뛰어간다. \n 2. 화장실 안가고 참는다. \n 3. 지린다.");
        int anwser2 = sc.nextInt();

        Go go = new Go();
        DontGo dontGo = new DontGo();
        Ending ending = new Ending();

        if (anwser2 == 1) {
            go.condition1();

        } else if (anwser2 == 2) {
            dontGo.condition2();
            player.takeDamage(25);

        } else if (anwser2 == 3) {
            ending.badEnding1();
            return;

        } else {

        }
        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");

        System.out.println("부장님이 나한테 점심메뉴를 고르라고하는데..!");
        System.out.println("\n 1. 제육 \n 2. 돈까스 \n 3. 떡볶이 \n 4. 순두부찌개");
        int anwser3 = sc.nextInt();

        ChiliBulgogi chiliBulgogi = new ChiliBulgogi();
        PorkCutlet porkCutlet = new PorkCutlet();
        SoftTofuStew softTofuStew = new SoftTofuStew();
        Tteokbokki tteokbokki = new Tteokbokki();

        if (anwser3 == 1) {
            chiliBulgogi.condition1();
            player.takeDamage(10);

        } else if (anwser3 == 2) {
            porkCutlet.condition2();
            player.takeDamage(20);

        } else if (anwser3 == 3) {
            tteokbokki.condition1();

        } else if (anwser3 == 4){
            softTofuStew.condition4();
            player.takeDamage(30);

        }else {}

        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");


        /* 미니게임 자리*/


        System.out.println("회의중 부장님이 갑자기 아재개그를 날렸다? 어떻게 반응 하시겠습니까?");
        System.out.println("\n 1. 하하 \n 2. 호호 \n 3. 꺄하하하항 \n 4. 정색 \n 5. 한마디 거든다.");
        int anwser4 = sc.nextInt();
        Haha haha = new Haha();
        Hoho hoho = new Hoho();
        Hahahahahahoho hahahahahahoho = new Hahahahahahoho();
        Serious serious = new Serious();


        if (anwser4 == 1) {
            haha.condition3();
            player.takeDamage(10);

        } else if (anwser4 == 2) {
            hoho.condition3();
            player.takeDamage(20);

        } else if (anwser4 == 3) {
            hahahahahahoho.condition4();


        } else if (anwser4 == 4){
            serious.condition1();
            player.heal(30);

        } else if (anwser4 == 5) {
            ending.badEnding2();
            return;
        }
        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");

        System.out.println();
        System.out.println("당신의 엔딩은 .......\n");

        if(player.getMental() == 100) {
            ending.hiddenEnding();
        } else if (player.getMental() > 50) {
            ending.happyEnding();
        } else if (player.getMental() >=0) {
            ending.badEnding3();
        }


    }
}
