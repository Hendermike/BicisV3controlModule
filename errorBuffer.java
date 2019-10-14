
public class errorBuffer {
	
	double[] errorBuffer;
	
	//CONSTRUCTOR
	public errorBuffer() {
		errorBuffer = new double[] {0.1, -1.4, -1.2, -0.6, 1.5};
	}
	
	//IMPRIMIR BUFFER
	public void display() {
		System.out.println("Element at index 0: "
                + errorBuffer[0]);
		System.out.println("Element at index 1: "
                + errorBuffer[1]);
		System.out.println("Element at index 2: "
                + errorBuffer[2]);
		System.out.println("Element at index 3: "
                + errorBuffer[3]);
		System.out.println("Element at index 4: "
                + errorBuffer[4]);
	}
	
	//ACTUALIZAR BUFFER
	public void update(double newError) {

		for (int i = errorBuffer.length - 1;i > 0; --i) { 
			errorBuffer[i] = errorBuffer[i - 1];
		}
		errorBuffer[0] = newError;
	}
	
	//EXTRAER VALOR DEL BUFFER
	public double get(int i) {
			return errorBuffer[i - 1];
	}
	
}
