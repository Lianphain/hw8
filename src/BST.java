/***************************************************************************************
*
* NAME: Kahlin Baughman
*
* HOMEWORK: 8
*
* CLASS: ICS 211
*
* INSTRUCTOR: Scott Robertson
*
* DATE: April 8, 2016
*
* FILE: BST.java
*
* DESCRIPTION: This file contains the methods and variables necessary to create and modify a BST
*
***************************************************************************************/

public class BST<Integer extends Comparable<Integer>>{
  private BSTNode<Integer> root;

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public BST(){
    root = new BSTNode(null);
  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public void add(Integer element){
    if(root.getData() == null){
      root.setData(element);
    }
    else{
      BSTNode parent = root;
      BSTNode curr = root;
      BSTNode input = new BSTNode(element);
      if(element > root.getData()){
        if(root.getRight() == null){
          root.setRight(input));
          input.setParent(parent);
        }
        else{
          curr = root.getRight();
          while(element > curr.getData()){
            if(curr.getRight() != null){
              curr = curr.getRight();
            }
            else{
              curr.setRight(input);
              input.setParent(curr);
            }
          }
          while(element < curr.getData()){
            if(curr.getLeft() != null){
              curr = curr.getLeft();
            }
            else{
              curr.setLeft(new BSTNode(element)));
            }
          }
        }
      }
      if(element < root.getData()){
        if(root.getLeft() == null){
          root.setLeft(new BSTNode(element));
        }
      }
    }
  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public Integer delete(Integer element){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

  public Integer search(Integer element){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public Integer mini(){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public Integer max(){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public Integer predecessor(Integer element){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public Integer successor(Integer element){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public int size(){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public String preorder(){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public String postorder(){

  }

  /********************************************************************
	*
	* Method: setNext
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<E> node
	*
	* @return None
	*
	********************************************************************/

  public String inorder(){

  }

}
