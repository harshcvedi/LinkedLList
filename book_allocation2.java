public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        	int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=arr[i];
			}
			System.out.println(Maxdistance(arr,m,sum));
	  

   }

}

		public static int Maxdistance(int arr[],int nos,int sum){
			int ans=0;
			int lo=0;
			int hi=sum;
			while(lo<=hi){
				int mid=(lo+hi)/2;
				if(ispossible(arr,nos,mid)){
					ans=mid;
					hi=mid-1;
				}else{
					lo=mid+1;
				}
			}
			return ans;


		}


		public static boolean ispossible(int arr[],int nos,int mid){
			int i=0;
			int student=1;
			int readpage=0;
			while(i<arr.length){
				if(readpage+arr[i]<=mid){
					readpage+=arr[i];
					i++;
				}else{
					student++;
					readpage=0;
				}
				if(student>nos){
					return false;
				}
			}
			return true;
		}
