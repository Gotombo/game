package com.company;

import javax.swing.*;
import java.util.Random;

public class Main {



    public static int bossHealth = 500;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static int[] heroesHealsh = {270, 260, 250, 240, 260};
    public static int[] heroesDamage = {25, 15, 20, 30, 0};
    public static int medicPoint = (30);
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Archer", "Medic"};
    public static int roundCounter = 0;





    public static void main(String[] args) {
        printStatistics();
        while (!isGameOver()) {
            round();
        }
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossDamage(90);
        boss.getBossDefenseType();

        hero hero = new hero();
        hero.setHeroHealsh(500);
        hero.setHeroDamage(50);
        hero.getheroSuperPower();

    }

    public static void Medical() {
        boolean isNegativeNum = false;
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (heroesHealsh[i] <= 100 && heroesHealsh[i] > 0) {
                isNegativeNum = true;
                if (isNegativeNum = true) {
                    break;
                }

                if (heroesHealsh[i] <= 100 && heroesHealsh[i] > 0) {
                    heroesHealsh[i] = heroesHealsh[i] + medicPoint;
                    continue;

                } else {
                    continue;

                }
            }


        }

    }


    public static void printStatistics() {
        System.out.println("_________________");
        System.out.println("Round: " + roundCounter);
        roundCounter++;
        System.out.println("Boss health: " + bossHealth);
        for (int I = 0; I < heroesAttackType.length; I++) {
            System.out.println(heroesAttackType[I] + "health: " + heroesHealsh[I]);
        }


        System.out.println("-----------------");
    }


    public static void bossHits() {
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (heroesHealsh[i] > 0) {
                if (heroesHealsh[i] - bossDamage < 0) {
                    heroesHealsh[i] = 0;
                } else {
                    heroesHealsh[i] = heroesHealsh[i] - bossDamage;

                }
            }
        }


    }

    public static void heroesHits() {
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (heroesHealsh[i] > 0 && bossHealth > 0) {

                if (heroesAttackType[i] == bossDefenceType) {
                    Random random = new Random();
                    int randomValue = random.nextInt(10);
                    heroesDamage[i] = heroesDamage[i] - randomValue;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];

                }
            } else {
                if (bossHealth - heroesDamage[i] < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];
                }
            }
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (heroesHealsh[i] > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;

    }

    public static void changeDefenceType() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss choose: " + bossDefenceType);
    }

    public static void round() {
        if (bossHealth > 0) {
            changeDefenceType();
            bossHits();
        }
        heroesHits();
        printStatistics();
        Medical();
    }
}




