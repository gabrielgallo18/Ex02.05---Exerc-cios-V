import java.util.ArrayList; 

public class NRU {

    public static void main(String[] args){

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

        int id_memoria;
        int indice_melhor_memoria = 0;
        int indice_primeira_memoria = 0;
        int id_memoria_final = 0;
        boolean br_atual;
        boolean bm_atual;
        

        int total_memorias = lista_memorias.size();

        for(int b = 0; b < total_memorias; b++){

            boolean existe_melhor_memoria = false;
            int id_melhor_memoria = 0;

            for(int c = 0; c < lista_memorias.size(); c++){

                Memoria minha_memoria_atual = lista_memorias.get(c);

                id_memoria = minha_memoria_atual.getId_memoria();
                br_atual = minha_memoria_atual.getBr();
                bm_atual = minha_memoria_atual.getBm();
                

                if(br_atual == false && bm_atual == false){

                    indice_melhor_memoria = c;
                    id_memoria_final = minha_memoria_atual.getId_memoria();
                
                    System.out.println("A memoria removida foi do ID: " + id_memoria_final);

                    lista_memorias.remove(indice_melhor_memoria);

                    break;

                
                }else if(br_atual == false || bm_atual == false){

                    if(existe_melhor_memoria == false){

                        existe_melhor_memoria = true;
                        id_melhor_memoria = minha_memoria_atual.getId_memoria();
                        indice_primeira_memoria = c;

                        if(c == (lista_memorias.size() - 1)){
 
                            id_memoria_final = minha_memoria_atual.getId_memoria();
                            
                            System.out.println("A memoria removida foi do ID: " + id_memoria_final);

                            lista_memorias.remove(c);

                            existe_melhor_memoria = false;

                            break;

                        }

                    }else{

                        if(c == (lista_memorias.size() - 1)){

                            System.out.println("A memoria removida foi do ID: " + id_melhor_memoria);

                            lista_memorias.remove(indice_primeira_memoria);
                            existe_melhor_memoria = false;

                            break;

                        }

                    }

                }else if(br_atual == true && bm_atual == true){
                    
                
                }else if(b == (total_memorias -1 ) && lista_memorias.size() == 1){

                    indice_melhor_memoria = c;
                    id_memoria_final = minha_memoria_atual.getId_memoria();

                    System.out.println("A memoria removida foi do ID: " + id_memoria_final);

                    lista_memorias.remove(indice_melhor_memoria);
                    
                    break;

                }else{

                        System.out.println("Não foi encontrada nenhuma referência");

                }
            }
        }


    }
}



        