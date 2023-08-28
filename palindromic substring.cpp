class Solution {
public:
int ekorfun(string s, int i, int j){
    int count = 0;
    while(i>=0 && j<s.length() && s[i]==s[j]){
        
        count++;
        i--;
        j++;
    }
    return count;
}
    int countSubstrings(string s) {
        int count = 0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int odd=ekorfun(s, i, i);
            count=count+odd;

            int even=ekorfun(s, i, i+1);
            count = count+even;
        }
        return count;
    }
};
