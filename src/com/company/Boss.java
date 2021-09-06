package com.company;

public class Boss {
    private int bossHealth = 800;
    private int bossDamage = 90;
    private String bossDefenseType = "Белый плащ";

    public Boss(){
        this.bossDamage=bossDamage;
        this.bossHealth=bossHealth;
        this.bossDefenseType=bossDefenseType;
    }
    public String getBossDefenseType(){
        return bossDefenseType;
    }
    public void setBossDefenseType(){
        this.bossDefenseType=bossDefenseType;
    }

    public int getBossDamage() {
        return bossDamage;
    }
    public void setBossDamage(int bossDamage){
        this.bossDamage = bossDamage;
    }
    public int getBossHealth(){
        return bossHealth;
    }
    public void setBossHealth(int bossHealth){
        this.bossHealth=bossHealth;
    }}

