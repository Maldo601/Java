package I_Arrays;

import java.util.*;

public class test {

	public static void main(String[] args) {

		int [] vector_x = new int [10];

		for (int y = 0; y < vector_x.length; y++) {
			vector_x[y] = (int) Math.round(Math.random() * 10);
		}

		Arrays.sort(vector_x);
		for (int y = 0; y < vector_x.length - 1; y++) {
			int count = 1;
			for (int z = y + 1; z < vector_x.length; z++) {
				if (vector_x[y] == vector_x[z])
					count++;
				else
					break;
			}
			if (count > 1) {
			}
			System.out.println("El valor " + vector_x[y] + " se encuentra en el vector " + count + " veces.");
			y += (count - 1);
		}
	}
}
