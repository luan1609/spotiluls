package br.spotiluls.com;

import java.util.Scanner;

public class Audio {

    private String name;
    private int releaseAge;
    private String bandName;
    private double duration;
    private boolean likes;
    private int totalLikes = 0;
    private int plays;

    public String getName() {
        return name;
    }

    public int getReleaseAge() {
        return releaseAge;
    }

    public String getBandName() {
        return bandName;
    }

    public double getDuration() {
        return duration;
    }


    public int getPlays() {
        return plays;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseAge(int releaseAge) {
        this.releaseAge = releaseAge;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int sumLikes(boolean likes){
        if (likes == true) {
            totalLikes += 1;
            return totalLikes;
        }
        return totalLikes;
    }

    public int sumPlays() {
        plays++;
        return plays;
    }

    public int getTotalPlays() {
        return plays;
    }

public void fillAudioData(){
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o nome da música: ");
    this.name = input.nextLine();

    System.out.print("Digite a idade de lançamento da música: ");
    this.releaseAge = input.nextInt();
    input.nextLine(); // Limpa o buffer do teclado

    System.out.print("Digite o nome da banda: ");
    this.bandName = input.nextLine();

    System.out.print("Digite a duração da música em minutos: ");
    this.duration = input.nextDouble();
    input.nextLine();
}

public void printInfo(){
    System.out.println("Nome da música: " + getName());
    System.out.println("Idade de lançamento: " + getReleaseAge());
    System.out.println("Nome da banda: " + getBandName());
    System.out.println("Duração: " + getDuration());
    System.out.println("Likes: " + getTotalLikes());
    System.out.println("Plays: " + getPlays());
}

    private int getTotalLikes() {
        return totalLikes;
    }
}
