package loopsPractice;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,5, 6, 9, 12, 15); 
		  
     // Map 
        //list.stream().map(number -> number * 3).forEach(s->System.out.println(s));
     //Filter
       // list.stream().filter(n->n%3==0).forEach(s->System.out.println(s));
     //Map&Filter
        list.stream().filter(n->n%3==0).map(n->n*3).forEach(s->System.out.println(s));
    } 
} 

