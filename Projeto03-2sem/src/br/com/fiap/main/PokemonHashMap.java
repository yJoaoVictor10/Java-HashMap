package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
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
                    tipo = JOptionPane.showInputDialog("Digite o tipo desse pokemon").toUpperCase();
                    pokemons.put(pokemon, tipo);
                   }
               }
               }while (!pokemon.equals("FIM"));
               String escolhaTipo = JOptionPane.showInputDialog("Escolha o tipo de pokemon para procurar").toUpperCase();

               ArrayList<String> nomesEncontrados = new ArrayList<>();
               for(Map.Entry<String, String> entrada : pokemons.entrySet()){
                   if(entrada.getValue().equals(escolhaTipo)){
                       nomesEncontrados.add(entrada.getKey());
                   }
               }
               if(!nomesEncontrados.isEmpty()){
                   JOptionPane.showMessageDialog(null, "Pokemons encontrados do tipo: " + escolhaTipo + "\n" + nomesEncontrados, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
               }else{
                   JOptionPane.showMessageDialog(null, "Nenhum Pokémon encontrado desse tipo", "Aviso", JOptionPane.WARNING_MESSAGE);
               }

           }catch (Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
           }
        }while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);

    }
}
