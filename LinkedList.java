package lists;

public class MyLinkedList {
	
	     public Node head ;
	    // Head is the initial node which would be pointing to null initially
	   public static class Node {
	    	
	    	public int data ; 
	    	public Node next ; 
	    	// Every Node has two attributes that is the data stored in it and the address of consecutive node
	    	  public Node(int data) {
	    		  
	    		  this.data = data; 
	    		  
	    		  next = null ; 
	    		  // Initial node would store null address since it wont be pointing to any node
	    	  }
	    	
	    }
	    
	    public void print() {
	    	
	    	Node temp = head ; 
	    	
	    	while(temp!=null) {
	    		
	    		System.out.print(temp.data+" ");
	    		temp = temp.next ; 
	    	}
	    	
	    }
	    
	    /* print function to print the created linked list */
	    
	    /* every time we enter the loop data corresponding to node is printed and we go to consecutive node until the null node is 
	      reached */
	     
	    
	    public int size() {
	    	
	    	int a = 0;
	    	
	    	Node temp = head ; 
	    	
	    	while(temp!=null) {
	    		
	    		a++ ; 
	    		temp = temp.next ;
	    	}
	    	
	    	return a ; 
	    }
	    
	    // The size method is to find number of elements present in linked list.
	    
	    public void get(int i) {
	    	
	    	int b = size() ; 
	    	
	    	try {
	    		
	    		if(i<0||i>b-1) {
	    			
	    			throw new ArithmeticException() ; 
	    		}
	    		
	    		int j=0; 
		    	
		    	Node temp = head ; 
		    	
		    	while(temp!=null) {
		    		
		    		if(j==i) {
		    			
		    			System.out.println(temp.data);
		    			  
		    		}
		    			 
		    		 j++;
		    		temp = temp.next ; 
		    		
		    	}	    			 
	    	}
	    	
	    	catch(ArithmeticException e) {
	    		System.out.println("Index Out of Bound Exception!!Please give a valid input");
	    		
	    	} 	
	    }
	    
	    /* Exception Handling is done just to ensure that code is not stopped even if
        wrong input is given */
	    
	    /* For wrong input you will get error message but your remaining code won't crash */
	    
	     public void set(int a , int b) {
	    	 
	    	 
	    	 
	    	
	    	 try {
	    		 
	    		   if(a<0||a>b-1) {
	    			   
	    			   throw new  ArithmeticException() ; 
	    		   }
	    		   
	    		 
	    		 int j=0; Node temp = head ; 
	    		
	    		 
	    		 while(temp!=null) {
	    			 
	    			 if(j==a) {
	    				 
	    				 temp.data = b ; 
	    			 }
	    			 
	    			 j++;
	    			 temp = temp.next ; 
	    				  
	    		 }
	    		 	    		 
	    	 }
	    	 
	    	  catch(ArithmeticException e) {
	    		  
	    		  System.out.println("Index Out Of Bound Exception!!!Please give a valid input");
	    	  } 
	     }
	     
	       public void remove1(int a) {
	    	   
	    	    int b= size() ; int j=0;
	    	   Node temp = head ; 
	    	   Node temp1 =  head ; 
	    	   
	    	   try {
	    		   
	    		     if(a<0||a>b-1) {
	    		    	 
	    		    	 throw new ArithmeticException() ; 
	    		     }
	    		     	   
	    		     Node array[] = new Node[b] ;
	    		  for(j=0; j<b; j++) {
	    			  
	    			 
	    			  array[j] = temp;
	    			  temp = temp.next ; 
	    			  
	    		  }
	    		  
	    		  if(a==0) {
	    		    	 
	    		    	 head = temp1.next ; 
	    		    	  
	    		     }
	    		  
	    		  else if(a==b-1) {
	    			  
	    			  array[b-2].next = null ; 
	    		  }
	    		  
	    		  else 
	    		  array[a-1].next = array[a+1] ; 
	    		   
	    	   }
	    		    catch(ArithmeticException e) {
	    		    	
	    		    	System.out.println("Index Out Of Bound Exception!!! Please give a valid input");
	    		    }
	    		   	   
	    	   }
	       
	    // There are two methods to remove an element from linked list.
	    // The methods are defined based on the way convenient to you
	    // The input could be the position of number or the number itself
	       
	       public void remove2(int data)  {
	    	   
	    	   Node temp = head ; int j=0; 
	    	   
	    	   while(temp!=null) {
	    		   
	    		   if(temp.data==data)
	    			    break;
	    			
	    		   temp = temp.next ; 
	    		   j++;  
	    	   }
	    	   
	    	    
	    	   remove1(j) ;  // The second remove method is actually taking help of first remove method for removing elements
	       }
	       
	         public void addAll(MyLinkedList obj) {
	        	 
	        	 Node temp = obj.head ; 
	        	 
	        	  while(temp!=null) {
	        		  
	        		  
	        		  add(temp.data);
	        		  
	        		  temp = temp.next ; 
	        		  
	        		  
	        	  }
	        	 
	         }
	         // This method is to add elements of 1 particular linked list into the given linked list.
	         
	         public void removeAll(MyLinkedList obj1) {
	        	 
	        	Node temp = obj1.head ; 
	        	
	        	while(temp!=null) {
	        		
	        		remove2(temp.data) ; 
	        		 temp = temp.next ; 
	        	}        	 
	         }
	         // This method is used to remove elements of 1 particular linked list from given linked list.
	         // This method actually uses the remove2 method for removal.
	         // Actually remove2 method was created to make removeAll code short and elegant 
	         
	         public boolean contains(int data) {
	        	 
	        	 boolean isTrue = false ; 
	        	 Node temp = head ; 
	        	 
	        	 while(temp!=null) {
	        		 
	        		 if(temp.data==data) {
	        			 isTrue = true ; 
	        			  break;
	        		 }
	        		 
	        		 temp = temp.next ; 
	        	 }
	        	 
	        	 return isTrue ;
	        	 
	         }
	             
	         public boolean isEmpty() {
	        	 
	        	 boolean isTrue = false ; 
	        	
	        	  if(head==null)
	        		   isTrue = true;
	        	  
	        	  return isTrue ; 
	         }
	         
	         public void printreverse() {
	        	 
	        	int j=0;
	        	Node temp = head ; 
	        	
	        	while(temp.next!=null) {
	        		
	        		temp = temp.next ;
	        		
	        		j++;
	        	}
	        	
//	        	head.next = null ;
	        	Node temp1 = head ; 
	        	Node array[] = new Node[j+1] ; 
	        	
	        	for(int i=0; i<=j; i++) {
	        		
	        		array[i] = temp1 ; 
	        		temp1 = temp1.next; 
	        	}
	        	
	        	MyLinkedList obj = new MyLinkedList() ; 
	        	for(int i=j; i>=0; i--) {
	        		
	        		obj.add(array[i].data);
	        	}
	        	
	        	obj.print();	        	
	         }
	         
	         
			public void reverse() {
	        	 
	        	 int j=0;
	        	 Node temp = head ; 
	        	 
	        	 while(temp!=null) {
	        		 
	        		 temp = temp.next ; 
	        		 
	        		   j++;
	        	 }
	        	 Node temp1 = head;
	        	 Node array[] = new Node[j];
	        	 int i=0;
	        	 
	        	for(i=0; i<j ;i++) {
	        		
	        		array[i] = temp1;
	        		
	        		if(i!=(j-1))
	        		temp1 =temp1.next; 
	        	}
	        	
	        	MyLinkedList obj = new MyLinkedList() ; 
	        	
	        	   for(i=(j-1); i>=0; i--) {
	        		   
	        		   obj.add(array[i].data);
	        		   
	        	   }
	        	   
	        	   head = obj.head ;      	 
	         }
	    	   
	    public void add(int data) {
	    	
	    	Node obj = new Node(data) ; 
	    	
	    	  if(head==null) {
	    		  
	    		  head = obj ; 
	    		  return ; // So as to end the function at this stage only
	    	  }
	    	
	    	Node temp = head ;
	    	
	    	 
	    	
	    	while(temp.next!=null) {
	    		
	    		temp = temp.next ; 
	    	}
	    	
	    	temp.next = obj ; 
	    }
	    // This method is the most important used for adding elements into the linked list.
	    /* As user will call this method, first of all a node named obj would be created somewhere in the memory and this obj 
	        would be added after the node which is pointing to null. It would be added in such a fashion that the previous node
	        would now store the address of obj and obj itself would be pointing to null. 
	      */   

}
