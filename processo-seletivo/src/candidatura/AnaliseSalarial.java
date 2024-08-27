package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class AnaliseSalarial{
    public static void main(String[] args) {
        //selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String[] candidatos = selecaoCandidatos();
        System.out.println("O(s) candidato(s) selecionado(s) para a vaga com base na proposta salarial foram:");
        for(String candidato : candidatos){
            if (candidato != null) {
                System.out.println(candidato);
            }
        }
    }

    static String[] selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA", "DANIELA","JORGE"};
        String[] candidatosAprovados = new String[5];

        int candidatosSelecionados = 0;
        int candidatoAprovado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

         while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
             String candidato = candidatos[candidatoAtual];
             double salarioPretendido = valorPretendido();

             if (salarioBase >= salarioPretendido) {
                 candidatosAprovados[candidatoAprovado] = candidato;
                 candidatosSelecionados++;
                 candidatoAprovado++;
             }

            candidatoAtual++;
         }
         return candidatosAprovados;
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
