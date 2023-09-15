
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // ENTRADA DE VARIÁVEIS
        int quantidadeChocolateMeioAmargo = 0;
        float precoChocolateMeioAmargo = 0;
        float totalChocolateMeioAmargo = 0;
        int quantidadeLeiteCondensado = 0;
        float precoLeiteCondensado = 0;
        float totalLeiteCondensado = 0;
        int quantidadeMargarina = 0;
        float precoMargarina = 0;
        float totalMargarina = 0;
        int quantidadeLeiteEmPo = 0;
        float precoLeiteEmPo = 0;
        float totalLeiteEmPo = 0;
        int quantidadeCocoRalado = 0;
        float precoCocoRalado = 0;
        float totalCocoRalado = 0;
        int quantidadeCafeSoluvel = 0;
        float precoCafeSoluvel = 0;
        float totalCafeSoluvel = 0;
        float precoConeTrufado = 0;
        float precoReceita = 0;
        float custoUnidade = 0;
        float custoReceita = 0;
        float precoVenda = 0;
        float lucroUnidade = 0;
        float lucroReceita = 0;
        int alterar = 0;
        float somaReceita = 0;
        int codigo = 0;
        int opcao = 0;

        do {
            int receitaChocolateMeioAmargo = 400;
            int receitaLeiteCondensado = 395;
            int receitaMargarina = 40;
            int receitaLeiteEmPo = 50;
            int receitaCocoRalado = 300;
            int receitaCafeSoluvel = 100;
            float limiteReceita = 60;

            //COLETA DO CÓDIGO DE SELEÇÃO SWITCH/CASE	
            System.out.println("Bombom de leite ninho........1\nBombom de coco (Beijinho)....2\nBombom de café...............3\n\nDigite o código do cone truafado desejado: ");
            codigo = ler.nextInt();

            //COLETA DE QUANTIDADES E VALORES DE INGREDIENTES CONSTANTES
            System.out.println("\nDigite a quantidade de Chocolate Meio Amargo(g): ");
            quantidadeChocolateMeioAmargo = ler.nextInt(); 
            System.out.println("Digite o preço do Chocolate Meio Amargo R$: "); 
            precoChocolateMeioAmargo = ler.nextFloat(); 
            totalChocolateMeioAmargo = quantidadeChocolateMeioAmargo / receitaChocolateMeioAmargo; 

            System.out.println("\nDigite a quantidade de Leite Condensado(g): "); 
            quantidadeLeiteCondensado = ler.nextInt();
            System.out.println("Digite o preço do Leite Condensado R$: ");
            precoLeiteCondensado = ler.nextFloat();
            totalLeiteCondensado = quantidadeLeiteCondensado / receitaLeiteCondensado;

            System.out.println("\nDigite quantidade de Margarina(g): ");
            quantidadeMargarina = ler.nextInt();
            System.out.println("Digite o preço da Margarina R$: ");
            precoMargarina = ler.nextFloat();
            totalMargarina = quantidadeMargarina / receitaMargarina;

            //COLETA DE QUANTIDADES E VALORES DE INGREDIENTES VARIÁVEIS 
            switch (codigo) {

                case 1://BOMBOM DE LEITE NINHO

                    System.out.println("\nDigite a quantidade de Leite em Pó(g): ");
                    quantidadeLeiteEmPo = ler.nextInt();
                    System.out.println("Digite o preço do Leite em Pó R$: ");
                    precoLeiteEmPo = ler.nextFloat();
                    totalLeiteEmPo = quantidadeLeiteEmPo / receitaLeiteEmPo;

                    //VERIFICAR SE QUER ALTERAR A RECEITA
                    System.out.println("RECEITA ORIGINAL:\nChocolate fracionado meio amargo...400g\nLeite condensado...................395g\nMargarina...........................40g\nLeite em pó.........................50g\n\nDeseja alterar a receita? [Sim - 1 / Não - 2]");
                    alterar = ler.nextInt();

                    if (alterar == 1) {
                        System.out.println("Digite a nova quantidade de Chocolate meio amargo para esta receita(g): ");
                        receitaChocolateMeioAmargo = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Leite condensado para esta receita(g): ");
                        receitaLeiteCondensado = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Margarina para esta receita(g): ");
                        receitaMargarina = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Leite em pó para esta receita(g): ");
                        receitaLeiteEmPo = ler.nextInt();
                        
                        somaReceita = receitaChocolateMeioAmargo + receitaLeiteCondensado + receitaMargarina + receitaLeiteEmPo;
                        limiteReceita = (6*((somaReceita * 100)/885))/10;

                        totalChocolateMeioAmargo = quantidadeChocolateMeioAmargo / receitaChocolateMeioAmargo;
                        totalLeiteCondensado = quantidadeLeiteCondensado / receitaLeiteCondensado;
                        totalMargarina = quantidadeMargarina / receitaMargarina;
                        totalLeiteEmPo = quantidadeLeiteEmPo / receitaLeiteEmPo;
                    }

                    //VERIFICAR SE HÁ INGREDIENTES PARA PELO MENOS UMA RECEITA DO BOMBOM DE LEITE NINHO
                    if (totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalLeiteEmPo > 0) {

                        custoUnidade = ((((precoChocolateMeioAmargo * receitaChocolateMeioAmargo) / quantidadeChocolateMeioAmargo) + ((precoLeiteCondensado * receitaLeiteCondensado) / quantidadeLeiteCondensado) + ((precoMargarina * receitaMargarina) / quantidadeMargarina) + ((precoLeiteEmPo * receitaLeiteEmPo) / quantidadeLeiteEmPo)) / 50);
                        custoReceita = custoUnidade * 50;
                    } else {
                        System.out.println("Não há ingredientes o sufuciente para receita");
                    }

                    break;

                case 2://BOMBOM DE COCO (BEIJINHO)

                    System.out.println("\nDigite a quantidade do Coco Ralado(g): ");
                    quantidadeCocoRalado = ler.nextInt();
                    System.out.println("Digite o preço do Coco Ralado R$: ");
                    precoCocoRalado = ler.nextFloat();
                    totalCocoRalado = quantidadeCocoRalado / receitaCocoRalado;
                    
                    //VERIFICAR SE QUER ALTERAR A RECEITA
                    System.out.println("\nRECEITA ORIGINAL:\nChocolate fracionado meio amargo...400g\nLeite condensado...................395g\nMargarina...........................40g\nCoco Ralado........................300g\n\nDeseja alterar a receita? [Sim - 1 / Não - 2]");
                    alterar = ler.nextInt();

                    if (alterar == 1) {
                        System.out.println("Digite a nova quantidade de Chocolate meio amargo para esta receita(g): ");
                        receitaChocolateMeioAmargo = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Leite condensado para esta receita(g): ");
                        receitaLeiteCondensado = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Margarina para esta receita(g): ");
                        receitaMargarina = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Coco Ralado para esta receita(g): ");
                        receitaCocoRalado = ler.nextInt();
                        
                        somaReceita = receitaChocolateMeioAmargo + receitaLeiteCondensado + receitaMargarina + receitaLeiteEmPo;
                        limiteReceita = (6*((somaReceita * 100)/1135))/10;

                        totalChocolateMeioAmargo = quantidadeChocolateMeioAmargo / receitaChocolateMeioAmargo;
                        totalLeiteCondensado = quantidadeLeiteCondensado / receitaLeiteCondensado;
                        totalMargarina = quantidadeMargarina / receitaMargarina;
                        totalCocoRalado = quantidadeCocoRalado / receitaCocoRalado;
                    }

                    //VERIFICAR SE HÁ INGREDIENTES PARA PELO MENOS UMA RECEITA DO BOMBOM DE COCO
                    if (totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalCocoRalado > 0) {

                        custoUnidade = ((((precoChocolateMeioAmargo * receitaChocolateMeioAmargo) / quantidadeChocolateMeioAmargo) + ((precoLeiteCondensado * receitaLeiteCondensado) / quantidadeLeiteCondensado) + ((precoMargarina * receitaMargarina) / quantidadeMargarina) + ((precoCocoRalado * receitaCocoRalado) / quantidadeCocoRalado)) / 50);
                        custoReceita = custoUnidade * 50;
                    } else {
                        System.out.println("Não há ingredientes o sufuciente para receita");
                    }

                    break;

                case 3://BOMBOM DE CAFÉ

                    System.out.println("\nDigite a quantidade de Café Solúvel(g): ");
                    quantidadeCafeSoluvel = ler.nextInt();
                    System.out.println("Digite o preço do Café Solúvel R$: ");
                    precoCafeSoluvel = ler.nextFloat();
                    totalCafeSoluvel = quantidadeCafeSoluvel / receitaCafeSoluvel;
                    
                    //VERIFICAR SE QUER ALTERAR A RECEITA
                    System.out.println("RECEITA ORIGINAL:\nChocolate fracionado meio amargo...400g\nLeite condensado...................395g\nMargarina...........................40g\nCafé Solúvel.......................100g\n\nDeseja alterar a receita? [Sim - 1/ Não - 2]");
                    alterar = ler.nextInt();

                    if (alterar == 1) {
                        System.out.println("Digite a nova quantidade de Chocolate meio amargo para esta receita(g): ");
                        receitaChocolateMeioAmargo = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Leite condensado para esta receita(g): ");
                        receitaLeiteCondensado = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Margarina para esta receita(g): ");
                        receitaMargarina = ler.nextInt();
                        System.out.println("Digite a nova quantidade de Café Solúvel para esta receita(g): ");
                        receitaCafeSoluvel = ler.nextInt();
                        
                        somaReceita = receitaChocolateMeioAmargo + receitaLeiteCondensado + receitaMargarina + receitaLeiteEmPo;
                        limiteReceita = (6*((somaReceita * 100)/935))/10;

                        totalChocolateMeioAmargo = quantidadeChocolateMeioAmargo / receitaChocolateMeioAmargo;
                        totalLeiteCondensado = quantidadeLeiteCondensado / receitaLeiteCondensado;
                        totalMargarina = quantidadeMargarina / receitaMargarina;
                        totalCafeSoluvel = quantidadeCafeSoluvel / receitaCafeSoluvel;
                    }

                    //VERIFICAR SE HÁ INGREDIENTES PARA PELO MENOS UMA RECEITA DO BOMBOM DE CAFÉ
                    if (totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalCafeSoluvel > 0) {

                        custoUnidade = ((((precoChocolateMeioAmargo * receitaChocolateMeioAmargo) / quantidadeChocolateMeioAmargo) + ((precoLeiteCondensado * receitaLeiteCondensado) / quantidadeLeiteCondensado) + ((precoMargarina * receitaMargarina) / quantidadeMargarina) + ((precoCafeSoluvel * receitaCafeSoluvel) / quantidadeCafeSoluvel)) / 50);
                        custoReceita = custoUnidade * 50;
                        
                    } else {
                        System.out.println("Não há ingredientes o sufuciente para receita");
                    }

                    break;
                    
                default:
                    System.out.println("O código digitado não esta na tabela.");
            }

            //SAÍDA DE INFORMAÇÔES
            if (totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalLeiteEmPo > 0 && custoReceita <= limiteReceita|| totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalCocoRalado > 0 && custoReceita <= limiteReceita|| totalChocolateMeioAmargo > 0 && totalLeiteCondensado > 0 && totalMargarina > 0 && totalCafeSoluvel > 0 && custoReceita <= limiteReceita) {
                System.out.printf("O custo por unidade será de R$: %.2f\nO custo por receita será de R$: %.2f\n\n", custoUnidade,custoReceita);
                System.out.println("Informe o preço de venda por unidade R$: ");
                precoVenda = ler.nextFloat();
                lucroUnidade = precoVenda - custoUnidade;
                lucroReceita = lucroUnidade * 50;
                System.out.printf("\nO lucro por unidade será de R$: %.2f\nO lucro por receita é de R$: %.2f\n", lucroUnidade, lucroReceita);
            } else{
                System.out.printf("\nO custo por receita excedeu o limite de R$: %.2f" ,limiteReceita);
            }
            
            System.out.println("\n\nDeseja verificar outra receita? [Sim - 1 | Não - 2]");
            opcao = ler.nextInt();
            
        } while (opcao == 1);
        
        System.out.println("Obrigado!!!");

    }

}
