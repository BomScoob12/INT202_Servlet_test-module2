package sit.int202.mid_exam_083.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class HistoryNumber {
    private List<NumberCheck> checkedNumber;

    public HistoryNumber(){
        checkedNumber = new ArrayList<>();
    }

    public void addNumber(NumberCheck num){
        checkedNumber.add(num);
    }

    public void clearHistory(){
        checkedNumber.clear();
    }
}
