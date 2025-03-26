public class ProductSearch {
    public static void main(String[] args) {
        BST tree = new BST();
        CSVLoader.loadCSV(tree, "products.csv");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter SKU to search: ");
        String sku = scanner.nextLine();
        Product result = tree.search(sku);
        
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product not found.");
        }
        scanner.close();
    }
}
