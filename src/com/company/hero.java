package com.company;

public class hero {
    private int heroHealth = 600;
    private int heroDamage = 50;
    private String heroSuperPower = "Адский меч";

    public hero (String heroSuperPower, int heroDamage,int heroHealth){
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
        this.heroSuperPower = heroSuperPower;

    }
    public hero (){
        System.out.println("Характеристики героя: ");
        System.out.println("Здоровье: " + heroHealth);
        System.out.println("Урон : " + heroDamage);
        System.out.println("Супер способности: " + heroSuperPower);

    }
    public String getHeroSuperPower(){
        return heroSuperPower;

    }
    public void getheroSuperPower(){
        this.heroSuperPower = heroSuperPower;

    }
    public int getHeroHealth(int i){
        return heroHealth;
    }
    public void setHeroHealsh(int i) {
        this.heroHealth = heroHealth;
    }
    public int getHeroDamage(){
        return heroDamage;
    }
    public void setHeroDamage(int i){
        this.heroDamage=heroDamage;
    }

}
