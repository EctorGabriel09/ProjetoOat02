public class Aula08 {
    public static void main(String[] args) {

        String[] nome = {"Ector", "Neymar", "Arrascaeta", "Gerson", "Pulgar"};
        int[] notas = {100, 90, 80, 70, 50};

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i] + ":" + notas[i]);
        }
            for (int i = 0; i < nome.length; i++) {
                if (notas[i] >= 70) {
                    System.out.println(nome[i] + ":" + notas[i]);
                }
            }


    }
}
