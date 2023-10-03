import java.util.HashMap;
public class ParsData {
    public HashMap<String, String> parsInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, String> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    dataDic.put("sex", i);
                } else {
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexException(i);
                    }
                }
                String[] fullName = String.valueOf(sb).split(" ");
                if (fullName.length == 3) {
                    dataDic.put("lastName", fullName[0]);
                    dataDic.put("firstName", fullName[1]);
                    dataDic.put("patronymic", fullName[2]);
                }
                return dataDic;
            }
        }
        return null;
    }

}
