package com.sys4soft;

import java.util.Arrays;

public class MetodoOrdenarArrayInt {

		public static int[] OrdemAsc(int[] array_int){
			int[] array_int_asc = new int[array_int.length];
			Arrays.sort(array_int);
			return array_int;
		}

		public static int[] OrdemDesc(int[] array_int){

			Arrays.sort(array_int);
			
			int[] array_int_desc = new int[array_int.length];
			
			int j = 0;
			
			for(int i = array_int.length - 1; i >= 0; i--){
				array_int_desc[j] = array_int[i];
				j++;
			}
			
			return array_int_desc;
		}

}
