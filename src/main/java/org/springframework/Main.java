package org.springframework;

public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        int TotalSpeed = fillingSpeed - devastationSpeed;
        int volumeNow = 0;
        int minutes = 0;

        while (volumeNow < volume) {
            volumeNow += TotalSpeed;
            minutes ++;
        }
            System.out.println("Бассейн наполнен!\n" + "Прошло: " + minutes + " минут");
    }
}