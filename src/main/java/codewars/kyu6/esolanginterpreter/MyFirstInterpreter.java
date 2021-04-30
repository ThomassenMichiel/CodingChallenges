package codewars.kyu6.esolanginterpreter;

/**
 * url: https://www.codewars.com/kata/esolang-interpreters-number-1-introduction-to-esolangs-and-my-first-interpreter-ministringfuck
 */
public class MyFirstInterpreter {
    private String code;
    
    public MyFirstInterpreter(String code) {
        this.code = code.replaceAll("[^+.]", "");
    }
    
    public String interpret() {
        int cell = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '+') {
                if (cell == 255) {
                    cell = 0;
                } else {
                    cell++;
                }
            }
            if (code.charAt(i) == '.') {
                sb.append((char) cell);
            }
        }
        return sb.toString();
    }
}
