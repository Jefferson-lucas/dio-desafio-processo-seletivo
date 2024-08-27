package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class AnaliseSalarial{
    public static void main(String[] args) {
        //selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("imprimindo a lista de candiadtos informando o indice do elemento");

        // for (int indice = 0; indice < candidatos.length; indice++){
        //     System.out.println("O candidato de numero " + (indice + 1) + " é " + candidatos[indice]);
        // }

        for(String candidato : candidatos){
            System.out.println("O candidato seleceionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA", "DANIELA","JORGE"};

            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;

         while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
             String candidato = candidatos[candidatoAtual];
             double salarioPretendido = valorPretendido();

             System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

             if (salarioBase >= salarioPretendido) {
                 System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                 candidatosSelecionados++;
             }

            candidatoAtual++;
         }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
