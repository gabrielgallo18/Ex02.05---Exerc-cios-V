import java.util.ArrayList; 

public class FIFO {

    public static void main(String[] args) throws Exception {


        int memoria_atual; 

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
        
        for(int b = 0; b < total_memorias; b++){
            
            for(int c = 0; c < lista_memorias.size(); c++){

                if(c == 0){

                    Memoria busca_memoria_atual = lista_memorias.get(c);

                    memoria_atual = busca_memoria_atual.getId_memoria();

                    lista_memorias.remove(c);

                    System.out.println("A memoria utilizada foi: " + memoria_atual);

                    break;

                }else{


                }

            }
        }

    }



        

    }

