package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();
        do{
           try{
               String pokemon, tipo;
               do{
                   pokemon = JOptionPane.showInputDialog("Digite o nome do pokemon (FIM para encerrar)").toUpperCase();
               if(!pokemon.equals("FIM")){
                   if(pokemons.containsKey(pokemon)){
                       JOptionPane.showMessageDialog(null, "Pokemon já cadastrado");
                   }else{
                    tipo = JOptionPane.showInputDialog("Digite o tipo desse pokemon");
                    pokemons.put(pokemon, tipo);
                   }
               }
               }while (!pokemon.equals("FIM"));
               String escolhaTipo = JOptionPane.showInputDialog("Escolha o tipo de pokemon para procurar");
               for(Map.Entry<String, String> i : pokemons.entrySet()){
                   
               }
           }catch (Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
           }
        }while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);

    }
}
