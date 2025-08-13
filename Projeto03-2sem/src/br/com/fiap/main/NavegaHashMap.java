package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Astrogildo", 18);
        pessoas.put("Berisvaldo", 25);
        pessoas.put("Gumercindo", 18);

        System.out.println(pessoas);
        System.out.println("-------");

        for (Map.Entry<String, Integer> i : pessoas.entrySet()){
            System.out.println("Chave: " + i.getKey() + "\nValor: " + i.getValue() + "\n-------");
        }
    }
}
