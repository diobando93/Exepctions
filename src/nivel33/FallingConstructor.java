package nivel33;

public class FallingConstructor {
	
	int[] array = {0, 1, 2, 3, 4, 5};
	
	
	int getValor(int indice) {
        return array[indice];
    }
	
	public FallingConstructor() {
		getValor(20);
	}

}
