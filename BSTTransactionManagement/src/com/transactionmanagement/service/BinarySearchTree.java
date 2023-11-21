package com.transactionmanagement.service;

public class BinarySearchTree {

	public Node node;
	Node prevNode = null;
	public Node headNode = null;

	public void convertToRightSkewedTree(Node root) {
		try {
			if (root == null) {
				return;
			}

			convertToRightSkewedTree(root.left);

			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			convertToRightSkewedTree(root.right);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewedTree(root.right);

	}
}