package arabianLogistics.ArabianLogistics.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ArabianLogisticsApiResponse <T>{
    private boolean isSuccessful;
    private T data;
}
