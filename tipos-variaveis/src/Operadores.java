public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

       //x repetição
       numero++;
       //numero = numero +1;

       System.out.println(numero);

       System.out.println(numero++);
       //primeiro imprimir / depois acrescentar +1

       System.out.println(++numero);
       //acrescentar (+1) / depois imprimir com o resultado

       System.out.println(numero);

       System.out.println(numero--);
       //retirar (-1) / depois imprimir com o resultado

       System.out.println(numero);

       boolean variavel = true;

       System.out.println(!variavel);
       //! = inverte o valor da variavel (false) 
       //porem o valor original da variavel continua sendo (true)

       variavel = !variavel;
       //dessa forma altera o valor original da variavel

       System.out.println(variavel);


    }
}
