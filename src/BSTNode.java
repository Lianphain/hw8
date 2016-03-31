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
* FILE: BSTNode.java
*
* DESCRIPTION: This file contains the methods and variables necessary to create a single linked list node
*
***************************************************************************************/

public class BSTNode<E> {

    private BSTNode<E> parent;
    private BSTNode<E> right;
    private BSTNode<E> left;
    private E data;

  /********************************************************************
	*
	* Method: BSTNode
	*
	* Description: Constructor, creates a BSTNode
	*
	* @param E newData
	*
	* @return None
	*
	********************************************************************/

	public BSTNode(E newData){
		data = newData;
		parent = null;
    right = null;
    left = null;
	}

	/********************************************************************
	*
	* Method: setData
	*
	* Description: Set the data at the specific node to whatever the user desires
	*
	* @param E newData
	*
	* @return None
	*
	********************************************************************/

	public void setData(E newData){
		data = newData;
	}

	/********************************************************************
	*
	* Method: getData
	*
	* Description: Returns the data of the specific node
	*
	* @param None
	*
	* @return data
	*
	********************************************************************/

	public E getData(){
		return data;
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

	public void setParent(BSTNode<E> node){
		parent = node;
	}

  public void setRight(BSTNode<E> node){
		right = node;
	}

  public void setLeft(BSTNode<E> node){
		left = node;
	}

	/********************************************************************
	*
	* Method: getNext
	*
	* Description: Returns the next variable from the specific node
	*
	* @param None
	*
	* @return next
	*
	********************************************************************/

	public BSTNode<E> getParent(){
		return parent;
	}

  public BSTNode<E> getRight(){
		return right;
	}

  public BSTNode<E> getLeft(){
		return left;
	}
}
