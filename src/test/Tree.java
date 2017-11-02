package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

	public TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
	
	private int data;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	private TreeNode left;
	private TreeNode right;	
}

class BTree {
	TreeNode root;
	public TreeNode insert (TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
		//	return root;
		} else {
			insertUtil(root,data);
		}
		return root;
	}
	
	public void insertUtil (TreeNode root, int data) {
			if (root.getLeft() == null) {
				root.setLeft(new TreeNode(data));			
			} else {
				insertUtil(root.getLeft(),data);
			} 
			
			if (root.getRight() == null){
				root.setLeft(new TreeNode(data));
			} else {
				insertUtil(root.getRight(),data);
			}  
		
		//return root;
	}
	
	// print level order
	public void printLevelOrder (TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode tmp = q.poll();
			if (tmp.getLeft() != null) {
				q.offer(root.getLeft());
			}			
			if (tmp.getRight() != null) {
				q.offer(root.getRight());
			}
			System.out.println(tmp.getData() + " ");
		}
	}
	//find the of the tree
	public int heightOfTree (TreeNode root) {
		if (root == null) {
			return -1;
		}		
		return Math.max(heightOfTree(root.getLeft()), heightOfTree(root.getRight())) + 1;
	}
	
	// find max element from tree
	public int maxFromTree (TreeNode root) {
		int max = Integer.MIN_VALUE;
		if (root == null) {
			return max;
		}
		if (root.getData() > max) {
			max = root.getData();
		}		
		return Math.max(maxFromTree (root.getLeft()),maxFromTree (root.getLeft()));		
	}
}
public class Tree {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		BTree bt = new BTree();
		String[] number = line.split(" ");
		for(String str:number) {
			bt.root = bt.insert(bt.root, Integer.parseInt(str));
		}
		bt.printLevelOrder(bt.root);
	}
}
