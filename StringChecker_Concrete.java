class StringChecker_Concrete implements StringChecker {
    public boolean checkString(String s) {
        boolean result = false; 
        if (s.length() < 5) {
            result = true; 
        }
        return result;
    }
}