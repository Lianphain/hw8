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
* DESCRIPTION: This file contains the methods and variables necessary to create a BSTNode
*
***************************************************************************************/

public class BSTNode<Integer> {

    private BSTNode<Integer> parent;
    private BSTNode<Integer> right;
    private BSTNode<Integer> left;
    private Integer data;

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

	public BSTNode(Integer newData){
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

	public void setData(Integer newData){
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

	public Integer getData(){
		return data;
	}

	/********************************************************************
	*
	* Method: setParent
	*
	* Description: Set the parent variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

	public void setParent(BSTNode<Integer> node){
		parent = node;
	}

  /********************************************************************
	*
	* Method: setRight
	*
	* Description: Set the right variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

  public void setRight(BSTNode<Integer> node){
		right = node;
	}

  /********************************************************************
	*
	* Method: setLeft
	*
	* Description: Set the left variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

  public void setLeft(BSTNode<Integer> node){
		left = node;
	}

	/********************************************************************
	*
	* Method: getParent
	*
	* Description: Returns the next variable from the specific node
	*
	* @param None
	*
	* @return next
	*
	********************************************************************/

	public BSTNode<Integer> getParent(){
		return parent;
	}

  /********************************************************************
	*
	* Method: setRight
	*
	* Description: Set the right variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

  public BSTNode<Integer> getRight(){
		return right;
	}

  /********************************************************************
	*
	* Method: setLeft
	*
	* Description: Set the next variable of the current node to the desired node
	*
	* @param BSTNode<Integer> node
	*
	* @return None
	*
	********************************************************************/

  public BSTNode<Integer> getLeft(){
		return left;
	}
}
