int findUnique(int a[], int n, int k) {
        int ans = 0;
        
        for(int i=0; i<32; i++){
            int count = 0;
            
            for(int j=0; j<n; j++){
                if(a[j]&(1<<i)){
                    count++;
                }
            }
            if(count%k!=0){
                    ans += (1<<i);
            }
        }
        
        return ans;
    }
