package Exo_Base_Java;

import java.util.ArrayList;

public class Tableau1 {

    public static void main(String[] args) {
        // Application qui liste des noms
        // si j'ai le argument '-number' => 1 - Samuel; 2 - Jason
        // si je n'ai rien => Samuel; Jason
        
        boolean hasNumber = false;
        // Parcours du tableau afin de trouver les arguments nécessaires
        // à la configuration de l'affichage

        ArrayList<String> argsSort = new ArrayList<>();

        for (String str : args) {
            if (str.equals("-number")){
                hasNumber = true;
            }else{
                argsSort.add(str);
            }
        }

        for (int i = 0; i < argsSort.size(); i++) {
            if (hasNumber){
                System.out.println((i + 1) + " - " + argsSort.get(i));
            }else{
                System.out.println(argsSort.get(i));
            }
        }
        
    }

}