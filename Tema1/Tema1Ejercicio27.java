class ejercicio27 {
    public static void main(String[]args){
        int numero = 1;
        int condicion = 0;
        System.out.println ("A continuacion se mostraran los 20 primeros numeros primos");
        while(condicion < 20){
            int bucle = 0;
            for(int i = 1; i <= numero; i++){
                if (numero%2==0){
                    bucle ++;
                }
            }
            if (bucle <= 2){
                System.out.println(numero);
                condicion++;
            }
            numero++;
        }
    }
}