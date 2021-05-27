package meli.ejerc;


import jdk.swing.interop.SwingInterOpUtils;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{


		//Se convierte el arreglo a cadena
		String sArr[] = meli.ejerc.StringUtil.toStringArray(arr);

		/*for(String x: sArr)
		{
			System.out.println(x);
		}*/
		char c = '0';

		//Se normaliza la longitud agregando ceros
		sArr = meli.ejerc.StringUtil.lNormalize(sArr,c);

		//Declaro las listas
		ArrayList<String> sList0 = new ArrayList<>();
		ArrayList<String> sList1 = new ArrayList<>();
		ArrayList<String> sList2 = new ArrayList<>();
		ArrayList<String> sList3 = new ArrayList<>();
		ArrayList<String> sList4 = new ArrayList<>();
		ArrayList<String> sList5 = new ArrayList<>();
		ArrayList<String> sList6 = new ArrayList<>();
		ArrayList<String> sList7 = new ArrayList<>();
		ArrayList<String> sList8 = new ArrayList<>();
		ArrayList<String> sList9 = new ArrayList<>();

		//Obtengo el Max Length
		int iMaxL = meli.ejerc.StringUtil.maxLength(sArr);
		int iIteraciones = 1;

		//Recorro el arreglo obteniendo el caracter que necesite
		for(String x: sArr)
		{
			//Se obtiene el caracter con maxL - iteracion para saber cual tomar
			int iCaracter = x.charAt(iMaxL-iIteraciones);

			//Tiene que filtrar por el caracter para guardar en las listas y borrar el elemento del arreglo anterior
		}



	}


	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);

		for(int i=0; i<arr.length;i++)

		{
		System.out.print(arr[i]+(i<arr.length-1?",":""));

		}




	}
}
