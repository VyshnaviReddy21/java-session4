class Fine {
    public static void main (String[] args) {
        String str = "hello";
        findDuplicates(str);
        }
        public static void findDuplicates(String str){
           int [] count = new int[256];
        for(char c: str.toCharArray()) {
            count[c]++;
            }
        for(int i=0;i<256;i++){
        if(count[i]>1){
            System.out.println((char) i + " " + count[i]);
         }
        }
    }
}