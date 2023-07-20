import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeProd;
        double preco[] = {0.05, 0.1, 0.15, 0.20, 0.25, 0.3, 0.35, 0.40, 0.45, 0.50};
        DecimalFormat df = new DecimalFormat("0.000");

        //questao 1

        System.out.print("Insira o nome do produto: ");
        nomeProd = scan.nextLine();
        System.out.print("Insira o preco: ");
        double valor = Integer.parseInt(scan.nextLine());
        System.out.println(nomeProd);
        System.out.println(valor);
        System.out.println("Promocao: " + nomeProd);
        for (int i = 0; i <= 9; i++) {
            double prodCdesc =  valor - valor * preco[i];
            System.out.println(i+1 + " x " + df.format(prodCdesc) + " = " + df.format(prodCdesc* (i+1)));
        }

        //questao 2

        int chute = -1;
        System.out.println("Escolha um numero: ");
        int numero1 = Integer.parseInt(scan.nextLine());
        int chutes = 0;

        while (chute != numero1) {
            System.out.println("Chute um numero: ");
            chute = Integer.parseInt(scan.nextLine());
            if (chute == numero1) {
                System.out.println("Voce acertou!!!");
                System.out.println("Usou " + chutes + " para acertar");
                break;
            } else if (chute < numero1) {
                System.out.println("O numero chutado eh menor que o escolhido!");
                chutes++;
            } else {
                System.out.println("O numero chutado eh maior que o escolhido!");
                chutes++;
            }
        }

        //questao 3

        String nome = "null";
        String maisVelho = null, maisPesado = null , maisAlto = null;
        double altura, altAnt = 0, peso, pesoAnt = 0, medAltura = 0;
        int idade, idadeAnt = 0, qtdJogadores = 0;

        while(!nome.equals("SAIR") ){
            System.out.println("Insira o nome do jogador: ");
            nome = scan.nextLine();
            nome = nome.toUpperCase();
            if (nome.equals("SAIR"))
                break;
            System.out.println("Insira a altura do jogador: ");
            altura = Double.parseDouble(scan.nextLine());
            System.out.println("Insira a idade do jogador: ");
            idade = Integer.parseInt(scan.nextLine());
            System.out.println("Insira o peso do jogador: ");
            peso = Double.parseDouble(scan.nextLine());
            if (peso > pesoAnt){
                maisPesado = nome;
            }
            if (idade > idadeAnt){
                maisVelho = nome;
            }
            if (altura > altAnt){
                maisAlto = nome;
            }
            qtdJogadores++;
            pesoAnt = peso;
            altAnt = altura;
            idadeAnt = idade;
            medAltura += altura;
        }
        medAltura = medAltura/qtdJogadores;
        System.out.println("Media de altura: " + medAltura + " mais velho: " + maisVelho + " mais alto: " + maisAlto + " mais pesado: " + maisPesado + " Numero jogadores: " + qtdJogadores);

        //questao 4

        int[][] matriz = new int[5][4];

        int medFinais = 0, maiorNota = 0, melhorAluno = 0;

        for (int aluno = 0; aluno < matriz.length; aluno++) {
                System.out.println("Insira a matricula: ");
                matriz[aluno][0] = Integer.parseInt(scan.nextLine());
                System.out.println("Insira a N1: ");
                matriz[aluno][1] = Integer.parseInt(scan.nextLine());
                System.out.println("Insira a N2: ");
                matriz[aluno][2] = Integer.parseInt(scan.nextLine());

                matriz[aluno][3] = (int) (((matriz[aluno][1] * 0.6) + (matriz[aluno][2] * 0.4)));
                if(matriz[aluno][3] > maiorNota) {
                    melhorAluno = matriz[aluno][0];
                    maiorNota = matriz[aluno][3];
                }
            System.out.println("ID: " + matriz[aluno][0] + " N1: " + matriz[aluno][1] + " N2: " + matriz[aluno][2] + " MF: " + matriz[aluno][3]);
            medFinais += matriz[aluno][3];
        }
        medFinais = medFinais / matriz.length;

        System.out.println("O aluno com maior nota final: " + melhorAluno);
        System.out.println("A media final da turma foi: " + medFinais);

        //questao 5

        float prod[][] = new float[10][3];
        float total[] = new float[3];

        for (int item = 0; item < prod.length; item++) {
            for (int mercado = 0; mercado < prod[item].length; mercado++) {
                System.out.println("Insira o preco do item " + (item+1) + " no mercado " + (mercado + 1));
                prod[item][mercado] = Float.parseFloat(scan.nextLine());
                total[mercado] += prod[item][mercado];
            }
        }
        int mercadoMaisBarato = 0;
        for (int mercado = 1; mercado < total.length; mercado++) {
            if (total[mercado] < total[mercadoMaisBarato]) {
                mercadoMaisBarato = mercado;
            }
        }
        System.out.println("O mercado mais barato é o mercado " + (mercadoMaisBarato + 1));

        //questao 6

        int [] numeros = {1,2,3,4,5,6,7,8,9,1};
        int iguais = 0, menores = 0, maiores = 0;

        System.out.println("Insira um numero no vetor: ");
        int num = Integer.parseInt(scan.nextLine());

        for (int numero: numeros) {
            if (numero == num){
                iguais++;
            }
            else if(numero > num){
                maiores++;
            }
            else if(numero < num){
                menores++;
            }
        }
        System.out.println("Numeros iguais no array: " + iguais);
        System.out.println("Numeros menores: " + menores);
        System.out.println("Numeros maiores: " + maiores);

    }
}


