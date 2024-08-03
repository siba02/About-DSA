class secondlargestelement{

 
    public static void main(String[] args){
            int[] array={50,12,55,86};
            int temp;
            for(int i=0; i<array.length;i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i] < array[j]){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
        
                    }
                }
            }
           
           
            System.out.println("Second largest element:"+array[1]);
        }
    }
    