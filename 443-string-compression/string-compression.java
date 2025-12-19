class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            int count=0;
            char curr=chars[i];

            //count same characters
            while(i<chars.length&&chars[i]==curr){
                i++;
                count++;

            }

            //write character
            chars[index++]=curr;

            //write count if greter than 1
            if(count>1){
                String c=String.valueOf(count);
                for(char ch:c.toCharArray()){
                    chars[index++]=ch;
                }
            }
        }
        return index;
    }
}