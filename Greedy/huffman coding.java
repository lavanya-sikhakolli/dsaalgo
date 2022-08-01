class Decode
{
    //Function to return the decoded string.
    static String decodeHuffmanData(MinHeapNode root, String binaryString)
    {
        
        // add your code here
        String res="";
        MinHeapNode curr=root;
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)=='0'){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
            if(curr.data!='$'){
                res+=curr.data;
                curr=root;
            }
        }
        return res;
    }
}

