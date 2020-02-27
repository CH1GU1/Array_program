import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Labkevin{
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
public static void initialize() {
	sc = new Scanner(System.in);
	array1 = new int[size1];
	array2 = new int[size2];
	array3 = new int[size3];
	arrayMove1 = new int[size1];
	arrayMove2 = new int[size2];
	arrayMove3 = new int[size3];
  } 
public static void stringInput() {
	  System.out.println("Esta es la opción #1: Ingrese tres cadenas de caracteres");
				System.out.println("Ingrese la primera cadena de caracteres");
				string1=sc.next();
				sc.nextLine();
				
				System.out.println("Ingrese la segunda cadena de caracteres");	
				string2=sc.next();
				sc.nextLine();
				
				System.out.println("Ingrese la tercera cadena de caracteres");
				string3=sc.next();
				sc.nextLine();
				System.out.println();
  
  
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
          stringLength();
		  exit = false;
			break;
		case option_stringConcatenate:
		stringConcatenate();
		exit = false;
			break;
		  case option_stringPosition:
		  ubicationCharacter();
		exit = false;
			break;
		case exit_menu:
		menu();
			break;
  }	
  }
  }
public static void stringLength() {
		System.out.println("La longitud de "+string1+" es: "+string1.length());
				System.out.println();
   
		System.out.println("La longitud de "+string2+" es: "+string2.length());
				System.out.println();
  
		System.out.println("La longitud de "+string3+" es: "+string3.length());
				System.out.println();
  }
public static void stringConcatenate() {
  System.out.println("Concatenado es de la siguiente forma:");
				System.out.println(new StringBuilder().append(" "+string1).append(" "+string2).append(" "+string3)+"\n");
	}
public static void ubicationCharacter() {
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
public static void realEntry(){
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
public static void realOut(){
  if(rNum1<=0)
		System.out.println("porfavor ingrese un real valido "+rNum1+" No es valido");
		
	else if(rNum2<=0) 
		System.out.println("porfavor ingrese un real valido "+rNum2+" No es valido");
	  
	else 
		System.out.println("Sus entradas fueron "+rNum1+" y "+rNum2);
		System.out.println();
		System.out.println("La division entre ("+rNum1+") y ("+rNum2+") es: "+realDivision()); 
		System.out.println("La division entre la parte entera de ("+rNum1+") y ("+rNum2+") es: "+intDivision()); 
		System.out.println("El residuo de la division entre ("+rNum1+") y ("+rNum2+") es: "+intResidue());
		System.out.println();
		System.out.println("(2) Volver a ingresar dos reales \n(4) Salir al menu ");
		option = sc.nextInt();
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
public static double realDivision(){
	real_result=rNum1/rNum2;
	return real_result;
  }
public static double intDivision(){ 
	  int n1 = (int)rNum1;
	  int n2 = (int)rNum2;
	  int_division = n1/n2;
	  return int_division;
  }	
public static double intResidue(){	 
	  int n1 = (int)rNum1;
	  int n2 = (int)rNum2;
	  real_residue = n1%n2;
	  return real_residue;
  }
public static void sizeEntry(){	  
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
public static void arrayEntry(){	
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
			
	System.out.println("Su arreglo #1 fue: ");			
	for(int i = 0; i<size1; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(array1[j]);
		}
		System.out.println();
	}
System.out.println();

 System.out.println("Su arreglo #2 fue: ");			
	for(int i = 0; i<size2; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(array2[j]);
		}
		System.out.println();
	}
 System.out.println();
 
  System.out.println("Su arreglo #3 fue: ");	
  for(int i = 0; i<size3; i++){
	 for(int j = 0; j<=i; j++){
		 System.out.print(array3[j]);
		}
		System.out.println();
	}
	
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
public static void arrayAverage(){	
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
public static void arrayHigher(){
System.out.println("¿De cual arreglo desea saber el mayor entero?");
        System.out.println();
		System.out.println("(1)Arreglo #1\n (2)Arreglo #2\n (3)Arreglo #3\n");
		option = sc.nextInt();
		if(option == 1){
			int mayor, menor;
			mayor = menor = array1[0];
			for(int i = 0; i<array1.length; i++){
				if(array1[i]>mayor){
					mayor = array1[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #1 fue: "+mayor);			
		}
		
		else if(option == 2){
			int mayor, menor;
			mayor = menor = array2[0];
			for(int i = 0; i<array2.length; i++){
				if(array2[i]>mayor){
					mayor = array2[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #2 fue: "+mayor);			
		}
		
		else if(option == 3){
			int mayor, menor;
			mayor = menor = array3[0];
			for(int i = 0; i<array3.length; i++){
				if(array3[i]>mayor){
					mayor = array3[i];
				}	
			}
			System.out.println("El mayor entero del arreglo #3 fue: "+mayor);			
		} else {
			System.out.println("Ingrese una opcion valida");
		}
}
public static void arrayOperation(){	
	System.out.println("¿Que operacion desea realizar?"); 
		System.out.println();
		System.out.println("(1)Suma\n (2)Resta\n (3)Multiplicacion\n ");
		option = sc.nextInt();
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
public static void intersection(){
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
}
System.out.println();
}
public static void rotation(){
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
public static void arrayOrder(){
System.out.println("¿Cual de los arreglos desea ordenar?");	
System.out.println("");
System.out.println("Opcion(1): Arreglo#1\n Opcion(2): Arreglo#2\n Opcion(3): Arreglo#3\n");	
option = sc.nextInt();

if(option == 1){	
	
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
static void menu() {
	System.out.println("-------------MENU #1 DE OPCIONES-------------");
	System.out.println();
    System.out.println("(1) INGRESAR CADENAS \n (2) INGRESAR DOS NUMEROS REALES MAYORES A CERO  \n (3) INGRESAR TRES ARREGLOS DE NUMEROS ENTEROS \n");
	option = sc.nextInt();
    sc.nextLine();
	
	 
	switch(option) {
        case option_stringEntry:
          stringInput();
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
	}
		
  }
public static void main(String[] args) {
	initialize();
	menu();
	}
}