class largestelement {
    public static int findlargestelement(int[]arr){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
             }
    }
    return largest;
}
    public static void main(String[] args){
        int[]array={50,42,38,10,29,44};
        int maxelement =largestelement.findlargestelement(array);
    System.out.println("largestelement:"+maxelement);
    }
}
