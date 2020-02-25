
public class ClaseParaDepurar {
private int suma;
private int[] lista;
public ClaseParaDepurar() {
System.out.println("Construyendo clase");
}
public int echacuentas() {
	lista= new int[100];
	for(int i=0;i<lista.length;i++) {
		lista[i]=i;
	}
	suma=0;
	for(int valor: lista) {
		suma+=valor;
	}
	return suma;
}
}
