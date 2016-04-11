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
	* Method: BST
	*
	* Description: Constructor, makes a BST
	*
	* @param None
	*
	* @return None
	*
	********************************************************************/

  public BST(){
    root = new BSTNode();
  }

  /********************************************************************
	*
	* Method: add
	*
	* Description: Adds an element to the BST
	*
	* @param E element
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
	* Method: delete
	*
	* Description: Deletes element or returns null if element doesn't exist
	*
	* @param E element
	*
	* @return E
	*
	********************************************************************/

  public E delete(E element){
    return null;
  }

  /********************************************************************
	*
	* Method: search
	*
	* Description: Searchs the bst and returns the element or null if it doesn't exist
	*
	* @param E element
	*
	* @return E
	*
	********************************************************************/

  public E search(E element){
    BSTNode<E> curr = root;
    E temp = null;
    while(true){
        if(curr.getData() == null){
          return null;
        }
        else if(element.compareTo(curr.getData()) == 0){
          temp = element;
          break;
        }
        else if(element.compareTo(curr.getData()) == 1 && curr.getRight() != null){
          curr = curr.getRight();
        }
        else if(element.compareTo(curr.getData()) == -1 && curr.getLeft() != null){
          curr = curr.getLeft();
        }
        else if(element.compareTo(curr.getData()) == 1 && curr.getRight() == null){
          break;
        }
        else if(element.compareTo(curr.getData()) == -1 && curr.getLeft() == null){
          break;
        }
    }
    return temp;
  }

  /********************************************************************
	*
	* Method: searchNode
	*
	* Description: Searchs the bst and returns the node with the desired or null if it doesn't exist
	*
	* @param E element
	*
	* @return BSTNode<E>
	*
	********************************************************************/

  public BSTNode<E> searchNode(E element){
    BSTNode<E> curr = root;
    BSTNode<E> temp = null;
    while(true){
        if(curr.getData() == null){
          return null;
        }
        else if(element.compareTo(curr.getData()) == 0){
          temp = curr;
          return temp;
        }
        else if(element.compareTo(curr.getData()) == 1 && curr.getRight() != null){
          curr = curr.getRight();
        }
        else if(element.compareTo(curr.getData()) == -1 && curr.getLeft() != null){
          curr = curr.getLeft();
        }
        else if(element.compareTo(curr.getData()) == 1 && curr.getRight() == null){
          break;
        }
        else if(element.compareTo(curr.getData()) == -1 && curr.getLeft() == null){
          break;
        }
    }
    return temp;
  }
  /********************************************************************
	*
	* Method: mini
	*
	* Description: Returns the minimum value in the bst or null if it doesn't exist
	*
	* @param None
	*
	* @return E
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
	* Method: max
	*
	* Description: Returns the maximum value in the bst or null if it doesn't exist
	*
	* @param None
	*
	* @return E
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
	* Method: predecessor
	*
	* Description: Finds the predecessor of the desired element or returns null if it doesn't exist
	*
	* @param E element
	*
	* @return E
	*
	********************************************************************/

  public E predecessor(E element){
    return null;
  }

  /********************************************************************
  *
  * Method: successor
  *
  * Description: Finds the successor of the desired element or returns null if it doesn't exist
  *
  * @param E element
  *
  * @return E
  *
  ********************************************************************/

  public E successor(E element){
    BSTNode<E> temp = searchNode(element);
    System.out.println(temp.getData());
    BSTNode<E> curr = temp;
    if(temp == null){
      return null;
    }
    else if(temp.getRight() == null && (temp.getParent().getData().compareTo(temp.getData()) == -1)
            && (temp.getData().compareTo(root.getData()) == -1)){
      return root.getData();
    }
    else if(temp.getLeft() == null && temp.getRight() == null && (temp.getParent().getData().compareTo(temp.getData()) == -1)
            && (temp.getParent().getParent().getData().compareTo(temp.getData()) == -1)
            && (temp.getData().compareTo(root.getData()) == 1)){
      return null;
    }
    else if(temp.getRight() == null && (temp.getParent().getData().compareTo(temp.getData()) == 1)){
      return temp.getParent().getData();
    }
    else if((temp.getParent().getParent().getData().compareTo(temp.getData()) == 1)){
      return temp.getParent().getParent().getData();
    }
    else if(temp.getRight() != null){
      curr = temp.getRight();
      while(curr.getLeft() != null){
        curr = curr.getLeft();
      }
      return curr.getData();
    }
    return null;
  }

  /********************************************************************
	*
	* Method: size
	*
	* Description: Returns the size of the bst
	*
	* @param None
	*
	* @return int
	*
	********************************************************************/

  public int size(){
    return size;
  }

  /********************************************************************
	*
	* Method: preorder
	*
	* Description: Calls the recursive method preorderRec
	*
	* @param None
	*
	* @return String
	*
	********************************************************************/

  public String preorder(){
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
      return output;
    }
    else{
      output = preorderRec(root);
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

  /********************************************************************
  *
  * Method: preorderRec
  *
  * Description: Traverses through the bst and puts it into a string preorder style
  *
  * @param BSTNode<E> input
  *
  * @return String
  *
  ********************************************************************/

  private String preorderRec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += input.getData() + " ";
    temp += preorderRec(input.getLeft());
    temp += preorderRec(input.getRight());
    return temp;
  }

  /********************************************************************
  *
  * Method: inorder
  *
  * Description: Calls the recursive method preorderRec
  *
  * @param None
  *
  * @return String
  *
  ********************************************************************/

  public String inorder(){
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
      return output;
    }
    else{
      output = inorderRec(root);
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

  /********************************************************************
  *
  * Method: inorderRec
  *
  * Description: Traverses through the bst and puts it into a string inorder style
  *
  * @param BSTNode<E> input
  *
  * @return String
  *
  ********************************************************************/

  public String inorderRec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += inorderRec(input.getLeft());
    temp += input.getData() + " ";
    temp += inorderRec(input.getRight());
    return temp;
  }

  /********************************************************************
  *
  * Method: postorder
  *
  * Description: Calls the recursive method preorderRec
  *
  * @param None
  *
  * @return String
  *
  ********************************************************************/

  public String postorder(){
    String output = "";
    String [] strarray;
    if(size == 0){
      output = "[]";
      return output;
    }
    else{
      output = postorderRec(root);
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

  /********************************************************************
  *
  * Method: postorderRec
  *
  * Description: Traverses through the bst and puts it into a string postorderRec style
  *
  * @param BSTNode<E> input
  *
  * @return String
  *
  ********************************************************************/

  public String postorderRec(BSTNode<E> input){
    String temp = "";
    if(input == null){
      return "";
    }
    temp += postorderRec(input.getLeft());
    temp += postorderRec(input.getRight());
    temp += input.getData() + " ";
    return temp;
  }
}
