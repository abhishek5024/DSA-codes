int majorityElement(int a[], int size)
    {
        int cnt = 0; 
    int el; 

   
    for (int i = 0; i < size; i++) {
        if (cnt == 0) {
            cnt = 1;
            el = a[i];
        }
        else if (el == a[i]) cnt++;
        else cnt--;
    }

    int cnt1 = 0;
    for (int i = 0; i < size; i++) {
        if (a[i] == el) cnt1++;
    }

    if (cnt1 > (size / 2)) return el;
    return -1;
        // your code here
        
    }
