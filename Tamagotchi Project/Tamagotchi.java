class Tamagotchi{
	//Nome: Abrahão Lucas Barboza Nunes
	//Matrícula: 20181143000154

	int saciedadeMAX;
	int energiaMAX;
	int limpezaMAX;
	int saciedade;
	int energia;
	int limpeza;
	int diamantes;
	int idade;

	void mostrar(){
		System.out.println("\nSaciedade:"+saciedade);
		System.out.println("Energia:"+energia);
		System.out.println("Limpeza:"+limpeza);
		System.out.println("Idade:"+idade);
		System.out.println("Diamantes:"+diamantes);
	}

	void brincar(){
		energia-=2;
		saciedade-=1;
		limpeza-=3;
		idade++;
		diamantes++;
		if(energia<0){
			energia=0;
		}
		if(saciedade<0){
			saciedade=0;
		}
		if(limpeza<0){
			limpeza=0;
		}
	}

	void comer(){
		energia-=1;
		limpeza-=2;
		saciedade+=4;
		idade++;
		if(energia<0){
			energia=0;
		}
		if(limpeza<0){
			limpeza=0;
		}
		if(saciedade>saciedadeMAX){
			saciedade=saciedadeMAX;
		}
	}

	void dormir(){
		if(energiaMAX-energia>=5){
		saciedade-=1;
		idade+=energiaMAX-energia;
		energia=energiaMAX;
		if(saciedade<0){
			saciedade=0;
		}
		}
		else{
			System.out.println("\nNao estou com sono agora!");
		}
	}

	void banho(){
		saciedade-=1;
		energia-=3;
		idade+=2;
		limpeza=limpezaMAX;
		if(energia<0){
			energia=0;
		}
		if(saciedade<0){
			saciedade=0;
		}
	}	
}
