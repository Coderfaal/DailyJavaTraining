package COLLECTIONS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMaps2 {
    public static void main(String[] args) {


       // String s= " Stella, your light is special, even if it’s not as bright as the others. Every star has its own way of shining. Maybe you need to discover what makes your shine unique.\" Stella thought about this and decided to go on a journey to find out what made her shine. She met Elder Star, an ancient star who had been shining in the sky for thousands of years. Elder Star was wise and kind. \"Little one,\" he twinkled softly, \"you are special because you shine the way only you can. Embrace your own light.\" Stella returned to her spot in the sky that night. She realized that she didn’t need to try to shine like anyone else. She could shine in her own way, and that was enough. As the night went on, something magical happened. Stella’s light grew brighter—not because she was trying harder, but because she was being true to herself. Her glow became soft, gentle, and steady, filling the sky with a peaceful, calming light. The other stars noticed Stella’s glow and smiled. This story teaches us that every star has its own unique way of shining, and we should embrace our own light.";
            String s =" Star Stories is made by Objective Productions commissioned for Channel 4 by Shane Allen and Andrew Newman with Lee Hupfield producing, Elliot Hegarty directing and Phil Clarke and Andrew O'Connor as executive producers ";
        String words[] =s.split(" ");
        System.out.println(words); //word:frequency
//
        HashMap<String,Integer> w =new HashMap<>();
        int i =0;
        while(i<words.length){
            if(w.containsKey(words[i])){
                w.put(words[i],w.get(words[i])+1);
            }else
                w.put(words[i],1);
            }
        System.out.println(w);
    }



}

