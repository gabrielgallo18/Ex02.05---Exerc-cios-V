import java.util.ArrayList; 

public class LFU {

    public static void main(String[] args){

        int menor_valor_final;
        int valor_menor;
        int referencia_menor; 
        int referencia_maior;  
        int id_memoria;
        int id_memoria_anterior;
        int memoria_atual;
        int valor_anterior;  

        Memoria memoria[] = new Memoria[3];
        
        memoria[0] = new Memoria(1, 12, 10, 20, true, true);
        memoria[1] = new Memoria(2, 10, 1, 12, false, false);
        memoria[2] = new Memoria(3, 11, 2, 21, true, false);

        ArrayList<Memoria> lista_memorias = new ArrayList<Memoria>();


        for(int a = 0; a < memoria.length; a++){

            lista_memorias.add(memoria[a]);

        }

        System.out.println("Memorias: "+lista_memorias);
        System.out.println();

        int total_memorias = lista_memorias.size();

        for(int c = 0; c < total_memorias; c++){

            menor_valor_final = 99;
            id_memoria_anterior = 0;
            id_memoria = 0;
            valor_menor = 0;

            for(int d = 0; d < lista_memorias.size(); d++){

                Memoria thememoria_atual = lista_memorias.get(d);

                memoria_atual = thememoria_atual.getTotal_referencias();

                if(memoria_atual < id_memoria){

                    referencia_menor = memoria_atual;
                    referencia_maior = id_memoria;


                    if(d == 0){
                        id_memoria_anterior = 0;
                    }else{
                        valor_anterior = d - 1;
                        id_memoria_anterior = (memoria[valor_anterior].getId_memoria());
                    }

                    if(menor_valor_final < referencia_menor){

                    }else{
                        valor_menor = d;
                        menor_valor_final = memoria_atual; 
                    }

                    if(d == (lista_memorias.size() - 1)){

                        Memoria pegar_id_valor_menor = lista_memorias.get(valor_menor);

                        lista_memorias.remove(valor_menor);
                        System.out.println("A memoria removida foi do ID: " + pegar_id_valor_menor.getId_memoria());  

                    }
                }else{

                    referencia_menor = id_memoria; 
                    referencia_maior = memoria_atual;
                    
                    if(d == 0){
                        id_memoria_anterior = 0;
                    }else{
                        valor_anterior = d - 1;
                        id_memoria_anterior = (memoria[valor_anterior].getId_memoria());
                    }

                    if(menor_valor_final < referencia_maior){

                    }else{
                        valor_menor = d;
                        menor_valor_final = memoria_atual; 
                    }

                    if(d == (lista_memorias.size() - 1)){

                        Memoria pegar_id_valor_menor = lista_memorias.get(valor_menor);

                        lista_memorias.remove(valor_menor);
                        System.out.println("A memoria removida foi do ID: " + pegar_id_valor_menor.getId_memoria());       
                    }

                }

                id_memoria = memoria_atual;

            }
            
        }
    }


}



        