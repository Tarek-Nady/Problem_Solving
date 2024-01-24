class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>output = new ArrayList<>();
        if(digits ==null||digits.length()==0){
            return output;
        }
        String[]letters = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(output,digits,"",0,letters);
        return output;
    }
    public void backtrack(List<String> output,String digits,String current,int index,String[]letters){
        if(index==digits.length()){
            output.add(current);
            return;
        }
        String letters1= letters[digits.charAt(index)-'0'];
        for(char letter: letters1.toCharArray()){
            backtrack(output,digits,current+letter,index+1,letters);
        }
    }
}
