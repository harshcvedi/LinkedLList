public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int noc=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();

	  }
	  Arrays.sort(arr);
	  System.out.println(Maxdistance(arr, noc));
	  




   }

   public static int Maxdistance(int arr[],int noc){
	int lo=arr[0];
	int hi=arr[arr.length-1];
	int ans=0;
	while(lo<=hi){
		int mid=(hi+lo)/2;
		if(ispossible(arr,noc,mid)){
			ans=mid;
			lo=mid+1;
		}else{
			hi=mid-1;
		}
	}
	return ans;

   }

   public static boolean ispossible(int arr[],int noc,int mid){
		int pos=arr[0];
		int c1=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]-pos>=mid){
				pos=arr[i];
				c1++;
			}
			if(c1==noc){
				return true;
			}
		}
		return false;
   }
	
		

	


}

