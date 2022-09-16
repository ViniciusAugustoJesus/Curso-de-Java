package Colection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adiciona elementos na fila e a diferença é o comportamento qnd a fila ta cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// element e peek -> adiciona elementos na fila e a diferença é o comportamento qnd a fila ta vazia

		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // retorna uma exceção
		
		System.out.println(fila.poll());// retorna false
		System.out.println(fila.remove()); // retorna uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		
	}
}
