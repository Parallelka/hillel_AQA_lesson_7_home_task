package com.hillel.kuchmii.lessons.lesson7;

public class Players {
    public static void main(String[] args) {
        countTeam("Cheremyshki");
        countTeam("Peresip");
    }

    private static void countTeam(String teamName) {
        int[] team = new int[25];
        int sumAges = 0;
        System.out.print("Ages of players of team " + teamName + ": ");
        for (int i = 0; i < team.length; i++) {
            team[i] = 18 + (int) (Math.random() * 23);
            sumAges += team[i];
            if (i == team.length - 1) {
                System.out.print(team[i] + "");
            } else {
                System.out.print(team[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Average age of players of team " + teamName + ": " + sumAges / team.length);
    }
}
//    Є дві команди регбі з 25 гравців різного віку у кожній.
//    Вік беремо випадковим чином в діапазоні від 18 до 40.
//    Виведіть у двох рядках вік гравців кожної команди.
//    Порахуйте середній вік гравців кожної команди та виведіть на екран.