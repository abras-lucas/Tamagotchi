import java.util.Scanner;
class TesteTamagotchi{
	public static void main(String[] args) {
		//vairavel de seleçao
		int opcao;
		Scanner ler=new Scanner(System.in);
		Tamagotchi zeze=new Tamagotchi();

		//setando as variaveis maximas
		System.out.println("Digite a saciedade maxima do seu Tamagotchi: ");
		zeze.saciedadeMAX=ler.nextInt();
		System.out.println("Digite a energia maxima do seu Tamagotchi: ");
		zeze.energiaMAX=ler.nextInt();
		System.out.println("Digite a limpeza maxima do seu Tamagotchi: ");
		zeze.limpezaMAX=ler.nextInt();

		//inicializando as variaves com o valor maximo
		zeze.saciedade=zeze.saciedadeMAX;
		zeze.limpeza=zeze.limpezaMAX;
		zeze.energia=zeze.energiaMAX;

		zeze.mostrar();

		//laço infinito ate que o bixinho morra
		while(zeze.saciedade>0 && zeze.limpeza>0 && zeze.energia>0){
			System.out.println("\nEscolha uma acao (de 1 a 4) para brincar, comer, domir ou dar banho, respectivamente, no seu Tamagotchi: ");
			opcao=ler.nextInt();
				switch(opcao){
					case 1:
					zeze.brincar();
					break;
					case 2:
					zeze.comer();
					break;
					case 3:
					zeze.dormir();
					break;
					case 4:
					zeze.banho();
					break;
					default:
					System.out.println("OPS! Opcao invalida! Digite um numero de 1 a 4!");
					break;
				}


			zeze.mostrar();
		}

		//mensagens diferentes para cada caso de morte do bixinho

		if(zeze.energia==0){
			System.out.println("EXAUSTO! O Tamagotchi morreu de cansaco!");
			System.out.println("Digite 0 para ver o ultimo status");
			opcao=ler.nextInt();
			while(opcao!=5){
			if(opcao==0){
				zeze.mostrar();
			}
			else{
				System.out.println("ERRO FATAL! Seu bichinho ja nao habita esse plano.");
			}
			System.out.println("Digite 5 para encerrar.");
			opcao=ler.nextInt();
			}
		}

		if(zeze.saciedade==0){
			System.out.println("FAMINTO! O Tamagotchi morreu de fome!");
			System.out.println("Digite 0 para ver o ultimo status");
			opcao=ler.nextInt();
			while(opcao!=5){
			if(opcao==0){
				zeze.mostrar();
			}
			else{
				System.out.println("ERRO FATAL! Seu bichinho ja nao habita esse plano.");
			}
			System.out.println("Digite 5 para encerrar.");
			opcao=ler.nextInt();
			}
		}

		if(zeze.limpeza==0){
			System.out.println("SUJISMUNDO! O Tamagotchi morreu de toa sujo que estava!");
			System.out.println("Digite 0 para ver o ultimo status");
			opcao=ler.nextInt();
			while(opcao!=5){
			if(opcao==0){
				zeze.mostrar();
			}
			else{
				System.out.println("ERRO FATAL! Seu bichinho ja nao habita esse plano.");
			}
			System.out.println("Digite 5 para encerrar.");
			opcao=ler.nextInt();
			}
		}
	}
}