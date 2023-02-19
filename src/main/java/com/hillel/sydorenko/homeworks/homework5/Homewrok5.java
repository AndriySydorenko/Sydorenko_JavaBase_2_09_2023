package com.hillel.sydorenko.homeworks.homework5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Homewrok5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name for team1:");
        String team1 = scanner.nextLine();
        System.out.println("Please enter name for team2:");
        String team2 = scanner.nextLine();

        int team1Player1Kills = -1;
        int team1Player2Kills = -1;
        int team1Player3Kills = -1;
        int team1Player4Kills = -1;
        int team1Player5Kills = -1;
        int team2Player1Kills = -1;
        int team2Player2Kills = -1;
        int team2Player3Kills = -1;
        int team2Player4Kills = -1;
        int team2Player5Kills = -1;

        System.out.println("Please enter kill for Player 1 from " + team1);
        if (scanner.hasNextInt()) {
            team1Player1Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 2 from " + team1);
        if (scanner.hasNextInt()) {
            team1Player2Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 3 from " + team1);
        if (scanner.hasNextInt()) {
            team1Player3Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 4 from " + team1);
        if (scanner.hasNextInt()) {
            team1Player4Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 5 from " + team1);
        if (scanner.hasNextInt()) {
            team1Player5Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 1 from " + team2);
        if (scanner.hasNextInt()) {
            team2Player1Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 2 from " + team2);
        if (scanner.hasNextInt()) {
            team2Player2Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 3 from " + team2);
        if (scanner.hasNextInt()) {
            team2Player3Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 4 from " + team2);
        if (scanner.hasNextInt()) {
            team2Player4Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter kill for Player 5 from " + team2);
        if (scanner.hasNextInt()) {
            team2Player5Kills = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }


        // team 1 avg kills
        int team1AvgKills = (team1Player1Kills + team1Player2Kills + team1Player3Kills + team1Player4Kills + team1Player5Kills) / 5;
        // team 2 avg kills
        int team2AvgKills = (team2Player1Kills + team2Player2Kills + team2Player3Kills + team2Player4Kills + team2Player5Kills) / 5;


//        System.out.println("Team1 = " + team1);
//        System.out.println("Team2 = " + team2);
//        System.out.println("Player 1 " + team1 + " " + "kills is " + team1Player1Kills);
//        System.out.println("Player 2 " + team1 + " " + "kills is " + team1Player2Kills);
//        System.out.println("Player 3 " + team1 + " " + "kills is " + team1Player3Kills);
//        System.out.println("Player 4 " + team1 + " " + "kills is " + team1Player4Kills);
//        System.out.println("Player 5 " + team1 + " " + "kills is " + team1Player5Kills);
//        System.out.println("Player 1 " + team2 + " " + "kills is " + team2Player1Kills);
//        System.out.println("Player 2 " + team2 + " " + "kills is " + team2Player2Kills);
//        System.out.println("Player 3 " + team2 + " " + "kills is " + team2Player3Kills);
//        System.out.println("Player 4 " + team2 + " " + "kills is " + team2Player4Kills);
//        System.out.println("Player 5 " + team2 + " " + "kills is " + team2Player5Kills);
//        System.out.println("Average kill team1 " + team1AvgKills);
//        System.out.println("Average kill team2 " + team2AvgKills);


        if (team1AvgKills > team2AvgKills) {
            System.out.println("Перемогла команда" + " " + team1 + " " + "набрала" + " " + team1AvgKills + " " + "очків");
        } else if (team1AvgKills < team2AvgKills){
            System.out.println("Перемогла команда" + " " + team2 + " " + "набрала" + " " + team2AvgKills + " " +  "очків");
        } else {
            System.out.println("Нічия!");
            System.exit(0);
        }
    }
}
