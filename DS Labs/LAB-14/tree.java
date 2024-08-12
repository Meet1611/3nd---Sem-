import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        left = null;
        right = null;
    }

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class tree {
    static TreeNode createTree(TreeNode root) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data : ");
        int data = sc.nextInt();

        root = new TreeNode(data);

        if (root.data == -1) {
            return null;
        }

        System.out.print("Enter value for left of " + root.data + " : ");
        root.left = createTree(root);
        System.out.print("Enter value for right of " + root.data + " : ");
        root.left = createTree(root);

        return root;
    }

    static TreeNode createTree(int arr[], int index) {
        if (index >= arr.length) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        if (root.data == -1) {
            return null;
        }

        root.left = createTree(arr, 2 * index + 1);
        root.right = createTree(arr, 2 * index + 2);

        return root;
    }

    static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, -1, -1, 80, 90, -1, -1, 100, -1, -1, -1, -1, -1, -1 };
        // int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        TreeNode root = new TreeNode();

        root = createTree(arr, 0);

        System.out.println("Preorder traversal of constructed tree is:");
        preOrder(root);
        System.out.println();

        System.out.println("Inorder traversal of constructed tree is:");
        inOrder(root);
        System.out.println();

        System.out.println("PostOrder traversal of constructed tree is:");
        postOrder(root);
        System.out.println();
    }
}
