import Controller.Ator.Clinica;
import Controller.Ator.Medico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exibe_menu();
        int perfil_selecionado = input.nextInt();

        if (perfil_selecionado == 0) {
            System.out.println("Cadastre seu CRM");
            String crm = input.next();
            Medico User = new Medico(crm);
        }

        if (perfil_selecionado == 1) {
            System.out.println("Cadastre seu ID");
            String id = input.next();
            Clinica User = new Clinica(id);
        }


    }

    public static void exibe_menu() {
        System.out.print(
                "        Clinica X       \n" +
                        "| =====================|\n" +
                        "| Selecione seu perfil |\n" +
                        "| -------------------- |\n" +
                        "| [0] Médico           |\n" +
                        "| [1] Atendente        |\n" +
                        "| -------------------- |\n" +
                        "| *Dica*: selecione o  |\n" +
                        "| numero desejado para |\n" +
                        "| continuar            |\n" +
                        "|----------------------|\n"
        );
    }

    public static void espera_selecao_usuario() {

    }

}
