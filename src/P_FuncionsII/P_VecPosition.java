package P_FuncionsII;

public class P_VecPosition {
    static int posicio(int v[], int x){
        boolean isThisNum = false;
        int num = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] == x){
                isThisNum = true;
                num = i;
                break;
            }
        }
        return (isThisNum == true) ? num : -1;
    }
    public static void main (String[] args){
        int v[] = {1,2,3,4,5,6,0,7,8,9};
        System.out.println(posicio(v, 6));

    }
}
