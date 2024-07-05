class largestelement {
    public static int findlargestelement(int[]arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
    }
    return largest;
}
    public static void main(String[] args){
        int[]array={50,42,38,10,29,44};
        int maxelement = findlargestelement(array);
    System.out.println("largestelement:"+maxelement);
    }
}