import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(System.in);
    public void m1() {
        System.out.print("Determine o numero de limhas: ");
        int linhas = sc.nextInt();
       
        System.out.print("Determine o numero de colunas: ");
        int colunas = sc.nextInt();
        

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(9) + 1;
            }

        }
        System.out.println("matriz");
        for (int i = 0; j < colunas; j++) {
            System.out.println(matriz[i][j] + " ");
            {

            
            System.out.println("Substituiçâo de valor:");
            for (i = 0; i < linhas; i++){
                for (int j = 0; j < colunas; j++) {
                    if (i > j) {
                        matriz[i][j] = 1;

                
                    }else if (i == j) {
                        matriz[i][j] = 0;

                    }else {
                        matriz[i][j] = 2;
                    }
                }
            }

        } 
    } 
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++){
            System.out.println(matriz[i][j] + " ");
        }
        System.out.println();
    }
    
}


 public void m2() {
    int numeroSorteado = (int) (Math.random() * 1001);
    int palpite;
    int tentativas = 0;
    boolean tentativasNovamente = true;

    System.out.println("======================");
    System.out.println("advinhe um numero de 0 a 1000:");

    while (tentarNovamente) {
        System.out.println("digite seu palpite:");
        palpite = sc.nextInt();
        tentativas++;
        
        if (palpite == numeroSorteado) {
            System.out.println("Parabens! voce acertou o número" +numeroSorteado+ ".");
            System.out.println("você acertou em "+ tentativas + " tentativas.");
            System.out.println("fim:");
            System.out.println("==============");

        }else if (palpite < numeroSorteado) {
            System.out.println("o numero sorteado é maior que seu palpite.");
        }else {
            System.out.println("o numero sorteado é menor do que seu palpite.");
        }
    }
 }

 public void m3() {
    int tamanhoVetor = rd.nextInt(901) + 100;
    int [] vetor = new int[tamanhoVetor];
    int qtdParPosicaoImpar = 0;
    Int qtdImparPosicaopar = 0;
    System.out.println("Tamanho do vetor: " + tamanhoVetor);
    System.out.println("vetor gerado:");
    
    for (int i = 0; i <vetor.length; i++){
        vetor[i] = rd.nextInt(100) + 1;
        System.out.println(vetor[i] + " ");

    }
    System.out.println();
    System.out.println("numeros pares do vetor:");

    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] % 2 !=0) {
            System.out.println(vetor[i] + " ");
        }
    }
    for (int i = 0; i < vetor.length; i += 2) {
        if (vetor[i] % 2 == 0) {
            qntParPosicaoimpar++;
        }
    }
    for (int i = 0; i < vetor.length; i += 2) {
        if (vetor[i] % 2 != 0){
            qntImparPosicaoPar++;
        }
    }
    System.out.println();
    System.out.println("Quantidades de numeros pares nas posicoes impares:" + qntParPosicaoimpar);
    System.out.println("Quantidade de numeros impares nas posicoes pares:" + qntImparPosicaoPar);
 }}
 





