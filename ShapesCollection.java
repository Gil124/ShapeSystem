package shapes;

// Exercício: comentar interface ShapesCollection
public interface ShapesCollection {
	boolean isEmpty();
	boolean hasShape(String ID);
	void addCircle(String ID, int x, int y, int radius);
	void addRectangle(String ID, int x, int y, int height, int width);
	void move(String ID, int x, int y);
	Shape smallestArea();
	Iterator allShapesIterator();
}
