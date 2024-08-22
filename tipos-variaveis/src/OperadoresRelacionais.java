public static void main(String[] args) {
    String nomeUm = "Jota";
    String nomeDois = new String("Jota");

    System.out.println(nomeUm.equals(nomeDois));
    //quando for objeto sempre utilizar o ".equals"
    
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    
    if(numero1 < numero2){
        System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDOis?" + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente que numeroDOis?" + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDOis?" + simNao);

}