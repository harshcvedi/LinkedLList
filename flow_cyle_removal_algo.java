 public void flyodcycleremoval(){
		Node meet=hascycle(head);
		if(meet==null){
			return;
		}

		Node fast=meet;
		Node slow=head;
		while(slow.next!=fast.next){
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	 }
