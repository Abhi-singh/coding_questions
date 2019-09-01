public class Code {
    private int[][] input,sol;
    private int n,m;
    Code(int[][] input){
        this.input=input;
        n=input.length;
        m=input[0].length;
        sol = new int[n][m];
    }
    private int get(int x,int y){
        if(x<0||x>=n||y<0||y>=m||input[x][y]==0)
            return -1;
        return sol[x][y]+1;
    }
    private int updateMin(int min,int temp){
        if(temp!=-1 && min>temp)
            return temp;
        return min;
    }
    private int getMin(int x,int y){
        if(input[x][y]==0)
            return -1;
        int min = get(x-1,y);
        min = updateMin(min,get(x,y-1));
        min = updateMin(min,get(x+1,y));
        min = updateMin(min,get(x,y+1));
        return min;
    }
    private void setSol(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                updateAll(i,j,get(i,j));
            }
        }
    }
    private void updateAll(int x,int y,int val){
        if(val==-1)
            return;
        if(x<0||x>=n||y<0||y>=m||input[x][y]==0)
            return;
        if(sol[x][y]<=0 || val<sol[x][y]){
            sol[x][y]=val;
            updateAll(x-1,y,val+1);
            updateAll(x,y-1,val+1);
            updateAll(x+1,y,val+1);
            updateAll(x,y+1,val+1);
        }
    }
    public int getOutput(int x,int y){
        setSol();
        return sol[x][y];
    }
    public void display(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
