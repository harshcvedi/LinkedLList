public void cycleremoval1(){
		Node meet=hascycle(head);
		if(meet==null){
			return;
		}
		Node curr=head;
		while(curr!=null){
			Node temp=meet;
			while(temp.next!=meet){
				if(temp.next==curr){
					temp.next=null;
					return;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}
	 }
