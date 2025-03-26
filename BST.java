class BST
{
    private BSTNode root;
    
    public void insert(Product product)
    {
        root = insertRec(root, product);
    }

    private BSTNode insertRec(BSTNode root, Product product)
    {
        if (root == null)
        {
            return new BSTNode(product);
        }
        if (product.sku.compareTo(root.product.sku) < 0)
        {
            root.left = insertRec(root.left, product);
        }
        else
        {
            root.right = insertRec(root.right, product);
        }
        return root;
    }

    public Product search(String sku)
    {
        return searchRec(root, sku);
    }

    private Product searchRec(BSTNode root, String sku)
    {
        if (root == null || root.product.sku.equals(sku))
        {
            return (root != null) ? root.product : null;
        }
        if (sku.compareTo(root.product.sku) < 0)
        {
            return searchRec(root.left, sku);
        }
        return searchRec(root.right, sku);
    }
}