/* 		/*
		 * To change this license header, choose License Headers in Project Properties.
		 * To change this template file, choose Tools | Templates
		 * and open the template in the editor.
		 */
/**
 *
 * @author vanessa albarran
 * */
public class Algoritmos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmosDeOrdenamiento ordenar=new AlgoritmosDeOrdenamiento();
        int vector1[]={5,6,3,44,22,1};
        int vector21[]={55,4,43,44,2,10};
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Ordenado con burbuja1");
        ordenar.burbuja(vector1);
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Orfiginal");
        ordenar.mostrarArreglo(vector21);
        System.out.println("Arreglo Ordenado con burbuja2");
        ordenar.burbuja(vector21);
        ordenar.mostrarArreglo(vector21);
		   }


		   }

