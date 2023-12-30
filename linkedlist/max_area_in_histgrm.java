import java.util.Stack; 
//time complexity ->o(n)

public class max_area_in_histgrm {
    public static void find_max_area(int arr[]){
        int maxarea=0;
        int []nextsmallleft=new int[arr.length];
        int []nextsmallright=new int[arr.length];
        
        //next samller right o(n)
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallright[i]=arr.length;
            }
            else{
                nextsmallright[i]=s.peek();

            }
            s.push(i);
        }



        //next ssmaller left o(n)
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallleft[i]=-1;
            }
            else{
                nextsmallleft[i]=s.peek();

            }
            s.push(i);
        }



        //current area  o(n)
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nextsmallright[i]-nextsmallleft[i]-1;
            int currArea=height*width;
            maxarea=Math.max(currArea,maxarea);
        }
        System.out.println("max area of histogram is "+maxarea);

    }
    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        find_max_area(arr);
}
}