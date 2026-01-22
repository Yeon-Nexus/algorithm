import java.util.*;

class PersonalityType {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Integer, Integer> scoreMap = insertScore();
        Map<Integer, String> typeMap = insertType();
        Map<String, Integer> defaultMap = insertDefault();

        for(int i=0; i <survey.length; i++) {
            String suv = survey[i];
            int score = choices[i];

            String position = typeMap.get(score);
            int count = scoreMap.get(score);

            if(position == null) {
                continue;
            }
            else if(position == "L") {
                String type = suv.substring(0,1);
                Integer sum = defaultMap.get(type);
                sum += count;
                defaultMap.put(type, sum);
            }
            else { //R
                String type = suv.substring(1,2);
                Integer sum = defaultMap.get(type);
                sum += count;
                defaultMap.put(type, sum);
            }
        }

        int rScore = defaultMap.get("R");
        int tScore = defaultMap.get("T");
        if(rScore >= tScore)
            answer += "R";
        else
            answer += "T";

        int cScore = defaultMap.get("C");
        int fScore = defaultMap.get("F");
        if(cScore >= fScore)
            answer += "C";
        else answer += "F";

        int jScore = defaultMap.get("J");
        int mScore = defaultMap.get("M");
        if(jScore >= mScore)
            answer += "J";
        else answer += "M";

        int aScore = defaultMap.get("A");
        int nScore = defaultMap.get("N");
        if(aScore >= nScore)
            answer +="A";
        else answer += "N";

        return answer;
    }


    private Map<Integer,Integer> insertScore() {
        Map<Integer, Integer> scoreMap = new HashMap<>();
        scoreMap.put(1,3);
        scoreMap.put(2,2);
        scoreMap.put(3,1);
        scoreMap.put(4,0);
        scoreMap.put(5,1);
        scoreMap.put(6,2);
        scoreMap.put(7,3);
        return scoreMap;
    }

    private Map<Integer, String> insertType() {
        Map<Integer, String> typeMap = new HashMap<>();
        typeMap.put(1, "L");
        typeMap.put(2, "L");
        typeMap.put(3, "L");
        typeMap.put(5, "R");
        typeMap.put(6, "R");
        typeMap.put(7, "R");
        return typeMap;
    }

    private Map<String, Integer> insertDefault() {
        Map<String, Integer> defaultMap = new HashMap<>();
        defaultMap.put("R", 0);
        defaultMap.put("T", 0);
        defaultMap.put("C", 0);
        defaultMap.put("F", 0);
        defaultMap.put("J", 0);
        defaultMap.put("M", 0);
        defaultMap.put("A", 0);
        defaultMap.put("N", 0);
        return defaultMap;
    }
}