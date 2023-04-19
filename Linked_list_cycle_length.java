	 public void cycleremoval2(){
		Node meet=hascycle(head);
		if(meet==null){
			return;
		}
		//cycle ki length
		int c1=1;
		Node temp=meet;
		while(temp.next!=meet){
			c1++;
			temp=temp.next;

		}
		Node fast=head;
		for(int i=0;i<c1;i++){
			fast=fast.next;
		}

		Node slow=head;
		while(slow.next!=fast.next){
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	 }
