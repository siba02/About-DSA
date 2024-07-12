class largestelement{
    public static int findlargestelement(int[]arr){
        int largest=0;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int[]array ={45,65,95,98,71,23,12};
        int maxelement= largestelement.findlargestelement(array);
    
    System.out.println("largestelement:"+ maxelement);
}
}
    
