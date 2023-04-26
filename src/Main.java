import br.spotiluls.com.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        char choose;
        System.out.println("Bem vindo ao Spotiluls");
        System.out.print("Deseja cadastrar alguma música?(Y/N) ");
        Scanner userChoose = new Scanner(System.in);
        choose = userChoose.next().charAt(0);
        while (choose != 'Y' && choose != 'N'){

            System.out.print("Por favor, digite uma opção válida!\nDeseja cadastrar alguma música?(Y/N) ");
            choose = userChoose.next().charAt(0);
        }
        if (choose == 'Y'){
            Audio userMusic = new Audio();
            userMusic.fillAudioData();
            userMusic.printInfo();

    }

    }
}