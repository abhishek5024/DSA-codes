class Solution{
public:	
	int search(int A[], int N){
	    //code
	   int Xor=0;
	    for(int i=0;i<N;i++)
	    {
	       Xor=Xor^A[i];
	       
	    }
	    return Xor;
	    
	}
};
