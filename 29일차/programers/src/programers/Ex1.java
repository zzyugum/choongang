package programers;

class Ex1 {
    public int solution(int n) {
        int answer = 0;
    if(n%2 == 0){
        for (int i = 1; i<=n; i+=2){
            answer += n;
        }
    }else {
        for (int i = n; i<=0; i-=2){
           answer += (n*n);
        }
    }    
        
    return answer;
    }
}