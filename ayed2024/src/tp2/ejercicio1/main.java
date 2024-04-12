package tp2.ejercicio1;

public class main {

	public static void main(String[] args) {
	        System.out.println("test");
	        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
	        ab.addLeftChild(new BinaryTree<Integer>(2));
	        ab.addRightChild(new BinaryTree<Integer>(6));
	        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
	        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	        
	        ab.entreNiveles(0, 1);
	        
		}

}
