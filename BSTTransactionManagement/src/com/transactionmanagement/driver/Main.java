package com.transactionmanagement.driver;

import com.transactionmanagement.service.BinarySearchTree;
import com.transactionmanagement.service.Node;

public class Main {

	static Node headNode = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();

		bst.node = new Node(50);
		bst.node.left = new Node(30);
		bst.node.right = new Node(60);
		bst.node.left.left = new Node(10);
		bst.node.right.left = new Node(55);

		bst.convertToRightSkewedTree(bst.node);
		bst.traverseRightSkewedTree(bst.headNode);

		System.out.println();
		BinarySearchTree bstTest = new BinarySearchTree();

		bstTest.node = new Node(50);
		bstTest.node.left = new Node(30);
		bstTest.node.right = new Node(60);
		bstTest.node.left.left = new Node(10);
		bstTest.node.left.right = new Node(40);
		bstTest.node.right.left = new Node(55);
		bstTest.node.right.right = new Node(70);

		bstTest.convertToRightSkewedTree(bstTest.node);
		bstTest.traverseRightSkewedTree(bstTest.headNode);
	}
}