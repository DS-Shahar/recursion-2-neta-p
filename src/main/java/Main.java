class Main {
  public static int q14(int[] arr, int i) {
		if(i==0)
			return arr[0];
	return arr[i]+q14(arr,i-1);
	}
	public static int q15(int[] arr, int i) {
		if(i==0) {
			if(arr[i]>0)
				return 1;
			else
				return 0;
		}
		if(arr[i]>0)
			return 1+q15(arr,i-1);
		else
			return q15(arr,i-1);
	}
	public static int q16(int[] arr,int num,int i) {
		if(i==arr.length)
			return -1;
		if(arr[i]==num)
			return i;
		return q16(arr,num,i+1);
	}
	public static boolean q17(int[] arr, int i) {
		if(i==arr.length-1)
			return true;
		int prev=arr[i];
		int curr=arr[i+1];
		if(prev>curr)
			return false;
		return q17(arr,i+1);
		
	}
	public static boolean q8(int n,int p) {
		if(p==1)
			return true;
		if(n%p==0)
			return false;
		return q8(n,p-1);
		
	}
	public static boolean q18(int[] arr, int i) {
		if(i==arr.length)
			return true;
		if(q8(arr[i],arr[i]/2))
			return false;
		return q18(arr,i+1);
	}
	public static boolean e19(int[] a, int num, int n) {
		if(n<0)
			return false;
		else
			if(a[n]==num)
				return true;
			else
				return e19(a,num,n-1);
	}
	public static int q19(int[][] arr, int num, int i) {
		if(i==-1)
			return 0;
		if(e19(arr[i],num,arr[i].length-1))
			return 1+q19(arr,num,i-1);
		return q19(arr,num,i-1);
	}
	public static boolean e20(int[] arr, int l,int r) {
		if(l>=r)
			return true;
		if(arr[r]!=arr[l])
			return false;
		return e20(arr,l+1,r-1);
	}
	public static boolean q20(int[] arr ) {
		int a=(int)(Math.random()*arr.length);
		int b=(int)(Math.random()*arr.length);
		if(a>b) {
			return e20(arr,b,a);
		}
		else {
			return e20(arr,a,b);
		}
		
	}
