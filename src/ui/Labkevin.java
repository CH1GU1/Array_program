import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Labkevin{
	//Variables and constants declaration
	static Scanner sc;
	private static int option;
	private final static int option_stringEntry = 1;
	private final static int option_realEntry = 2;
	private final static int option_arraysEntry = 3;
	private final static int option_stringLenght = 1;
	private final static int option_stringConcatenate = 2;
	private final static int option_stringPosition = 3;
	private final static int exit_menu = 4;
	private static int move;
	private static int copy;
	private static double rNum1;
	private static double rNum2;
	private static int choice1;
	private static int choice2;
	private static double real_result;
	private static double real_residue;
	private static double int_division;
	public static int totalSum;
	public static int totalSubtraction;
	public static int totalMult;
	public static int size1;
	public static int size2;
	public static int size3;
	public static int SUM1;
	public static int SUM2;
	public static int SUM3;
	public static double DIV1;
	public static double DIV2;
	public static double DIV3;
	private static int choice_character; 
	private static String string1;
	private static String string2;
	private static String string3;
	private static int[] array1;
	private static int[] array2;
	private static int[] array3;
	private static int[] array4;
	private static int[] arrayMove1;
	private static int[] arrayMove2;
	private static int[] arrayMove3;
/**
*This method initialize the size of arrays.
*<b>pre:</b> Arrays are already created.<br>
*<b>pre:</b> The size must be entire.<br>
*
*<b>post:</b> The size will be set.<br>
*/
public static void initialize() {
	sc = new Scanner(System.in);
	array1 = new int[size1];
	array2 = new int[size2];
	array3 = new int[size3];
	arrayMove1 = new int[size1];
	arrayMove2 = new int[size2];
	arrayMove3 = new int[size3];
  } 
/**
*This method save the strings entered by user.
*<b>pre:</b> Strings are already initialized.<br>
*
*<b>post:</b> The strings are already saved.<br>
*
*@param string1, is string.
*@param string2, is string.
*@param string3, is string.
*
*/  
public static void stringInput(String string1, String string2, String string3) {
//Strings entry	
	  System.out.println("Esta es la opción #1: Ingrese tres cadenas de caracteres");
				System.out.println("Ingrese la primera cadena de caracteres");
				string1=sc.nextLine();
				
				System.out.println("Ingrese la segunda cadena de caracteres");	
				string2=sc.nextLine();
				
				System.out.println("Ingrese la tercera cadena de caracteres");
				string3=sc.nextLine();
				System.out.println();
//Deploy sub-menu of strings
  boolean exit = false;
  if(exit=false)
	  menu();
  while(!exit){
  System.out.println("¿Que desea realizar con las cadenas?");
	System.out.println();
    System.out.println("(1) Desplegar longitud de las cadenas\n (2) Concatenar las cadenas y mostrar\n (3) Mostrar caracter a su eleccion\n (4) Salir al menu principal\n");
	option = sc.nextInt();
    sc.nextLine();
	
	switch(option) {
        case option_stringLenght:
          stringLength(string1, string2, string3);
		  exit = false;
			break;
		case option_stringConcatenate:
		stringConcatenate(string1,string2,string3);
		exit = false;
			break;
		  case option_stringPosition:
		  ubicationCharacter(string1,string2,string3);
		exit = false;
			break;
		case exit_menu:
		menu();
			break;
  }	
  }
  }
/**
*This method show the length of strings.
*<b>pre:</b> Strings are already saved.<br>
*
*<b>post:</b> Will show the length for each string.<br>
*
*@param string1, is string.
*@param string2, is string.
*@param string3, is string.
*
*/  
public static void stringLength(String string1, String string2, String string3) {
//String length deploy	
		System.out.println("La longitud de "+string1+" es: "+string1.length());
				System.out.println();
   
		System.out.println("La longitud de "+string2+" es: "+string2.length());
				System.out.println();
  
		System.out.println("La longitud de "+string3+" es: "+string3.length());
				System.out.println();
  }
/**
*This method concatenate the strings entered by user.
*<b>pre:</b> Strings are already saved.<br>
*
*<b>post:</b> Will show the strings concatenated.<br>
*
*@param string1, is string.
*@param string2, is string.
*@param string3, is string.
*
*/
public static void stringConcatenate(String string1, String string2, String string3) {
//String concatenated deploy	
  System.out.println("Concatenado es de la siguiente forma:");
				System.out.println(new StringBuilder().append(" "+string1).append(" "+string2).append(" "+string3)+"\n");
	}
/**
*This method show the strings characters of a position joined by user.
*<b>pre:</b> Strings are already saved.<br>
*<b>pre:</b> Position of string must be an integer value.<br>
*
*<b>post:</b> Will show the character of a position of the strings.<br>
*
*@param string1, is string.
*@param string2, is string.
*@param string3, is string.
*  
*/
public static void ubicationCharacter(String string1, String string2, String string3) {
//Entry and deploy the position of string character 
	  System.out.println("Ingrese la posicion de la letra de la cadena que desea saber");
	  choice_character = sc.nextInt();
	  sc.nextLine();
	  if(choice_character >= 0 && choice_character < string1.length())
	  System.out.println("El caracter ubicado en la posicion #"+choice_character+" de la cadena "+string1+" es: "+string1.charAt(choice_character)+"\n");
		else
	  System.out.println("***La posicion #"+choice_character+"  no está dentro de la cadena "+string1+"*** \n");
  {  
	  if(choice_character >= 0 && choice_character < string2.length())
	  System.out.println("El caracter ubicado en la posicion #"+choice_character+" de la cadena "+string2+" es: "+string2.charAt(choice_character)+"\n");
		else
	  System.out.println("***La posicion #"+choice_character+"  no está dentro de la cadena "+string2+"*** \n");
  }
  {
	  if(choice_character >= 0 && choice_character < string3.length())
	  System.out.println("El caracter ubicado en la posicion #"+choice_character+" de la cadena "+string3+" es: "+string3.charAt(choice_character)+"\n");
		else
	  System.out.println("***La posicion #"+choice_character+"  no está dentro de la cadena "+string3+"*** \n");
  }
  }
/**
*This method save the real values entered by user.
*<b>pre:</b> User must entry double values.<br>
*
*<b>post:</b> values are already saved.<br>
*  
*/  
public static void realEntry(){
//Real number entry 
	  System.out.println("Esta es la opción #2: Ingrese dos reales mayores a cero");
	  System.out.println();
	  System.out.println("Ingrese el primer real");
	  rNum1=sc.nextDouble();
	  sc.nextLine();
	  System.out.println();
	  System.out.println("Ingrese el segundo real");
	  rNum2=sc.nextDouble();	
	  sc.nextLine();  
  }
/**
*This method show the values entered by user and deploy a sub-menu.
*
*<b>pre:</b> values are already saved.<br>
*<b>pre:</b> values are differents of cero.<br>
*
*<b>post:</b> values are displayed and user have the option to reentry values or exit to main menu.<br>
*  
*/    
public static void realOut(){
//Real number validation
  if(rNum1<=0)
		System.out.println("porfavor ingrese un real valido "+rNum1+" No es valido");
		
	else if(rNum2<=0) 
		System.out.println("porfavor ingrese un real valido "+rNum2+" No es valido");
	  
	else 
		//Real number deploy and performing requested operations  
		System.out.println("Sus entradas fueron "+rNum1+" y "+rNum2);
		System.out.println();
		System.out.println("La division entre ("+rNum1+") y ("+rNum2+") es: "+realDivision()); 
		System.out.println("La division entre la parte entera de ("+rNum1+") y ("+rNum2+") es: "+intDivision()); 
		System.out.println("El residuo de la division entre ("+rNum1+") y ("+rNum2+") es: "+intResidue());
		System.out.println();
		System.out.println("(2) Volver a ingresar dos reales \n(4) Salir al menu ");
		option = sc.nextInt();
		//Sub-menu deploy 
	switch(option) {
			case exit_menu:
			menu();
			break;
			case option_realEntry:
			realEntry();
			realOut();
			break;	
		
  }
  }
/**
*This method makes the division of rNum1 and rNUM2.
*
*<b>pre:</b> values are already saved.<br>
*
*<b>post:</b> Make the division.<br>
*
*  
*@return is the result of the division.
*  
*/    
public static double realDivision(){
	//Division between rNum1 and rNUM2
	real_result=rNum1/rNum2;
	return real_result;
  }
/**
*This method makes the division of the integer value of rNum1 and rNUM2.
*
*<b>pre:</b> values are already saved.<br>
*
*<b>post:</b> Make the division between the integer value of the double variables.<br>
*  
*@return is the result of the integer division.
*  
*/   
public static double intDivision(){
//Division between integer part of rNum1 and rNUM2	
	  int n1 = (int)rNum1;
	  int n2 = (int)rNum2;
	  int_division = n1/n2;
	  return int_division;
  }
/**
*This method makes the module of the integer value of rNum1 and rNUM2.
*
*<b>pre:</b> values are already saved.<br>
*
*<b>post:</b> Make the module between the integer value of the double variables.<br>
*
*@return is the result of the integer module.
*  
*/     
public static double intResidue(){	
//Module between integer part of rNum1 and rNUM2 
	  int n1 = (int)rNum1;
	  int n2 = (int)rNum2;
	  real_residue = n1%n2;
	  return real_residue;
  }
/**
*This method save the size of the arrays.
*
*<b>pre:</b> values of size must be integer.<br>
*
*<b>post:</b> Arrays sizes are already saved.<br>
*    
*/   
public static void sizeEntry(){	
//Entry arrays size 
	 System.out.println("Esta es la opción #3: Ingrese tres arreglos de numeros enteros");
	 System.out.println();
	 System.out.println("Ingrese el tamano del primer arreglo de enteros");
	 size1 = sc.nextInt();
	 sc.nextLine();
	 System.out.println();
	 
	 System.out.println("Ingrese el tamano del segundo arreglo de enteros");
	 size2 = sc.nextInt();
	 sc.nextLine();
	 System.out.println();
	 
	 System.out.println("Ingrese el tamano del tercer arreglo de enteros");
	 size3 = sc.nextInt();
	 sc.nextLine();	
	System.out.println();	 
	  
  }
/**
*This method saves the values of arrays and deploy it, this method deploy too a menu of functions to do later with arrays.
*
*<b>pre:</b> values of size must saved by user.<br>
*
*<b>post:</b> Arrays values are saved.<br>
*<b>post:</b> Each arrays are deployed.<br>
*    
*/  
public static void arrayEntry(){	
//Entry values of arrays
		System.out.println("Ingrese hasta "+size1+" enteros para el primer arreglo"); 
	 for(int i = 0; i < array1.length; i++) {
				array1[i] = sc.nextInt();
				sc.nextLine();
			}
			System.out.println();
			
	
	 
		System.out.println("Ingrese hasta "+size2+" enteros para el segundo arreglo");
	 for(int i = 0; i < array2.length; i++) {
				array2[i] = sc.nextInt();
				sc.nextLine();
			}
			System.out.println();
	
		System.out.println("Ingrese hasta "+size3+" enteros para el tercer arreglo");	
	 for(int i = 0; i < array3.length; i++) {
				array3[i] = sc.nextInt();
				sc.nextLine();
			}
			System.out.println();
			
//Arrays deploy 			
	System.out.println("Su arreglo #1 fue: ");			
	for(int i = 0; i<size1; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(" "+array1[j]);
		}
		System.out.println();
	}
System.out.println();

 System.out.println("Su arreglo #2 fue: ");			
	for(int i = 0; i<size2; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(" "+array2[j]);
		}
		System.out.println();
	}
 System.out.println();
 
  System.out.println("Su arreglo #3 fue: ");	
  for(int i = 0; i<size3; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(" "+array3[j]);
		}
		System.out.println();
	}
//deploy sub-menu of arrays 	
  boolean exit = false;
  if(exit=false) 
	  menu();
  while(!exit){
	System.out.println();
  System.out.println("¿Que desea realizar con sus arreglos?");
	System.out.println();
    System.out.println("(1) Mostrar el promedio de un arreglo\n (2) Conocer el mayor entero de un arreglo\n (3) Realizar operacion con dos arreglos\n (4) Unir arreglos en dos formas diferentes\n (5) Interceptar los arreglos\n (6) Girar un arreglo\n (7) Ordenar de menor a mayor un arreglo\n (8) Salir al menu\n");
	option = sc.nextInt();
    sc.nextLine();
	
	switch(option) {
        case 1:
		arrayAverage();
		exit = false;
			break;
		
		case 2:
		arrayHigher();
		exit = false;
		break;

		case 3:
		arrayOperation();
		exit = false;
		break;
		
		case 4:
		arrayUnion();
		exit = false;
		break;
		
		case 5:
		intersection();
		exit = false;
		break;
		
		case 6:
		rotation();
		exit = false;
		break;
		
		case 7:
		arrayOrder();
		exit = false;
		break;
		
		case 8:
		menu();
		break;
		}	
	}
}
/**
*This method deploy a menu to choose one array and then makes the average of an array (the user decide which one).
*
*<b>pre:</b> Arrays values are saved.<br>
*
*<b>post:</b> Deploy the average of the array decided by user.<br>
*    
*/  
public static void arrayAverage(){
//Average of the chosen array	
	System.out.println("¿Cual arreglo desea saber el promedio?");
        System.out.println();
		System.out.println("(1)Arreglo #1\n (2)Arreglo #2\n (3)Arreglo #3\n");
		option = sc.nextInt();
		if(option == 1){
			for(int i = 0; i < array1.length; i++) {
			SUM1+=array1[i];
		}
			DIV1=SUM1/size1;
			System.out.println("El promedio del primer arreglo es: "+DIV1);
			System.out.println();
			
		} else if (option == 2){
			for(int i = 0; i < array2.length; i++) {
			SUM2+=array2[i];
		}
			DIV2=SUM2/size2;
			System.out.println("El promedio del segundo arreglo es: "+DIV2);
			System.out.println();
			
		} else if (option == 3){
			for(int i = 0; i < array3.length; i++) {
			SUM3+=array3[i];
		}
			DIV3=SUM3/size3;
			System.out.println("El promedio del tercer arreglo es: "+DIV3);
			System.out.println();
			
		} else {
			System.out.println("ingrese una opcion valida");
			System.out.println();
		}
}
/**
*This method deploy a menu to choose one array and then show the higher value of an array (the user decide which one).
*
*<b>pre:</b> Arrays values are saved.<br>
*
*<b>post:</b> Deploy the higher value of the array decided by user.<br>
*    
*/  
public static void arrayHigher(){
//Deploys the hisgher value of chosen array	
System.out.println("¿De cual arreglo desea saber el mayor entero?");
        System.out.println();
		System.out.println("(1)Arreglo #1\n (2)Arreglo #2\n (3)Arreglo #3\n");
		option = sc.nextInt();
		if(option == 1){
			int higher_value;
			higher_value = array1[0];
			for(int i = 0; i<array1.length; i++){
				if(array1[i]>higher_value){
					higher_value = array1[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #1 fue: "+higher_value);			
		}
		
		else if(option == 2){
			int higher_value;
			higher_value = array2[0];
			for(int i = 0; i<array2.length; i++){
				if(array2[i]>higher_value){
					higher_value = array2[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #2 fue: "+higher_value);			
		}
		
		else if(option == 3){
			int higher_value;
			higher_value = array3[0];
			for(int i = 0; i<array3.length; i++){
				if(array3[i]>higher_value){
					higher_value = array3[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #3 fue: "+higher_value);			
		} else {
			System.out.println("Ingrese una opcion valida");
		}
}
/**
*This method deploy a menu to choose between addition, subtraction or multiply two arrays (the user decide which one), and then the arrays are operated.
*
*<b>pre:</b> Arrays values are saved.<br>
*
*<b>post:</b> Deploy the addition between the values of two array decided by user.<br>
*<b>post:</b> Deploy the subtraction between the values of two array decided by user.<br>
*<b>post:</b> Deploy the multiply between the values of two array decided by user.<br>
*
*    
*/  
public static void arrayOperation(){
//Deploys sub-menu to operate arrays	
	System.out.println("¿Que operacion desea realizar?"); 
		System.out.println();
		System.out.println("(1)Suma\n (2)Resta\n (3)Multiplicacion\n ");
		option = sc.nextInt();
		//Adttion between arrays
		if(option == 1){
			System.out.println("¿Cuales arreglos desea sumar?");
			System.out.println("Opcion(1): Arreglo #1 + Arreglo#2\n Opcion(2): Arreglo#1 + Arreglo#3\n Opcion(3): Arreglo#2 + Arreglo#3\n");
			option = sc.nextInt();
			if(option == 1){
				for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array2[x];
					totalSum = num1+num2;
					
				System.out.println("La suma de los arreglos en la posicion #"+(x+1)+" es: "+totalSum);
				}
			}
			else if(option == 2){
				for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array3[x];
					totalSum = num1+num2;
					
				System.out.println("La suma de los arreglos en la posicion #"+(x+1)+" es: "+totalSum);
				}
			}
			else if(option == 3){
				for(int x = 0; x < array2.length; x++){
					int num1 = array2[x];
					int num2 = array3[x];
					totalSum = num1+num2;
					
				System.out.println("La suma de los arreglos en la posicion #"+(x+1)+" es: "+totalSum);
				}
			} else {
				System.out.println("Ingrese una opcion valida");
			}
		 }
		 //Subtraction between arrays
		 else if(option == 2){
			System.out.println("Elija un arreglo");
			System.out.println("Opcion(1): Arreglo #1\n Opcion(2): Arreglo#2\n Opcion(3): Arreglo#3\n");
			choice1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Elija un segundo arreglo");
			System.out.println("Opcion(1): Arreglo #1\n Opcion(2): Arreglo#2\n Opcion(3): Arreglo#3\n");
			choice2 = sc.nextInt();
			sc.nextLine();
			if(choice1 == 1 && choice2 == 2){
			
			for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array2[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #1 menos #2 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}

			} else if(choice1 == 1 && choice2 == 3){
				
				for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array3[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #1 menos #3 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}
			 } else if(choice1 == 2 && choice2 == 1){
				
				for(int x = 0; x < array2.length; x++){
					int num1 = array2[x];
					int num2 = array1[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #2 menos #1 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}		
			 } else if(choice1 == 2 && choice2 == 3){
				
				for(int x = 0; x < array2.length; x++){
					int num1 = array2[x];
					int num2 = array3[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #2 menos #3 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}		
			 } else if(choice1 == 3 && choice2 == 1){
				
				for(int x = 0; x < array3.length; x++){
					int num1 = array3[x];
					int num2 = array1[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #3 menos #1 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}		
			 } else if(choice1 == 3 && choice2 == 2){
				
				for(int x = 0; x < array3.length; x++){
					int num1 = array3[x];
					int num2 = array2[x];
					totalSubtraction = num1-num2;
					
				System.out.println("La resta de los arreglos #2 menos #1 en la posicion #"+(x+1)+" es: "+totalSubtraction);
				}		
			 } else {
				 System.out.println();
				 System.out.println("Elija una opcion valida");
			 }
		//Multiply arrays	 
		} else if (option == 3) {
			System.out.println("¿Cuales arreglos desea multiplicr?");
			System.out.println("Opcion(1): Arreglo #1 * Arreglo#2\n Opcion(2): Arreglo#1 * Arreglo#3\n Opcion(3): Arreglo#2 * Arreglo#3\n");
			option = sc.nextInt();
			if(option == 1){
				for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array2[x];
					totalMult = num1*num2;
					
				System.out.println("El producto de los arreglos #1 por #2 en la posicion #"+(x+1)+" es: "+totalMult);
				}
			}
			else if(option == 2){
				for(int x = 0; x < array1.length; x++){
					int num1 = array1[x];
					int num2 = array3[x];
					totalMult = num1*num2;
					
				System.out.println("El producto de los arreglos #1 por #3 en la posicion #"+(x+1)+" es: "+totalMult);
				}
			}
			else if(option == 3){
				for(int x = 0; x < array2.length; x++){
					int num1 = array2[x];
					int num2 = array3[x];
					totalMult = num1*num2;
					
				System.out.println("El producto de los arreglos #2 por #3 en la posicion #"+(x+1)+" es: "+totalMult);
				}
			} else {
				System.out.println("Ingrese una opcion valida");
			}
		 }
}
/**
*This method show two types of union between the arrays, first one is the union all values of every arrays and the second one is the union of every arrays without duplicate values.
*
*<b>pre:</b> Arrays values are saved.<br>
*
*<b>post:</b> Array4 is created to makes the union of array1, array2 and array3.<br>
*<b>post:</b> Array4 have the addition of size1, size2 and size3.<br>
*<b>post:</b> Show the both types of union between every arrays.<br>
*    
*/  
public static void arrayUnion(){
array4 = new int[array1.length+array2.length+array3.length];

int c=0;

for(int i=0;i<array1.length;i++){
	
	array4[i]=array1[i];
	c++;
}
for(int j=0;j<array2.length;j++){
	
	array4[c++]=array2[j];
}
for(int k=0;k<array3.length;k++){
	
	array4[c++]=array3[k];
}

System.out.println();
System.out.println("La union de los arreglos es: ");
for(int i=0;i<array4.length;i++){
	System.out.print(array4[i]+" ");
	}
System.out.println();

Arrays.sort(array4);
int len = array4.length;
int j=0;

for(int i = 0; i < len - 1;i++){
	if(array4[i] != array4[i + 1]){
		array4[j++] = array4[i];
	}
}
array4[j++] = array4[len - 1];

System.out.println("La union de los arreglos sin duplicar elementos es: ");
for(int k = 0; k < j; k++){
	System.out.print(array4[k]+" ");
}
System.out.println();
}
/**
*This method show the interseccion between the arrays.
*
*<b>pre:</b> Arrays values are saved.<br>
*<b>pre:</b> Arrays values must be common for the three arrays.<br>
*
*<b>post:</b> Show the interseccion between the values in common of every arrays.<br>
*    
*/  
public static void intersection(){
//Intersection between the three arrays (only common elements between all arrays)	
int x =0, y=0, z=0;
System.out.println("La interseccion de los arreglos es: ");
while(x<array1.length && y<array2.length && z<array3.length){
	
	if(array1[x] == array2[y] && array2[y] == array3[z]){
		System.out.print(array1[x]+" ");
		
		x++;
		y++;
		z++;
		
	} else if(array1[x] > array2[y]){
		y++;
		
	} else if(array2[y] > array3[z]){
		z++;
		
	}else{
		x++;
	}
System.out.println();
}
}
/**
*This method makes the rotation of each array (the user choose which one).
*
*<b>pre:</b> Arrays values are saved.<br>
*<b>pre:</b> An array only can rotate of it maximum of length.<br>
*
*<b>post:</b> Show the array moved to the right the times that the user decided.<br>.
* 
*/  
public static void rotation(){
//Displacement of values positions on arrays
System.out.println("¿Cual de los arreglos desea rotar?");	
System.out.println("");
System.out.println("Opcion(1): Arreglo #1\n Opcion(2): Arreglo#2\n Opcion(3): Arreglo#3\n");	
option = sc.nextInt();
	
if(option == 1){
	for (int i = 0; i < array1.length; i++){
System.out.print(array1[i]+" ");
	}
	
System.out.print("\nIngrese la cantidad a desplazar: ");
move = sc.nextInt();

if(move <= size1){
int j = move;

for(int i = 0; i< size1 - move;i++){
arrayMove1[j] = array1[i];
j++;	
}

j=size1-move;
for(int i=0; i < move;i++){
	arrayMove1[i] = array1[j];
	j++;
}
System.out.println("\nElementos desplazados: ");
        for(int i = 0; i < size1; i++){
            System.out.println("Numero "+(i+1)+": "+arrayMove1[i]);
        }
} else {
	System.out.println("No se puede rotar mas de "+size1+" posiciones");
	System.out.println();
}
} 
else if(option == 2){
	for (int i = 0; i < array2.length; i++){
System.out.print(array2[i]+" ");
	}
	
System.out.print("\nIngrese la cantidad a desplazar: ");
move = sc.nextInt();

if(move <= size2){
int j = move;

for(int i = 0; i < size2 - move;i++){
arrayMove2[j] = array2[i];
j++;	
}

j=size2-move;
for(int i=0; i < move;i++){
	arrayMove2[i] = array2[j];
	j++;
}
System.out.println("\nElementos desplazados: ");
        for(int i = 0; i < size2; i++){
            System.out.println("Numero "+(i+1)+": "+arrayMove2[i]);
        }
} else {
	System.out.println("No se puede rotar mas de "+size2+" posiciones");
	System.out.println();
}
}
else if(option == 3){
	for (int i = 0; i < array3.length; i++){
System.out.print(array3[i]+" ");
	}
	
System.out.print("\nIngrese la cantidad a desplazar: ");
move = sc.nextInt();

if(move <= size3){
int j = move;

for(int i = 0; i < size3 - move;i++){
arrayMove3[j] = array3[i];
j++;	
}

j=size3-move;
for(int i=0; i < move;i++){
	arrayMove3[i] = array3[j];
	j++;
}
System.out.println("\nElementos desplazados: ");
        for(int i = 0; i < size3; i++){
            System.out.println("Numero "+(i+1)+": "+arrayMove3[i]);
        }
} else {
	System.out.println("No se puede rotar mas de "+size3+" posiciones");
	System.out.println();
}
}
}
/**
*This method organize from least to greatest values each array by the bubble method (the user choose which one).
*
*<b>pre:</b> Arrays values are saved.<br>
*<b>pre:</b> Just an option between 1 and 3.<br>
*
*<b>post:</b> Show the chosen array organized.<br>
* 
*/   
public static void arrayOrder(){
//Select array to organize	
System.out.println("¿Cual de los arreglos desea ordenar?");	
System.out.println("");
System.out.println("Opcion(1): Arreglo#1\n Opcion(2): Arreglo#2\n Opcion(3): Arreglo#3\n");	
option = sc.nextInt();

if(option == 1){	
	//Bubble method to organize array
	for(int i = 0; i < (size1-1); i++){
		for(int j =0; j < (size1-1); j++){
			if(array1[j]>array1[j+1]){
				move = array1[j];
				array1[j] = array1[j+1];
				array1[j+1] = move;
			}
		}
	}
	System.out.println("Su arreglo de menor a mayor es:");
	for(int i = 0; i < array1.length; i++){
		System.out.print(array1[i]+" ");
}
} 
else if(option == 2){

	for(int i = 0; i < (size2-1); i++){
		for(int j =0; j < (size2-1); j++){
			if(array2[j]>array2[j+1]){
				move = array2[j];
				array2[j] = array2[j+1];
				array2[j+1] = move;
			}
		}
	}
	System.out.println("Su arreglo de menor a mayor es:");
	for(int i = 0; i < array2.length; i++){
		System.out.print(array2[i]+" ");
}
} 		
else if(option == 3){	
	
	for(int i = 0; i < (size3-1); i++){
		for(int j =0; j < (size3-1); j++){
			if(array3[j]>array3[j+1]){
				move = array3[j];
				array3[j] = array3[j+1];
				array3[j+1] = move;
			}
		}
	}
	System.out.println("Su arreglo de menor a mayor es:");
	for(int i = 0; i < array3.length; i++){
		System.out.print(array3[i]+" ");
			}
	} 
}
/**
*This method deploy the main menu of the program.
*
*<b>pre:</b> Just an option between 1 and 3.<br>
*
*<b>post:</b> Perform a series of methods according to your choice.<br>
* 
*/   
static void menu() {
//Main menu of the program with three cases (strings, real numbers and arrays)	
	System.out.println("-------------MENU #1 DE OPCIONES-------------");
	System.out.println();
    System.out.println("(1) INGRESAR CADENAS \n (2) INGRESAR DOS NUMEROS REALES MAYORES A CERO  \n (3) INGRESAR TRES ARREGLOS DE NUMEROS ENTEROS \n");
	option = sc.nextInt();
    sc.nextLine();
	
	 
	switch(option) {
        case option_stringEntry:
          stringInput(string1,string2,string3);
        break;
		case option_realEntry:
			realEntry();
			realOut();
		break;
		case option_arraysEntry:
			sizeEntry();
			initialize();
			arrayEntry();
		break;
		default:
		System.out.println("***Elije una opcion valida***");
		menu();
		break;
	}
		
  }
public static void main(String[] args) {
	initialize();
	menu();
	}
}
