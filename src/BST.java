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

public class BST<E extends Comparable<E>>{
  private BSTNode<E> root;
  private int size = 0;

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
    root = new BSTNode();
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

  public void add(E element){
    BSTNode<E> input = new BSTNode(element);
    BSTNode<E> curr = root;
    while(true){
        if(curr.getData() == null){
          root.setData(input.getData());
          size++;
          break;
        }
        else if((element.compareTo(curr.getData()) == 1) && curr.getRight() == null){
          curr.setRight(input);
          input.setParent(curr);
          size++;
          break;
        }
        else if((element.compareTo(curr.getData()) == -1) && curr.getLeft() == null){
          curr.setLeft(input);
          input.setParent(curr);
          size++;
          break;
        }
        else if((element.compareTo(curr.getData()) == 1)){
          curr = curr.getRight();
        }
        else if((element.compareTo(curr.getData()) == -1)){
          curr = curr.getLeft();
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

  public E delete(E element){
    return null;
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

  public E search(E element){
    BSTNode<E> curr = root;
    E temp = null;
    while(true){
        if(element.compareTo(curr.getData()) == 0){
          temp = element;
          break;
        }
        else if((element.compareTo(curr.getData()) == 1)){
          curr = curr.getRight();
        }
        else if((element.compareTo(curr.getData()) == -1)){
          curr = curr.getLeft();
        }
    }
    return temp;
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

  public E mini(){
    BSTNode<E> temp = root;
    while(temp.getLeft() != null){
      temp = temp.getLeft();
    }
    return temp.getData();
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

  public E max(){
    BSTNode<E> temp = root;
    while(temp.getRight() != null){
      temp = temp.getRight();
    }
    return temp.getData();
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

  public E predecessor(E element){
    return null;
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

  public E successor(E element){
    return null;
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
    return size;
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
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
    }
    else{
      output = preorderrec(root);
      strarray = output.split(" ");
      output = "";
      for(int i = 0; i < strarray.length; i++){
        if(strarray.length - 1 != i){
          output += strarray[i] + ", ";
        }
        else{
          output += strarray[i];
        }
      }
    }
    return "[" + output + "]";
  }

  private String preorderrec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += input.getData() + " ";
    temp += preorderrec(input.getLeft());
    temp += preorderrec(input.getRight());
    return temp;
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
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
    }
    else{
      output = inorderrec(root);
      strarray = output.split(" ");
      output = "";
      for(int i = 0; i < strarray.length; i++){
        if(strarray.length - 1 != i){
          output += strarray[i] + ", ";
        }
        else{
          output += strarray[i];
        }
      }
    }
    return "[" + output + "]";
  }

  public String inorderrec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += inorderrec(input.getLeft());
    temp += input.getData() + " ";
    temp += inorderrec(input.getRight());
    return temp;
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
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
    }
    else{
      output = postorderrec(root);
      strarray = output.split(" ");
      output = "";
      for(int i = 0; i < strarray.length; i++){
        if(strarray.length - 1 != i){
          output += strarray[i] + ", ";
        }
        else{
          output += strarray[i];
        }
      }
    }
    return "[" + output + "]";
  }

  public String postorderrec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += postorderrec(input.getLeft());
    temp += postorderrec(input.getRight());
    temp += input.getData() + " ";
    return temp;
  }

}
