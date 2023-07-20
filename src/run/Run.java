package run;

import method.Mentality;

import java.util.Scanner;

public class Run {
    Scanner sc = new Scanner(System.in);
    public void leaveWork() {
        System.out.println("직장인 무사히 퇴근하기 게임을 시작합니다.");


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
    }
}
