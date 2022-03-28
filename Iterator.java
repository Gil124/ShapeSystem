package shapes;


public interface Iterator {
	/**
	 * Vai para o inicio da coleccao
	 */
	void init();

	/**
	 * Verifica se existe mais algum elemento a visitar
	 * @return true, se houver mais elementos a visitar, false, caso contrario
	 */
	boolean hasNext();

	/**
	 * Devolve o proximo elemento a visitar na coleccao.
	 * @pre hasNext()
	 * @return O proximo elemento a visitar, se existir, ou null, caso contrario.
	 */
	 Shape next();
}